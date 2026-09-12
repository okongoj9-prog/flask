from flask import Flask, request, jsonify
import pymysql
from werkzeug.security import generate_password_hash

# Create the Flask application
app = Flask(__name__)

# Database Configuration Dictionary
db_config = {
    "host": "localhost",
    "user": "root",
    "password": "",
    "database": "test",
    "cursorclass": pymysql.cursors.DictCursor # Returns rows as dictionaries
}

@app.route("/api/signups", methods=["POST"])
def signups():
    # 1. Extract data from the request form
    username = request.form.get("username")
    password = request.form.get("password")
    email = request.form.get("email")
    phone = request.form.get("phone")

    # Basic Validation: Ensure all fields are filled
    if not all([username, password, email, phone]):
        return jsonify({"error": "Missing required fields"}), 400

    # 2. Securely hash the password before saving
    hashed_password = generate_password_hash(password)

    connection = None
    try:
        # 3. Establish database connection
        connection = pymysql.connect(**db_config)
        
        # Use a context manager ('with') to automatically close the cursor
        with connection.cursor() as cursor:
            # Check if user already exists
            check_sql = "SELECT id FROM users WHERE email = %s OR username = %s"
            cursor.execute(check_sql, (email, username))
            if cursor.fetchone():
                return jsonify({"error": "Username or Email already registered"}), 400

            # Insert new user with the securely hashed password
            insert_sql = "INSERT INTO users (username, password, email, phone) VALUES (%s, %s, %s, %s)"
            data = (username, hashed_password, email, phone)
            cursor.execute(insert_sql, data)
        
        # Commit changes if no database exceptions occurred
        connection.commit()
        return jsonify({"message": "User registered successfully"}), 201

    except pymysql.MySQLError as e:
        # Rollback in case of database failures
        if connection:
            connection.rollback()
        return jsonify({"error": f"Database error: {str(e)}"}), 500

    finally:
        # 4. Crucial: Always close the database connection
        if connection and connection.open:
            connection.close()

if __name__ == "__main__":
    app.run(debug=True)

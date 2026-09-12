
import './App.css';
import Firstcomponent from './components/Firstcomponent';
import TaskComponent from './components/TaskComponent';

function App() {
  return (
    <div className="App">
      <header className="App-header">

        <h1>Welcome to learning Reactjs</h1>
        
        
      </header>
      {/* below we render/display/show our components */}
      <Firstcomponent/>
      <TaskComponent/>
    </div>
  );
}

export default App;


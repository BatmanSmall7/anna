import React, { Component } from 'react';
import './App.css';
import Clock from './Clock';

class App extends Component {
  render() {
    return (
      <div className="App">
          <div id="wish">
              祝小安琦生日快乐，天天开心!
          </div>
          <div>
              <div className="age">十</div>
              <div  id="pic">希望以后的每个生日，都可以陪在你的身边。</div>
              <div className="age">八</div>
          </div>
          <Clock></Clock>
      </div>
    );
  }
}

export default App;
import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <p className="App-intro">
            叔叔若是有心，喝了奴家这半盏残酒。 --尼古拉斯~克标
        </p>
      </div>
    );
  }
}

export default App;

import React, { Component } from 'react';
import './App.css';
import Clock from './Clock';

class App extends Component {
    componentDidMount(){
        var userAgentInfo = navigator.userAgent;
        var Agents = ["Android", "iPhone",
            "SymbianOS", "Windows Phone",
            "iPad", "iPod"];
        var flag = true;
        for (var v = 0; v < Agents.length; v++) {
            if (userAgentInfo.indexOf(Agents[v]) > 0) {
                flag = false;
                break;
            }
        }
        if(!flag){
            document.getElementById('wish').style.fontSize = "21px";
            document.getElementById('pic').style.fontSize = "12px";
            document.getElementById('pic').style.color = "white";
            document.getElementById('clock').style.fontSize = "17px";
            document.getElementById('clock').style.color = "darkorange";
            document.getElementById('age1').style.color = "black";
            document.getElementById('age2').style.color = "black";
        }
    }
  render() {
    return (
      <div className="App">
          <div id="wish">
              祝小安琦生日快乐，天天开心!
          </div>
          <div>
              <div id="age1">十</div>
              <div  id="pic">希望以后的每个生日，都可以陪在你的身边。</div>
              <div id="age2">八</div>
          </div>
          <Clock></Clock>
      </div>
    );
  }
}

export default App;
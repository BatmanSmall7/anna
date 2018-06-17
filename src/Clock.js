import React, {Component} from 'react';

class Clock extends Component{
    constructor() {
        super();
        this.tick = this.tick.bind(this);
        this.calcu = this.calcu.bind(this);
        this.state = {
            date: this.calcu()
        };
    }

    componentDidMount() {
        this.interval = setInterval(()=>this.tick(),1000)
    }

    componentWillUnmount() {
        clearInterval(this.interval);
    }

    tick() {
        this.setState({
            date : this.calcu()
        })
    }

    calcu(){
        var s1 = '2013-06-07';
        s1 = new Date(s1.replace(/-/g, "/"));
        var s2 = new Date();
        var days = s2.getTime() - s1.getTime();
        var time = parseInt(days / (1000 * 60 * 60 * 24), 10);
        var hour = s2.getHours();
        var min = s2.getMinutes();
        var sec = s2.getSeconds();
        return '爱你的第'+time.toString(10)+'天第'+hour.toString(10)+'小时第'+min.toString(10)+'分钟第'+sec.toString(10)+'秒';
    }

    render() {
        return (
            <div id="clock">
                {this.state.date.toString()}
            </div>
        )
    }
}

export default Clock;
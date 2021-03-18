import Door from "./images/Door.PNG"
import React, {useState, useEffect} from 'react';

class Doors extends React.Component {

    constructor() {
        super ();
        this.state = {
            availabelData: ""
        }
    }

    door1 = () => {
        this.fetchMethod (1)
    }

    door2 = () => {
        this.fetchMethod (2)
    }

    door3 = () => {
        this.fetchMethod (3)
    }


    fetchMethod(number) {

        var response = []
        fetch ("/api/client/" + number, {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            }
        }).then (res => res.json ())
            .then (data => {
                response.push ({
                    name: data["doorName"],
                    ask: data["askQuestion"]
                });
                console.log (data)
            }).then (data => this.setState (prevState => {
                return {
                    availabelData: response[0]
                }
            }
        ))
    }


    render() {
        return (
            <div>
                <h1 className={"h"}>Choose one of doors below for winning A Bil</h1>
                <img src={Door} className="img" alt="logo" onClick={this.door1}/>

                <img src={Door} className="img" alt="logo" onClick={this.door2}/>

                <img src={Door} className="img" alt="logo" onClick={this.door3}/>

                <h1 className={"h"}>{this.state.availabelData.name}</h1>
                <h1 className={"h"}>{this.state.availabelData.ask}</h1>
            </div>

        )
    }
}

export default Doors





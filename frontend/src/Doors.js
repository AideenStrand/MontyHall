import Door from "./images/Door.PNG"
import React, {useState, useEffect} from 'react';

class Doors extends React.Component {

    constructor() {
        super ();
        this.state = {
            doorOne: "",
            doorTwo: "",
            doorThree: "",
            ask: ""
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
        var doorsName = []

        fetch ("/api/client/" + number, {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            }
        }).then (res => res.json ())
            .then (data => {
                response.push ({
                    doorsName: data["doorsName"],
                    ask: data["resultSentence"]
                });
                console.log (data)
                console.log ("RES")
                console.log (response[0].doorsName)
                console.log (response[0].ask)
            }).then (respo => this.setState (prevState => {
                return {
                    doorOne: response[0].doorsName["door1"],
                    doorTwo: response[0].doorsName["door2"],
                    doorThree: response[0].doorsName["door3"],
                    ask: response[0].ask,

                }
            }
        ))
    }


    render() {

        const one = this.state.doorOne;
        console.log("one")
        console.log(one)
        if(one != null) {

            return (
                <div>
                    <h1 className={"h"}>Choose one of doors below for winning A Bil</h1>

                    <button ><img src={Door} className="img" alt="logo" onClick={this.door1}/>{this.state.doorOne}</button>
                    <button> <img src={Door} className="img" alt="logo" onClick={this.door2}/>{this.state.doorTwo}</button>
                    <button>  <img src={Door} className="img" alt="logo" onClick={this.door3}/>{this.state.doorThree}</button>

                    <h1 className={"h"}>{this.state.ask}</h1>
                </div>


            )
        }
    }
}

export default Doors





import Door from "./images/Door.PNG"
import React, {useState, useEffect} from 'react';

class Test extends React.Component {

    constructor() {
        super ();
        this.state = {
            availabelData: "",
            number: 0
        }
    }

    door1 = () => {
        var response = []

        fetch ("/api/client/1", {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            }
        }).then (res => res.json ())
            .then (data => {
                response.push ({
                    name: data["doorName"]
                });
                console.log (response)
            }).then (data => this.setState (prevState => {
                return {
                    availabelData: response[0]
                }
            }
        ))
    }

    door2 = () => {
        var response = []

        fetch ("/api/client/2", {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            }
        }).then (res => res.json ())
            .then (data => {
                response.push ({
                    name: data["doorName"]
                });
                console.log (response)
            }).then (data => this.setState (prevState => {
                return {
                    availabelData: response[0]
                }
            }
        ))
    }

    door3 = () => {

        var response = []
         fetch ("/api/client/3", {
             headers: {
                 'Content-Type': 'application/json',
                 'Accept': 'application/json'
             }
         }).then (res => res.json ())
             .then (data => {
                 response.push ({
                     name: data["doorName"]
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

                <img src={Door} className="img" alt="logo" onClick={this.door1}/>

                <img src={Door} className="img" alt="logo" onClick={this.door2}/>

                <img src={Door} className="img" alt="logo" onClick={this.door3}/>

                <div>
                    <h1>{this.state.availabelData.name}</h1>
                </div>
            </div>

        )
    }
}

export default Test





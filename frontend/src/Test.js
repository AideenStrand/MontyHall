import Door from "./images/Door.PNG"
import React, {useState, useEffect} from 'react';

class Test extends React.Component {

    constructor() {
        super ();
        this.state = {
            availabelData: "",
            count: 1
        }
    }

    toggleButtonState = (count) => {
        var response = []


        fetch ("/api/client/1", {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            }
        }).then (res => res.json ())
            .then (data => {
                response.push ({
                    name: data["completeName"]
                });
                console.log (response)
            }).then (data => this.setState (prevState => {
                return {
                    availabelData: response[0]
                }
            }
        ))
    }

    toggleButtonState1 = (count) => {
        var response = []

        fetch ("/api/client/2", {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            }
        }).then (res => res.json ())
            .then (data => {
                response.push ({
                    name: data["completeName"]
                });
                console.log (response)
            }).then (data => this.setState (prevState => {
                return {
                    availabelData: response[0]
                }
            }
        ))
    }

    toggleButtonState2 = (count) => {
        var response = []

        this.state.count = count

        fetch ("/api/client/3", {
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            }
        }).then (res => res.json ())
            .then (data => {
                response.push ({
                    name: data["completeName"]
                });
                console.log (response)
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


                <img src={Door} className="img" alt="logo" onClick={this.toggleButtonState}/>

                <img src={Door} className="img" alt="logo" onClick={this.toggleButtonState1}/>

                <img src={Door} className="img" alt="logo" onClick={this.toggleButtonState2}/>

                <div>
                    <h1>{this.state.availabelData.name}</h1>
                    {/*              <h1>{this.state.response2.name}</h1>
                    <h1>{this.state.response3.name}</h1>*/}
                </div>
            </div>

        )
    }


    /*        const [result, setResult] = useState(0);
            useEffect(() => {
                fetch("/api/client", {
                    headers : {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json'
                    }
                }).then(res => res.json()).then(data => {
                    // setResult(data)
                    console.log("data")
                    console.log(data)
                    console.log(data)
                })
            }, []);


    /!*        return (
                <div >
                  <h1>{this.toggleButtonState}</h1>

                </div>

            )*!/
        return result*/
}

export default Test





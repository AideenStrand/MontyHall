
import React, { useState, useEffect } from 'react';

export default function Test(){

        const [result, setResult] = useState(0);
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
                console.log(data) // should show {result: 100}
            })
        }, []);


/*        return (
            <div >
              <h1>{this.toggleButtonState}</h1>

            </div>

        )*/
    return result
}





import React, { useState } from "react";

// Child component receiving props
const Greeting = (props) => {
  return <h1>Hello, {props.name}!</h1>;
};

const Counter = () => {
  const [count, setCount] = useState(0); // Using state

  return (
    <div>
      <h2>Count: {count}</h2>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
};

// Parent component demonstrating both Props & State
const App = () => {
  return (
    <div>
      <Greeting name="Avadhoot" />
      <Counter />
    </div>
  );
};

export default App;

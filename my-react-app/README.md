# My React App

## Overview

**my-react-app** is a simple React project initialized using `create-react-app`. It demonstrates fundamental React concepts such as **Props** and **State**.

## Installation & Setup

To run this project locally, follow these steps:

### 1. Clone the Repository (If Hosted on GitHub)

```sh
 git clone https://github.com/your-username/my-react-app.git
 cd my-react-app
```

### 2. Install Dependencies

```sh
npm install
```

### 3. Start the Development Server

```sh
npm start
```

This will start the app at `http://localhost:3000/`.

---

## Features

### 1. **Props Demonstration**

- The app includes a component that receives data from its parent via **props**.
- Example usage:
  ```jsx
  <App name="Avadhoot" />
  ```
- The `App` component dynamically displays the passed name.

### 2. **State Demonstration**

- The `App` component also manages a state variable (`count`) using `useState`.
- Clicking a button updates and displays the count dynamically.
- Example implementation:
  ```jsx
  const [count, setCount] = useState(0);
  ```

---

## Project Structure

```
my-react-app/
│── src/
│   ├── App.js            # Main component demonstrating Props & State
│   ├── index.js          # Entry point
│── public/
│── package.json
│── .gitignore
│── README.md
```

---

## Dependencies

- **React** (Latest version)
- **React-DOM**
- **React Scripts**
import logo from "../../logo.svg";
import "./App.css";
import Header from "../Header/header";
import { Route, Routes } from "react-router-dom";

function App() {
  return (
    <Routes>
      <Header />
      <main>
        <div className="container">
          <Route path="" />
        </div>
      </main>
    </Routes>
  );
}

export default App;

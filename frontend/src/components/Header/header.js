import React from "react";
import { Link } from "react-router-dom";

function Header({ props }) {
  return (
    <header>
      <nav>
        <a>EMT_LAB</a>
        <button></button>
        <div>
          <ul>
            <li>
              <Link to={"/books"}>Books</Link>
              <Link to={"/categories"}>Categories</Link>
            </li>
          </ul>
        </div>
      </nav>
    </header>
  );
}

export default Header;

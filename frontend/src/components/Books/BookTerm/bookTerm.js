import React from "react";
import { Link } from "react-router-dom";
const bookTerm = (props) => {
  return (
    <tr key={props.term.id}>
      <td scope={"col"}>{props.term.name}</td>
      <td scope={"col"}>{props.term.category}</td>
      <td scope={"col"}>
        {props.term.author.name + " " + props.term.author.surname}
      </td>
      <td scope={"col"}>{props.term.availableCopies}</td>
      <td scope={"col"} className={"text-right"}>
        <a
          title={"Delete"}
          className={"btn btn-danger ml-2"}
          onClick={() => props.onDelete(props.term.id)}
        >
          Delete
        </a>
        <Link
          className={"btn btn-info ml-2"}
          onClick={() => props.onEdit(props.term.id)}
          to={`/books/edit/${props.term.id}`}
        >
          Edit
        </Link>
      </td>
    </tr>
  );
};
export default bookTerm;

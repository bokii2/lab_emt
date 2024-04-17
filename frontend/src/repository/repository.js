import axios from "../custom-axios/axios";

const Repository = {
  fetchBooks: () => {
    return axios.get("/books");
  },
  fetchCategories: () => {
    return axios.get("/categories");
  },
  deleteBook: (id) => {
    return axios.delete(`/books/delete/${id}`);
  },
  addBook: (name, category, author, copies) => {
    return axios.post("/books/add", {
      name: name,
      category: category,
      author: author,
      availableCopies: copies,
    });
  },
  editBook: (id, name, category, author, copies) => {
    return axios.put(`/books/edit/${id}`, {
      name: name,
      category: category,
      author: author,
      availableCopies: copies,
    });
  },
  getBook: (id) => {
    return axios.get(`/books/${id}`);
  },
};

export default Repository;

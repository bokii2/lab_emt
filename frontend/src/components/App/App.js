import "./App.css";
import React, { Component } from "react";
import Repository from "../../repository/repository";
import { Route, Router } from "react-router-dom";
import Books from "../Books/BookList/books";
import BookEdit from "../Books/BookEdit/bookEdit";
import BookAdd from "../Books/BookAdd/bookAdd";
import Categories from "../Categories/categories";
import Header from "../Header/header";

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      books: [],
      authors: [],
      countries: [],
      categories: [],
      selectedBook: {},
    };
  }

  loadBooks = () => {
    Repository.fetchBooks().then((data) => {
      this.setState({
        books: data.data,
      });
    });
  };
  loadCategories = () => {
    Repository.fetchCategories().then((data) => {
      this.setState({
        categories: data.data,
      });
    });
  };
  deleteBook = (id) => {
    Repository.deleteBook(id).then(() => {
      this.loadBooks();
    });
  };
  addBook = (name, category, author, availableCopies) => {
    Repository.addBook(name, category, author, availableCopies).then(() => {
      this.loadBooks();
    });
  };
  getBook = (id) => {
    Repository.getBook(id).then((data) => {
      this.setState({
        selectedBook: data.data,
      });
    });
  };
  editBook = (id, name, category, author, availableCopies) => {
    Repository.editBook(id, name, category, author, availableCopies).then(
      () => {
        this.loadBooks();
      },
    );
  };

  componentDidMount() {
    this.loadBooks();
    this.loadCategories();
  }

  render() {
    return (
      <Router>
        <Header />
        <main>
          <div className="container">
            <Route
              path={"/categories"}
              exact
              render={() => <Categories categories={this.state.categories} />}
            />
            <Route
              path={"/books/add"}
              exact
              render={() => (
                <BookAdd
                  authors={this.state.authors}
                  categories={this.state.categories}
                  onAddBook={this.addBook}
                />
              )}
            />
            <Route
              path={"/books/edit/:id"}
              exact
              render={() => (
                <BookEdit
                  authors={this.state.authors}
                  categories={this.state.categories}
                  onEditBook={this.editBook}
                  book={this.state.selectedBook}
                />
              )}
            />
            <Route
              path={["/books", "/"]}
              exact
              render={() => (
                <Books
                  books={this.state.books}
                  onDelete={this.deleteBook}
                  onEdit={this.getBook}
                />
              )}
            />
          </div>
        </main>
      </Router>
    );
  }
}

export default App;

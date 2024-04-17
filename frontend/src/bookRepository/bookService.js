import axios from "../custom-axios/axios";

const bookService = {
    fetchBooks: () => {
        return axios.get("/books");
    },
    deleteBook: (id) => {
        return axios.delete(`/books/delete/${id}`);
    },
    addBook: (name, bookCategory, authorId, availableCopies) => {
        return axios.post("/books/add", {
            "name": name,
            "bookCategory": bookCategory,
            "authorId": authorId,
            "availableCopies": availableCopies
        });
    },
    editBook: (id, name, bookCategory, authorId, availableCopies) => {
        return axios.put(`/books/edit/${id}`, {
            "name": name,
            "bookCategory": bookCategory,
            "authorId": authorId,
            "availableCopies": availableCopies
        });
    },
    getBook: (id) => {
        return axios.get(`/books/${id}`);
    },
    notAvailable: (id) => {
        return axios.get(`/books/rent/${id}`)
    }
}
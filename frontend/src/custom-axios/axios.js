import axios from "axios";

const instance = axios.create({
  baseURL: "https://localhost:9090/api",
  headers: {
    "Access-Control-Allow-Origin": "*",
  },
});

export default instance;

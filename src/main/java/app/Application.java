package app;

import static spark.Spark.get;
import static spark.Spark.port;

import app.snippet.SnippetDao;

public class Application {

    public static SnippetDao snippetDao;

    public static void main(String[] args) {
        snippetDao = new SnippetDao();

        port(5000);
        get("/hello", (req, res) -> "Hello Sylvan and Zeeger, did you like this snippet: "
            + snippetDao.getAllSnippets().iterator().next().getCode());

    }
}
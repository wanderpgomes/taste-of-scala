package javainterop;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static scala.collection.JavaConversions.asJavaCollection;

public class App {
    public List<Author> loadAuthorsFromFile(File file) {
        return new ArrayList<Author>(asJavaCollection(
                Author.loadAuthorsFromFile(file)));
    }
    public void sortAuthors(List<Author> authors) {
        Collections.sort(authors);
    }
    public void displaySortedAuthors(File file) {
        List<Author> authors = loadAuthorsFromFile(file);
        sortAuthors(authors);
        for (Author author : authors) {
            System.out.println(
                    author.lastName() + ", " + author.firstName());
        }
    }
    public File getFile(String fileName){
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(fileName).getFile());
    }
    public static void main(String... args){
        App app = new App();
        app.displaySortedAuthors(app.getFile("authors.txt"));
    }
}

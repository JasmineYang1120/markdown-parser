import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void test1() throws IOException{
        String file = Files.readString(Path.of("test-file.md"));
        ArrayList<String> links1 = MarkdownParse.getLinks(file);
        assertEquals(List.of("https://something.com","some-thing.html"),
        links1);
    }
    @Test
    public void test2() throws IOException{
        String file1 = Files.readString(Path.of("test-file1.md"));
        ArrayList<String> links2 = MarkdownParse.getLinks(file1);
        assertEquals(List.of("some-thing.html"),links2);
    }

    // @Test
    // public void test_snippet1() throws IOException{
    //     String file = Files.readString(Path.of("test-snippet1.md"));
    //     ArrayList<String> link = MarkdownParse.getLinks(file);
    //     assertEquals(List.of("google.com, google.com, ucsd.edu"),link);
    // }
    // @Test
    // public void test_snippet2() throws IOException{
    //     String file = Files.readString(Path.of("test-snippet2.md"));
    //     ArrayList<String> link = MarkdownParse.getLinks(file);
    //     assertEquals(List.of("a.com, a.com, example.com"),link);
    // }
    // @Test
    // public void test_snippet3() throws IOException{
    //     String file = Files.readString(Path.of("test-snippet3.md"));
    //     ArrayList<String> link = MarkdownParse.getLinks(file);
    //     assertEquals(List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"),link);
    // }
}

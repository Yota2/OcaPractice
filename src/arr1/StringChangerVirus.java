package arr1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/*
public class StringChangerVirus {


    public static void main(String[] args) throws IOException {

        String inputFile = "C:\\Users\\yonij\\Desktop\\haahhaNow_Viruse.txt";
        String outputFile = "C:\\Users\\yonij\\Desktop\\lines_new.txt";

        File file = new File("/Users/yonij/NewhaahhaNow_Viruse.txt");

        // Create an object of the File class
        // Replace the file path with path of the directory
        File rename = new File("/Users/yonij/haahhaNow_Viruse.txt");

        Map<Character, Character> replacements = new HashMap<>();
        replacements.put('a', 'c');
        replacements.put('b', 'p');
        replacements.put('c', 'q');
        try (Stream<String> stream = Files.lines(Paths.get(inputFile));

             FileOutputStream fop = new FileOutputStream(new File(outputFile))) {
            stream.map(line -> line += " manipulate line as required\n").forEach(line -> {
                try {
                    fop.write(line.getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
*/
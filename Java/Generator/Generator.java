import com.fileio.*;
import com.util.StringUtil;

import java.io.*;
import java.util.*;

public class Generator {
    public HashMap<String, ArrayList<Model>> map = new HashMap<>();
    public static ArrayList<Model> langs = new ArrayList<Model>();
    public static FileInput input = new FileInput();
    public static FileOutput output = new FileOutput();

    public static final StringUtil stringUtil = StringUtil.getInstance();

    public static void readFile() {

        ArrayList<String> fileData = new ArrayList<String>();

        if (input.ReadFile("./multi_lang_180612.csv")) {
            fileData = input.getKeys();
            if (fileData == null) {
                System.out.println("Key Array is Null");
            } else {
                for (String key:fileData) {
                    langs = input.getDataArray(key);

                    System.out.println(key);
                    // for (Model model:langs) {
                    //     System.out.println(model.key + " : " + model.value);
                    // }

                    boolean writeAnroid = output.writeFileAndroid(key, langs);
                    boolean writeiOS = output.writeFileiOS(key, langs);
                }
                
            }
        }
        else {
            System.out.println("Cannot find CSV file");
        }
        System.out.print("End");
    }

    public static void main(String[] args) {
        readFile();
    }
}
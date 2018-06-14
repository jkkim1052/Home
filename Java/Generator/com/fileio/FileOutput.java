package com.fileio;

import com.fileio.*;
import com.util.StringUtil;

import java.io.*;
import java.util.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class FileOutput {

    private static StringUtil util = StringUtil.getInstance();

    public boolean WriteFile(String name) {
        boolean state = false;

        return state;
    }

    public boolean writeFileAndroid(String country, ArrayList<Model> data) {
        boolean write = false;

        File dir = new File("./Android/");
        if (!dir.exists()) {
            try {
                if (dir.mkdir())
                    util.Log(util.LOG_LEVEL_FUNCTION, "make folder : " + dir.getPath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        dir = new File("./Android/" + country);
        if (!dir.exists()) {
            try {
                if (dir.mkdir())
                    System.out.println("make folder : " + dir.getPath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            DocumentBuilderFactory docFac = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuil = docFac.newDocumentBuilder();
            Document doc = docBuil.newDocument();
            Element resource = doc.createElement("resources");
            Element attr;

            Element word = null;
            for (Model lang:data) {
                // System.out.println(lang.key + " : " + lang.value);
                if (!"".equals(lang.value)) {
                    word = doc.createElement("string");
                    word.setAttribute("name", lang.key);
                    word.appendChild(doc.createTextNode(lang.value));
                    resource.appendChild(word);
                }
            }

            doc.appendChild(resource);

            TransformerFactory transFac = TransformerFactory.newInstance();
            Transformer trans = transFac.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("./Android/"+country+"/string.xml"));

            trans.transform(source, result);

            write = true;
        } catch (Exception e) {
            write = false;
        }

        return write;
    }

    public boolean writeFileiOS(String country, ArrayList<Model> data) {
        boolean write = false;

        File dir = new File("./iOS/");
        if (!dir.exists()) {
            try {
                if (dir.mkdir())
                    System.out.println("make folder : " + dir.getPath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        dir = new File("./iOS/" + country + ".lproj");
        if (!dir.exists()) {
            try {
                if (dir.mkdir())
                    System.out.println("make folder : " + dir.getPath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./iOS/"+country+".lproj/Localizable.strings"));
            StringBuffer buffer = new StringBuffer();

            String line;
            for (Model lang:data) {
                // System.out.println(lang.key + " : " + lang.value);
                line = "\"" + lang.key + "\" = " + "\"" + lang.value + "\";\n";
                buffer.append(line);
            }

            writer.write(buffer.toString());
            writer.close();




            // DocumentBuilderFactory docFac = DocumentBuilderFactory.newInstance();
            // DocumentBuilder docBuil = docFac.newDocumentBuilder();
            // Document doc = docBuil.newDocument();
            // Element resource = doc.createElement("resources");

            // Element word = null;

            // doc.appendChild(resource);

            // TransformerFactory transFac = TransformerFactory.newInstance();
            // Transformer trans = transFac.newTransformer();
            // DOMSource source = new DOMSource(doc);
            // StreamResult result = new StreamResult();

            // trans.transform(source, result);

            write = true;
        } catch (Exception e) {
            write = false;
        }

        return write;
    }

    public boolean makeXMLFile() {
        boolean state = false;
        
        return state;
    }
}
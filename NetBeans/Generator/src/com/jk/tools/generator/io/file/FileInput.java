/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.tools.generator.io.file;

import com.jk.tools.generator.util.CSVParser;
import com.jk.tools.generator.util.StringUtil;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jonggwonkim
 */
public class FileInput {
    
    private BufferedReader bufferedReader;
    private ArrayList<String> data = new ArrayList<String>();
    private ArrayList<String> keys = new ArrayList<String>();
    private HashMap<String, ArrayList<JsonModel>> map = new HashMap<>();

    private static final CSVParser csvParser = CSVParser.getInstance();
    private static final StringUtil stringUtil = StringUtil.getInstance();

//    public Boolean ReadFile(String path) {
//        Boolean state = true;
//        try {
//            bufferedReader = new BufferedReader(new FileReader(path));
//            state = state & makeData();
//            state = state & makeKeys();
//            state = state & makeDataMap();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            state = false;
//        }
//        return state;
//    }
//
//    /**
//     * If filedata will empty, return empty
//     * Otherwise return string array line by line
//     */
//    private boolean makeData() {
//        System.out.println("===== FileInput.getData");
//        boolean result = false;
//        try {
//            data.clear();
//            String line;
//            while((line = bufferedReader.readLine()) != null) {
//                data.add(line);
//                System.out.println("===== FileInput.getData line : " + line);
//            }
//            result = true;
//        } catch (IOException e) {
//            
//        }
//        return result;
//    }
//
//    public ArrayList<String> getData() {
//        return data;
//    }
//
//    /**
//     * Make key array using first line in data.
//     */
//    private boolean makeKeys() {
//        System.out.println("===== FileInput.makeKeys");
//        ArrayList<Model> dataArray = null;
//        boolean result = false;
//
//        if (data.size() > 0) {
//            String[] items = data.get(0).split(",");
//            // for(String item : items){
//            //     keys.add(items[i]);
//            //     dataArray = new ArrayList<>();
//            //     map.put(items[i], dataArray);
//            // }
//
//            int len = items.length;
//            for(int i = 1;i < len;i++) {
//                keys.add(items[i]);
//                dataArray = new ArrayList<>();
//                map.put(items[i], dataArray);
//            }
//    
//            if (keys.size() > 0) {
//                result = true;
//                // stringUtil.printStringArray(keys);
//            }
//            else {
//                result = false;
//            }
//        }
//        System.out.println("===== FileInput.makeKeys Success : " + keys.size());
//        return result;
//    }
//
//    /**
//     * return Key array
//     */
//    public ArrayList<String> getKeys() {
//        System.out.println("===== FileInput.getKeys");
//        if (keys != null && keys.size() > 0) {
//            return keys;
//        } else {
//            return null;
//        }
//    }
//
//    /**
//     * 
//     */
//    private boolean makeDataMap() {
//        boolean result = false;
//        System.out.println("===== FileInput.makeDataMap");
//        if (data == null || data.size() == 0) {
//            result = false;
//        }
//        else {
//            System.out.println("===== FileInput.makeDataMap start Parse");
//            // stringUtil.printStringArray(data);
//            ArrayList<String> parsed = new ArrayList<String>();
//            ArrayList<Model> dataModel = null;
//            Model modelItem = null;
//            if (keys != null && keys.size() > 0) {
//                for (int i = 1;i < data.size();i++) {
//                    // System.out.println("===== FileInput.makeDataMap Parse : " + data.get(i));
//                    parsed = csvParser.getStringArray(data.get(i));
//                    System.out.println("===== FileInput.makeDataMap Parse : " + parsed);
//                    if (parsed != null && !"".equals(parsed.get(0))) {
//                        String keyLang = "";
//                        String keyString = parsed.get(0);
//                        String emptyString = "";
//                        for ( int order = 0;order < keys.size();order++) {
//                            keyLang = keys.get(order);
//                            dataModel = (ArrayList<Model>)map.get(keyLang);
//                            emptyString = parsed.get(order+1);
//                            if (!"".equals(emptyString)) {
//                                modelItem = new Model(keyString, emptyString);
//                                dataModel.add(modelItem);
//                            }
//                            map.put(keyLang, dataModel);
//                        }
//                    }
//                }
//            }
//            
//            if (map != null || map.size() > 0) {
//                result = true;
//            }
//        }
//        return result;
//    }
//
//    private HashMap<String, ArrayList<Model>> getDataMap() {
//        System.out.println("===== FileInput.getDataMap");
//        if (map != null && map.size() > 0) {
//            return map;
//        } else {
//            return null;
//        }
//    }
//
//    /**
//     * If map data will empty, return null
//     */
//    public ArrayList<Model> getDataArray(String key) {
//        System.out.println("===== FileInput.getDataArray");
//        if (map != null && map.size() > 0) {
//            return map.get(key);
//        } else {
//            return null;
//        }
//    }
}

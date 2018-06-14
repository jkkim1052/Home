package com.fileio;

import java.util.ArrayList;

public class CSVParser {

    private CSVParser() {}
    private static class Singleton {
        private static final CSVParser instance = new CSVParser();
    }
    
    public static CSVParser getInstance() {
        return Singleton.instance;
    }

    public ArrayList<String> getStringArray(String data) {
        System.out.println("===== CSVParser : " + data);
        ArrayList<String> items = null;
        String item;
        StringBuffer buffer;

        if (data != null && !"".equals(data)) {
            items = new ArrayList<>();
            buffer = new StringBuffer();

            char[] dataArray = data.toCharArray();
            boolean skipComma = false;
            for(char ch:dataArray) {
                if ((',' == ch && !skipComma) || '\n' == ch) {
                    item = buffer.toString();
                    System.out.println("===== CSVParser : " + item);
                    items.add(item);
                    buffer = new StringBuffer();
                }
                else if ('\"' == ch) {
                    skipComma = !skipComma;
                }
                else {
                    buffer.append(ch);
                }
            }
            
            item = buffer.toString();
            System.out.println("===== CSVParser : " + item);
            items.add(item);
        }

        return items;
    }
}
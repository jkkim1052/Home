package com.util;

import java.io.*;
import java.util.*;

public class StringUtil {

    public static final int LOG_LEVEL_DATA = 1;
    public static final int LOG_LEVEL_ERROR = 2;
    public static final int LOG_LEVEL_FUNCTION = 3;
    public static final int LOG_LEVEL_STSTEM = 4;

    private static int logLevel = 1;

    private StringUtil() {}
    private static class SingleTon {
        private static final StringUtil instance = new StringUtil();
    }
    public static StringUtil getInstance() {
        return SingleTon.instance;
    }

    public static void Log(final int level, final String message) {
        if (level >= logLevel) {
            System.out.println(message);
        }
    }

    public void printStringArray(ArrayList<String> array) {
        if (array != null && array.size() > 0) {
            for (String data:array) {
                System.out.println(data);
            }
        }
    }
}
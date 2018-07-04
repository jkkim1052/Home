/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jk.tools.generator.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jonggwonkim
 */
public class Log {
    
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    
    private enum TYPE {
        d(ANSI_BLACK), 
        w(ANSI_BLUE),
        e(ANSI_RED);
        
        public String color;
        TYPE(String color) {
            this.color = color;
        }
    }
    
    public static void d(Object... obj) { print(TYPE.d, obj); }
    public static void w(Object... obj) { print(TYPE.w, obj); }
    public static void e(Object... obj) { print(TYPE.e, obj); }
    
    private static void print(TYPE type, Object... obj) {
        
        String msg;
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
        String time = "[" + dateFormat.format(date) + "] ";
        
        String root = "";
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        int deleteStack = 3;  // stack[0] = Thread, stack[1] = Log.print, stack[2] = Log.d or w or e
        int printStack = 4;  // Count that want to printing log stack
        for (StackTraceElement st:stack) {
            if (deleteStack == 0) {
                if (printStack > 0) {
                    String[] className = st.getFileName().split("\\.");
                    root = className[0] + "." + st.getMethodName() + ":" + st.getLineNumber() + " --> " + root + "\n";
                    printStack--;
                }
                else {
                    break;
                }
            }
            else
                deleteStack--;
        }
        
        String body = "";
        for (Object o:obj) {
            body = body + o.toString() + "\n";
        }
        
	System.out.println(type.color + time + root);
        System.out.println(body + ANSI_RESET);
        System.out.println();
    }
}

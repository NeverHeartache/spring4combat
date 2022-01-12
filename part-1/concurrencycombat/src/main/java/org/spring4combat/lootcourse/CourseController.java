package org.spring4combat.lootcourse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class CourseController {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(new FileInputStream("src/main/resources/mytext.txt"), "UTF-8");
             PrintWriter out = new PrintWriter("out.txt")){
            while(in.hasNext()){
                System.out.println(in.next());
                out.println(in.next().toUpperCase(Locale.ROOT));
            }
        }catch (FileNotFoundException e){
//            e.printStackTrace();
            Throwable t = new Throwable();
            StackTraceElement[] stackTraceElements = t.getStackTrace();
            for (StackTraceElement s : stackTraceElements){
                System.out.print("class name: " + s.getClassName() + System.lineSeparator());
                System.out.print("file name: "+ s.getFileName() + System.lineSeparator());
                System.out.print("method name: " + s.getMethodName() + System.lineSeparator());
                System.out.print("line number: " + s.getLineNumber() + System.lineSeparator());
            }
        }
    }

}

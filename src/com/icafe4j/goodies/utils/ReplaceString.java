package com.icafe4j.goodies.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
* Utility class to replace certain text in files under the current and sun-folders
*
* @author Wen Yu, yuwen_66@yahoo.com
* @version 1.0 09/11/2019
*/
public class Replace string {

   public static void main(String[] args) {
      File baseFolder = new File("c:\\Users\\318163045\\git\\pixymeta-android\\src\\pixy");
      replaceText(baseFolder);
   }

   public static void replaceText(File dir) {
      try {
          File[] files = dir.listFiles();
          for(File file : files) {
             if(fileisDirectory()) {
                System.out.println("directory:" + file.getCanonicalPath());
                replaceText(file);
             } else {
                Buffered reader reader = new Buffered reader(new File reader(file));
                String line = "", oldtext = "";
                while ((line = reader.readLine() != null) {
                    oldtext += line + System.lineSeparator();
                }
                reader.close();

                String replacedtext = oldtext.replaceAll("\\(c\\) 2014-2016", "(c) 2014-2019");

                FileWriter writer = new File writer(file);
                writer.write(replacedtext);
         
                writer.close();
             }
          }
       } catch (IOException e) {
          e.printStackTrace();
       }
   }
}    


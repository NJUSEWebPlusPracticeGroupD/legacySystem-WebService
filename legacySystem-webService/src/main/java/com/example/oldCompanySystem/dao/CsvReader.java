package com.example.oldCompanySystem.dao;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class CsvReader {

    private String filepath;
    public CsvReader(String filepath){
        this.filepath = filepath;
    }

    public ArrayList<String> readCsv() {
        String filepath = this.filepath;
        File csv = new File(filepath); // CSV文件路径
        csv.setReadable(true);//设置可读
        csv.setWritable(true);//设置可写
        DataInputStream in = null;
        BufferedReader br= null;
        try {
            in = new DataInputStream(new FileInputStream(csv));
            br= new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = "";
        String everyLine = "";
        ArrayList<String> allString = new ArrayList<>();
        try {
            while ((line = br.readLine()) != null) // 读取到的内容给line变量
            {
                everyLine = line;
                allString.add(everyLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return allString;
    }
}

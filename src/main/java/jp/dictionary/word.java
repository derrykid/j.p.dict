package jp.dictionary;
import java.util.Scanner;  // 导入 Scanner 类
public class word{
    

        Map<String, String> map = new HashMap<String, String>();
    while(true){
        String in = myObj.nextLine();  // 读取用户输入
        String explain=myObj.nextLine();
        map.put(in,explain);//map.put("dog", "type of animal");
        System.out.println(map.get(in)+":"map.get(explain));//System.out.println(map.get("dog"));
    }
    
}

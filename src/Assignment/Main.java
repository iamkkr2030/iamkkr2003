package Assignment;

import java.io.Writer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Drama drama=new Drama(); Log log1=new Log();
		SquidGame sg=new SquidGame(); Woo woo=new Woo(); Suriname sn=new Suriname();
		drama1 rve=null;
		int[] intArray= {250,350,200};String a="왠지 모르겠는데 동영상 다운이 되지 않아서";String b="메모장에 동영상 주소를 올려놓겠습니다.";	    
		List<String> list=new ArrayList<String>();
		
		try {
			System.out.println("--------------------------------------------");
		    drama.dTitle(sg);
		    System.out.println(rve.오징어게임+" 제작비:"+intArray[0]+"억\n");
		    log1.log(sg);
  		    System.out.println("--------------------------------------------\n");
		    System.out.println("--------------------------------------------");
		    drama.dTitle(sn);
		    System.out.println(rve.수리남+" 제작비:"+intArray[1]+"억\n");
		    log1.log(sn);
		    System.out.println("--------------------------------------------\n");
		    System.out.println("--------------------------------------------");
		    drama.dTitle(woo);
		    System.out.println(rve.이상한변호사우영우+" 제작비:"+intArray[2]+"억\n");
		    log1.log(woo);
		    System.out.println("--------------------------------------------\n");
		    
		    System.out.println("그 외 작품들");
		    list.add("마이 네임");
		    list.add("지금 우리 학교는");
		    list.add("스위트홈");
		    list.add("킹덤");
		    
		    System.out.println(list);
		    
		    File readerWriterFile=new File("C:\\코딩\\자바\\workspaces\\First\\src\\Assignment\\files\\text.txt");
		    
		    try(Writer writer=new FileWriter(readerWriterFile)){
		    	writer.write(a+"\n");
		    	writer.write(b);
		    }catch(IOException e) {}
		    
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		
		
		}
}

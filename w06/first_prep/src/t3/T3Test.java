package t3;

public class T3Test {
    public static void main(String[] args) {
    	Professor prof1 = new Professor("Jack Smith","0968123456",90000);
    	prof1.setCourse("Data Structure"); // 教授「資料結構」課程
    	prof1.setRank("Full");             // 正教授
    	prof1.setDeptName("Computer Science"); // 資訊科學系
    	
    	Professor prof2 = new Professor("Steve Bush","0921345678",85000);
    	prof2.setCourse("Operating Systems"); // 教授「作業系統」課程
    	prof2.setRank("Associate");           // 副教授
    	prof2.setDeptName("Electrical Engineering"); 
    	
    	TA ta1 = new TA("John McDonold","0988987654",21000); // TA:教學助理
    	ta1.setGrad("Master");                // 碩士班
    	ta1.setCourse("Basic Computer Concepts"); // 「資訊概論」助教
    	ta1.setDeptName("Computer Science");
    	
    	TA ta2 = new TA("Amy Miller","0938246801",25000,"Doctoral"); // 博士班   
    	ta2.setCourse("C Programming");       // 「C程式語言」助教
    	ta2.setDeptName("Civil Engineering");
    	
    	RA ra1 = new RA("Alex Jones","0939876543",20000);    // RA:研究助理
    	ra1.setGrad("Doctoral");
    	ra1.setResearchID("NSC-2008-10");     //研究計畫編號
    	ra1.setDeptName("Computer Science");
    	
    	RA ra2 = new RA("Mary Adams","0941678954",23000,"Master");     
    	ra2.setResearchID("NSC-2008-20");  
    	ra2.setDeptName("Mathematics");
    	
    	System.out.print(prof1+"\n\n");
    	System.out.print(prof2+"\n\n");
    	System.out.print(ta1+"\n\n");
    	System.out.print(ta2+"\n\n");
    	System.out.print(ra1+"\n\n");
    	System.out.print(ra2+"\n\n");
   }
}


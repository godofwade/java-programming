package t4;

public class T3Test {
    public static void main(String[] args) {
    	int MAX = 10;
    	Employee[] emp = new Employee[MAX];
    	int empCount = 0;
    	emp[empCount] = new Professor("Jack Smith","0968123456",90000);
    	((Professor) emp[empCount]).setCourse("Data Structure"); // 教授「資料結構」課程
    	((Professor) emp[empCount]).setRank("Full");             // 正教授
    	((Professor) emp[empCount++]).setDeptName("Computer Science"); // 資訊科學系
    	
    	emp[empCount] = new Professor("Steve Bush","0921345678",85000);
    	((Professor) emp[empCount]).setCourse("Operating Systems"); // 教授「作業系統」課程
    	((Professor) emp[empCount]).setRank("Associate");           // 副教授
    	((Professor) emp[empCount++]).setDeptName("Electrical Engineering"); 
    	
    	emp[empCount] = new TA("John McDonold","0988987654",21000); // TA:教學助理
    	((TA) emp[empCount]).setGrad("Master");                // 碩士班
    	((TA) emp[empCount]).setCourse("Basic Computer Concepts"); // 「資訊概論」助教
    	((TA) emp[empCount++]).setDeptName("Computer Science");
    	
    	emp[empCount] = new TA("Amy Miller","0938246801",25000,"Doctoral"); // 博士班   
    	((TA) emp[empCount]).setCourse("C Programming");       // 「C程式語言」助教
    	((TA) emp[empCount++]).setDeptName("Civil Engineering");
    	
    	emp[empCount] = new RA("Alex Jones","0939876543",20000);    // RA:研究助理
    	((RA) emp[empCount]).setGrad("Doctoral");
    	((RA) emp[empCount]).setResearchID("NSC-2008-10");     //研究計畫編號
    	((RA) emp[empCount++]).setDeptName("Computer Science");
    	
    	emp[empCount] = new RA("Mary Adams","0941678954",23000,"Master");     
    	((RA) emp[empCount]).setResearchID("NSC-2008-20");  
    	((RA) emp[empCount++]).setDeptName("Mathematics");
    	
    	
    	for(int i=0; i<empCount ; i++) {
    		System.out.print(emp[i]+"\n\n");
    	}
   }
}


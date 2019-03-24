package t2;

public class Parallelogram {
	
	int height;
	int type;
	boolean filled;
	
	public Parallelogram() {
		
	}
	
	public Parallelogram(int height, int type, boolean filled) {
		this.height = height;
		this.type = type;
		this.filled = filled;
	}
	
	public void draw() {
		switch(type) {
			case 1:
				for(int i=1; i<=height; i++) {
					if(i==1 || i==height) {
						prchar(' ',height-i);
						prchar('*',height);
					}
					else {
						prchar(' ',height-i);
						if(filled) {
							prchar('*',height);
						}
						else {
							prchar('*',1);
							prchar(' ',height-2);
							prchar('*',1);
						}
					}
					System.out.println();
				}
				break;
			case 2:
				for(int i=0; i<height; i++) {
					if(i==0 || i==height) {
						prchar(' ',i);
						prchar('*',height);
					}
					else {
						prchar(' ',i);
						if(filled) {
							prchar('*',height);
						}
						else {
							prchar('*',1);
							prchar(' ',height-2);
							prchar('*',1);
						}
					}
					System.out.println();
				}
				break;
		}
	}
	
	@Override
	public String toString() {
		return "Parallelogram: height=" + height + ", type=" + type + ", filled=" + filled ;
	}

	private void prchar(char c, int n) {
		for(int i=0; i<n; i++) {
			System.out.printf("%c", c);
		}
	}
	
}

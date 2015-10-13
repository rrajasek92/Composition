package Composition;

public class Education {
	private String[] schools;
	
	
	public Education(){
		
			schools[0]="Harvard";
			schools[1]="Princeton";
			schools[2]="MIT";
			schools[3]="Duke";
			schools[4]="Alabama";
			schools[5]="Georgia";
			schools[6]="Texas A&M";
			schools[7]="Ole Miss";
			schools[8]="Kentucky";
			schools[9]="Auburn";
		
			}
	@Override
	public String toString(){
		String a="";
		for (int i=0;i<9;i++){
			a=a+schools[i]+"\n";
		}
		return a;
	}

}

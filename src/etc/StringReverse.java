package etc;

public class StringReverse {

	private String target;
	
	public StringReverse(){};
	
	public StringReverse(String target){
		this.target = target;
	};
	
	public String reverse(){
		char[] array = this.target.toCharArray();
		
		String result = "";
		for(int i = array.length -1; i >= 0; i--){
			result += array[i];
		}
		
		return result;
	}
}

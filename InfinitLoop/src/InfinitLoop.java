
public class InfinitLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;;i++) {
			if(i!=1000) {
				System.out.println(i);
			}
			if(i==2000) {
				return;
			}
		}
	}

}

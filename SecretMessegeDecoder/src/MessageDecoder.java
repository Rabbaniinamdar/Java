import java.util.Scanner;

class MsgDec {
	public int decodeCharacter(char ch) {
		return ch;
	}
public class MessageDecoder{
	public static void main(String[] args) {
		MsgDec md=new MsgDec();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		System.out.println(md.decodeCharacter(ch));
		}
	}
}

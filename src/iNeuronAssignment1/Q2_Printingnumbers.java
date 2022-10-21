package iNeuronAssignment1;
//Write a program to print
//1 1 1 1
//2 2 2 2
//3 3 3 3
//4 4 4 4
public class Q2_Printingnumbers {
public static void main(String[] args) {
	int count=0;
	for(int i=0;i<4;i++) {
		while(count<4) {
		System.out.print(i+1+" ");
		count++;
		}
		System.out.print("\n");
		count=0;
	}
}
}

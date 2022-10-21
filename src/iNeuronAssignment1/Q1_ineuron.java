package iNeuronAssignment1;

//1.Write a program(WAP) to print INEURON using pattern programming logic.
public class Q1_ineuron {
public static void main(String[] args) {
	int n=10;
	for(int i=0;i<n;i++) {
//		Printing I
		for(int j=0;j<n;j++) {
			if(i==0 || i==n-1 || j==(n-1)/2) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("    ");
//		Printing N
		for(int j=0;j<n;j++) {
			if(j==0 || j==n-1 || i==j) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("    ");
//		Printing E
		for(int j=0;j<n;j++) {
			if((i==0) || (i==(n-1)/2) || (i==n-1) ||j==0) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("    ");
//		Printing U
		for(int j=0;j<n;j++) {
			if((j==0 && i<n-1) || (j==n-1 && i<n-1) || (i==n-1 && j>0 && j<n-1) ){
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("    ");
//		Printing R
		for(int j=0;j<n;j++) {
			if( j==0 || (i==0 && j<n-1) || (i==(n-1)/2 && j<n-1) || (i!=(n-1)/2 && j==n-1 && i!=0)	) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("    ");
//		Printing O
		for(int j=0;j<n;j++) {
			if((i==0 && j>0 && j<n-1) || (i==n-1 && j>0 && j<n-1) || (j==0 && i>0 && i <n-1) || (j==n-1 && i>0 && i <n-1) ) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("    ");
//		Printing N
		for(int j=0;j<n;j++) {
			if(j==0 || j==n-1 || i==j) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
}
}

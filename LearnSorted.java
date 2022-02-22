import java.util.Scanner;

public class LearnSorted {
    public static boolean AlreadySorted(int a[]){
        int len=a.length;
        for(int i=0;i<len;i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] > a[j]) {
                    return false;
                }

            }
        }
                return true;
            }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int size=sc.nextInt();
        System.out.print("Enter Element: ");
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
            System.out.println(AlreadySorted(a));
    }
}

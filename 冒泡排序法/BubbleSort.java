import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入你想要比较数字的个数：");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("输入你想要比较数字：");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int j:arr)
        {
            System.out.print(j + "\t");
        }
    }
}

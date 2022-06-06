package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要排序数字个数：");
        int c=sc.nextInt();
        int[] b=new int[c];
        int count=0;
        System.out.println("请输入需要排序数字：");
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
            }
        sc.close();
        for(int i=0;i<b.length-1;i++){
            for (int j = 0; j < b.length-1-i; j++) {
				if (b[j]>b[j+1]) {
					int temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
				count++;
			}
        }
        System.out.println("最终排序为："+Arrays.toString(b));
		System.out.println("一共比较了："+count+"次");
        System.out.println("比较完成！！");
    }
}

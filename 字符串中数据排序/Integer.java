import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        String s="91 27 46 38 58";
        String[] a=s.split(" ");
        int[] arr=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            arr[i]=Integer.parseInt(a[i]);
        }
        Arrays.sort(a);
        StringBuilder sp=new StringBuilder();
        for (int i=0;i<a.length;i++)
        {
            if(i==a.length-1)
            {
                sp.append(a[i]);
            }
            else
            {
                sp.append(a[i]).append(" ");
            }
        }
        String result=sp.toString();
        System.out.println("结果:"+result);
    }
}

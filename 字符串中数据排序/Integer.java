import java.util.Arrays;
public class Integer {
    public static void main(String[] args) {
        String s="91 27 46 38 58";
        String[] a=s.split(" ");
        int[] arr=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            arr[i]=Integer.parseInt(a[i]);
        }
        Arrays.sort(a);
        System.out.println("排序结果如下："+Arrays.toString(a));
    }
}

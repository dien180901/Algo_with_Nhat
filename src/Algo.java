public class Algo {
    public static int p1(int[] arr){
        int l1=arr[0];
        int l2=arr[0];
        for(int i=0;i<arr.length;i+=1){
            if (arr[i]>l1){
                l2=l1;
                l1=arr[i];
            }else if (arr[i]>l2){
                l2=arr[i];
            }
        }
        return l2;
    }
    public static int p2(int[] arr){
        int count[]=new int[101];
        for (int i=0;i<arr.length;i+=1){
            count[arr[i]]+=1;
        }
        int i;
        for (i=1;i<101;i+=1){
            if (count[i]==0){
                break;
            }
        }
        return i;
    }
    public static boolean p3(int[] arr){
        if (arr.length==1){
            return true;
        }
        int ma=-1000000000,mi=1000000000;
        for (int i=0;i<arr.length;i+=1){
            if (arr[i]<mi){
                mi=arr[i];
            }else if (arr[i]>ma){
                ma=arr[i];
            }
        }
        return (ma-mi)==arr.length;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1};
        System.out.println(p1(arr));
    }
}

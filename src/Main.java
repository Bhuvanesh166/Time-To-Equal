import java.util.Scanner;

class Time{
    public static int timeToEqual(int[] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]<max){
                sum+=max-arr[j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size:");
        int sze= scanner.nextInt();
        System.out.println("Enter array Element");
        int arr[]=new int[sze];
        for (int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Time to Euqal: "+timeToEqual(arr));
    }
}
public class AddAlternate {
    // method to store the alternate value of the array
    public static void Alternate(int arr1[],int arr2[])
    {
        int j=0;
        for(int i=0;i<arr1.length;i+=2)
        {
            arr2[j] = arr1[i];
            j++;
        }
        sumofArray(arr2);
    }
    public static void sumofArray(int arr2[])
    {
        int sum=0;
        for(int i=0;i<arr2.length;i++)
        {
            sum += arr2[i];
        }
        System.out.print("The sum of the alternate element of the aray is: "+sum);
    }
    public static void main(String args[])
    {
        // initialize the Arrays
        int arr1[]={10,20,30,40,50,60,70,80,90,100};
        int arr2[]= new int[5];
        Alternate(arr1, arr2);
    }
}


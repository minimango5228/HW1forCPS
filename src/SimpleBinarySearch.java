public class SimpleBinarySearch
{
    public static void main(String[] args)
    {
        int[] array = {1,3,4,5,7,8,9};
        int target = 3;
        int leftP = 0;
        int rightP = array.length - 1;

        while(leftP <= rightP)
        {
            int midP = leftP + (rightP - leftP) / 2;

            if (array[midP] < target)
            {
                leftP = midP + 1;
            }
            else if (array[midP] > target)
            {
                rightP = midP - 1;
            }
            else
            {
                System.out.println(midP);
                break;
            }

        }
    }
}

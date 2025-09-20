public class ArrayPractice
{
    public static void main(String[] args)
    {
        int[] array = {7, 0, 9, 1, 4, 6, -1};
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }

        System.out.println(max);
        System.out.println(min);
    }
}

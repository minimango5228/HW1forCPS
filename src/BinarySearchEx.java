//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BinarySearchEx {
    public static void main(String[] args) {

        int[] array = {1, 3, 4, 5, 7, 9};
        int target = 7;
        int leftP = 0;
        int rightP = array.length - 1;

        while(leftP <= rightP)
        {
            int midP = leftP + (rightP - leftP) / 2;
//      Check if midpoint is less than the starting point

            if(array[midP] < target)
            {
                leftP = midP +1;
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

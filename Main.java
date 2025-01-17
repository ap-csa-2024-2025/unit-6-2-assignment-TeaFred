import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length");
    int len = sc.nextInt();

    int[] arr = new int[len];
    System.out.println("Enter values");
    for (int i = 0; i < len; i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("Contains negative: " + containsNeg(arr));
  }

  public static boolean containsNeg(int[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] <= 0)
      {
        return true;
      }
    }
    return false;
  }

  public static int numDivisibleBy3 (int[] arr)
  {
    int threecounter;
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i]%3 == 0)
      {
        threecounter++;
      }
    }
      return threecounter;
  }

  public static int numDivisible (int[] arr, num)
  {
    int numcounter;
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i]%numcounter == 0)
      {
        numcounter++;
      }
    }
    return numcounter++;
  }
}

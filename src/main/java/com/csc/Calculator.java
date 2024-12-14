package com.csc;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Calculator {
  
  public int maximumUsingForLoop(int[] nums) 
  {
    int max = nums[0];
    for(int i = 0; i < nums.length; i++)
    {
      if (max < nums[i]) {
        max = nums[i];
      }
    }

    return max;
  }
  public int minimumUsingForLoop(int[] nums) 
  { 
    int min = nums[0];
    for(int i = 0; i < nums.length; i++)
    {
      if (min > nums[i]) {
        min = nums[i];
      }
    }

    return min;
  }
  public int sumUsingForLoop(int[] nums) 
  {
    int sum = 0;
    for(int i = 0; i < nums.length; i++)
    {
      sum += nums[i];
    }

    return sum;
  }
  public int averageUsingForLoop(int[] nums) 
  {
    int quantity = nums.length;
    int sum = 0;
    int avg = 0;
    for(int i = 0; i < nums.length; i++)
    {
      sum += nums[i];
    }

    avg = sum/quantity;

    return avg;

  }
  
  public int maximumUsingStream(int[] nums) 
  {
    int max = Arrays.stream(nums).max().getAsInt();
    return max;
  }
  public int minimumUsingStream(int[] nums) 
  {
    int min = Arrays.stream(nums).min().getAsInt();
    return min;
  }
  public int sumUsingStream(int[] nums) 
  {
    int sum = Arrays.stream(nums).reduce(0, (x,y) -> x+y);
    return sum;
  }
  public double averageUsingStream(int[] nums) 
  {
    double avg = Arrays.stream(nums).mapToDouble(no->no).average().getAsDouble();
    return avg;
  }
  public int[] filterEvensOnly(int[] nums)
  {
    int[] evens = Arrays.stream(nums).filter(n -> n % 2 == 0).toArray();
    return evens;
  }
  public int[] filterOddsOnly(int[] nums)
  {
    int[] odds = Arrays.stream(nums).filter(n -> n % 2 == 1).toArray();
    return odds;
  }

  public static void main(String[] args) {
    System.out.println("This class can house your driver program and / or your functions.");
  }
}

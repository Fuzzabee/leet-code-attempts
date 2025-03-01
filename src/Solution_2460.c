#include <stdio.h>
#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* applyOperations(int* nums, int numsSize, int* returnSize) {
  // Creating space for temp array
  int* temp = malloc(numsSize * sizeof(int));

  // Copying initial array to temp to preserve nums
  for (int i = 0; i < numsSize; i++) {
    temp[i] = nums[i];
  }
  
  // Checking i and i + 1 in array and applying operation if equal
  for (int i = 0; i < numsSize - 1; i++) {
    if (temp[i] == temp[i + 1]) {
      temp[i] = 2 * temp[i];
      temp[i + 1] = 0;
    }
  }

  // Creating the return array as a more simple way of moving 0's to end
  int* result = malloc(numsSize * sizeof(int));
  int rIndex = 0;
  for (int i = 0; i < numsSize; i++) {
    if (temp[i] != 0) {
      result[rIndex] = temp[i];
      rIndex++;
    }
  }

  // Ensuring remaining elements are 0
  for (int i = rIndex; i < numsSize; i++) {
    result[i] = 0;
  }

  // Setting return values and freeing memory
  free(temp);
  *returnSize = numsSize;
  return result;
}

int main() {
  int nums[] = {1,2,2,1,1,0};
  int size = 6;
  int resultSize = 0;
  int* result = applyOperations(nums, size, &resultSize);
  for (int i = 0; i < resultSize; i++) {
    printf("%d ", result[i]);
  }
  printf("\n");
  free(result);

  int nums2[] = {1,0};
  size = 2;
  resultSize = 0;
  result = applyOperations(nums2, size, &resultSize);
  for (int i = 0; i < resultSize; i++) {
    printf("%d ", result[i]);
  }
  printf("\n");
  free(result);

  return 0;
}
/*
升序排列
最原始的冒泡排序写法
*/

#include <stdio.h>

void swap(int* a_pointer, int* b_pointer);
void bubbleSort(int array[], int length) ;

void swap(int* a_pointer, int* b_pointer)
{
    int temp = *a_pointer;
    *a_pointer = *b_pointer;
    *b_pointer = temp;
}

void bubbleSort(int array[], int length)
{
    for(int i = 0; i < length; i++)
    {
      for(int j = 1; j < length-i; j++)
      {
        if(array[j-1] > array[j])
        {swap(&array[j-1], &array[j]);}
      }
    }
}


int main()
{
    int length = 0;
    int array[100];
    scanf("%d", &length);
    for(int i = 0; i < length; i++)
    {
        scanf("%d", &array[i]);
    }

    bubbleSort(array, length);

    for(int i = 0; i <length; i++)
    {
        printf("%d\n", array[i]);
    }
    return 0;
}

/*
升序排列
记录下无序的位置，下次排序判断时，只需要从数组头部遍历到该
位置就可以了，这样可以省去遍历后面的元素
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
    int flag = length;
    while(flag > 0)
    {
        int k = flag;
        flag = 0;
        for(int j = 1; j < k; j++)
        {
            if(array[j-1] > array[j])
            {
                swap(&array[j-1], &array[j]);
                flag = j;
            }
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

/*这个版本可以在已经完全成序的时候就退出循环，
减少不必要的比较*/
#include <stdio.h>
typedef int BOOL;
#define TRUE 1
#define FALSE 0

void swap(int* a_pointer, int* b_pointer);
void bubbleSort(int array[], int length) ;

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

void bubbleSort(int array[], int length)
{
    BOOL flag = TRUE;//判断是否发生交换
    while (flag)
    {
        flag = FALSE;
        for (int j = 1; j < length; j++)
        {
            if (array[j-1] > array[j])
            {
                swap(&array[j-1], &array[j]);
                printf("array[j-1] = %d, array[j] = %d\n", array[j-1], array[j]);
                flag = TRUE;
            }
        }
        length --;
    }
}

void swap(int* a_pointer, int* b_pointer)
{
    int temp = *a_pointer;
    *a_pointer = *b_pointer;
    *b_pointer = temp;
}

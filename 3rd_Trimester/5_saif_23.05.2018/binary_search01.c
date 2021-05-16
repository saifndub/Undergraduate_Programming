#include <stdio.h>
int main()
{
    int n, i, first, last, mid, search, array[100];
    while (1)
    {
        printf("Enter number of elements :\n");
        scanf("%d", &n);

        printf("Enter %d sorted integers :\n", n);

        for (i = 0; i < n; i++)
            scanf("%d", &array[i]);

        printf("Enter value to search :\n");
        scanf("%d", &search);
        first = 0;
        last = n-1 ;
        mid = (first + last)/2;

        while (first <= last && search != array[mid])
        {
            if (search < array[mid])
                last = mid - 1;

            else if (search > array[mid])
                first = mid + 1;

            mid = (first + last)/2;
        }

        if (array[mid] == search)
        {
            printf("%d found at location %d.\n", search, mid+1);
            //break;
        }
        else //if (first > last)
            printf("Not found! %d isn't present in the list.\n", search);
    }
    return 0;
}
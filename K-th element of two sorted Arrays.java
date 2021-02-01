//using merge sort merge operation
class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int l) {
        int sorted[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                sorted[k]=arr1[i];
                i++;
            }
            else
            {
                sorted[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n)
        {
            sorted[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m)
        {
            sorted[k]=arr2[j];
            j++;
            k++;
        }
        return sorted[l-1];
    }
}

//using the binary search
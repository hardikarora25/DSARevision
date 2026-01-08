public class ceilandfloor {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
     int start = 0, end = n - 1;
    int floor = -1, ceil = -1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (a[mid] == x) {
            return new int[]{x, x};
        } 
        else if (a[mid] < x) {
            floor = a[mid];
            start = mid + 1;
        } 
        else {
            ceil = a[mid];
            end = mid - 1;
        }
    }

    return new int[]{floor, ceil};
    }
    
}

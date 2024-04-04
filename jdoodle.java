void merge(int[] X, int[] Y, int m, int n) {
    int i = m - 1, j = n - 1, k = m + n - 1;

    // Merge in reverse order
    while (i >= 0 && j >= 0) {
        if (X[i] > Y[j]) {
            X[k--] = X[i--];
        } else {
            X[k--] = Y[j--];
        }
    }

    // Copy remaining elements of Y[]
    while (j >= 0) {
        X[k--] = Y[j--];
    }
}
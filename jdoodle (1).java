int maxSumPath(int[] X, int[] Y, int m, int n) {
    int i = 0, j = 0, result = 0, sum1 = 0, sum2 = 0;

    while (i < m && j < n) {
        if (X[i] < Y[j]) {
            sum1 += X[i++];
        } else if (X[i] > Y[j]) {
            sum2 += Y[j++];
        } else {
            result += Math.max(sum1, sum2) + X[i];
            sum1 = 0;
            sum2 = 0;
            i++;
            j++;
        }
    }

    while (i < m) {
        sum1 += X[i++];
    }

    while (j < n) {
        sum2 += Y[j++];
    }

    result += Math.max(sum1, sum2);
    return result;
}
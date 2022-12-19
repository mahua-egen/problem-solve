public class TwoArrayFlatPrint {
    public static void main(String[] args) {
        int[][] a = new int[4][5];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[0][3] = 4;
        a[0][4] = 5;

        a[1][0] = 1;
        a[1][1] = 2;
        a[1][2] = 3;
        a[1][3] = 4;
        a[1][4] = 5;

        a[2][0] = 1;
        a[2][1] = 2;
        a[2][2] = 3;
        a[2][3] = 4;
        a[2][4] = 5;

        a[3][0] = 1;
        a[3][1] = 2;
        a[3][2] = 3;
        a[3][3] = 4;
        a[3][4] = 5;
        arrayPrint(a);
    }

    public static void arrayPrint(int[][] a) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(a[i][j]);
                if (j == (4 - i)) {
                    for (int k = 1; k < 4; k++)
                        System.out.print(a[k][j]);
                }
            }
        }
        System.out.println();
    }
}


//input:
//        {1,2,3,4,5}
//        {1,2,3,4,5}
//        {1,2,3,4,5}
//        {1,2,3,4,5}
//output:  123455551234444123333

//for(i=0;i<4;i++)
//  for(j=0;j<5-i;j++)
//     print(a[i][j])
//     for(k=1;k<4;k++)
//         print(a[k][j])
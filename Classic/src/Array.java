public class Array {
    void Dimension(){
        int a[][] ={{2,4,6,7,2},{5,2,7,8,3}};
        int b[][] ={{10,3,44,32,5},{25,22,47,8,23}};
        int c[][] = new int [2][5];

        for (int i=0;i<2;i++){
            for (int j=0;j<5;j++){
                c[i][j]=a[i][j]*b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

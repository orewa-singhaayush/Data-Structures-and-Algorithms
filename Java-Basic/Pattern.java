public class Pattern {
    public static void main(String[] args) {
        // pattern solid square
        // int n=5;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=n;col++){
        //         System.out.print("* ");
        //     }
        // System.out.println();
        // }
        // pattern solid rectangle
        // int m=3;
        // for(int row=1;row<=m;row++){
        //     for(int col=1;col<=6;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // pattern right angle triangle
        // int n=5;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=row;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // pattern inverted right angle triangle
        // int n=5;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=n-row+1;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // pattern solid rhombus
        // int n=5;
        // for(int row=1;row<=n;row++){
        //     for(int space=1;space<=n-row;space++){
        //         System.out.print(" ");
        //     }
        //     for(int col=1;col<=n;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        
        // pattern pyramid
        // int n=5;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=n-row;col++){
        //         System.out.print("  ");
        //     }
        //     for(int col=1;col<=2*row-1;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // pattern inverted pyramid
        // int n=5;
        // for(int row=1;row<=n;row++){
        //     for(int col=1;col<=row-1;col++){
        //         System.out.print("  ");
        //     }
        //     for(int col=1;col<=2*(n-row)+1;col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // hollow pyramid
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            if(row==1||row==n){
                for(int col=1;col<=2*row-1;col++){
                    System.out.print("* ");
                }
            }else{
               System.out.print("* ");
               for(int col=1;col<=2*row-3;col++){
                System.out.print("  ");
               }
               System.out.print("* ");
            }
            System.out.println();
        }
    }
}

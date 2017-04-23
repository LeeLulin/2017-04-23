public class ShiJian2 {
	public static void main(String args[]){
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{10,11,12},{13,14,15},{16,17,18}};
		int[][] c=new int[3][3];
		int i,j;
		System.out.println("数组a为：");
		for(i=0;i<a.length;i++){
			for(j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("数组b为：");
		for(i=0;i<b.length;i++){
			for(j=0;j<b[i].length;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("数组c为：");
		for(i=0;i<c.length;i++){
			for(j=0;j<c[i].length;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
		System.out.println();
	}
	}

}
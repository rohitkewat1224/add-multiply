public class matrixAdd {

public static void main(String[] args) {  
int a[][]={{1,1,1},{1,1,1},{1,1,1}};   
int b[][]={{2,2,2},{2,2,2},{2,2,2}};     
int c[][]=new int[3][3];  
for(int i=0;i<3;i++){   
for(int j=0;j<3;j++){   
c[i][j]=a[i][j]+b[i][j];   
System.out.print(c[i][j]+" ");   
}   
System.out.println(); 
} 
}
}


//

Output:
3 3 3
3 3 3
3 3 3






//sol-2: multiplication.


public class MatrixMultiplication{  
public static void main(String args[]){   
int a[][]={{1,1,1},{1,1,1},{1,1,1}};   
int b[][]={{2,2,2},{2,2,2},{2,2,2}};    
int c[][]=new int[3][3];  
for(int i=0;i<3;i++){   
for(int j=0;j<3;j++){   
c[i][j]=0;    
for(int k=0;k<3;k++)    
{    
c[i][j]+=a[i][k]*b[k][j];    
} 
System.out.print(c[i][j]+" ");  
}  
System.out.println();  
}   
}}  


//Output:
6 6 6 
6 6 6 
6 6 6

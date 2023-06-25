class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
           int temp=image.length-1;
           for(int j=0;j<image.length/2;j++)
           {
               int temp1=image[i][j]==1?0:1;
               image[i][j]=image[i][temp]==1?0:1;
               image[i][temp]=temp1;
               temp--;
           }
           if(image.length%2!=0)
                image[i][temp]=image[i][temp]==1?0:1;
        }
        return image;
    }
}

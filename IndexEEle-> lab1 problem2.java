public class IndexEEle {
    static int a[] = {-3,-1,0,1,4,6,7,8};
  static int flag = 0;
    public static void find(int l,int h)
    {
        int mid=(l+h)/2;
        
       if (mid<a[mid]) 
        find(l,mid-1);
        
       else if (mid>a[mid])
        find(mid+1,h);
        
       else 
        {
        flag = 1;
        System.out.println("The index which is same as the element at its position is "+mid);
        System.exit(0);
        }
        
    }
    
    public static void main(String args[])
    {
        
        find(0,a.length-1);
        if(flag == 0)
          System.out.println("There is no such element");
    }
}

// built in exceptions

import java.lang.*;
class builtin{
    public static void main(String args[]){
        try{
            int a[] = {1,4,5,7,9,12};
            System.out.println(a[445]);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
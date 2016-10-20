public class StringProcess
{
    public static boolean isPalindrome(String s)
    {
        int n = s.length();
        for (int i = 0; i < n/2; i++)
        {
            if(s.charAt(i)!=s.charAt(n-1-i))
            {return false;}
        }
        return true;
    }

    //提取文件名和一个拓展名
    //如果需要，可以构造类来返回，这里只是展示一下过程
    //If neccessary, build a class to return them,
    //it is just a show of process
    public static void splitFName(String filename)
    {
        int dot = filename.indexOF(".");
        String base = filename.subString(0, dot);
        String extension = filename.subString(dot+1, filename.length);
    }



}

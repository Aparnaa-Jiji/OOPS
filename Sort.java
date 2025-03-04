public class Sort
{
    public static void main(String[] args)
    {
        String[] strings = {"Virat","Jadeja","Messi","Anderson","Zaka"};
        for(int i =0;i<strings.length;i++)
        {
            for(int j = i+1;j<strings.length;j++)
            {
                if(strings[i].compareTo(strings[j])>0)
                {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
    System.out.println("Sorted Strings:");
        for (String str : strings) {
            System.out.println(str);
    }
}
}

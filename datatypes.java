    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();

    for(int i=0;i<t;i++)
    {

        try
        {
            long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");
    if (sc.hasNextByte())
            System.out.println("* byte");
    if (sc.hasNextShort())
            System.out.println("* short");
    if (sc.hasNextInt())
            System.out.println("* int");
    if (sc.hasNextLong())
            System.out.println("* long");

        }
        catch(Exception e)
        {
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }

    }
}






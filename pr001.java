class pr001 {
        public static void main(String args[]) {
                System.out.println("Первая программа на Джава");
                int Var1=1024;
                int Var2345678;
                Var2345678 = 411;
                System.out.println(Var1/2);
                System.out.println("result: " + Var2345678/2);
                System.out.println("result privedeniem tipa double: " + (double)Var2345678/2);
                double Var3 = (double)Var2345678/2;
                //if (Var1 = 0_
                //      System.out.println("yslovlie Var1=0 vipolneno"); nesovmest tipov
                if (Var1/2==512)
                        System.out.println("yslovie \"Var1=0\" vipolneno");
                if(true)
                        System.out.println("\tYslovie TRUE \n\tviponeno");

                //primer ispolzovaniya operatora FOR
                System.out.println("stroka proverki");
                for (int i=0; i<10; i++)
                        System.out.println("Stroka nomer " + i);
		//i = 10;
		System.out.println();
		int j;
		for (j=0; j<10; j++)
			System.out.println(j + " ");
		System.out.println();
	}
}

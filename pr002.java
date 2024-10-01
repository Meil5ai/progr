class pr002 {
        public static void main(String args[]) {
                byte b, bb, bbb;
                short s, ss, sss;
                int i, ii, I;
                long l, ll, L;
                b=127;
                bb=(byte)130;
                s=32000;
                ss=(short)330000;
                System.out.println("bb = " +bb +"\nss = " +ss);
                sss=100;
                bbb=(byte)sss;
                System.out.println("bbb = " + bbb + "\nsss = " + sss);
                ii=7000000;
                int V = ii*ii*ii;
                long VV = (long)ii*ii*ii;
                System.out.println(VV);

                double d, dd;
                d=b/2;
                System.out.println("d =" +d);
                dd =(double)b/2;
                System.out.println("dd = " +dd);

        }
}

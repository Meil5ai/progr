class Avtomobil {
        int pass; //кол-во пассажиров
        int v; //объем топл бака в л.
        double rash; //расод топлива в л. на 100 км. 
}
class pr004 {
        public static void main(String args[]) {
                //Созадние экземпляра класса
                Avtomobil lada = new Avtomobil();
                int rasst;

                //Присваиваем значение внутренним переменным экземпляра класса
                lada.pass = 4;
                lada.v = 40;
                lada.rash = 9.5;


                //Расчет расстояния, которое lada проедет на полном баке
                rasst =(int) (lada.v/lada.rash * 100);

                System.out.println("Lada проедет " + rasst + "км, на полном баке");
        
	}
}

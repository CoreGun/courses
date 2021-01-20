package eu.senla.task1;

public class Main {

    //глобальные Main (с маленькой буквы примитивы, с большой обертки, стринг класс)(
    static byte byteGlobalMain;//примитив
    static Byte ByteGlobalMain;//обертка
    static short shortGlobalMain;//
    static Short ShortGlobalMain;
    static int intGlobalMain;
    static Integer IntegerGlobalMain;
    static long longGlobalMain;
    static Long LongGlobalMain;
    static float floatGlobalMain;
    static Float FloatGlobalMain;
    static double doubleGlobalMain;
    static Double DoubleGlobalMain;
    static char charGlobalMain;
    static Character CharacterGlobalMain;
    static boolean booleanGlobalMain;
    static Boolean BooleanGlobalMain;
    static String StringGlobalMain;
    // )глобальные Main


    public static void main(String[] args) {
        //Локальные метода (
        byte byteLocalMain = 121;
        short shortLocalMain = 2741;
        int intLocalMain = 423564;
        long longLocalMain = 52334134;
        float floatLocalMain = 3312.54f;
        double doubleLocalMain = 3.14;
        char charLocalMain = '5';
        boolean booleanLocalMain = true;
        String StringLocalMain = "1";
        // ) Локальные метода
        //Выводим локальные переменные
        System.out.println("Локальные переменные: byte - " + byteLocalMain + "; short - " + shortLocalMain + "; int - " + intLocalMain + "; long - "
                + longLocalMain + "; float - " + floatLocalMain + "; double - " + doubleLocalMain + "; char - " + charLocalMain + "; boolean - " + booleanLocalMain + "; String - " + StringLocalMain);
        //остальные переменные = 0 или Null или false
        //присваиваю глобальной переменной Main значения разными спосабами
        Number num = new Number();

        //to byte
        byteGlobalMain = (byte) shortLocalMain;
        System.out.println(byteGlobalMain);//-75  short можно, явное приведение, но byte меньше

        num.setC(652654);
        byteGlobalMain = (byte) num.getC();
        System.out.println(byteGlobalMain);//110  int можно, явное приведение, но byte меньше

        num.setdLong(564L);
        byteGlobalMain = (byte)(long)num.getdLong();//обертка дабл не влезает, сначала развернули
        System.out.println(byteGlobalMain);//52 long можно, явное приведение, но byte меньше

        ByteGlobalMain = (byte) floatLocalMain;
        System.out.println(ByteGlobalMain);//-16 float можно, явное приведение, сужающее преобразование но byte меньше и режет дробь

        num.setF(6542.4122);
        ByteGlobalMain =(byte) num.getF();
        System.out.println(ByteGlobalMain);//-114 double можно, явное приведение, сужающее преобразование но byte меньше и режет дробь

        num.setgChar('9');
        ByteGlobalMain =(byte)(char)num.getgChar();
        System.out.println(ByteGlobalMain);//57 char можно, явное приведение, но byte меньше

        //zM = (byte) booleanLocalMain; //boolean нельзя

        //to short
        shortGlobalMain = byteLocalMain;
        System.out.println(shortGlobalMain); //121 byte можно, автоматически

        num.setcInteger(1188899);
        shortGlobalMain = (short)(int)num.getcInteger();//обертка дабл не влезает, сначала развернули
        System.out.println(shortGlobalMain); //9251 int можно, явное приведение, но short меньше

        num.setD(98456321);
        shortGlobalMain =(short) num.getD();
        System.out.println(shortGlobalMain); //21249 long можно, явное приведение, но short меньше

        ShortGlobalMain = (short) floatLocalMain;
        System.out.println(ShortGlobalMain); //3312 float можно, явное приведение, но short меньше и режет дробь

        num.setfDouble(84561654.455646);
        ShortGlobalMain = (short)(double)num.getfDouble();//обертка дабл не влезает, сначала развернули
        System.out.println(ShortGlobalMain);//20214 double можно, явное приведение, но short меньше и режет дробь

        num.setG('8');
        ShortGlobalMain =(short) num.getG();
        System.out.println(ShortGlobalMain); // 56 char можно, явное приведение, но short меньше

        //xM = (short) booleanLocalMain; //boolean нельзя

        //to int
        intGlobalMain = byteLocalMain;
        System.out.println(intGlobalMain); //121 byte можно, автоматически

        num.setB((short)3299);
        intGlobalMain = num.getB();
        System.out.println(intGlobalMain);//3299  short можно, автоматически

        intGlobalMain =(int)(long) num.getdLong();//обертка дабл не влезает, сначала развернули
        System.out.println(intGlobalMain); //564 long можно, явное приведение, но int меньше

        IntegerGlobalMain =(int)floatLocalMain;
        System.out.println(IntegerGlobalMain); //3312 float можно, явное приведение, но int меньше и режет дробь

        num.setfDouble(36.58);
        intGlobalMain = (int)(double)num.getfDouble();//обертка дабл не влезает, сначала развернули
        System.out.println(intGlobalMain); // 36 double можно, явное приведение, но int меньше и режет дробь

        intGlobalMain = charLocalMain;
        System.out.println(intGlobalMain); //53 char можно, автоматически

        //to long
        longGlobalMain = byteLocalMain;
        System.out.println(longGlobalMain); //121 byte можно, автоматически

        longGlobalMain = shortLocalMain;
        System.out.println(longGlobalMain); // 2741 short можно, автоматически

        longGlobalMain = intLocalMain;
        System.out.println(longGlobalMain); //423564 int можно, автоматически

        longGlobalMain =(long) floatLocalMain;
        System.out.println(longGlobalMain); //3312 float можно, явное приведение, но long меньше и режет дробь

        longGlobalMain =(long) doubleLocalMain;
        System.out.println(floatGlobalMain); //0.0 double можно, явное приведение, но long меньше и режет дробь

        longGlobalMain = charLocalMain;
        System.out.println(floatGlobalMain); //0.0 char можно, автоматически

        //to float
        floatGlobalMain = byteLocalMain;
        System.out.println(floatGlobalMain); //121.0 byte можно, автоматически

        floatGlobalMain = shortLocalMain;
        System.out.println(floatGlobalMain); //2741.0 short можно, автоматически

        floatGlobalMain = intLocalMain;
        System.out.println(floatGlobalMain); //423564.0 int можно, автоматически

        floatGlobalMain = longLocalMain;
        System.out.println(floatGlobalMain); //5.2334136E7 long можно, автоматически

        floatGlobalMain =(float) doubleLocalMain;
        System.out.println(floatGlobalMain); //3.0 double можно, явное приведение

        floatGlobalMain = charLocalMain;
        System.out.println(floatGlobalMain); //53.0 char можно, автоматически

        //to double
        doubleGlobalMain = byteLocalMain;
        System.out.println(doubleGlobalMain); //121.0 byte можно, автоматически

        doubleGlobalMain = shortLocalMain;
        System.out.println(doubleGlobalMain); //2741.0 short можно, автоматически

        doubleGlobalMain = intLocalMain;
        System.out.println(doubleGlobalMain); //423564.0 int можно, автоматически

        doubleGlobalMain = longLocalMain;
        System.out.println(doubleGlobalMain); //5.2334134E7 long можно, автоматически

        doubleGlobalMain = floatLocalMain;
        System.out.println(doubleGlobalMain); //3312.5400390625 float можно, автоматически

        doubleGlobalMain = charLocalMain;
        System.out.println(doubleGlobalMain); //53.0 char можно, автоматически

        //to char
        charGlobalMain =(char) byteLocalMain;
        System.out.println(charGlobalMain); //y byte можно, явное приведение

        charGlobalMain =(char) shortLocalMain;
        System.out.println(charGlobalMain); //વ short можно, явное приведение

        charGlobalMain =(char) intLocalMain;
        System.out.println(charGlobalMain); //皌 int можно, явное приведение

        charGlobalMain =(char) longLocalMain;
        System.out.println(charGlobalMain); //踶 long можно, явное приведение

        charGlobalMain =(char) floatLocalMain;
        System.out.println(charGlobalMain); //೰ float можно, явное приведение

        charGlobalMain =(char) doubleLocalMain;
        System.out.println(charGlobalMain); // double можно, явное приведение



    }

}
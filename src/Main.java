//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    char c = 454; // тип char 2 bytes
    char c2 = 'Q'; // одни кавычки '' + в типе можно хранить ТОЛЬКО один симовол (в кавычках) буквенный или число
    // + это  плюс
    // - это минус
    // * это умножение
    // / это деление
    // % это остаток от деления
    // Х++ это постинкремент
    // ++Х это преинкремет
    // Х-- это постдекремент
    // --Х это предекремет
    int x = 6, y = 25;
    int z = x + y;
        System.out.println(z);
    int a = z * (x - y); // скобки задают приоритет операций (как и в математике)
        System.out.println(a);
    double b = x / (double) y; // пробразование типа int -> double
    // если мы делим целое на целое, то на выходе мы получаем целое
    // например int / int -> int
    // int / byte -> int
    // byte / short -> short
    // но если мы делим вещественное на вещественное -> мы всегда получаем вещественное (с дробной частью)
    // double / float -> double
    // и если мы делим вещественное на целое или наоборот, то мы ВСЕГДА получаем вещественное
    // float / int -> float
    // char / double -> double
    // если мы делим long / double -> double
    // в JAVA нельзя преобразовать больший тип в меньший
        System.out.println(b);
    //  7%3=>1 --> 2 1/3 и то что будет в числителе (1) это и будет остаток
    //  15%4 --> 3 3/4 т.е. остаток 3
        System.out.println(x%y);
    // y=y+1 <==> y++
    y = y+1;
    y++;
    // y=y-1 <==> y--
    y = y-1;
    y--;
        System.out.println(y);
    // f = (y+1)*10
    int f = y++*10;
    // операция 1 - у=y*10
    // операция 2 - у=y++
        System.out.println(f);
        System.out.println(y);
    int k = ++y*10;
    // операция 1 - у=у+1
    // операция 2 - у=у*10
        System.out.println(k);

    // бинарные операторы
    // & - бинарное "И"
    // | - бинарное "ИЛИ"
    // >> - бинарный сдвиг вправо
    // << - бинарный сдвиг влево
    int h = 1250; // 0100 1110 0010
        System.out.println(h >> 3); // h сдвигается на три бита вправо
        System.out.println(h << 2);
        System.out.println(h & 15);
        System.out.println(h | 20);

        System.out.println(x*2);

        }
    }
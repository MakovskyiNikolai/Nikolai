package sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {         //функция main обратилась к функции hello
    hello("world");
    hello("user");
    hello("user1");

    Square s = new Square(5);
    s.l = 5;
    System.out.println("Площадь квадрата со стороной " + s.l + "=" + s.area());

    Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());


  }
  public static void hello(String somebody){                   //параметр или аргумент функции
    System.out.println("Hello, " + somebody + "!");
  }





}



//void не возвращает значение
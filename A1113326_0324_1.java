import java.util.*;

class Animal {
    String name;
    double height;
    int weight;
    int speed;

    void show() {
        System.out.println("姓名: " + this.name);
        System.out.println("身高: " + this.height + " 公尺");
        System.out.println("體重: " + this.weight + " 公斤");
        System.out.println("速度: " + this.speed + "公尺/分鐘 ");
    }

    double distance(int x) {
        return x * this.speed;
    }

    double distance(int x, double y) {
        return x * y * this.speed;
    }
}




public class A1113326_0324_1 {
    public static void main(String[] argv) {
        Animal[] animals = new Animal[4];

        String []name = {"雪寶","驢子","安那","愛沙"};
        double []height = {1.1,1.5,1.7,1.7} ;
        int []weight = {52,99,48,50};
        int []speed = {100,200,120,120};

        for(int i = 0; i < 4; i++){

            animals[i] = new Animal();
            animals[i].name = name[i];
            animals[i].height = height[i];
            animals[i].weight = weight[i];
            animals[i].speed = speed[i];
            animals[i].show();

		}

        Scanner scanner = new Scanner(System.in);
        for (Animal animal : animals) {
            System.out.println("請輸入" + animal.name + "的奔跑時間(x)為:");
            int x = scanner.nextInt();
            System.out.println("請輸入" + animal.name + "的加速度(y)為:(若無，請輸入0)");
            double y = scanner.nextDouble();
		double distance;

 		if (y > 0)

                distance = animal.distance(x,y);
            else
                distance = animal.distance(x);
            
            System.out.println(animal.name + " 的奔跑距離為 " + distance + " 公里");
		System.out.println();
 
		}
	}
}

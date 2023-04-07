import java.util.*;

class animal {
    String name;
    double height;
    int weight;
    int speed;

    animal(String name,double height,int weight,int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    void show() {
        System.out.println("姓名："+this.name);
        System.out.println("身高："+this.height+"公尺");
        System.out.println("體重："+this.weight+"公斤");
        System.out.println("速度："+this.speed+"公尺/分鐘");
    }

    double distance(int x,double y) {
        return x*y*this.speed;
    }
    double distance(int x) {
        return x*this.speed;
    }

    static void showinfo() {
		System.out.println("歡迎進入冰雪奇緣系統。");
    }
}

class human extends animal {
    String gender;

    human(String name,double height,int weight,int speed,String gender) {
        super(name, height, weight, speed);
        this.gender = gender;
    }

    void show() {
        super.show();
        System.out.println("性別："+gender);
    }
}

class snow extends human {
    String skill;

    snow(String name,double height,int weight,int speed,String gender,String skill) {
        super(name,height,weight,speed,gender);
        this.skill = skill;
    }

    void show() {
        super.show();
        System.out.println("技能："+skill);
    }

    double distance(int x,double y) {
        return x*y*2*this.speed;
    }
    double distance(int x) {
        return x*2*this.speed;
    }
}
 
public class A1113326_0331 {
    public static void main(String[] argv) {
        animal.showinfo();

        animal []animals = {new animal("雪寶",1.1,52,100),new animal("驢子",1.5,99,200)};

        human []people = {new human("阿克",1.9,80,150,"男"),new human("漢斯",1.8,78,130,"男"),new human("安娜",1.7,48,120,"女")};
        
        snow queen = new snow("愛沙",1.7,50,120,"女","Yes");

        for(animal an : animals) {
            an.show();
            System.out.println();
        }
        for(human hu : people) {
            hu.show();
            System.out.println();
        }
        queen.show();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        double dist;
        for(animal an : animals) {
            System.out.println("請輸入"+an.name+"的奔跑時間(x)：");
            int x = sc.nextInt();
            System.out.println("請輸入"+an.name+"的加速度(y)，沒有則輸入0：");
            double y = sc.nextDouble();
        
            if(y!=0)
                dist = an.distance(x,y);
        
            else
                dist = an.distance(x);
            System.out.println(an.name+"的奔跑距離為："+dist);
        }

        for(human hu : people) {
            System.out.println("請輸入"+hu.name+"的奔跑時間(x)：");
            int x = sc.nextInt();
            System.out.println("請輸入"+hu.name+"的加速度(y)，沒有則輸入0：");
            double y = sc.nextDouble();
        
            if(y!=0)
                dist = hu.distance(x,y);    
            else
                dist = hu.distance(x);
            System.out.println(hu.name+"的奔跑距離為："+dist);
        }
        System.out.println("請輸入"+queen.name+"的奔跑時間(x)：");
        int x = sc.nextInt();
        System.out.println("請輸入"+queen.name+"的加速度(y)，沒有則輸入0：");
        double y = sc.nextDouble();

        if(y!=0)
           dist = queen.distance(x,y);
        else
           dist = queen.distance(x);
         System.out.println(queen.name+"的奔跑距離為："+dist);
    }
}

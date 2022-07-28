package myproject;

import java.util.LinkedList;
import java.util.Scanner;

public class client {
    int num;
    LinkedList orderDisjes=new LinkedList();
    Scanner input=new Scanner(System.in);
    //点餐方法
    int choose2;
    public void orderDishes(){
        do {
            System.out.println("请输入你要点的菜");
            int choose=input.nextInt();
            orderDisjes.add(xxxx.get(choose-1));
            System.out.println("输入1继续点餐，其他退出点餐");
            int choose2=input.nextInt();
            }while (choose2==1);
        }
        //退餐方法
    public void remove(){
        int i=0;//已点餐编号
        System.out.println("您已点了：");
        for (Object I:orderDisjes){
          xxxx xxxx=(xxxx)I;
          i+=1;
          System.out.println(i+xxxx.getname()+"\t"+xxxx.getmoney());
        }
        System.out.println("共计"+orderDisjes.size()+"个菜");
            int choose1;
            do {
                System.out.println("输入你要退的菜的编号");
                int choose = input.nextInt();
                orderDisjes.remove(choose + 1);
                System.out.println("输入1继续退餐，其他结束退餐");
                 choose1=input.nextInt();
            }while (choose1==1);
        }
    //接单方法
    public void orderReceiving(){
        double total=0;
        System.out.println("您最终点了");
        for (Object I:orderDisjes){
            xxxx xxxx=(xxxx)I;
            i+=1;
            total+=xxxx.getmoney;
            System.out.println(i+xxxx.getname()+"\t"+xxxx.getmoney());
        }
        System.out.println("共计"+orderDisjes.size()+"个菜"+"\t"+"合计金额："+total);
        System.out.println("稍作等候，马上出餐");
    }

   }
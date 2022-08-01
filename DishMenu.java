import java.util.ArrayList;
import java.util.List;

/**
 * @author YKai
 * @date 2022/7/29  14:13
 * @desciption:
 */


public class DishMenu {
	public void addPizza() {
		
		// 披萨
		Pizza pizza1 = new Pizza("奥尔良鸡肉披萨7寸", 25);
		Pizza pizza2 = new Pizza("法式牛肉披萨7寸\t", 25);
		Pizza pizza3 = new Pizza("超级至尊披萨7寸\t", 25);
		Pizza pizza4 = new Pizza("奥尔良鸡肉披萨9寸", 32);
		Pizza pizza5 = new Pizza("法式牛肉披萨9寸\t", 32);
		Pizza pizza6 = new Pizza("超级至尊披萨9寸\t", 32);
		Pizza pizza7 = new Pizza("榴莲披萨9寸 \t\t", 40);

		List pizza = new ArrayList();
		pizza.add(pizza1);
		pizza.add(pizza2);
		pizza.add(pizza3);
		pizza.add(pizza4);
		pizza.add(pizza5);
		pizza.add(pizza6);
		pizza.add(pizza7);

		for (
				int i = 0; i < pizza.size(); i++) {
			Dishes dishes = (Dishes) pizza.get(i);
			System.out.println(dishes.getName() + "\t\t" + "￥" + dishes.getPrice());
		}
	}

	public void addRice() {

		// 米饭
		Rice rice1 = new Rice("花甲粉\t\t", 15);
		Rice rice2 = new Rice("炸菜肉丝盖浇饭", 12);
		Rice rice3 = new Rice("泡椒鸡炸盖浇饭", 12);
		Rice rice4 = new Rice("炸菜肉丝拌饭\t", 10);
		Rice rice5 = new Rice("泡椒鸡炸拌粉\t", 10);

		List rice = new ArrayList();
		rice.add(rice1);
		rice.add(rice2);
		rice.add(rice3);
		rice.add(rice4);
		rice.add(rice5);

		for (
				int i = 0; i < rice.size(); i++) {
			Dishes dishes = (Dishes) rice.get(i);
			System.out.println(dishes.getName() + "\t\t" + "￥" + dishes.getPrice());
		}

	}

	public void addSnack() {

		// 小吃
		Snack snack1 = new Snack("香脆鸡排", 10);
		Snack snack2 = new Snack("奥尔良对翅", 8);
		Snack snack3 = new Snack("薯条 \t", 5);
		Snack snack4 = new Snack("鸡柳条\t", 5);
		Snack snack5 = new Snack("胖大星\t", 5);
		Snack snack6 = new Snack("臭豆腐\t", 8);
		Snack snack7 = new Snack("鸡蛋饼\t", 8);
		Snack snack8 = new Snack("劲脆鸡排堡", 8);
		Snack snack9 = new Snack("香辣鸡煲", 7);
		Snack snack10 = new Snack("奶油小馒头", 8);
		Snack snack11 = new Snack("全鸡\t", 20);

		List snack = new ArrayList();
		snack.add(snack1);
		snack.add(snack2);
		snack.add(snack3);
		snack.add(snack4);
		snack.add(snack5);
		snack.add(snack6);
		snack.add(snack7);
		snack.add(snack8);
		snack.add(snack9);
		snack.add(snack10);
		snack.add(snack11);

		for (
				int i = 0; i < snack.size(); i++) {
			Dishes dishes = (Dishes) snack.get(i);
			System.out.println(dishes.getName() + "\t\t" + "￥" + dishes.getPrice());
		}

	}
}


/**
 * @author ykai
 * @date 2022/7/27 15:47
 * @desciption: 菜品
 */
public abstract class Dishes {
	String name;
	int price;

	public Dishes(String name, int price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

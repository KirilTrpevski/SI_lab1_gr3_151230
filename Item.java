class Item {
	int id;
	String name;
	double price;

	//TODO add variable.

	int A = 1.18;
	int B = 1.05;
	int V = 1.0;

	//TODO constructor

	public Item(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	//TODO setters and getters

	void setId(int id) {
		this.id = id;
	}
	int getId() {
		return this.id;
	}

	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}

	void setPrice() {
		this.price = price;
	}
	double getPrice() {
		return this.price;
	}

	double taxReturn (Item item) {
		//TODO
		return item.price * 0.15;
	}
}
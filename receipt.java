class Receipt{
    List<Item> lista = new ArrayList<Item>();

    void add (Item item) {
        this.lista.add(item);
    }

    void delete (int id) {
        for (Item i : Lista) {
            if (i.id == id) {
                Lista.remove(i[id]);
            }
        }
    }

    double vkupenPovrat() {

    }
}
public class LibApp {
	public static void main(String[] args) {
		Library lib = new Library();
		lib.addBook("Гэдэс", 1921);
		lib.addBook("1984", 1949);
		lib.addBook("Сүүн Зам", 2020);
		for (Book b : lib.getRecentBooks(2000)) {
			System.out.println(b.getTitle() + ": " + b.getYear());
		}
	}
}
package main

func main() {
	go func() {
		// separate thread
	}()
}

public class Example {
	public static void main(final String... args) {
		new Thread(() -> {
			// separate thread
		}.start();
	}
}

package fibonacci;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

	private static final String template = "The Fibonacci series for %s is!";
	private int n1 = 0;
	private int n2 = 1;
	private int i;


	@RequestMapping("/dashboard")
	public Fibonacci fibonacci(@RequestParam(value="fib") int fib) {
		return new Fibonacci(n1, n2, i, fib, String.format(template, fib));
	}
}
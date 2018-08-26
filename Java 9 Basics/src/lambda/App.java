package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class App
{
	public static void main(String[] args)
	{
		/*
		Drawable drawable=new Drawable()
		{
			@Override
			public void draw()
			{
				System.out.println("Drawing...");
			}
		};
		drawable.draw();
		

		Drawable drawable=(width)->System.out.println("Drawing..."+width);

		drawable.draw(30);
		
		Addable addable=(a, b)->(a+b);
		
		System.out.println(addable.add(30,  44));
		
		List<String> names=new ArrayList<>();
		names.add("sdsfs");
		names.add("gfhggj");
		names.add("sdsjgfgdffs");
		names.add("ssfwef");
		names.add("iuiuo");
		
		names.forEach((name)->System.out.println(name));
		*/
		
		List<Product> productList=new ArrayList<>();
		productList.add(new Product(1, 23.3, "P1"));
		productList.add(new Product(2, 44.0, "P2"));
		productList.add(new Product(3, 55.13, "P3"));
		productList.add(new Product(4, 78.3, "P4"));
		
		/*
		Collections.sort(productList, (p1, p2)->{
			return p1.getName().compareTo(p2.getName());
		});
		
		Collections.sort(productList, Comparator.comparing(p->p.getName()));
		*/
		
		Stream<Product> filteredData=productList.stream().filter(product->product.getPrice()>55.0);
		
		filteredData.forEach((product)->System.out.println(product.getName()));
	}
}

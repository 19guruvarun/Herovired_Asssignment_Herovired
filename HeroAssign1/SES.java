import java.util.*;
class product{
    private String p_name;
    private String p_spec;
	private int p_cost;
    private	int p_count;
	product(String p_name,String p_spec,int p_cost,int p_count)
    {
        this.p_name = p_name;
        this.p_spec = p_spec;
		this.p_cost = p_cost;
		this.p_count = p_count;
	}
	public void change_prod_name(String name) 
    {
		this.p_name = p_name;
	}
	public String get_prod_name() 
    {
		return this.p_name;
	}
	public void update_spec(String spec) {
		this.p_spec = p_spec;
	}
	public int prod_count() 
    {
		return this.p_count;
	}
	public void update_count(int count) {
		this.p_count = p_count;
	}
	public void update_cost(int cost) {
		this.p_cost = p_cost;
	}
    public void prod_details() 
    {
		System.out.println("Product Name:- "+this.p_name);
		System.out.println("Product Specification:- "+this.p_spec);
		System.out.println("Product Cost:- "+this.p_cost);
		System.out.println("Product Count:- "+this.p_count);
	}
}

public class SES
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
    {
		System.out.println("Enter No of products:- ");
		ArrayList<product> al= new ArrayList<>();
        int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) 
        {
			System.out.println("Enter Product Name:-");
			String name = sc.nextLine();
			System.out.println("Enter Product Specification:-");
			String spec = sc.nextLine();
			System.out.println("Enter Product Cost:-");
			int cost = sc.nextInt();
			System.out.println("Enter Product Count:-");
			int count = sc.nextInt();
			product p_new= new product(name,spec,cost,count);
			al.add(p_new);
			System.out.println();
		}
		while(true) 
        {
			System.out.println("\n1.Product List ");
			System.out.println("2.Product count ");
			System.out.println("3.Product details ");
			System.out.println("4.Edit Product details ");
			System.out.println("5.Update Inventory ");
			System.out.println("6.Exit");
			System.out.println("Enter your choice:-");
			int ch= sc.nextInt();
			switch(ch)
			{
				case 1: prod_list(al);
						break;
				case 2:prod_count(al);
						break;
				case 3:prod_details(al);
						break;
				case 4:edit_product(al);
						break;
				case 5:updateInventory(al);
						break;
				case 6:
						break;
				default: System.out.println("Select values upto range only");

			}
			if(ch==6)
				break;
		}
	}
	public static void edit_product(ArrayList<product> li) 
    {
		System.out.println("Enter Product_name:- ");
		String pname = sc.nextLine();
		for(product p: li) {
			if(p.get_prod_name().compareToIgnoreCase(pname) == 0) 
            {
				System.out.println("Choose Object to Edit");
                System.out.println("1.Cost");
                System.out.println("2.Specification");
                System.out.println("3.Pro_Count");
				int ch = sc.nextInt();
				if(ch == 1) 
                {
                    System.out.println("Enter Product_Cost");
					int cost = sc.nextInt();
					p.update_cost(cost);	
				}
                else if(ch == 2) 
                {
                    System.out.println("Enter Product_Specification");
					sc.nextLine();
					String st = sc.nextLine();
					p.update_spec(st);
				}
                else 
                {
					System.out.println("\nEnter Product_Count");
					int count = sc.nextInt();
					p.update_count(count);
				}
				return;
			}
            System.out.println();
		}
		System.out.println("Product not Found..enter valid prod_name");
		System.out.println();
	}

	public static void prod_details(ArrayList<product> al) 
    {
		System.out.println("Enter Product_name");
		sc.nextLine();
		String pname = sc.nextLine();
		System.out.println();
		for(product prod: al) 
        {
			if(prod.get_prod_name().compareToIgnoreCase(pname) == 0) 
            {
				prod.prod_details();
				return;
			}
		}
		System.out.println("\nProduct not Found..enter valid one......");
	}
    public static void updateInventory(ArrayList<product> al) 
    {
		System.out.println();
		System.out.println("1.Add_Poduct");
		System.out.println("2.Delete_Product");
		System.out.println("Enter your choice");
		System.out.println();
		int x= sc.nextInt();
		if(x== 1) 
        {
			System.out.println("Enter Product_name");
			String name = sc.nextLine();
			System.out.println("Enter Product_Specification");
			String spec = sc.nextLine();
			System.out.println("Enter Product_Cost");
			int cost = sc.nextInt();
			System.out.println("Enter Product_Count");
			int count = sc.nextInt();
			product p_new= new product(name,spec,cost,count);
			al.add(p_new);
			System.out.println();
		}
        else 
        {
			System.out.println("Enter Product_name to Delete");
			int i=0;
			String p_name = sc.nextLine();
			for(product prod: al) 
            {
				if((prod.get_prod_name()).compareToIgnoreCase(p_name) == 0) 
					break;
				i++;
			}
			if(i == al.size())
				System.out.println("Product not Found");
			else 
            {
				al.remove(i);
				System.out.println("Product is removed Successfully");
			}		
		}
	}
	public static void prod_list(ArrayList<product> al) 
    {
		if(al.size() == 0) 
        {
			System.out.println("No Products......");
			return;
		}
		int i = 1 ;
		for(product prod:al)
			System.out.println((i++) + " " +prod.get_prod_name());
	}
    public static void prod_count(ArrayList<product> al) 
    {
		System.out.print("\nEnter Product_name");
		sc.nextLine();
		String pname = sc.nextLine();
		boolean c= false;
		for(product prod: al) 
        {
			if((prod.get_prod_name()).compareToIgnoreCase(pname) == 0) 
            {
				System.out.println("Product"+prod.get_prod_name() + "count is "+prod.prod_count());
				c= true;
				break;
			}
		}
		if(!c)
			System.out.println("Enter valid product_name");
	}
}
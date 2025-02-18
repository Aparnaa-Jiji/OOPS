class Products{
    int pcode,price;
    String pname;

    public  Products(int pcode,String pname,int price){
        this.pcode = pcode;
        this.pname=pname;
        this.price=price;
    }
    public void display()
    {
        System.out.println("Product code:"+pcode);
        System.out.println("Product name:"+pname);
        System.out.println("Product code:"+price);
    }
    
    public static void main(String[] args)
        {
            Products p1 = new Products(101,"laptop",55000);
            Products p2 = new Products(102,"SmartPhone",30000);
            Products p3 = new Products(103,"tablet",35000);

            if (p1.price<p2.price)
            {
                if(p1.price<p3.price)
                {
                    p1.display();
                }
                else
                {
                    p3.display();
                }
            }
            else{
                p2.display();
                
                }
            
        }
    }

class Cpu{
    double price;
    Cpu (double price){
        this.price = price;
    }
    public void printinfo(){
        System.out.println("CPU Price: " + price);
    }
    class Processor{
        int core;
        String manufacture;
        Processor(int core, String manufacture){
            this.core = core;
            this.manufacture = manufacture;
        }
        public void printinfo(){
            System.out.println("Cores are:"+core);
            System.out.println("Manufacturer:"+manufacture);
        }
    }
    public static class ram{
        int memory;
        String manufacture;
        ram(int memory, String manufacture){
            this.memory = memory;
            this.manufacture = manufacture;
    }
    public void printinfo(){
        System.out.println("Ram memory:"+memory);
        System.out.println("Ram Manufacture:"+manufacture);
    }
    }
    public static void main(String[] args){
        Cpu cpu1 = new Cpu(500);
        Cpu.Processor processor1 = cpu1.new Processor(4,"Intel");
        Cpu.ram ram1 = new Cpu.ram(8,"cosarir");
        cpu1.printinfo();
        processor1.printinfo();
        ram1.printinfo();
        
    }
}
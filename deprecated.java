public class deprecated {
    public static void main(String[] args) {
        old o = new old();
        o.display();
    }
}


class old{
    public void display()
    {
        System.out.println("hi");
    }

    @Deprecated
    public void show()
    {
        System.out.println("hello");
    }
}


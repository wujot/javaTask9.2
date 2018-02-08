public class Print {

    public static void main(String[] args) {

        System.out.println("\n" +
                "    Wyjątki dzielimy na KONTROLOWANE które trzeba obsłużyć i NIEKONTROLOWANE które można, ale nie trzeba obsłużyć.\n" +
                "    Wyjątki NIEKONTROLOWANE dziedziczą po klasie RuntimeException\n" +
                "    Wyjątki rzucamy korzystając z instrukcji THROW, jeśli rzucamy wyjątek kontrolowany musimy dodatkowo w sygnaturze metody/konstruktora zadeklarować wyjątek używając słowa THROWS.\n" +
                "    Do bloku try-catch możemy dodać dodatkowo blok FINALLY, który wykona się zawsze, niezależnie, czy w bloku try wyjątek wystąpił, czy nie\n");
    }
}

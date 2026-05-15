public class Main {
    public static void main(String[] args){

        User mainUser = new User("Thalles", 19,false);
        Car myCar = new Car("BMW",20,true);

        System.out.println("\nNosso usuário chamado " + mainUser.name +
                " tem " + mainUser.age + " anos.\nEle mora com os pais dele? " +
                mainUser.liveAlone + "\n");

        System.out.println("O meu carro é uma " + myCar.carBrand + ". Atualmente" +
                " ele tem " + myCar.carAge + " anos.\nO motor dele ainda funciona? "
         + myCar.engineWorks);
    }
}
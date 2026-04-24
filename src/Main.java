public class Main {
    public static void main(String[] args){

        User mainUser = new User("Thalles",19,false);
        car myCar = new car("BMW",20,true);

        System.out.println("\nNosso usuário chamado " + mainUser.nameOfUser +
                " tem " + mainUser.ageOfUser + " anos.\nEle mora com os pais dele? " +
                mainUser.heLiveWithHisParents + "\n");

        System.out.println("O meu carro é uma " + myCar.theCarBrand + ". Atualmente" +
                " ele tem " + myCar.ageOfCar + " anos.\nO motor dele ainda funciona? "
         + myCar.theEngineWords);
    }
}
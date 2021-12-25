package hm;

public class Magazine {


    public <T> void bookReception (T product){
        System.out.println("Книга поступила в магазин:\n" + product);
    }

    public void monthOfReceipt(EnumYear month){
        if (month.compareTo(EnumYear.FEBRUARY) < 1) {
            System.out.println("Книга поступила зимой");
        } else if (month.compareTo(EnumYear.MAY) < 1) {
            System.out.println("Книга поступила  весной");
        } else if (month.compareTo(EnumYear.AUGUST) < 1){
            System.out.println("Книга поступила  летом");
        } else if (month.compareTo(EnumYear.NOVEMBER) < 1) {
            System.out.println("Книга поступила  осенью");
        } else{
            System.out.println("Книга поступила  зимой ");
        }
    }
}

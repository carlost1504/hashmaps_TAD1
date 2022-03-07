package ui;

import java.util.*;

public class Main {
    public Scanner sc=new Scanner(System.in);
    public static void main(String...agrt){
        Main p=new Main();
        p.createHashmap();
    }
    public void createHashmap (){
        HashMap<String,Integer> itemsgrup = new HashMap<>();
        System.out.println("how items you want");
        int items=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<items;i++){
            String itemsName=sc.nextLine();
            itemsgrup.put(itemsName, i);
        }
        System.out.println("Elements in student map:");
        System.out.println(itemsgrup);
        System.out.println("what activity do you want to do \n1) add items \n2) remove items \n3) Search items ");
        int numActivity=sc.nextInt();
        sc.nextLine();
        switch (numActivity){
            case 1:
                System.out.println("name to add");
                String itemsAdd=sc.nextLine();
                itemsgrup=new addItems( itemsgrup,  itemsAdd );
                break;
            case 2:
                System.out.println("what is item name");
                String itemsNameSearch=sc.nextLine();
                itemsgrup=new  eliminar( itemsgrup,  itemsNameSearch );
                break;
            case 3:
                System.out.println("name to add");
                String itemCheck=sc.nextLine();
                boolean checkName=checkItems( itemsgrup,  itemCheck );
                if(checkName==true){
                    System.out.println("itemCheck E items grup");
                }
                break;
        }
        System.out.println(itemsgrup);

    }
    public HashMap eliminar(HashMap itemsgrup, String itemsNameSearch ){
        if(itemsgrup.containsKey(itemsNameSearch)==true){
            itemsgrup.remove(null,itemsNameSearch );
            return itemsgrup;
        }else{
            System.out.println("Search item invalid");
            return itemsgrup;
        }
    }
    public HashMap addItems(HashMap itemsgrup,String  itemsdNameSearch ){
        if(itemsgrup.containsKey(itemsNameSearch)==false){
            itemsgrup.put(itemsgrup.size()+1,itemsNameSearch );
            return itemsgrup;
        }else{
            System.out.println("add item invalid");
            return itemsgrup;
        }
    }
    public boolean checkItems(HashMap itemsgrup,String  itemCheck ){
        if(itemsgrup.containsKey(itemCheck)==true){
            return true;
        }else
            return false;
    }

}

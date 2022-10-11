/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Todolist;

/**
 *
 * @author hp
 */
public class Rifal {
    
    
    public static String[]model= new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        viewShowTodoList();
        // TODO code application logic here
        
    //    
    //      testRemoveTodoList();
        
        addTodoList("1");
        addTodoList("2");
        addTodoList("3");
    //       addTodoList("5");
        addTodoList("4");
        addTodoList("5");
        removeTodoList(3);
        showTodoList();
      

    
     }

    /**
    * Menampilkan todo list
    */
    public static void showTodoList() {
        System.out.println("TODOLIST");
        for (int i = 0; i < model.length; i++) {
        String  todo = model[i];
        int no = i + 1;

        if (todo != null) {
        System.out.println(no + ". " + todo);
        }
    }
  }

    public static void testShowTodoList() {
    //    3e[0] = "Belajar Java Dasar";
    //    model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
    // 
        
        
        showTodoList();
    }

    /**
    * Menambah todo ke list
    */
    
    
    public static void addTodoList(String todo) {
        
    // cek apakah model penuh?
    boolean isFull = true;
    for (int i = 0; i < model.length; i++) {
      if (model[i] == null) {
        // model masih ada yang kosong
          
        isFull = false;
        break;
      }
    }

    // jika penuh, kita resize ukuran array 2x lipat
    if (isFull) {
      String [] temp = model;
      model = new String[model.length * 2];
        
        
      for (int i = 0; i < temp.length; i++) {
        model[i] = temp[i];
          
      }
    }

    // tambahkan ke posisi yang data array nya NULL
    for (int i = 0; i < model.length; i++) {
      if (model[i] == null) {
        model[i] = todo;
          System.out.println(model[i]);
        break;
      }
    }
  }
    

    public static void testAddTodoList() {
    for (int i = 0; i < 25; i++) {
      addTodoList("Contoh Todo Ke." + i);
    }

    showTodoList();
    
  }
    
    
    

  
    public static boolean removeTodoList(Integer number) {
    if ((number - 1) >= model.length) {
      return false;
    } else if (model[number - 1] == null) {
      return false;
    } else {
      for (int i = (number - 1); i < model.length; i++) {
        if (i == (model.length - 1)) {
          model[i] = null;
        } else {
          model[i] = model[i + 1];
        }
      }
      return true;
    }
  }

    public static void testRemoveTodoList() {
    addTodoList("1");
    addTodoList("2");
    addTodoList("3");
    addTodoList("4");
    addTodoList("5");
    addTodoList("6");
    addTodoList("7");

    boolean result = removeTodoList(5);
    System.out.println(result);

    result = removeTodoList(4);
    System.out.println(result);

    result = removeTodoList(2);
    System.out.println(result);

    showTodoList();
  }
    

    public static String input(String info) {
    System.out.print(info + " : ");
    String data = scanner.nextLine();
    return data;
  }

    public static void testInput() {
    String name = input("Nama");
    System.out.println("Hi " + name);

    String channel = input("Channel");
    System.out.println(channel);
  }

    /**
    * Menampilkan view todo list
    */
    public static void viewShowTodoList() {
    while (true) {
        
        showTodoList();
      

        System.out.println("MENU : ");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("x. Keluar");
        

        String input = input("Pilih");

        if (input.equals("1")) {
        viewAddTodoList();
      } else if (input.equals("2")) {
        viewRemoveTodoList();
      } else if (input.equals("x")) {
        break;
      } else {
        System.out.println("Pilihan tidak dimengerti");
      }
    }
  }
    

    public static void testViewShowTodoList() {
    addTodoList("1");
    addTodoList("2");
    addTodoList("3");
    addTodoList("4");
    addTodoList("5");
    viewShowTodoList();
  }
    

 
    public static void viewAddTodoList() {
    System.out.println("MENAMBAH TODOLIST");

    String todo = input("Todo (x Jika Batal)");

    if (todo.equals("x")) {
    
    } else {
      addTodoList(todo);
    }
  }

    public static void testViewAddTodoList() {
    addTodoList("Satu");
    addTodoList("Dua");

    viewAddTodoList();

    showTodoList();
  }

    
  
    public static void viewRemoveTodoList() {
    System.out.println("MENGHAPUS TODOLIST");

    String number = input("Nomor yang Dihapus (x Jika Batal)");

    if (number.equals("x")) {
      // batal
    } else {
      boolean success = removeTodoList(Integer.valueOf(number));
      if (!success) {
        System.out.println("Gagal menghapus todolist : " + number);
      }
    }
  }

    public static void testViewRemoveTodoList() {
    addTodoList("1");
    addTodoList("2");
    addTodoList("3");
    addTodoList("4");

    showTodoList();

    viewRemoveTodoList();

    showTodoList();
  }
}





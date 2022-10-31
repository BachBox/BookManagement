package Q2;

import java.util.*;

public class ReaderModel{
    List<Reader> readers = new ArrayList<>();
    public Reader inputAReader(Scanner sc){
        System.out.println("Input reader's id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Input reader's name: ");
        String name = sc.nextLine();
        System.out.println("Input reader's phone: ");
        String phoneNum = sc.nextLine();
        System.out.println("Input reader's address: ");
        String address = sc.nextLine();
        readers.add(new Reader(id, name, phoneNum, address));
        return new Reader(id, name, phoneNum, address);
    }
    public int searchReaderById(int id){
        int pos = -1;
        for (int i = 0; i < readers.size(); i++) {
            if(readers.get(i).getId() == id)
            pos = i;
        }
        return pos;
    }
}

package EncapMain;

import EncapExample.EncapClass;

/**
 * Created by Mahadi on 1/30/2018.
 */
public class EncapApps {

    public static void main(String[] args) {

        EncapClass encapClass = new EncapClass();

        encapClass.setEmpId(500);
        encapClass.setEmpName("Mahadi");
        encapClass.setEmpAge(26);

        System.out.println("Employee Id   : " + encapClass.getEmpId());
        System.out.println("Employee Name : " + encapClass.getEmpName());
        System.out.println("Employee Age  : " + encapClass.getEmpAge());
    }
}

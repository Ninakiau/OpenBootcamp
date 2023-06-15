/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cochecrudapp;

/**
 *
 * @author clau
 */

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Método save()");
    }

    @Override
    public void findAll() {
        System.out.println("Método findAll()");
    }

    @Override
    public void delete() {
        System.out.println("Método delete()");
    }
}



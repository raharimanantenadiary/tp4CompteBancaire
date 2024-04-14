/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package tpraharimanantena.jsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import tpraharimanantena.entity.CompteBancaire;
import tpraharimanantena.service.GestionnaireCompte;

/**
 *
 * @author Diary
 */
@Named
@RequestScoped
public class ListeComptes implements Serializable {

    @Inject
    private GestionnaireCompte gestionnaireCompte;
    
    public List<CompteBancaire> getAllComptes() {
        return gestionnaireCompte.getAllComptes();
    }
}

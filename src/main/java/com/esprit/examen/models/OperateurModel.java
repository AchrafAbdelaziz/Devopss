package com.esprit.examen.models;

import lombok.Data;

@Data
public class OperateurModel {
	private Long idOperateur;
	private String nom;
	private String prenom;
	private String password;
}

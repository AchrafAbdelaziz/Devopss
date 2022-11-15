/*package com.esprit.examen.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.Operateur;
import com.esprit.examen.repositories.OperateurRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OperateurServiceImplTest {

	@Autowired
	OperateurRepository or;

	@Test
	public void Add() {
		Operateur o_add = Operateur.builder().nom("chamsAdd").prenom("balti").password("xxxxx").build();
		Operateur o_add2 = or.save(o_add);
		assertEquals(o_add.getIdOperateur(), o_add2.getIdOperateur());
	}

	@Test
	public void Edit() {

		Operateur o_edit = or.save(Operateur.builder().nom("chamsEdit").prenom("balti").password("xxxxx").build());
		Operateur o_edit2 = or.findById(o_edit.getIdOperateur()).get();

		o_edit2.setNom("chxwsEdit");
		o_edit2.setPrenom("bvlti");
		o_edit2.setPassword("yyyyy");
		or.save(o_edit2);

		assertEquals(o_edit.getIdOperateur(), o_edit2.getIdOperateur());
		assertNotEquals(o_edit.getNom(), o_edit2.getNom());
		assertNotEquals(o_edit.getPrenom(), o_edit2.getPrenom());
		assertNotEquals(o_edit.getPassword(), o_edit2.getPassword());
	}
	
	@Test
	public void List() {
		Operateur o_add = Operateur.builder().nom("chamsAdd").prenom("balti").password("xxxxx").build();
		Operateur o_add2 = or.save(o_add);
		assertEquals(o_add.getIdOperateur(), o_add2.getIdOperateur());
	}

}*/

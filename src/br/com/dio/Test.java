package br.com.dio;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Test {

    @org.junit.Test
    public void testarInsercaoDeCurso() {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        assertNotNull(curso1);
        assertNotNull(curso2);
        assertEquals("curso java", curso1.getTitulo());
        assertEquals("descrição curso java", curso1.getDescricao());
        assertEquals(8, curso1.getCargaHoraria());
        assertEquals("curso js", curso2.getTitulo());
        assertEquals("descrição curso js", curso2.getDescricao());
        assertEquals(4, curso2.getCargaHoraria());

    }

    @org.junit.Test
    public void testarInsercaoDeMentoria(){
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        assertNotNull(mentoria);
        assertEquals("mentoria de java", mentoria.getTitulo());
        assertEquals("descrição mentoria java",mentoria.getDescricao());
    }
    @org.junit.Test
    public void testarInsercaoDeBootcamp(){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        assertNotNull(bootcamp);
        assertEquals("Bootcamp Java Developer", bootcamp.getNome());
        assertEquals("Descrição Bootcamp Java Developer",bootcamp.getDescricao());
    }

    @org.junit.Test
    public void testarInsercaoDeDev(){
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");

        assertNotNull(devCamila);
        assertEquals("Camila", devCamila.getNome());
    }
    
}

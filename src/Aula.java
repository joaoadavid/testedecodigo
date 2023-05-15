public class Aula {
    public static void main(String[] args) {
        // cria um curso
        Curso curso = new Curso("Ci�ncia da Computa��o", 4);

        // cria algumas disciplinas e adiciona ao curso
        Disciplina prog1 = new Disciplina("Programa��o 1");
        Disciplina prog2 = new Disciplina("Programa��o 2");
        curso.adicionarDisciplina(prog1);
        curso.adicionarDisciplina(prog2);

        // cria alguns alunos
        Aluno aluno1 = new Aluno("Jo�o", 1);
        Aluno aluno2 = new Aluno("Maria", 2);

        // matricula os alunos em algumas disciplinas
        curso.matricularAlunoEmDisciplina(aluno1, prog1, 2023, 1);
        curso.matricularAlunoEmDisciplina(aluno2, prog2, 2023, 1);
        curso.matricularAlunoEmDisciplina(aluno1, prog2, 2023, 1);

        // obt�m a lista de alunos matriculados no curso
        List<Aluno> alunosMatriculados = curso.obterAlunosDoCurso();

        // imprime a lista de alunos matriculados
        System.out.println("Alunos matriculados no curso:");
        for (Aluno aluno : alunosMatriculados) {
            System.out.println(aluno.getNome() + " - Matr�cula: " + aluno.getMatricula());
        }

        // obt�m a lista de alunos matriculados na disciplina de programa��o 2
        List<Aluno> alunosMatriculadosProg2 = prog2.obterAlunosMatriculados();

        // imprime a lista de alunos matriculados na disciplina de programa��o 2
        System.out.println("\nAlunos matriculados na disciplina de programa��o 2:");
        for (Aluno aluno : alunosMatriculadosProg2) {
            System.out.println(aluno.getNome() + " - Matr�cula: " + aluno.getMatricula());
        }
    }
}
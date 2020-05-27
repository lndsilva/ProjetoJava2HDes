package PacoteJava;

public class TestarPessoa {
    
    public static void main(String[] args) {
        Pessoa ps = new Pessoa();
      
        ps.setNome("Maria Antonieta");
        ps.setEmail("maria.antonieta@gmail.com");
        ps.setTelefone(55555555);
        ps.setIdade(50);
        
        System.out.println("Seu nome é = "+ps.getNome());
        System.out.println("Seu email é = "+ps.getEmail());
        System.out.println("Seu telefone é = "+ps.getTelefone());
        System.out.println("Sua idade é = "+ps.getIdade());
        
        //Criei uma instância vazia
        //Foi criado um novo objeto.
        Pessoa ps1 = new Pessoa("João Antonio", "ja@gmail.com", 45454545, 35);
        
        System.out.println("Seu nome é "+ps1.getNome()+" "
                + "e seu email é "+ps1.getEmail()+" e seu telefone é "+ps1.getTelefone()+ ""
                        + " e sua idade é "+ps1.getIdade());
        
        Pessoa ps2 = new Pessoa("Patricia Miranda", "patricia.miranda@hotmail.com");
        
        System.out.println("Nome: "+ps2.getNome()+"\nemail: "+ps2.getEmail());
        
        PessoaFisica psf = new PessoaFisica();
        
        psf.setNome("Amarildo Santana");
        psf.setCpf("111.111.111-11");
        psf.setEmail("amarildo.santana@hotmal.com");
        psf.setIdade(40);
        
        System.out.println("Nome: "+psf.getNome()+""
                + "\nCPF: "+psf.getCpf()+""
                        +"\nEmail: "+psf.getEmail()+""
                                + "\nIdade: "+psf.getIdade());
        
        
       
    }
    
}

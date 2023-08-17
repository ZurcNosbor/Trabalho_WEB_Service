package qi.Atividade_Integradora;

import java.util.ArrayList;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("aluno")
public class RecursoAluno {
	
	ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	public RecursoAluno() {
		
		listaAlunos.add(new Aluno(0, "Domyngo" , "Domyngo@Dupla_1.com", 3, 303));
		listaAlunos.add(new Aluno(1, "Feryado" , "Feryado@Dupla_1.com", 3, 303));
		listaAlunos.add(new Aluno(2, "Poliglota" , "Poliglota@Dupla_2.com", 2, 201));
		listaAlunos.add(new Aluno(3, "Porta-Voz" , "Porta_Voz@Dupla_2.com", 2, 201));
		listaAlunos.add(new Aluno(4, "Prefferido" , "Prefferido@Dupla_3.com", 1, 103));
		listaAlunos.add(new Aluno(5, "Prediletto" , "Prediletto@Dupla_3.com", 1, 103));
		listaAlunos.add(new Aluno(6, "Jacklane" , "Jacklane@Dupla_4.com", 2, 203));
		listaAlunos.add(new Aluno(7, "Manda Brasa" , "Manda_Brasa@Dupla_4.com", 2, 203));
		listaAlunos.add(new Aluno(8, "Malboro" , "Malboro@Dupla_5.com", 3, 301));
		listaAlunos.add(new Aluno(9, "Hollywood" , "Hollywood@Dupla_5.com", 3, 301));
		
	}
	
	//Serviço 1: Um serviço do tipo GET que não recebe nenhum parâmetro e retorna um arquivo JSON
	//contendo a lista de todos os alunos.
	@GET
    @Path("getalunos")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Aluno> getAluno() {
		
		return listaAlunos;
	}
	
	//Serviço 2: Um serviço do tipo GET que recebe como parâmetro um número de id e retorna um
	//arquivo JSON com todas as informações sobre o aluno com o id especificado.
	//http://localhost:8080/filme/identificador/1
	@GET
	@Path("identificador/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Aluno getAlunoParam(@PathParam("id") int id) {
			
		for (Aluno aluno:listaAlunos) {
			if(aluno.getId()==id) {
				return aluno;
			}
		}
		return null;
	}
	
	
	//SERVIÇO 3: EXCLUSÃO DE UM ITEM DA LISTA DE ALUNOS
	 @DELETE
	 @Path("removealuno/{id}")
	 public Response removerAluno(@PathParam("id") int id) {
	        for (Aluno aluno : listaAlunos) {
	            if (aluno.getId() == id) {
	                listaAlunos.remove(aluno);
	                return Response.ok("Aluno removido com sucesso").build();
	            }
	        }
	        return Response.status(Response.Status.NOT_FOUND).entity("Aluno não encontrado").build();
	    }

}

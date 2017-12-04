package RestWeb;

import RestBean.BeanJson;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import myRESTwsBean.BeanJSon;

@Path("")
public class API {
    /*-------SERVER-------*/
    @Path("/server/{serverID}")
    @GET
    //Si volem XML tmb es pot
    @Produces(MediaType.APPLICATION_JSON)
    public String getServerInfo(@PathParam("serverID") String serverID){
        //Show the information of the server with ID serverId
        return null;
    }

    @Path("/server/{serverID}/{content}")
    @GET
    //Si volem XML tmb es pot
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllContent(@PathParam("serverID") String serverID, @PathParam("content") String content){

        return null;
    }

    /*-------CONTENT-------*/
    @Path("/content")
    @GET
    //Si volem XML tmb es pot
    @Produces(MediaType.APPLICATION_JSON)
    public String getSearchContent(){
        return null;
    }

    @Path("/content")
    @POST
    public Response uploadContent(BeanJson bean){
        /*String resultat = bean.getNom();
        return Response.status(201).entity(resultat).build();*/
        return null;
    }

    @Path("/content/{contentID}")
    @GET
    //Si volem XML tmb es pot
    @Produces(MediaType.APPLICATION_JSON)
    public String getSearchContentByID(@PathParam("contentID") String contentID){
        return null;
    }

    @Path("/download/{contentID}")
    @GET
    //Si volem XML tmb es pot
    @Produces(MediaType.APPLICATION_JSON)
    public String downloadContent(@PathParam("contentID") String contentID){
        return null;
    }
    /*-------USER-------*/
    @Path("/user/sign")
    @POST
    public Response signUser(BeanJson bean){
        /*String resultat = bean.getNom();
        return Response.status(201).entity(resultat).build();*/
        return null;
    }
    @Path("/user/{userID}/content")
    @GET
    //Si volem XML tmb es pot
    @Produces(MediaType.APPLICATION_JSON)
    public String contentFromUser(@PathParam("contentID") String contentID){
        return null;
    }

}
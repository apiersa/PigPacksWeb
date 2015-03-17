package com.springapp.mvc;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("hello")
public class WebPiggyService {
   @GET
   public String sayHello(
          @DefaultValue("") @QueryParam("name") String name
   ) {
       try {
           return "hello " + name;
       }
       catch(Exception e){
           return e.getMessage();
       }
     }
}




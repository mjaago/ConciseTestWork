package com.conciseTest.web;


import com.conciseTest.entity.Data;
import com.conciseTest.interactor.gateway.GetDataGateway;
import com.conciseTest.interactor.gateway.SaveDataGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import java.util.List;

@Component
@Path("/data")
public class DataController {

    @Autowired
    private GetDataGateway getDataGateway;
    @Autowired
    private SaveDataGateway saveDataGateway;

    @GET
    @Produces("application/json")
    public List<Data> getDataByContent(@QueryParam("search") String dataPiece){
        return getDataGateway.getByData(dataPiece);
    }


    @POST
    @Consumes("application/json")
    public void saveData(Data data){
        saveDataGateway.save(data);
    }


}

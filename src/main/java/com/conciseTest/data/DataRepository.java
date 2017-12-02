package com.conciseTest.data;

import com.conciseTest.entity.Data;
import com.conciseTest.interactor.gateway.GetDataGateway;
import com.conciseTest.interactor.gateway.SaveDataGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataRepository implements GetDataGateway, SaveDataGateway{
    @Autowired
    private DAO dao;

    @Override
    public void save(Data data) {
        dao.save(data);
    }

    @Override
    public List<Data> getByData(String pieceOfData) {
        return dao.findByDataContaining(pieceOfData);
    }
}

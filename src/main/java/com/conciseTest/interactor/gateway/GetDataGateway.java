package com.conciseTest.interactor.gateway;

import com.conciseTest.entity.Data;

import java.util.List;

public interface GetDataGateway {
    List<Data> getByData(String pieceOfData);

}

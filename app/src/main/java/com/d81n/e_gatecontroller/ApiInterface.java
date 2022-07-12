package com.d81n.e_gatecontroller;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/CloseAllGates")
    Call<String> CloseAllGatesRequest();

    @GET("/OpenAllGates")
    Call<String> OpenAllGatesRequest();

    @GET("/StopAllGates")
    Call<String> StopAllGatesRequest();

    @GET("/OpenCloseSingleGate")
    Call<String> OpenCloseSingleGateRequest();
}

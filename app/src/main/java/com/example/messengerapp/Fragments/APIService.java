package com.example.messengerapp.Fragments;

import com.example.messengerapp.Notifications.MyResponse;
import com.example.messengerapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService
{
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAKPPTSqA:APA91bGFKPrSE6htPgk0JR-Y2w6gsvsm7eDHi5IqlGRk9Uyz2KbK10r6hPPutEy52feLXpG10uUfmo9lcyGkdWyyY5883lYaAhkrpTdK8DDZC2ibSJrkjff1iLaULlfLlyUzUyfwy1gq"
    })

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

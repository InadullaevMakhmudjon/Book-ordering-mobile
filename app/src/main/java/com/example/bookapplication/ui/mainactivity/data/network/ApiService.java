package com.example.bookapplication.ui.mainactivity.data.network;

import android.arch.lifecycle.LiveData;

import com.example.bookapplication.ui.mainactivity.data.network.models.Book;

import java.util.List;

import retrofit2.http.GET;

public interface ApiService {

    @GET(ApiEndPoint.GetAllBooks)
    LiveData<List<Book>> allBooks();

}

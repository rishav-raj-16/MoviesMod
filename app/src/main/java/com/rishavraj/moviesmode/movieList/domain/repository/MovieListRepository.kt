package com.rishavraj.moviesmode.movieList.domain.repository

import com.rishavraj.moviesmode.movieList.domain.model.Movie
import com.rishavraj.moviesmode.movieList.util.Resource
import kotlinx.coroutines.flow.Flow


interface MovieListRepository {
    suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>>

    suspend fun getMovie(id: Int): Flow<Resource<Movie>>
}
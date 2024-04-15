package com.rishavraj.moviesmode.details.presentaion

import com.rishavraj.moviesmode.movieList.domain.model.Movie

data class DetailState (
    val isLoading: Boolean = false,
    val movie:Movie? = null
)
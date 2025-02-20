package com.user.userexplorer

import com.user.userexplorer.data.UserRepository
import com.user.userexplorer.data.UserResponse
import retrofit2.Response

open class MockUserRepository : UserRepository() {
    override suspend fun getUsers(number: Int): Response<UserResponse> {
        return Response.success(UserResponse(results = emptyList())) // Return a successful response with an empty list
    }
}

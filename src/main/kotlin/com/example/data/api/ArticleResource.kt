package com.example.data.api

sealed class Failure(e: Exception) {
    class HttpErrorInternalServerError(e: Exception): Failure(e)
    class HttpErrorBadRequest(e: Exception): Failure(e)
    class HttpErrorUnauthorized(e: Exception): Failure(e)
    class HttpErrorForbidden(e: Exception): Failure(e)
    class HttpErrorNotFound(e: Exception): Failure(e)
    class HttpError(e: Exception): Failure(e)
    class GenericError(e: Exception): Failure(e)
}

sealed class Either<L, R> {
    class Left<L, R>(val reason: L): Either<L, R>()
    class Right<L, R>(val result: R): Either<L, R>()
}

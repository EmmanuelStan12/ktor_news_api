package com.example.server

enum class ServerResponseCode(val code: Int, val message: String) {
    SUCCESSFUL_OPERATION(200, "Successful operation"),
    PARAMETER_MISSING(400, "Parameter missing"),
    UNAUTHORIZED(401, "Unauthorized"),
    CORS_POLICY_FAILED(403, "Cors policy failed. IP/Domain restricted"),
    PARAMETER_DUPLICATE(409, "Parameter duplicate"),
    UNSUPPORTED_TYPE(415, "Unsupported type"),
    UNPROCESSABLE_ENTITY(422, "Unprocessable entity"),
    TOO_MANY_REQUESTS(429, "Too many requests"),
    INTERNAL_SERVER_ERROR(500, "Internal server error")
}

package com.example.freelancemarketplace

object Properties {

    // Application details
    const val APP_NAME = "FreelanceHub"
    const val APP_VERSION = "1.0.0"

    // Backend API configuration
    // Replace this URL with your actual backend server URL.
    const val BASE_URL = "http://10.0.2.2:8000/api/"

    // API endpoints
    const val LOGIN_ENDPOINT = "auth/login"
    const val REGISTER_ENDPOINT = "auth/register"
    const val USERS_ENDPOINT = "users"
    const val FREELANCERS_ENDPOINT = "freelancers"
    const val SERVICES_ENDPOINT = "services"
    const val PROJECTS_ENDPOINT = "projects"
    const val PROPOSALS_ENDPOINT = "proposals"
    const val REVIEWS_ENDPOINT = "reviews"
    const val MESSAGES_ENDPOINT = "messages"

    // Request configuration
    const val CONNECT_TIMEOUT_SECONDS = 30L
    const val READ_TIMEOUT_SECONDS = 30L

    // Pagination
    const val DEFAULT_PAGE = 1
    const val DEFAULT_PAGE_SIZE = 20

    // Currency
    const val CURRENCY_SYMBOL = "₹"
}

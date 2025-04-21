package br.com.alluGames

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {
    val client: HttpClient = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=146"))
        .build()
    // código omitido

    val response = client
        .send(request, HttpResponse.BodyHandlers.ofString())

    val json = response.body()
    println(json)
}

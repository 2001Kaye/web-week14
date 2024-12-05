package kr.ac.kumoh.ce.s20240058.w14_backend_mongodb.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "songs")
data class Song(
    @Id
    val id: String? = null,
    val title: String,
    val singer: String,
    val rating : Int,
    val lyrics: String,
)

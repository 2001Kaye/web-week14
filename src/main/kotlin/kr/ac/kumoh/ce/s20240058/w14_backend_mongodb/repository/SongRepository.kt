package kr.ac.kumoh.ce.s20240058.w14_backend_mongodb.repository

import kr.ac.kumoh.ce.s20240058.w14_backend_mongodb.model.Song
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

// 데이터 타입과 id 타입을 넣어줌
// 일부분 맞는 걸 검색하는 건 우리가 구현해야 하지만 기본적인건 알아서 만들어줌 Mongo가 알아서 구현해줌
interface SongRepository : MongoRepository<Song, String> {
    fun findBySinger(singer: String): List<Song>
}
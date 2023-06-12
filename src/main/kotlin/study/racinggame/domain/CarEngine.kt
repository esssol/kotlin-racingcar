package study.racinggame.domain

import kotlin.random.Random

interface CarEngine {
    fun run(): Int
}

object RandomSeedEngine : CarEngine {
    override fun run(): Int {
        return if (Random.nextInt(0, 10) > 4) 1 else 0
    }
}
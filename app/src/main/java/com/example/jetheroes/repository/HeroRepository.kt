package com.example.jetheroes.repository

import com.example.jetheroes.model.Hero
import com.example.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> = HeroesData.heroes

    fun searchHeroes(query: String): List<Hero> {
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}
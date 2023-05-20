package com.example.jetheroes.repository

import com.example.jetheroes.model.Hero
import com.example.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> = HeroesData.heroes
}
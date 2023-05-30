package ru.okay.whack_a_mole.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.okay.whack_a_mole.presentation.game.GameViewModel
// инъекция зависимости
val viewModel = module {
    viewModel {
        GameViewModel()
    }
}
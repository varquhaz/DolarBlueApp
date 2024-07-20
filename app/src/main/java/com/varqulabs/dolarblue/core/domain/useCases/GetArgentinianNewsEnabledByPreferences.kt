package com.varqulabs.dolarblue.core.domain.useCases

import com.varqulabs.dolarblue.core.data.local.preferences.PreferenceKey
import com.varqulabs.dolarblue.core.domain.preferences.repository.PreferencesRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow

class GetArgentinianNewsEnabledByPreferences(
    dispatcher: CoroutineDispatcher,
    private val preferencesRepository: PreferencesRepository
) : UseCase<Unit, Boolean>(dispatcher) {

    override suspend fun executeData(input: Unit): Flow<Boolean> {
        return preferencesRepository.getPreference(
            key = PreferenceKey.ARGENTINIAN_NEWS_ENABLED_KEY,
            defaultValue = false
        )
    }
}
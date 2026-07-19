package com.example.courseapp.ui.screens.detail

import androidx.lifecycle.ViewModel
import com.example.courseapp.data.model.CourseModule
import com.example.courseapp.data.repository.ModuleRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ModuleDetailViewModel : ViewModel() {
    private val _moduleState = MutableStateFlow<CourseModule?>(null)
    val moduleState: StateFlow<CourseModule?> = _moduleState

    fun loadModule(moduleId: String) {
        _moduleState.value = ModuleRepository.getModuleById(moduleId)
    }
}
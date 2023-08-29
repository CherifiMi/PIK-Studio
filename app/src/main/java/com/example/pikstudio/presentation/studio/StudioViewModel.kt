package com.example.pikstudio.presentation.studio

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.toArgb
import androidx.lifecycle.ViewModel
import com.example.pikstudio.ui.theme.Red
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


sealed class StudioEvent{
    /*data class Do2(val it: Int): StudioEvent()*/
    object DOThing: StudioEvent()
}
data class StudioState(
    val i: Int = 1
)

@HiltViewModel
class StudioViewModel @Inject constructor(): ViewModel() {
    private val _state = mutableStateOf(StudioState())
    val state: State<StudioState> = _state

    fun onEvent(event: StudioEvent){
        when(event){
            is StudioEvent.DOThing -> {
                _state.value = state.value.copy()
            }
        }
    }

}

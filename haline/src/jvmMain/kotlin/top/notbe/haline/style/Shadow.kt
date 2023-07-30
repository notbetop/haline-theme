package top.notbe.haline.style

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
class Shadows {
    val extraSmall: Dp = 2.dp
    val small: Dp = 4.dp
    val medium: Dp = 6.dp
    val large: Dp = 8.dp
    val extraLarge: Dp = 10.dp
}

internal val LocalShadows = staticCompositionLocalOf { Shadows() }

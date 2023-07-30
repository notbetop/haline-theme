package top.notbe.haline.style

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

object HalineTheme {
    val colorScheme: ColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current

    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val shapes: Shapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    val shadows: Shadows
        @Composable
        @ReadOnlyComposable
        get() = LocalShadows.current
}

@Composable
fun HalineTheme(
    colorScheme: ColorScheme = HalineTheme.colorScheme,
    shapes: Shapes = HalineTheme.shapes,
    typography: Typography = HalineTheme.typography,
    shadows: Shadows = HalineTheme.shadows,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColorScheme provides colorScheme,
        LocalShapes provides shapes,
        LocalTypography provides typography,
        LocalTextStyle provides LocalTypography.current.bodyMedium,
        LocalShadows provides shadows
    ) {
        content()
    }
}
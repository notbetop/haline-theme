package top.notbe.haline.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import top.notbe.haline.style.HalineTheme

data class ButtonColors(
    var container: Color,
    var border: Color,
    var content: Color,
    var shadow: Color = content
) {
    companion object {
        val primary
            @Composable get() = ButtonColors(
                container = HalineTheme.colorScheme.primary,
                border = HalineTheme.colorScheme.primaryBorder,
                content = HalineTheme.colorScheme.onPrimary
            )
        val secondary
            @Composable get() = ButtonColors(
                container = HalineTheme.colorScheme.secondary,
                border = HalineTheme.colorScheme.secondaryBorder,
                content = HalineTheme.colorScheme.onSecondary
            )
        val tertiary
            @Composable get() = ButtonColors(
                container = HalineTheme.colorScheme.tertiary,
                border = HalineTheme.colorScheme.tertiaryBorder,
                content = HalineTheme.colorScheme.onTertiary
            )
        val error
            @Composable get() = ButtonColors(
                container = HalineTheme.colorScheme.error,
                border = HalineTheme.colorScheme.errorBorder,
                content = HalineTheme.colorScheme.onError
            )
    }
}
package top.notbe.haline.style

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@Stable
class ColorScheme(
    primary: Color,
    primaryBorder: Color,
    onPrimary: Color,
    primaryContainer: Color,
    onPrimaryContainer: Color,

    secondary: Color,
    secondaryBorder: Color,
    onSecondary: Color,
    secondaryContainer: Color,
    onSecondaryContainer: Color,

    tertiary: Color,
    tertiaryBorder: Color,
    onTertiary: Color,
    tertiaryContainer: Color,
    onTertiaryContainer: Color,

    background: Color,
    onBackground: Color,

    surface: Color,
    surfaceBorder: Color,
    onSurface: Color,

    error: Color,
    errorBorder: Color,
    onError: Color,
    errorContainer: Color,
    onErrorContainer: Color,
) {
    var primary by mutableStateOf(primary, structuralEqualityPolicy())
        internal set

    var primaryBorder by mutableStateOf(primaryBorder, structuralEqualityPolicy())
        internal set

    var onPrimary by mutableStateOf(onPrimary, structuralEqualityPolicy())
        internal set

    var primaryContainer by mutableStateOf(primaryContainer, structuralEqualityPolicy())
        internal set

    var onPrimaryContainer by mutableStateOf(onPrimaryContainer, structuralEqualityPolicy())
        internal set

    var secondary by mutableStateOf(secondary, structuralEqualityPolicy())
        internal set

    var secondaryBorder by mutableStateOf(secondaryBorder, structuralEqualityPolicy())
        internal set

    var onSecondary by mutableStateOf(onSecondary, structuralEqualityPolicy())
        internal set

    var secondaryContainer by mutableStateOf(secondaryContainer, structuralEqualityPolicy())
        internal set

    var onSecondaryContainer by mutableStateOf(onSecondaryContainer, structuralEqualityPolicy())
        internal set

    var tertiary by mutableStateOf(tertiary, structuralEqualityPolicy())
        internal set

    var tertiaryBorder by mutableStateOf(tertiaryBorder, structuralEqualityPolicy())
        internal set

    var onTertiary by mutableStateOf(onTertiary, structuralEqualityPolicy())
        internal set

    var tertiaryContainer by mutableStateOf(tertiaryContainer, structuralEqualityPolicy())
        internal set

    var onTertiaryContainer by mutableStateOf(onTertiaryContainer, structuralEqualityPolicy())
        internal set

    var background by mutableStateOf(background, structuralEqualityPolicy())
        internal set

    var onBackground by mutableStateOf(onBackground, structuralEqualityPolicy())
        internal set

    var surface by mutableStateOf(surface, structuralEqualityPolicy())
        internal set

    var surfaceBorder by mutableStateOf(surfaceBorder, structuralEqualityPolicy())
        internal set

    var onSurface by mutableStateOf(onSurface, structuralEqualityPolicy())
        internal set

    var error by mutableStateOf(error, structuralEqualityPolicy())
        internal set

    var errorBorder by mutableStateOf(errorBorder, structuralEqualityPolicy())
        internal set

    var onError by mutableStateOf(onError, structuralEqualityPolicy())
        internal set

    var errorContainer by mutableStateOf(errorContainer, structuralEqualityPolicy())
        internal set

    var onErrorContainer by mutableStateOf(onErrorContainer, structuralEqualityPolicy())
        internal set

    fun copy(
        primary: Color = this.primary,
        primaryBorder: Color = this.primaryBorder,
        onPrimary: Color = this.onPrimary,
        primaryContainer: Color = this.primaryContainer,
        onPrimaryContainer: Color = this.onPrimaryContainer,

        secondary: Color = this.secondary,
        secondaryBorder: Color = this.secondaryBorder,
        onSecondary: Color = this.onSecondary,
        secondaryContainer: Color = this.secondaryContainer,
        onSecondaryContainer: Color = this.onSecondaryContainer,

        tertiary: Color = this.tertiary,
        tertiaryBorder: Color = this.tertiaryBorder,
        onTertiary: Color = this.onTertiary,
        tertiaryContainer: Color = this.tertiaryContainer,
        onTertiaryContainer: Color = this.onTertiaryContainer,

        background: Color = this.background,
        onBackground: Color = this.onBackground,

        surface: Color = this.surface,
        surfaceBorder: Color = this.surfaceBorder,
        onSurface: Color = this.onSurface,

        error: Color = this.error,
        errorBorder: Color = this.errorBorder,
        onError: Color = this.onError,
        errorContainer: Color = this.errorContainer,
        onErrorContainer: Color = this.onErrorContainer,
    ): ColorScheme =
        ColorScheme(
            primary = primary,
            primaryBorder = primaryBorder,
            onPrimary = onPrimary,
            primaryContainer = primaryContainer,
            onPrimaryContainer = onPrimaryContainer,

            secondary = secondary,
            secondaryBorder = secondaryBorder,
            onSecondary = onSecondary,
            secondaryContainer = secondaryContainer,
            onSecondaryContainer = onSecondaryContainer,

            tertiary = tertiary,
            tertiaryBorder = tertiaryBorder,
            onTertiary = onTertiary,
            tertiaryContainer = tertiaryContainer,
            onTertiaryContainer = onTertiaryContainer,

            background = background,
            onBackground = onBackground,

            surface = surface,
            surfaceBorder = surfaceBorder,
            onSurface = onSurface,

            error = error,
            errorBorder = errorBorder,
            onError = onError,
            errorContainer = errorContainer,
            onErrorContainer = onErrorContainer,
        )

    override fun toString(): String {
        return "ColorScheme(primary=$primary, primaryBorder=$primaryBorder, onPrimary=$onPrimary, primaryContainer=$primaryContainer, onPrimaryContainer=$onPrimaryContainer, secondary=$secondary, secondaryBorder=$secondaryBorder, onSecondary=$onSecondary, secondaryContainer=$secondaryContainer, onSecondaryContainer=$onSecondaryContainer, tertiary=$tertiary, tertiaryBorder=$tertiaryBorder, onTertiary=$onTertiary, tertiaryContainer=$tertiaryContainer, onTertiaryContainer=$onTertiaryContainer, background=$background, onBackground=$onBackground, surface=$surface, surfaceBorder=$surfaceBorder, onSurface=$onSurface, error=$error, errorBorder=$errorBorder, onError=$onError, errorContainer=$errorContainer, onErrorContainer=$onErrorContainer)"
    }

    fun contentColorFor(backgroundColor: Color): Color =
        when (backgroundColor) {
            primary -> onPrimary
            secondary -> onSecondary
            tertiary -> onTertiary
            background -> onBackground
            error -> onError
            surface -> onSurface
            primaryContainer -> onPrimaryContainer
            secondaryContainer -> onSecondaryContainer
            tertiaryContainer -> onTertiaryContainer
            errorContainer -> onErrorContainer
            else -> Color.Unspecified
        }

//    @Composable
//    @ReadOnlyComposable
//    fun contentColorFor(backgroundColor: Color) =
//        HalineTheme.colorScheme.contentColorFor(backgroundColor).takeOrElse {
//            LocalContentColor.current
//        }


}

fun defaultLightColorScheme(
    primary: Color = DefaultLightColorToken.primary,
    primaryBorder: Color = DefaultLightColorToken.primaryBorder,
    onPrimary: Color = DefaultLightColorToken.onPrimary,
    primaryContainer: Color = DefaultLightColorToken.primaryContainer,
    onPrimaryContainer: Color = DefaultLightColorToken.onPrimaryContainer,

    secondary: Color = DefaultLightColorToken.secondary,
    secondaryBorder: Color = DefaultLightColorToken.secondaryBorder,
    onSecondary: Color = DefaultLightColorToken.onSecondary,
    secondaryContainer: Color = DefaultLightColorToken.secondaryContainer,
    onSecondaryContainer: Color = DefaultLightColorToken.onSecondaryContainer,

    tertiary: Color = DefaultLightColorToken.tertiary,
    tertiaryBorder: Color = DefaultLightColorToken.tertiaryBorder,
    onTertiary: Color = DefaultLightColorToken.onTertiary,
    tertiaryContainer: Color = DefaultLightColorToken.tertiaryContainer,
    onTertiaryContainer: Color = DefaultLightColorToken.onTertiaryContainer,

    background: Color = DefaultLightColorToken.background,
    onBackground: Color = DefaultLightColorToken.onBackground,

    surface: Color = DefaultLightColorToken.surface,
    surfaceBorder: Color = DefaultLightColorToken.surfaceBorder,
    onSurface: Color = DefaultLightColorToken.onSurface,

    error: Color = DefaultLightColorToken.error,
    errorBorder: Color = DefaultLightColorToken.errorBorder,
    onError: Color = DefaultLightColorToken.onError,
    errorContainer: Color = DefaultLightColorToken.errorContainer,
    onErrorContainer: Color = DefaultLightColorToken.onErrorContainer,
): ColorScheme {
    return ColorScheme(
        primary,
        primaryBorder,
        onPrimary,
        primaryContainer,
        onPrimaryContainer,
        secondary,
        secondaryBorder,
        onSecondary,
        secondaryContainer,
        onSecondaryContainer,
        tertiary,
        tertiaryBorder,
        onTertiary,
        tertiaryContainer,
        onTertiaryContainer,
        background,
        onBackground,
        surface,
        surfaceBorder,
        onSurface,
        error,
        errorBorder,
        onError,
        errorContainer,
        onErrorContainer
    )
}

internal val LocalColorScheme = staticCompositionLocalOf { defaultLightColorScheme() }
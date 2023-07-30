package top.notbe.haline.style

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object DefaultLightColorToken {
    val primary: Color = Color(0xFFFFF068)
    val primaryBorder: Color = Color(0xFF0B0B0B)
    val onPrimary: Color = Color(0xFF2F2C14)
    val primaryContainer: Color = Color(0xFFc7c289)
    val onPrimaryContainer: Color = Color(0xFF2F2C14)

    val secondary: Color = Color(0xFFD5E9AB)
    val secondaryBorder: Color = Color(0xFF687253)
    val onSecondary: Color = Color(0xFF21241B)
    val secondaryContainer: Color = Color(0xFF71A3A5)
    val onSecondaryContainer: Color = Color(0xFF2f251d)

    val tertiary: Color = Color(0xFF8FF0E4)
    val tertiaryBorder: Color = Color(0xFF0A2728)
    val onTertiary: Color = Color(0xFF020101)
    val tertiaryContainer: Color = Color(0xFFcca0db)
    val onTertiaryContainer: Color = Color(0xFF231E28)

    val background: Color = Color(0xFFFFFFFF)
    val onBackground: Color = Color(0xFF0B0B0B)

    val surface: Color = Color(0xFFEFEFEF)
    val surfaceBorder: Color = Color(0xFF757575)
    val onSurface: Color = Color(0xFF0B0B0B)

    val error: Color = Color(0xFFF36666)
    val errorBorder: Color = Color(0xFF6F2E2E)
    val onError: Color = Color(0xFF230909)
    val errorContainer: Color = Color(0xFFa85851)
    val onErrorContainer: Color = Color(0xFF2d0f03)
}


internal object TypographyToken {
    val BodyLarge =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
    val BodyMedium =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp
        )
    val BodySmall =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )

    val DisplayLarge =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp
        )
    val DisplayMedium =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp
        )
    val DisplaySmall =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )
    val HeadlineLarge =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 36.sp
        )
    val HeadlineMedium =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 34.sp
        )
    val HeadlineSmall =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp
        )
    val LabelLarge =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    val LabelMedium =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp
        )
    val LabelSmall =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 11.sp
        )
    val TitleLarge =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp
        )
    val TitleMedium =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
    val TitleSmall =
        TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        )
}


internal object ShapeTokens {
    val CornerExtraLarge = RoundedCornerShape(28.0.dp)
    val CornerExtraLargeTop =
        RoundedCornerShape(
            topStart = 28.0.dp,
            topEnd = 28.0.dp,
            bottomEnd = 0.0.dp,
            bottomStart = 0.0.dp
        )
    val CornerExtraSmall = RoundedCornerShape(4.0.dp)
    val CornerExtraSmallTop = RoundedCornerShape(
        topStart = 4.0.dp,
        topEnd = 4.0.dp,
        bottomEnd = 0.0.dp,
        bottomStart = 0.0.dp
    )
    val CornerFull = CircleShape
    val CornerLarge = RoundedCornerShape(16.0.dp)
    val CornerLargeEnd =
        RoundedCornerShape(
            topStart = 0.0.dp,
            topEnd = 16.0.dp,
            bottomEnd = 16.0.dp,
            bottomStart = 0.0.dp
        )
    val CornerLargeTop =
        RoundedCornerShape(
            topStart = 16.0.dp,
            topEnd = 16.0.dp,
            bottomEnd = 0.0.dp,
            bottomStart = 0.0.dp
        )
    val CornerMedium = RoundedCornerShape(12.0.dp)
    val CornerNone = RectangleShape
    val CornerSmall = RoundedCornerShape(8.0.dp)
}
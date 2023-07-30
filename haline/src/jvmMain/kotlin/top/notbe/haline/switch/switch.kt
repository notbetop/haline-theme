package top.notbe.haline.switch

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import top.notbe.haline.fundation.clickable
import top.notbe.haline.style.LocalColorScheme


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Switch(
    modifier: Modifier = Modifier,
    checked: Boolean,
    disable: Boolean = false,
    onChange: (Boolean) -> Unit
) {
    val colorScheme = LocalColorScheme.current
    val interactionSource = remember { MutableInteractionSource() }
    val isHover by interactionSource.collectIsHoveredAsState()

    val dotColor by animateColorAsState(
        if (checked) colorScheme.primary else colorScheme.surface
    )
    val dotBorderColor by animateColorAsState(
        if (checked) colorScheme.primaryBorder else colorScheme.surfaceBorder
    )

    val barColor by animateColorAsState(
        if (checked) colorScheme.primary.copy(.2f) else colorScheme.surface
    )

    val barBorderColor by animateColorAsState(
        if (checked) colorScheme.primaryBorder else colorScheme.surfaceBorder
    )

    val dotOffset by animateDpAsState(
        targetValue = if (checked) lineSize.width - (dotSize / 4 * 2) else 0.dp
    )
    val dotShadowElevation by animateDpAsState(
        if (isHover) 10.dp else
            if (checked) 4.dp else 2.dp,
    )
    val mergeModifier = modifier.then(
        if (disable) Modifier.alpha(.5f) else Modifier
    )
    Box(mergeModifier) {
        Box(
            modifier = Modifier
                .width(dotSize / 2 + lineSize.width)
                .then(if (disable) Modifier.hoverable(interactionSource) else Modifier)
                .clickable {
                    if (!disable) {
                        onChange(!checked)
                    }
                }
                .pointerHoverIcon(if (disable) PointerIcon.Default else PointerIcon.Hand)
        ) {
            Box(
                modifier = Modifier,
                contentAlignment = Alignment.CenterStart
            ) {
                Box(
                    modifier = Modifier
                        .offset(x = dotSize / 4)
                        .size(lineSize)
                        .clip(CircleShape)
                        .border(1.dp, barBorderColor, CircleShape)
                        .background(barColor)
                )
                Box(
                    modifier = Modifier.size(dotSize)
                        .offset(x = dotOffset)
                        .shadow(elevation = dotShadowElevation, shape = CircleShape)
                        .clip(CircleShape)
                        .border(1.dp, dotBorderColor, CircleShape)
                        .background(dotColor)

                )
            }
        }
    }
}

private val dotSize = 26.dp
private val lineSize = DpSize(35.dp, 21.dp)
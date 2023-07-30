package top.notbe.haline.button

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import top.notbe.haline.fundation.clickable
import top.notbe.haline.style.LocalShadows
import top.notbe.haline.style.LocalShapes

@Composable
fun Button(
    modifier: Modifier = Modifier,
    borderWidth: Dp = 1.dp,
    colors: ButtonColors,
    size: DpSize,
    disable: Boolean = false,
    shape: Shape = LocalShapes.current.medium,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    val localShadows = LocalShadows.current
    val isHover by interactionSource.collectIsHoveredAsState()
    val shadowElevation by animateDpAsState(
        if (disable) 0.dp else
            if (isHover) localShadows.large else localShadows.small
    )
    val margeModifier = if (disable) modifier.alpha(.6f) else modifier
    Box(modifier = margeModifier) {
        Box(
            modifier = Modifier
                .shadow(shadowElevation, shape, spotColor = colors.shadow)
                .border(borderWidth, colors.border, shape)
                .size(size)
                .then(if (disable) Modifier else Modifier.hoverable(interactionSource))
                .clickable {
                    if (!disable) onClick()
                }
                .pointerHoverIcon(if(disable) PointerIcon.Default else PointerIcon.Hand)
                .clip(shape)
                .background(colors.container),
            contentAlignment = Alignment.Center
        ) {
            content()
        }
    }
}

@Composable
fun LargeButton(
    modifier: Modifier = Modifier,
    borderWidth: Dp = 2.dp,
    colors: ButtonColors = ButtonColors.primary,
    size: DpSize = DpSize(126.dp, 55.dp),
    disable: Boolean = false,
    shape: Shape = LocalShapes.current.medium,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Button(
        modifier = modifier,
        borderWidth = borderWidth,
        colors = colors,
        size = size,
        disable = disable,
        shape = shape,
        interactionSource = interactionSource,
        onClick = onClick,
        content = content
    )
}

@Composable
fun MediumButton(
    modifier: Modifier = Modifier,
    borderWidth: Dp = 2.dp,
    colors: ButtonColors = ButtonColors.primary,
    size: DpSize = DpSize(103.dp, 46.dp),
    disable: Boolean = false,
    shape: Shape = LocalShapes.current.medium,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Button(
        modifier = modifier,
        borderWidth = borderWidth,
        colors = colors,
        size = size,
        disable = disable,
        shape = shape,
        interactionSource = interactionSource,
        onClick = onClick,
        content = content
    )
}

@Composable
fun SmallButton(
    modifier: Modifier = Modifier,
    borderWidth: Dp = 1.dp,
    colors: ButtonColors = ButtonColors.primary,
    size: DpSize = DpSize(73.dp, 36.dp),
    disable: Boolean = false,
    shape: Shape = LocalShapes.current.medium,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Button(
        modifier = modifier,
        borderWidth = borderWidth,
        colors = colors,
        size = size,
        disable = disable,
        shape = shape,
        interactionSource = interactionSource,
        onClick = onClick,
        content = content
    )
}
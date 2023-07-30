package top.notbe.haline.context_menu

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ContextMenu(
    modifier: Modifier = Modifier,
    content: @Composable ContextMenuScope.() -> Unit
) {

}

@Composable
fun ContextMenuItem(
    modifier: Modifier = Modifier,
    content: @Composable ContextMenuScope.() -> Unit
) {

}

@Composable
fun WithContextMenu(
    modifier: Modifier = Modifier,
    content: @Composable ContextMenuScope.() -> Unit
) {

}


interface ContextMenuScope

//fun main() {
//    ContextMenu {
//        ContextMenuItem {
//
//        }
//
//        ContextMenuItem {
//
//        }
//    }
//}
package com.laoxu.launcher.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = Primary,
    secondary = Secondary,
    background = Background,
    surface = Surface,
    onPrimary = OnPrimary,
    onBackground = OnBackground,
    onSurface = OnSurface
)

private val DarkColors = darkColorScheme(
    primary = PrimaryVariant,
    secondary = Secondary,
    background = Color.Black,
    surface = Color.DarkGray,
    onPrimary = OnPrimary,
    onBackground = OnBackground,
    onSurface = OnSurface
)

@Composable
fun LaoxuTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = Typography(),
        content = content
    )
}

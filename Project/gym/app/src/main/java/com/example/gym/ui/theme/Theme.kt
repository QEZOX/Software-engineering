// وارد کردن کتابخانه‌های مورد نیاز برای استفاده از تم و رنگ‌ها
package com.example.gym.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme // برای تشخیص تم تاریک سیستم
import androidx.compose.material3.MaterialTheme // برای اعمال تم در رابط کاربری
import androidx.compose.material3.darkColorScheme // برای تعریف رنگ‌های تم تاریک
import androidx.compose.material3.dynamicDarkColorScheme // برای رنگ‌های دینامیک تم تاریک در نسخه‌های اندروید 12 به بالا
import androidx.compose.material3.dynamicLightColorScheme // برای رنگ‌های دینامیک تم روشن در نسخه‌های اندروید 12 به بالا
import androidx.compose.material3.lightColorScheme // برای تعریف رنگ‌های تم روشن
import androidx.compose.runtime.Composable // برای استفاده از کامپوزابل
import androidx.compose.ui.platform.LocalContext // برای دسترسی به context محلی

// تعریف رنگ‌های مورد استفاده در تم تاریک
private val DarkColorScheme = darkColorScheme(
    primary = Purple80, // رنگ اصلی (بنفش روشن)
    secondary = PurpleGrey80, // رنگ فرعی (بنفش خاکی روشن)
    tertiary = Pink80 // رنگ سوم (صورتی روشن)
)

// تعریف رنگ‌های مورد استفاده در تم روشن
private val LightColorScheme = lightColorScheme(
    primary = Purple40, // رنگ اصلی (بنفش تیره)
    secondary = PurpleGrey40, // رنگ فرعی (بنفش خاکی تیره)
    tertiary = Pink40 // رنگ سوم (صورتی تیره)

    /* سایر رنگ‌ها برای بازنویسی (در صورت نیاز):
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

// تابع کامپوزابل برای اعمال تم به رابط کاربری
@Composable
fun GymTheme(
    darkTheme: Boolean = isSystemInDarkTheme(), // تعیین اینکه از تم تاریک استفاده شود یا خیر
    dynamicColor: Boolean = true, // فعال یا غیرفعال کردن رنگ‌های دینامیک در دستگاه‌های با اندروید 12 و بالاتر
    content: @Composable () -> Unit // محتوای اصلی که باید در داخل تم نمایش داده شود
) {
    // انتخاب رنگ‌ها بر اساس تم انتخابی
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            // اگر دستگاه از اندروید 12 یا بالاتر باشد، از رنگ‌های دینامیک استفاده می‌شود
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme // اگر تم تاریک باشد، از رنگ‌های تم تاریک استفاده می‌شود
        else -> LightColorScheme // در غیر این صورت، از رنگ‌های تم روشن استفاده می‌شود
    }

    // اعمال تم به رابط کاربری با رنگ‌ها و تایپوگرافی انتخاب‌شده
    MaterialTheme(
        colorScheme = colorScheme, // تعیین رنگ‌های تم
        typography = Typography, // تعیین تایپوگرافی (فونت‌ها)
        content = content // محتوای داخلی که باید نمایش داده شود
    )
}

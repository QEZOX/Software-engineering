// وارد کردن کتابخانه‌های مورد نیاز برای تایپوگرافی
package com.example.gym.ui.theme

import androidx.compose.material3.Typography // برای استفاده از تایپوگرافی در متریال 3
import androidx.compose.ui.text.TextStyle // برای تنظیم استایل متن
import androidx.compose.ui.text.font.FontFamily // برای تعیین خانواده فونت
import androidx.compose.ui.text.font.FontWeight // برای تعیین وزن فونت
import androidx.compose.ui.unit.sp // برای تعیین اندازه فونت بر حسب sp

// تعریف مجموعه‌ای از استایل‌های تایپوگرافی برای شروع
val Typography = Typography(
    // استایل متن برای بدنه بزرگ
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default, // استفاده از خانواده فونت پیش‌فرض
        fontWeight = FontWeight.Normal, // وزن فونت عادی
        fontSize = 16.sp, // اندازه فونت 16sp
        lineHeight = 24.sp, // ارتفاع خط 24sp
        letterSpacing = 0.5.sp // فاصله حروف 0.5sp
    )
    // سایر استایل‌های پیش‌فرض متن که می‌توانید آنها را بازنویسی کنید
    /* 
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default, // استفاده از خانواده فونت پیش‌فرض
        fontWeight = FontWeight.Normal, // وزن فونت عادی
        fontSize = 22.sp, // اندازه فونت 22sp
        lineHeight = 28.sp, // ارتفاع خط 28sp
        letterSpacing = 0.sp // فاصله حروف 0sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default, // استفاده از خانواده فونت پیش‌فرض
        fontWeight = FontWeight.Medium, // وزن فونت متوسط
        fontSize = 11.sp, // اندازه فونت 11sp
        lineHeight = 16.sp, // ارتفاع خط 16sp
        letterSpacing = 0.5.sp // فاصله حروف 0.5sp
    )
    */
)

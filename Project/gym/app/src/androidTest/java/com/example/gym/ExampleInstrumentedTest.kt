// وارد کردن پکیج‌ها و کتابخانه‌های مورد نیاز برای تست
package com.example.gym

import androidx.test.platform.app.InstrumentationRegistry // برای دسترسی به context اپلیکیشن
import androidx.test.ext.junit.runners.AndroidJUnit4 // برای استفاده از رانر AndroidJUnit4 در تست‌های اندروید

import org.junit.Test // برای ایجاد متدهای تست
import org.junit.runner.RunWith // برای مشخص کردن رانر تست
import org.junit.Assert.* // برای استفاده از توابع assertion در تست‌ها

/**
 * تست‌های اینسترومنت (Instrumented test)، که روی دستگاه اندروید اجرا خواهند شد.
 *
 * برای اطلاعات بیشتر به مستندات تست مراجعه کنید: [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class) // اجرای تست‌ها با استفاده از رانر AndroidJUnit4
class ExampleInstrumentedTest {
    // تعریف یک تست به نام useAppContext
    @Test
    fun useAppContext() {
        // دریافت context اپلیکیشن در حال تست
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        // بررسی اینکه نام بسته اپلیکیشن با "com.example.gym" برابر باشد
        assertEquals("com.example.gym", appContext.packageName)
    }
}

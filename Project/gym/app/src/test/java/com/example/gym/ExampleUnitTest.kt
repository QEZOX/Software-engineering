// وارد کردن کتابخانه‌های مورد نیاز برای تست
package com.example.gym

import org.junit.Test // برای ایجاد متدهای تست
import org.junit.Assert.* // برای استفاده از توابع assertion در تست‌ها

/**
 * تست محلی (Local unit test)، که روی ماشین توسعه (Host) اجرا می‌شود.
 *
 * برای اطلاعات بیشتر به مستندات تست مراجعه کنید: [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    // تعریف یک تست به نام addition_isCorrect
    @Test
    fun addition_isCorrect() {
        // بررسی اینکه جمع 2 و 2 برابر با 4 است
        assertEquals(4, 2 + 2)
    }
}

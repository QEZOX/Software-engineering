// وارد کردن پکیج‌ها و کتابخانه‌های مورد نیاز
package Presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gym.R

// تعریف کلاس SundayFragment که از Fragment ارث‌بری می‌کند
class SundayFragment : Fragment() {

    // بازنویسی متد onCreateView که برای ایجاد و بازگشت نمای فریم‌ورک فرگمنت استفاده می‌شود
    override fun onCreateView(
        inflater: LayoutInflater, // برای باز کردن Layout استفاده می‌شود
        container: ViewGroup?, // گروه نمایی که فرگمنت در آن قرار می‌گیرد
        savedInstanceState: Bundle? // داده‌های ذخیره‌شده قبلی (در صورت وجود)
    ): View? {
        // بارگذاری و نمایش Layout مربوط به فرگمنت یکشنبه (که در فایل XML تعریف شده است)
        return inflater.inflate(R.layout.fragment_sunday, container, false)
    }
}

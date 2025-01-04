package Presentation// وارد کردن کتابخانه‌ها و پکیج‌های مورد نیاز
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gym.R

// تعریف کلاس Presentation.SaturdayFragment که از Fragment ارث‌بری می‌کند
class SaturdayFragment : Fragment() {

    // بازنویسی متد onCreateView که برای ایجاد و بازگشت نمای فریم‌ورک فرگمنت استفاده می‌شود
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, // دریافت LayoutInflater و container برای بارگذاری نما
        savedInstanceState: Bundle? // داده‌های ذخیره‌شده قبلی (در صورت وجود)
    ): View? {
        // بارگذاری و نمایش Layout مخصوص این فرگمنت (که در فایل XML تعریف شده است)
        return inflater.inflate(R.layout.fragment_saturday, container, false)
    }
}

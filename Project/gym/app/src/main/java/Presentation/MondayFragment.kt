package Presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gym.R

// این کلاس نماینده‌ی Fragment مربوط به روز دوشنبه است
class MondayFragment : Fragment() {

    // این متد برای ایجاد و نمایش نمای مربوط به این Fragment استفاده می‌شود
    override fun onCreateView(
        inflater: LayoutInflater, // مسئول ایجاد نمای XML و تبدیل آن به View
        container: ViewGroup?,   // گروه والد که View به آن اضافه می‌شود (اگر وجود داشته باشد)
        savedInstanceState: Bundle? // داده‌های ذخیره شده در هنگام بازسازی
    ): View? {
        // فایل layout مربوط به این Fragment (fragment_monday) را inflate می‌کند
        return inflater.inflate(R.layout.fragment_monday, container, false)
    }
}

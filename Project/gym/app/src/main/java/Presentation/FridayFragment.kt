package Presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.gym.R

// این کلاس نماینده‌ی یک Fragment برای نمایش محتوا مربوط به روز جمعه است
class FridayFragment : Fragment() {

    // این متد برای ایجاد و نمایش نمای مرتبط با این Fragment استفاده می‌شود
    override fun onCreateView(
        inflater: LayoutInflater, // مسئول تبدیل layout XML به View
        container: ViewGroup?,   // ViewGroup والد که View باید به آن متصل شود
        savedInstanceState: Bundle? // داده‌های ذخیره‌شده، اگر وجود داشته باشد
    ): View? {
        // فایل layout مربوط به این Fragment (fragment_friday) را inflate می‌کند
        return inflater.inflate(R.layout.fragment_friday, container, false)
    }
}

package Presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gym.R

class ExerciseFragment : Fragment() {

    companion object {
        private const val ARG_EXERCISE_NAME = "exerciseName" // کلید برای آرگومان نام تمرین

        // این متد برای ساخت یک نمونه جدید از ExerciseFragment با استفاده از آرگومان (نام تمرین) استفاده می‌شود
        fun newInstance(exerciseName: String): ExerciseFragment {
            val fragment = ExerciseFragment()
            val args = Bundle()
            args.putString(ARG_EXERCISE_NAME, exerciseName) // ذخیره نام تمرین در آرگومان‌ها
            fragment.arguments = args
            return fragment
        }
    }

    // این متد برای ایجاد و نمایش نمای مربوط به این Fragment استفاده می‌شود
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // فایل layout مربوط به این Fragment را inflate می‌کند
        return inflater.inflate(R.layout.fragment_exercise, container, false)
    }
}

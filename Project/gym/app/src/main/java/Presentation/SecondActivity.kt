// وارد کردن پکیج‌ها و کتابخانه‌های مورد نیاز
package Presentation

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.gym.R

// تعریف کلاس SecondActivity که از AppCompatActivity ارث‌بری می‌کند
class SecondActivity : AppCompatActivity() {

    // متد onCreate که هنگام ایجاد Activity فراخوانی می‌شود
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // تعیین Layout مربوط به این Activity
        setContentView(R.layout.activity_second)

        // پیدا کردن دکمه‌ها (Button) برای هر روز هفته
        val saturdayTextView = findViewById<Button>(R.id.saturdayTextView)
        val sundayTextView = findViewById<Button>(R.id.sundayTextView)
        val mondayTextView = findViewById<Button>(R.id.mondayTextView)
        val tuesdayTextView = findViewById<Button>(R.id.tuesdayTextView)
        val wednesdayTextView = findViewById<Button>(R.id.wednesdayTextView)
        val thursdayTextView = findViewById<Button>(R.id.thursdayTextView)
        val fridayTextView = findViewById<Button>(R.id.fridayTextView)

        // تنظیم رویداد کلیک برای هر دکمه تا فرگمنت‌های مختلف نمایش داده شوند
        saturdayTextView.setOnClickListener {
            replaceFragment(SaturdayFragment()) // باز کردن فرگمنت مربوط به شنبه
        }

        sundayTextView.setOnClickListener {
            replaceFragment(SundayFragment()) // باز کردن فرگمنت مربوط به یکشنبه
        }

        mondayTextView.setOnClickListener {
            replaceFragment(MondayFragment()) // باز کردن فرگمنت مربوط به دوشنبه
        }

        tuesdayTextView.setOnClickListener {
            replaceFragment(TuesdayFragment()) // باز کردن فرگمنت مربوط به سه‌شنبه
        }

        wednesdayTextView.setOnClickListener {
            replaceFragment(WednesdayFragment()) // باز کردن فرگمنت مربوط به چهارشنبه
        }

        thursdayTextView.setOnClickListener {
            replaceFragment(ThursdayFragment()) // باز کردن فرگمنت مربوط به پنج‌شنبه
        }

        fridayTextView.setOnClickListener {
            replaceFragment(FridayFragment()) // باز کردن فرگمنت مربوط به جمعه
        }
    }

    // متد جایگزینی فرگمنت جدید در Activity
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction() // شروع تراکنش
            .replace(R.id.fragmentContainer, fragment) // جایگزین کردن فرگمنت جدید
            .commit() // اتمام تراکنش
    }
}

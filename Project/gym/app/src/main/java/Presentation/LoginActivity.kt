package Presentation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gym.R

class LoginActivity : AppCompatActivity() {

    // تعریف متغیرها برای استفاده از ویجت‌های صفحه
    private lateinit var firstNameEditText: EditText
    private lateinit var lastNameEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var heightEditText: EditText
    private lateinit var weightEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // اتصال فایل XML به این اکتیویتی

        // مقداردهی اولیه ویجت‌ها با استفاده از ID آنها
        firstNameEditText = findViewById(R.id.firstNameEditText)
        lastNameEditText = findViewById(R.id.lastNameEditText)
        ageEditText = findViewById(R.id.ageEditText)
        heightEditText = findViewById(R.id.heightEditText)
        weightEditText = findViewById(R.id.weightEditText)
        loginButton = findViewById(R.id.loginButton)

        // تنظیم رویداد کلیک برای دکمه ورود
        loginButton.setOnClickListener {
            // دریافت مقادیر وارد شده توسط کاربر
            val firstName = firstNameEditText.text.toString()
            val lastName = lastNameEditText.text.toString()
            val ageText = ageEditText.text.toString()
            val heightText = heightEditText.text.toString()
            val weightText = weightEditText.text.toString()

            // بررسی اینکه آیا همه فیلدها پر شده‌اند یا نه
            if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() || heightText.isEmpty() || weightText.isEmpty()) {
                // نمایش پیام هشدار به کاربر
                Toast.makeText(this, "لطفاً همه‌ی مشخصات را پر کنید", Toast.LENGTH_SHORT).show()
            } else {
                // تبدیل مقادیر سن، قد و وزن به نوع مناسب (با پیش‌فرض در صورت خطا)
                val age = ageText.toIntOrNull() ?: 0
                val height = heightText.toDoubleOrNull() ?: 0.0
                val weight = weightText.toDoubleOrNull() ?: 0.0

                // انتقال داده‌ها به اکتیویتی دوم
                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra("FIRST_NAME", firstName) // ارسال نام
                    putExtra("LAST_NAME", lastName) // ارسال نام خانوادگی
                    putExtra("AGE", age) // ارسال سن
                    putExtra("HEIGHT", height) // ارسال قد
                    putExtra("WEIGHT", weight) // ارسال وزن
                }
                startActivity(intent) // شروع اکتیویتی دوم
            }
        }
    }
}

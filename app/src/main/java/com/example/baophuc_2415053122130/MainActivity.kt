package com.example.baophuc_2415053122130

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dữ liệu cá nhân hóa
        val student = Student(
            id = "2415053122130",
            name = "Bảo Phúc",
            className = "241505",
            age = 20,
            score = 8.5
        )

        // Gán dữ liệu lên View
        findViewById<TextView>(R.id.tvId).text = "MSSV: ${student.id}"
        findViewById<TextView>(R.id.tvName).text = "Họ tên: ${student.name.uppercase()}"
        findViewById<TextView>(R.id.tvClass).text = "Lớp: ${student.className}"
        findViewById<TextView>(R.id.tvAge).text = "Tuổi: ${student.age}"
        findViewById<TextView>(R.id.tvScore).text = "Điểm: ${student.score}"

        // Gọi Extension Functions
        findViewById<TextView>(R.id.tvStatus).text = "Trạng thái: ${student.getStatus()}"
        findViewById<TextView>(R.id.tvRank).text = "Xếp loại: ${student.getRank()}"
    }
}
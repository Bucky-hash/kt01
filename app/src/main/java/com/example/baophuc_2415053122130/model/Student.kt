package com.example.baophuc_2415053122130

/**
 * Model lưu trữ thông tin sinh viên.
 * Yêu cầu 6 (bổ sung 1 thông tin vào giao diện): thêm trường "email"
 * ngoài 5 trường bắt buộc (mssv, hoTen, lop, tuoi, diem).
 */
data class Student(
    val mssv: String,
    val hoTen: String,
    val lop: String,
    val tuoi: Int,
    val diem: Double,
    val email: String
)

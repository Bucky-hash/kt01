package com.example.baophuc_2415053122130


// Extension Function 1: Đánh giá trạng thái Đạt / Chưa đạt
fun Student.getStatus(): String {
    return if (this.score >= 5.0) "Đạt" else "Chưa đạt"
}

// Extension Function 2: Xếp loại học lực
fun Student.getRank(): String {
    return when {
        this.score >= 8.5 -> "Xuất sắc"
        this.score >= 7.0 -> "Khá"
        this.score >= 5.0 -> "Trung bình"
        else -> "Yếu"
    }
}
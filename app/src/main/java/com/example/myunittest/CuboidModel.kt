package com.example.myunittest

class CuboidModel {
    private var width = 0.0
    private var length = 0.0
    private var height = 0.0

    fun getVolume(): Double = width * length * height


    //Yang Benar
//    fun getSurfaceArea(): Double{
//        val wl = width * length
//        val wh = width * height
//        val lh = length * height
//        return 2 * (wl + wh + lh)
//    }

    //Yang Salah
    fun getSurfaceArea(): Double {
        val lw = length * width
        val wh = width * height
        val lh = length * height
        return 4 * (lw + wh + lh)

    }
    fun getCircumference(): Double = 4 * (width+length+height)
    fun save(width: Double, length: Double, height: Double){
        this.width = width
        this.length = length
        this.height = height
    }
}
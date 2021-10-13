package com.example.myapplication

open class ColisionRect(var x : Float, var y : Float, var width : Float, var height : Float)
{
    open fun Move(x : Float, y : Float)
    {
        this.x = x
        this.y = y
    }
    open fun ColidersWith(rect : ColisionRect) : Boolean
    {
        return x < rect.x + rect.width && y < rect.y + rect.height &&
                x + width > rect.x && y + height > rect.y
    }
}
package com.example.chrono.tpath

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
import java.security.AccessControlContext

val DATABASE_NAME = "MyDB"
val TABLE_NAME= "Users"
val COL_EMAIL = "email"
val COL_PASSWORD = "passwd"
val COL_ID = "id"

class DataBaseHandler(var context: Context): SQLiteOpenHelper(context, DATABASE_NAME,null,1) {
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        val createTable = "CREATE TABLE"+ TABLE_NAME+"("+COL_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"+ COL_EMAIL+" VARCHAR(256),"+ COL_PASSWORD+" VARCHAR(256)";
        db?.execSQL(createTable)
    }

    override fun onCreate(db: SQLiteDatabase?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun insertData(user: User){
        val db = this.writableDatabase
        var cv = ContentValues()
        cv.put(COL_EMAIL,user.emailstu)
        cv.put(COL_PASSWORD,user.passwordstu)
        var result = db.insert(TABLE_NAME,null,cv)
        if(result == -1.toLong())
            Toast.makeText(context,"Failed",Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(context,"Success",Toast.LENGTH_SHORT).show()

    }
}
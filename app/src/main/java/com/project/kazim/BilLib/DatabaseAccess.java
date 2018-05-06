package com.project.kazim.BilLib;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    /**
     * Private constructor to avoid object creation from outside classes.
     *
     * @param context
     */
    public DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
}

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DabaseAccess
     */
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    /**
     * Read all quotes from the database.
     *
     * @return a List of quotes
     */
//    public List<String> getBooks() {
//        List<String> list = new ArrayList<>();
//        Cursor cursor = database.rawQuery("SELECT RangeStart,RangeEnd FROM locations", null);
//        cursor.moveToFirst();
//        while (!cursor.isAfterLast()) {
//            list.add(cursor.getString(0)+"-"+cursor.getString(1));
//            cursor.moveToNext();
//        }
//        cursor.close();
//        return list;
//    }
    public Location getLocationInformation(String search)
    {
            open();
            Cursor cursor = database.rawQuery("SELECT ShelfID,RangeStart,RangeEnd,ShelfLocation,Xcor,Ycor FROM locations",null);
            cursor.moveToFirst();

            while (cursor.moveToNext()) {

                String ShelfID = cursor.getString(0);
                String RangeStart = cursor.getString(1);
                String RangeEnd = cursor.getString(2);
                String ShelfLocation = cursor.getString(3);
                double Xcor = cursor.getDouble(4);
                double Ycor = cursor.getDouble(5);
                Comparator comparator = new Comparator();
                int x = comparator.CompareTo(search,RangeStart);
                int y = comparator.CompareTo(search,RangeEnd);
                if(comparator.CompareTo(search,RangeStart)>=0 && comparator.CompareTo(search,RangeEnd)<=0)
                    return new Location(ShelfID,ShelfLocation,Xcor,Ycor);

            }
            close();
        return  null;
    }
}
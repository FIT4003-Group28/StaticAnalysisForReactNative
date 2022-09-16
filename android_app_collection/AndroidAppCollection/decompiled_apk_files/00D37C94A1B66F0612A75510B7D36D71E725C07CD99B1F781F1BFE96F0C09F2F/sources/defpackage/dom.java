package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: PG */
/* renamed from: dom  reason: default package */
/* loaded from: classes3.dex */
public final class dom extends SQLiteOpenHelper {
    public dom(Context context) {
        super(context, "google_conversion_tracking.db", (SQLiteDatabase.CursorFactory) null, 5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(don.a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS conversiontracking");
        onCreate(sQLiteDatabase);
    }
}

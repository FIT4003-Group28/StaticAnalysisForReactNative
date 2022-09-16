package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: PG */
/* renamed from: akzo  reason: default package */
/* loaded from: classes.dex */
final class akzo extends SQLiteOpenHelper {
    public akzo(Context context) {
        super(context, "youtube_upload_service", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS job_storage_jobs");
        sQLiteDatabase.execSQL("CREATE TABLE job_storage_jobs (id TEXT PRIMARY KEY,version INTEGER,data BLOB)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z = false;
        aqxo.p(i > 1);
        if (i2 == 1) {
            z = true;
        }
        aqxo.p(z);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z = false;
        aqxo.p(i <= 0);
        if (i2 == 1) {
            z = true;
        }
        aqxo.p(z);
        onCreate(sQLiteDatabase);
    }
}

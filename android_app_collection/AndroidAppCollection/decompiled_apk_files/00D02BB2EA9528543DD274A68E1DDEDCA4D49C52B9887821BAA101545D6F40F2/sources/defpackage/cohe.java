package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
/* compiled from: PG */
/* renamed from: cohe  reason: default package */
/* loaded from: classes5.dex */
final class cohe extends SQLiteOpenHelper {
    private final Context a;
    private final String b;
    private final dcdc<String> c;
    private final int d;
    private boolean e;

    public cohe(Context context, dcdc<String> dcdcVar) {
        super(context, "brella_example_store", (SQLiteDatabase.CursorFactory) null, dcdcVar.size());
        this.a = context;
        this.b = "brella_example_store";
        this.c = dcdcVar;
        this.d = dcdcVar.size();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            if (!SQLiteDatabase.deleteDatabase(this.a.getDatabasePath(this.b))) {
                String str = this.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
                sb.append("Deletion of ");
                sb.append(str);
                sb.append(" failed");
                sb.toString();
                throw e;
            }
            try {
                writableDatabase = super.getWritableDatabase();
            } catch (SQLiteException e2) {
                throw e2;
            }
        }
        if (this.e) {
            String path = writableDatabase.getPath();
            writableDatabase.close();
            SQLiteDatabase.deleteDatabase(new File(path));
            this.e = false;
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e3) {
                throw e3;
            }
        }
        return writableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        onUpgrade(sQLiteDatabase, 0, this.d);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.e = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        boolean z = false;
        dbsk.a(i >= 0);
        dbsk.a(i < i2);
        if (i2 == this.d) {
            z = true;
        }
        dbsk.a(z);
        sQLiteDatabase.beginTransaction();
        while (i < i2) {
            try {
                sQLiteDatabase.execSQL(this.c.get(i));
                i++;
            } finally {
                sQLiteDatabase.endTransaction();
            }
        }
        sQLiteDatabase.setTransactionSuccessful();
    }
}

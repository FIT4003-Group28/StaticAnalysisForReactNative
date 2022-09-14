package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: PG */
/* renamed from: cvkl  reason: default package */
/* loaded from: classes5.dex */
final class cvkl extends SQLiteOpenHelper {
    public cvkl(Context context) {
        super(context, "accounts.notifications.db", (SQLiteDatabase.CursorFactory) null, 5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        cvlw.a("ChimeAccountSQLiteHelper", "Creating SQLite Database [%s]", "accounts.notifications.db");
        sQLiteDatabase.execSQL("CREATE TABLE accounts(_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE NOT NULL,obfuscated_gaia_id TEXT,sync_version INTEGER NOT NULL DEFAULT(0),page_version INTEGER NOT NULL DEFAULT(0),registration_status INTEGER NOT NULL DEFAULT(0),last_registration_time_ms INTEGER NOT NULL DEFAULT(0),last_registration_request_hash INTEGER NOT NULL DEFAULT(0),first_registration_version INTEGER NOT NULL DEFAULT(0));");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        cvlw.a("ChimeAccountSQLiteHelper", "Upgrading SQLite Database [%s], from version [%d] to [%d]", "accounts.notifications.db", Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accounts");
            sQLiteDatabase.execSQL("CREATE TABLE accounts(_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE NOT NULL,obfuscated_gaia_id TEXT,sync_version INTEGER NOT NULL DEFAULT(0),page_version INTEGER NOT NULL DEFAULT(0),registration_status INTEGER NOT NULL DEFAULT(0),last_registration_time_ms INTEGER NOT NULL DEFAULT(0),last_registration_request_hash INTEGER NOT NULL DEFAULT(0),first_registration_version INTEGER NOT NULL DEFAULT(0));");
            return;
        }
        if (i < 3) {
            cvks.c(sQLiteDatabase, "accounts", "last_registration_time_ms", "INTEGER NOT NULL DEFAULT(0)");
            i = 3;
        }
        if (i < 4) {
            cvks.c(sQLiteDatabase, "accounts", "last_registration_request_hash", "INTEGER NOT NULL DEFAULT(0)");
        } else if (i >= 5) {
            return;
        }
        if (cvks.d(sQLiteDatabase, "accounts", "first_registration_version")) {
            return;
        }
        cvks.c(sQLiteDatabase, "accounts", "first_registration_version", "INTEGER NOT NULL DEFAULT(0)");
    }
}

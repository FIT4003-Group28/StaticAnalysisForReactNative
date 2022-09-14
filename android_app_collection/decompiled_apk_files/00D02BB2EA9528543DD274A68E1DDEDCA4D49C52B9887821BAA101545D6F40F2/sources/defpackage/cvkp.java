package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: PG */
/* renamed from: cvkp  reason: default package */
/* loaded from: classes5.dex */
public final class cvkp extends SQLiteOpenHelper {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cvkp(android.content.Context r3, long r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 45
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "_threads.notifications.db"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5 = 0
            r0 = 18
            r2.<init>(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvkp.<init>(android.content.Context, long):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        cvlw.a("ChimeThreadSQLiteHelper", "Creating SQLite Database [%s]", getDatabaseName());
        sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0));");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = i;
        cvlw.a("ChimeThreadSQLiteHelper", "Upgrading SQLite Database [%s], from version [%d] to [%d]", getDatabaseName(), Integer.valueOf(i), Integer.valueOf(i2));
        if (i3 < 6) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS threads");
            sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0));");
            return;
        }
        if (i3 == 6) {
            cvks.c(sQLiteDatabase, "threads", "expiration_timestamp", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 7) {
                return;
            }
            i3 = 7;
        }
        if (i3 == 7) {
            cvks.c(sQLiteDatabase, "threads", "locally_removed", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 8) {
                return;
            }
            i3 = 8;
        }
        if (i3 < 12) {
            cvks.c(sQLiteDatabase, "threads", "storage_mode", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 12) {
                return;
            }
            i3 = 12;
        }
        if (i3 < 14) {
            cvks.c(sQLiteDatabase, "threads", "payload_type", "TEXT");
            if (i2 <= 14) {
                return;
            }
            i3 = 14;
        }
        if (i3 == 14) {
            cvks.c(sQLiteDatabase, "threads", "thread_stored_timestamp", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 15) {
                return;
            }
            i3 = 15;
        }
        if (i3 == 15) {
            cvks.c(sQLiteDatabase, "threads", "creation_id", "INTEGER NOT NULL DEFAULT(0)");
            if (i2 <= 16) {
                return;
            }
            i3 = 16;
        }
        if (i3 == 16) {
            cvks.c(sQLiteDatabase, "threads", "actions", "BLOB");
            if (i2 <= 17) {
                return;
            }
        } else if (i3 != 17) {
            return;
        }
        if (!cvks.d(sQLiteDatabase, "threads", "_id", "thread_id", "read_state", "count_behavior", "system_tray_behavior", "last_updated__version", "last_notification_version", "creation_id", "notification_metadata", "actions", "rendered_message", "payload_type", "payload", "update_thread_state_token", "group_id", "expiration_timestamp", "thread_stored_timestamp", "locally_removed", "storage_mode")) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS threads");
            sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),creation_id INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,actions BLOB,rendered_message BLOB,payload_type TEXT,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),locally_removed INTEGER NOT NULL DEFAULT(0),storage_mode INTEGER NOT NULL DEFAULT(0));");
        }
        if (i2 <= 18) {
        }
    }
}

package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: PG */
/* renamed from: crwm  reason: default package */
/* loaded from: classes5.dex */
public final class crwm extends SQLiteOpenHelper {
    @dzsi
    private static crwm a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private crwm(android.content.Context r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "PhotoUploader.db"
            if (r5 == 0) goto L19
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]
            r1 = 0
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getPath()
            r5[r1] = r2
            r1 = 1
            r5[r1] = r0
            java.lang.String r0 = defpackage.deeb.a(r5)
        L19:
            r5 = 0
            r1 = 22
            r3.<init>(r4, r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crwm.<init>(android.content.Context, boolean):void");
    }

    public static synchronized crwm a(Context context, crwb crwbVar) {
        crwm crwmVar;
        synchronized (crwm.class) {
            if (a == null) {
                Context applicationContext = context.getApplicationContext();
                crwf crwfVar = crwbVar.w;
                if (crwfVar == null) {
                    crwfVar = crwf.c;
                }
                a = new crwm(applicationContext, crwfVar.a);
            }
            crwmVar = a;
        }
        return crwmVar;
    }

    private static void c(SQLiteDatabase sQLiteDatabase, String str) {
        StringBuilder sb = new StringBuilder(str.length() + 37 + 4);
        sb.append("ALTER TABLE ");
        sb.append("upload_tasks");
        sb.append(" ADD COLUMN ");
        sb.append(str);
        sb.append(" ");
        sb.append("TEXT");
        sQLiteDatabase.execSQL(sb.toString());
    }

    final void b(SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {"labels", "local_tags", "places", "photos", "upload_labels", "upload_local_tags", "upload_associations", "upload_tasks"};
        for (int i = 0; i < 8; i++) {
            String valueOf = String.valueOf(strArr[i]);
            sQLiteDatabase.execSQL(valueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(valueOf) : new String("DROP TABLE IF EXISTS "));
        }
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE upload_tasks ( _id INTEGER PRIMARY KEY, gpu_media_id TEXT NOT NULL, request_time INTEGER, account_name TEXT, obfuscated_user_id TEXT, source INTEGER, ugcs_client_name TEXT, share_target INTEGER, upload_target INTEGER, original_url TEXT, description TEXT, album_id TEXT, ugcs_content_id TEXT, place_confidence BLOB, clientside_metadata BLOB, cell_id INTEGER, fprint INTEGER, latitude REAL, longitude REAL, mid TEXT, match_existing_media INTEGER, wifi_only INTEGER, clear_record_type INTEGER, clear_record_ttl INTEGER, temp_copy_uri TEXT, sha1_hash TEXT, mime_type TEXT, byte_size INTEGER, upload_status INTEGER, attempt_count INTEGER, transfer_handle TEXT, completion_time INTEGER, success_reason INTEGER, failure_reason INTEGER, public_photo_id TEXT, public_media_key TEXT, public_image_url TEXT, public_content_url TEXT )");
        sQLiteDatabase.execSQL("CREATE TABLE upload_labels ( _id INTEGER PRIMARY KEY, upload_task_id INTEGER NOT NULL, label TEXT NOT NULL, FOREIGN KEY ( upload_task_id ) REFERENCES upload_tasks ( _id ) ON DELETE CASCADE );");
        sQLiteDatabase.execSQL("CREATE TABLE upload_local_tags (_id INTEGER PRIMARY KEY, upload_task_id INTEGER NOT NULL, local_tag BLOB NOT NULL, FOREIGN KEY ( upload_task_id ) REFERENCES upload_tasks ( _id ) ON DELETE CASCADE );");
        sQLiteDatabase.execSQL("CREATE TABLE upload_associations (_id INTEGER PRIMARY KEY, upload_task_id INTEGER NOT NULL, association BLOB NOT NULL, FOREIGN KEY ( upload_task_id ) REFERENCES upload_tasks ( _id ) ON DELETE CASCADE );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 20) {
            b(sQLiteDatabase);
            return;
        }
        if (i < 21) {
            c(sQLiteDatabase, "ugcs_content_id");
        } else if (i >= 22) {
            return;
        }
        c(sQLiteDatabase, "ugcs_client_name");
    }
}

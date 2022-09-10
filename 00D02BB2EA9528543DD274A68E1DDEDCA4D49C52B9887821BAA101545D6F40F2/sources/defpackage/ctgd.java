package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* renamed from: ctgd  reason: default package */
/* loaded from: classes5.dex */
public final class ctgd extends SQLiteOpenHelper {
    public final dbsg a;
    private final dehp b;

    public ctgd(Context context, dbsg dbsgVar) {
        super(context, "lighter_registration.db", (SQLiteDatabase.CursorFactory) null, 8);
        this.b = cstu.b().a;
        this.a = dbsgVar;
    }

    private static final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE registration ( registration_id INTEGER PRIMARY KEY AUTOINCREMENT, tachyon_app_name TEXT, tachyon_auth_token BLOB, auth_token_expire_at_timestamp_ms INT, identity_key_type INT NOT NULL DEFAULT 1, identity_key_private BLOB, identity_key_public BLOB, server_registration_id BLOB, server_registration_status INTEGER, auth_token_refreshed_at_timestamp_ms INTEGER, registration_properties BLOB);");
        sQLiteDatabase.execSQL("CREATE TABLE reachability(reachability_id TEXT, reachability_type INT,  registration_id INT,  reachability_normalized_id TEXT, FOREIGN KEY (registration_id) REFERENCES registration(registration_id) ON DELETE CASCADE, PRIMARY KEY (registration_id, reachability_type, reachability_id));");
        sQLiteDatabase.execSQL("CREATE INDEX registration_tachyon_app_name on registration(tachyon_app_name)");
    }

    private static final void b(SQLiteDatabase sQLiteDatabase) {
        ctiw.d(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 < 7) {
            b(sQLiteDatabase);
            return;
        }
        ctiw.h(sQLiteDatabase, "registration", "CREATE TABLE registration ( registration_id INTEGER PRIMARY KEY AUTOINCREMENT, tachyon_app_name TEXT, tachyon_auth_token BLOB, auth_token_expire_at_timestamp_ms INT, identity_key_type INT NOT NULL DEFAULT 1, identity_key_private BLOB, identity_key_public BLOB, server_registration_id BLOB, server_registration_status INTEGER, auth_token_refreshed_at_timestamp_ms INTEGER, registration_properties BLOB);", ctmg.a);
        ctiw.h(sQLiteDatabase, "reachability", "CREATE TABLE reachability(reachability_id TEXT, reachability_type INT,  registration_id INT,  reachability_normalized_id TEXT, FOREIGN KEY (registration_id) REFERENCES registration(registration_id) ON DELETE CASCADE, PRIMARY KEY (registration_id, reachability_type, reachability_id));", ctme.a);
        sQLiteDatabase.execSQL("CREATE INDEX registration_tachyon_app_name on registration(tachyon_app_name)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 5) {
            b(sQLiteDatabase);
            return;
        }
        for (int i3 = i + 1; i3 <= i2; i3++) {
            if (i3 == 6) {
                sQLiteDatabase.execSQL("ALTER TABLE reachability ADD COLUMN reachability_normalized_id TEXT;");
                int i4 = ContactId.ContactType.EMAIL.f;
                Cursor query = sQLiteDatabase.query("reachability", null, null, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            do {
                                String string = query.getString(ctmd.a(1));
                                int i5 = query.getInt(ctmd.a(2));
                                int i6 = query.getInt(ctmd.a(3));
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("reachability_normalized_id", i5 == i4 ? cstg.a(string) : string);
                                sQLiteDatabase.update("reachability", contentValues, "reachability_id = ? AND reachability_type = ? AND registration_id = ?", new String[]{string, Integer.toString(i5), Integer.toString(i6)});
                            } while (query.moveToNext());
                        }
                    } catch (Throwable th) {
                        try {
                            query.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                }
            } else if (i3 == 7) {
                sQLiteDatabase.execSQL("ALTER TABLE registration ADD COLUMN identity_key_type INT NOT NULL DEFAULT 1;");
            } else if (i3 == 8) {
                sQLiteDatabase.execSQL("ALTER TABLE registration ADD COLUMN registration_properties BLOB;");
            }
        }
    }
}

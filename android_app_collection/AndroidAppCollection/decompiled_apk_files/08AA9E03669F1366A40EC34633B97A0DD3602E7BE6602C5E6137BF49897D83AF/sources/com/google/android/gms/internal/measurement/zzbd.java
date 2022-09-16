package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzbd extends SQLiteOpenHelper {
    private final /* synthetic */ zzbc zzwz;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbd(zzbc zzbcVar, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.zzwz = zzbcVar;
    }

    private final boolean zza(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query;
        Cursor cursor = null;
        try {
            try {
                query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e) {
            e = e;
        }
        try {
            boolean moveToFirst = query.moveToFirst();
            if (query != null) {
                query.close();
            }
            return moveToFirst;
        } catch (SQLiteException e2) {
            cursor = query;
            e = e2;
            this.zzwz.zzc("Error querying for table", str, e);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            cursor = query;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static Set<String> zzb(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            for (String str2 : rawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        zzcz zzczVar;
        zzcz zzczVar2;
        String zzcz;
        zzcz zzczVar3;
        zzczVar = this.zzwz.zzwy;
        if (!zzczVar.zzj(3600000L)) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzczVar2 = this.zzwz.zzwy;
            zzczVar2.start();
            this.zzwz.zzt("Opening the database failed, dropping the table and recreating it");
            zzbc zzbcVar = this.zzwz;
            zzcz = zzbc.zzcz();
            this.zzwz.getContext().getDatabasePath(zzcz).delete();
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                zzczVar3 = this.zzwz.zzwy;
                zzczVar3.clear();
                return writableDatabase;
            } catch (SQLiteException e) {
                this.zzwz.zze("Failed to open freshly created database", e);
                throw e;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        if (zzcb.version() >= 9) {
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r9) {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            if (r0 >= r1) goto L19
            java.lang.String r0 = "PRAGMA journal_mode=memory"
            r1 = 0
            android.database.Cursor r0 = r9.rawQuery(r0, r1)
            r0.moveToFirst()     // Catch: java.lang.Throwable -> L14
            r0.close()
            goto L19
        L14:
            r9 = move-exception
            r0.close()
            throw r9
        L19:
            java.lang.String r0 = "hits2"
            boolean r0 = r8.zza(r9, r0)
            r1 = 0
            if (r0 != 0) goto L2a
            java.lang.String r0 = com.google.android.gms.internal.measurement.zzbc.zzda()
        L26:
            r9.execSQL(r0)
            goto L83
        L2a:
            java.lang.String r0 = "hits2"
            java.util.Set r0 = zzb(r9, r0)
            java.lang.String r2 = "hit_id"
            java.lang.String r3 = "hit_string"
            java.lang.String r4 = "hit_time"
            java.lang.String r5 = "hit_url"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5}
            r3 = 0
        L3d:
            r4 = 4
            if (r3 >= r4) goto L68
            r4 = r2[r3]
            boolean r5 = r0.remove(r4)
            if (r5 != 0) goto L65
            android.database.sqlite.SQLiteException r9 = new android.database.sqlite.SQLiteException
            java.lang.String r0 = "Database hits2 is missing required column: "
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r2 = r1.length()
            if (r2 == 0) goto L5b
            java.lang.String r0 = r0.concat(r1)
            goto L61
        L5b:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L61:
            r9.<init>(r0)
            throw r9
        L65:
            int r3 = r3 + 1
            goto L3d
        L68:
            java.lang.String r2 = "hit_app_id"
            boolean r2 = r0.remove(r2)
            r2 = r2 ^ 1
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7e
            android.database.sqlite.SQLiteException r9 = new android.database.sqlite.SQLiteException
            java.lang.String r0 = "Database hits2 has extra columns"
            r9.<init>(r0)
            throw r9
        L7e:
            if (r2 == 0) goto L83
            java.lang.String r0 = "ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER"
            goto L26
        L83:
            java.lang.String r0 = "properties"
            boolean r0 = r8.zza(r9, r0)
            if (r0 != 0) goto L91
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;"
            r9.execSQL(r0)
            return
        L91:
            java.lang.String r0 = "properties"
            java.util.Set r9 = zzb(r9, r0)
            java.lang.String r2 = "app_uid"
            java.lang.String r3 = "cid"
            java.lang.String r4 = "tid"
            java.lang.String r5 = "params"
            java.lang.String r6 = "adid"
            java.lang.String r7 = "hits_count"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
        La7:
            r2 = 6
            if (r1 >= r2) goto Ld2
            r2 = r0[r1]
            boolean r3 = r9.remove(r2)
            if (r3 != 0) goto Lcf
            android.database.sqlite.SQLiteException r9 = new android.database.sqlite.SQLiteException
            java.lang.String r0 = "Database properties is missing required column: "
            java.lang.String r1 = java.lang.String.valueOf(r2)
            int r2 = r1.length()
            if (r2 == 0) goto Lc5
            java.lang.String r0 = r0.concat(r1)
            goto Lcb
        Lc5:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        Lcb:
            r9.<init>(r0)
            throw r9
        Lcf:
            int r1 = r1 + 1
            goto La7
        Ld2:
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto Le0
            android.database.sqlite.SQLiteException r9 = new android.database.sqlite.SQLiteException
            java.lang.String r0 = "Database properties table has extra columns"
            r9.<init>(r0)
            throw r9
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbd.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

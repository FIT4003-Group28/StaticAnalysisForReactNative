package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: PG */
/* renamed from: awf  reason: default package */
/* loaded from: classes3.dex */
final class awf extends SQLiteOpenHelper {
    final awd[] a;
    final avv b;
    private boolean c;

    public awf(Context context, String str, awd[] awdVarArr, avv avvVar) {
        super(context, str, null, avvVar.e, new awe(awdVarArr));
        this.b = avvVar;
        this.a = awdVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static awd c(awd[] awdVarArr, SQLiteDatabase sQLiteDatabase) {
        awd awdVar = awdVarArr[0];
        if (awdVar == null || awdVar.b != sQLiteDatabase) {
            awd awdVar2 = new awd(sQLiteDatabase);
            awdVarArr[0] = awdVar2;
            return awdVar2;
        }
        return awdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized avu a() {
        this.c = false;
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (this.c) {
            close();
            return a();
        }
        return b(writableDatabase);
    }

    final awd b(SQLiteDatabase sQLiteDatabase) {
        return c(this.a, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.a[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        avv avvVar = this.b;
        awd b = b(sQLiteDatabase);
        Cursor f = b.f("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (f.moveToFirst()) {
                if (f.getInt(0) == 0) {
                    z = true;
                }
            }
            f.close();
            bq bqVar = (bq) avvVar;
            bqVar.b.b(b);
            if (!z) {
                bp d = bqVar.b.d(b);
                if (!d.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + d.b);
                }
            }
            bqVar.b(b);
            bqVar.b.f();
        } catch (Throwable th) {
            f.close();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        ((bq) this.b).a(b(sQLiteDatabase), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r6) {
        /*
            r5 = this;
            boolean r0 = r5.c
            if (r0 != 0) goto L99
            avv r0 = r5.b
            awd r6 = r5.b(r6)
            java.lang.String r1 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r1 = r6.f(r1)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L94
            r3 = 0
            if (r2 == 0) goto L1f
            int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            r1.close()
            r1 = 0
            if (r2 == 0) goto L61
            avt r2 = new avt
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r2.<init>(r4)
            android.database.Cursor r2 = r6.g(r2)
            boolean r4 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L3c
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L5c
            goto L3d
        L3c:
            r3 = r1
        L3d:
            r2.close()
            r2 = r0
            bq r2 = (defpackage.bq) r2
            java.lang.String r4 = r2.c
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L71
            java.lang.String r2 = r2.d
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L54
            goto L71
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number."
            r6.<init>(r0)
            throw r6
        L5c:
            r6 = move-exception
            r2.close()
            throw r6
        L61:
            r2 = r0
            bq r2 = (defpackage.bq) r2
            bo r3 = r2.b
            bp r3 = r3.d(r6)
            boolean r4 = r3.a
            if (r4 == 0) goto L7b
            r2.b(r6)
        L71:
            bq r0 = (defpackage.bq) r0
            bo r2 = r0.b
            r2.c(r6)
            r0.a = r1
            return
        L7b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L94:
            r6 = move-exception
            r1.close()
            throw r6
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awf.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.b.a(b(sQLiteDatabase), i, i2);
    }
}

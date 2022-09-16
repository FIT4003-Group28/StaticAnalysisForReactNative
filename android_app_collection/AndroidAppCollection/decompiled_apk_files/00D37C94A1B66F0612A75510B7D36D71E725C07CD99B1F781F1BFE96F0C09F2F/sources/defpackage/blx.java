package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blx  reason: default package */
/* loaded from: classes2.dex */
public final class blx extends SQLiteOpenHelper {
    final blv[] a;
    final bln b;
    private boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blx(Context context, String str, blv[] blvVarArr, bln blnVar) {
        super(context, str, null, 12, new blw(blvVarArr));
        int i = blnVar.a;
        this.b = blnVar;
        this.a = blvVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static blv b(blv[] blvVarArr, SQLiteDatabase sQLiteDatabase) {
        blv blvVar = blvVarArr[0];
        if (blvVar == null || blvVar.a != sQLiteDatabase) {
            blv blvVar2 = new blv(sQLiteDatabase);
            blvVarArr[0] = blvVar2;
            return blvVar2;
        }
        return blvVar;
    }

    final blv a(SQLiteDatabase sQLiteDatabase) {
        return b(this.a, sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized blv c() {
        this.c = false;
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (this.c) {
            close();
            return c();
        }
        return a(writableDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.a[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[ORIG_RETURN, RETURN] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r5) {
        /*
            r4 = this;
            bln r0 = r4.b
            blv r5 = r4.a(r5)
            java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r1 = r5.b(r1)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L6b
            r3 = 0
            if (r2 == 0) goto L1b
            int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L6b
            if (r2 != 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            r1.close()
            bkt r1 = r0.c
            r1.a(r5)
            if (r2 != 0) goto L4a
            bkt r1 = r0.c
            doq r1 = r1.b(r5)
            boolean r2 = r1.b
            if (r2 == 0) goto L31
            goto L4a
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.append(r2)
            java.lang.String r1 = r1.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L4a:
            defpackage.bln.c(r5)
            bkt r5 = r0.c
            brp r5 = (defpackage.brp) r5
            androidx.work.impl.WorkDatabase_Impl r0 = r5.a
            java.util.List r0 = r0.e
            if (r0 == 0) goto L6a
            int r0 = r0.size()
        L5b:
            if (r3 >= r0) goto L6a
            androidx.work.impl.WorkDatabase_Impl r1 = r5.a
            java.util.List r1 = r1.e
            java.lang.Object r1 = r1.get(r3)
            lc r1 = (defpackage.lc) r1
            int r3 = r3 + 1
            goto L5b
        L6a:
            return
        L6b:
            r5 = move-exception
            r1.close()
            goto L71
        L70:
            throw r5
        L71:
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blx.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.b.b(a(sQLiteDatabase), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r8) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blx.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.c = true;
        this.b.b(a(sQLiteDatabase), i, i2);
    }
}

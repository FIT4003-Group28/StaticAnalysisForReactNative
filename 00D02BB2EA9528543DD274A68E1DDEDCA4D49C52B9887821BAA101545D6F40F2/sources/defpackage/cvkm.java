package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: cvkm  reason: default package */
/* loaded from: classes5.dex */
public final class cvkm implements cvkf {
    private final cvkl a;

    public cvkm(Context context) {
        this.a = new cvkl(context);
    }

    private static final cvkc f(Cursor cursor) {
        cvju k = cvkc.k();
        k.a = Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
        k.b(cursor.getString(cursor.getColumnIndex("account_name")));
        k.b = cursor.getString(cursor.getColumnIndex("obfuscated_gaia_id"));
        k.c = Long.valueOf(cursor.getLong(cursor.getColumnIndex("sync_version")));
        k.d = Long.valueOf(cursor.getLong(cursor.getColumnIndex("page_version")));
        k.d(cviv.a(cursor.getInt(cursor.getColumnIndex("registration_status"))));
        k.e = Long.valueOf(cursor.getLong(cursor.getColumnIndex("last_registration_time_ms")));
        k.c(cursor.getInt(cursor.getColumnIndex("last_registration_request_hash")));
        k.f = Long.valueOf(cursor.getLong(cursor.getColumnIndex("first_registration_version")));
        return k.a();
    }

    private static final ContentValues g(cvkc cvkcVar) {
        ContentValues contentValues = new ContentValues(8);
        cvjv cvjvVar = (cvjv) cvkcVar;
        contentValues.put("account_name", cvjvVar.b);
        contentValues.put("obfuscated_gaia_id", cvjvVar.c);
        contentValues.put("sync_version", cvjvVar.d);
        contentValues.put("page_version", cvjvVar.e);
        contentValues.put("registration_status", Integer.valueOf(cvjvVar.f.h));
        contentValues.put("last_registration_time_ms", cvjvVar.g);
        contentValues.put("last_registration_request_hash", Integer.valueOf(cvjvVar.h));
        contentValues.put("first_registration_version", cvjvVar.i);
        return contentValues;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r2 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[Catch: all -> 0x0061, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x0033, B:13:0x0038, B:28:0x0058, B:30:0x005d, B:31:0x0060, B:22:0x004e), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058 A[Catch: all -> 0x0061, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x0033, B:13:0x0038, B:28:0x0058, B:30:0x005d, B:31:0x0060, B:22:0x004e), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[Catch: all -> 0x0061, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x0033, B:13:0x0038, B:28:0x0058, B:30:0x005d, B:31:0x0060, B:22:0x004e), top: B:38:0x0001 }] */
    @Override // defpackage.cvkf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<defpackage.cvkc> a() {
        /*
            r12 = this;
            monitor-enter(r12)
            defpackage.czhz.c()     // Catch: java.lang.Throwable -> L61
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L61
            r0.<init>()     // Catch: java.lang.Throwable -> L61
            r1 = 0
            cvkl r2 = r12.a     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L41
            android.database.sqlite.SQLiteDatabase r2 = r2.getReadableDatabase()     // Catch: java.lang.Throwable -> L3e java.lang.RuntimeException -> L41
            java.lang.String r4 = "accounts"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r3 = r2
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L42
            boolean r3 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L42
            if (r3 == 0) goto L31
        L24:
            cvkc r3 = f(r1)     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L42
            r0.add(r3)     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L42
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L3c java.lang.RuntimeException -> L42
            if (r3 != 0) goto L24
        L31:
            if (r1 == 0) goto L36
            r1.close()     // Catch: java.lang.Throwable -> L61
        L36:
            if (r2 == 0) goto L54
        L38:
            r2.close()     // Catch: java.lang.Throwable -> L61
            goto L54
        L3c:
            r0 = move-exception
            goto L56
        L3e:
            r0 = move-exception
            r2 = r1
            goto L56
        L41:
            r2 = r1
        L42:
            java.lang.String r3 = "ChimeAccountStorageImpl"
            java.lang.String r4 = "Error getting list of available ChimeAccounts."
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L3c
            defpackage.cvlw.e(r3, r4, r5)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L51
            r1.close()     // Catch: java.lang.Throwable -> L61
        L51:
            if (r2 == 0) goto L54
            goto L38
        L54:
            monitor-exit(r12)
            return r0
        L56:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.lang.Throwable -> L61
        L5b:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.lang.Throwable -> L61
        L60:
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            monitor-exit(r12)
            goto L65
        L64:
            throw r0
        L65:
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvkm.a():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #3 {, blocks: (B:3:0x0001, B:10:0x002e, B:12:0x0033, B:16:0x003a, B:18:0x003f, B:19:0x0042, B:20:0x0051, B:32:0x006e, B:34:0x0073, B:35:0x0076), top: B:42:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073 A[Catch: all -> 0x0077, TryCatch #3 {, blocks: (B:3:0x0001, B:10:0x002e, B:12:0x0033, B:16:0x003a, B:18:0x003f, B:19:0x0042, B:20:0x0051, B:32:0x006e, B:34:0x0073, B:35:0x0076), top: B:42:0x0001 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.database.sqlite.SQLiteDatabase, android.database.Cursor] */
    @Override // defpackage.cvkf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.cvkc b(java.lang.String r14) {
        /*
            r13 = this;
            monitor-enter(r13)
            defpackage.czhz.c()     // Catch: java.lang.Throwable -> L77
            r0 = 0
            r1 = 1
            r2 = 0
            cvkl r3 = r13.a     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L59
            android.database.sqlite.SQLiteDatabase r3 = r3.getReadableDatabase()     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L59
            java.lang.String[] r8 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            r8[r0] = r14     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            java.lang.String r5 = "accounts"
            r6 = 0
            java.lang.String r7 = "account_name=?"
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r4 = r3
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            int r4 = r2.getCount()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            if (r4 <= 0) goto L38
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            cvkc r14 = f(r2)     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            if (r2 == 0) goto L31
            r2.close()     // Catch: java.lang.Throwable -> L77
        L31:
            if (r3 == 0) goto L36
            r3.close()     // Catch: java.lang.Throwable -> L77
        L36:
            monitor-exit(r13)
            return r14
        L38:
            if (r2 == 0) goto L3d
            r2.close()     // Catch: java.lang.Throwable -> L77
        L3d:
            if (r3 == 0) goto L42
            r3.close()     // Catch: java.lang.Throwable -> L77
        L42:
            cvke r2 = new cvke     // Catch: java.lang.Throwable -> L77
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L77
            r1[r0] = r14     // Catch: java.lang.Throwable -> L77
            java.lang.String r14 = "ChimeAccount not found [%s]"
            java.lang.String r14 = java.lang.String.format(r14, r1)     // Catch: java.lang.Throwable -> L77
            r2.<init>(r14)     // Catch: java.lang.Throwable -> L77
            throw r2     // Catch: java.lang.Throwable -> L77
        L52:
            r14 = move-exception
            goto L6c
        L54:
            r4 = move-exception
            goto L5c
        L56:
            r14 = move-exception
            r3 = r2
            goto L6c
        L59:
            r3 = move-exception
            r4 = r3
            r3 = r2
        L5c:
            cvke r5 = new cvke     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L52
            r1[r0] = r14     // Catch: java.lang.Throwable -> L52
            java.lang.String r14 = "Error getting ChimeAccount [%s]"
            java.lang.String r14 = java.lang.String.format(r14, r1)     // Catch: java.lang.Throwable -> L52
            r5.<init>(r14, r4)     // Catch: java.lang.Throwable -> L52
            throw r5     // Catch: java.lang.Throwable -> L52
        L6c:
            if (r2 == 0) goto L71
            r2.close()     // Catch: java.lang.Throwable -> L77
        L71:
            if (r3 == 0) goto L76
            r3.close()     // Catch: java.lang.Throwable -> L77
        L76:
            throw r14     // Catch: java.lang.Throwable -> L77
        L77:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvkm.b(java.lang.String):cvkc");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070 A[Catch: all -> 0x0074, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:10:0x001e, B:34:0x0070, B:35:0x0073), top: B:41:0x0001 }] */
    @Override // defpackage.cvkf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized long c(defpackage.cvkc r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            defpackage.czhz.c()     // Catch: java.lang.Throwable -> L74
            r0 = 0
            android.content.ContentValues r1 = g(r7)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L49
            cvkl r2 = r6.a     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L49
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L49
            java.lang.String r3 = "accounts"
            r4 = 2
            long r0 = r2.insertWithOnConflict(r3, r0, r1, r4)     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L6c
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L23
            if (r2 == 0) goto L21
            r2.close()     // Catch: java.lang.Throwable -> L74
        L21:
            monitor-exit(r6)
            return r0
        L23:
            cvkd r0 = new cvkd     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L6c
            java.lang.String r1 = "Conflict inserting ChimeAccount: "
            r3 = r7
            cvjv r3 = (defpackage.cvjv) r3     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L6c
            java.lang.String r3 = r3.b     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L6c
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L6c
            int r4 = r3.length()     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L6c
            if (r4 == 0) goto L3b
            java.lang.String r1 = r1.concat(r3)     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L6c
            goto L41
        L3b:
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L6c
            r3.<init>(r1)     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L6c
            r1 = r3
        L41:
            r0.<init>(r1)     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L6c
            throw r0     // Catch: java.lang.RuntimeException -> L45 java.lang.Throwable -> L6c
        L45:
            r0 = move-exception
            goto L4c
        L47:
            r7 = move-exception
            goto L6e
        L49:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L4c:
            cvkd r1 = new cvkd     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = "Error inserting ChimeAccount: "
            cvjv r7 = (defpackage.cvjv) r7     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = r7.b     // Catch: java.lang.Throwable -> L6c
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L6c
            int r4 = r7.length()     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L63
            java.lang.String r7 = r3.concat(r7)     // Catch: java.lang.Throwable -> L6c
            goto L68
        L63:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L6c
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L6c
        L68:
            r1.<init>(r7, r0)     // Catch: java.lang.Throwable -> L6c
            throw r1     // Catch: java.lang.Throwable -> L6c
        L6c:
            r7 = move-exception
            r0 = r2
        L6e:
            if (r0 == 0) goto L73
            r0.close()     // Catch: java.lang.Throwable -> L74
        L73:
            throw r7     // Catch: java.lang.Throwable -> L74
        L74:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvkm.c(cvkc):long");
    }

    @Override // defpackage.cvkf
    public final synchronized void d(String str) {
        czhz.c();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = this.a.getWritableDatabase();
            sQLiteDatabase.delete("accounts", "account_name=?", new String[]{str});
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.close();
        } catch (RuntimeException unused) {
            cvlw.e("ChimeAccountStorageImpl", "Error deleting ChimeAccount [%s]", str);
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.close();
        }
    }

    @Override // defpackage.cvkf
    public final synchronized void e(cvkc cvkcVar) {
        czhz.c();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            ContentValues g = g(cvkcVar);
            sQLiteDatabase = this.a.getWritableDatabase();
            sQLiteDatabase.update("accounts", g, "account_name=?", new String[]{((cvjv) cvkcVar).b});
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.close();
        } catch (RuntimeException unused) {
            cvlw.e("ChimeAccountStorageImpl", "Error updating ChimeAccount [%s]", ((cvjv) cvkcVar).b);
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.close();
        }
    }
}

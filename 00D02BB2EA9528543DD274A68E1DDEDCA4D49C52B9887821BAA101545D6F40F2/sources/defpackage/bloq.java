package defpackage;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: bloq  reason: default package */
/* loaded from: classes3.dex */
public final class bloq implements blpg {
    private static final String a = "bloq";
    private final btvo b;
    private final cqat c;
    private final blop d;
    private final Context e;

    public bloq(btvo btvoVar, cqat cqatVar, Application application, afec afecVar) {
        this.b = btvoVar;
        this.c = cqatVar;
        this.e = application;
        this.d = new blop(application, afecVar);
    }

    @Override // defpackage.blpg
    public final synchronized void a() {
        this.d.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[Catch: all -> 0x00cb, TRY_LEAVE, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x000d, B:18:0x004a, B:20:0x0058, B:23:0x0068, B:25:0x0086, B:27:0x00a2, B:16:0x003d, B:19:0x0050, B:26:0x009b), top: B:45:0x0001 }] */
    @Override // defpackage.blpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(java.lang.String r12, defpackage.dspd r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            bvrj r0 = defpackage.bvrj.UI_THREAD     // Catch: java.lang.Throwable -> Lcb
            r0.d()     // Catch: java.lang.Throwable -> Lcb
            r0 = 0
            blop r1 = r11.d     // Catch: android.database.SQLException -> L39 defpackage.bvjv -> L3b java.lang.Throwable -> Lcb
            android.database.sqlite.SQLiteDatabase r1 = r1.b()     // Catch: android.database.SQLException -> L39 defpackage.bvjv -> L3b java.lang.Throwable -> Lcb
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: android.database.SQLException -> L35 defpackage.bvjv -> L37 java.lang.Throwable -> Lcb
            r2.<init>()     // Catch: android.database.SQLException -> L35 defpackage.bvjv -> L37 java.lang.Throwable -> Lcb
            java.lang.String r3 = "user_account_id"
            r2.put(r3, r12)     // Catch: android.database.SQLException -> L35 defpackage.bvjv -> L37 java.lang.Throwable -> Lcb
            java.lang.String r12 = "similarity_token"
            java.lang.String r13 = r13.J()     // Catch: android.database.SQLException -> L35 defpackage.bvjv -> L37 java.lang.Throwable -> Lcb
            r2.put(r12, r13)     // Catch: android.database.SQLException -> L35 defpackage.bvjv -> L37 java.lang.Throwable -> Lcb
            java.lang.String r12 = "last_accessed_millis"
            cqat r13 = r11.c     // Catch: android.database.SQLException -> L35 defpackage.bvjv -> L37 java.lang.Throwable -> Lcb
            long r3 = r13.b()     // Catch: android.database.SQLException -> L35 defpackage.bvjv -> L37 java.lang.Throwable -> Lcb
            java.lang.Long r13 = java.lang.Long.valueOf(r3)     // Catch: android.database.SQLException -> L35 defpackage.bvjv -> L37 java.lang.Throwable -> Lcb
            r2.put(r12, r13)     // Catch: android.database.SQLException -> L35 defpackage.bvjv -> L37 java.lang.Throwable -> Lcb
            java.lang.String r12 = "interacted_questions"
            r1.replaceOrThrow(r12, r0, r2)     // Catch: android.database.SQLException -> L35 defpackage.bvjv -> L37 java.lang.Throwable -> Lcb
            goto L48
        L35:
            r12 = move-exception
            goto L3d
        L37:
            r12 = move-exception
            goto L3d
        L39:
            r12 = move-exception
            goto L3c
        L3b:
            r12 = move-exception
        L3c:
            r1 = r0
        L3d:
            defpackage.bvoq.a()     // Catch: java.lang.Throwable -> Lcb
            java.lang.RuntimeException r13 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lcb
            r13.<init>(r12)     // Catch: java.lang.Throwable -> Lcb
            defpackage.bvoo.i(r13)     // Catch: java.lang.Throwable -> Lcb
        L48:
            if (r1 == 0) goto Lc9
            java.lang.String r12 = "SELECT COUNT(*) FROM interacted_questions"
            android.database.Cursor r12 = r1.rawQuery(r12, r0)     // Catch: java.lang.Throwable -> Lcb
            r12.moveToFirst()     // Catch: java.lang.Throwable -> Lc4
            r13 = 0
            int r2 = r12.getInt(r13)     // Catch: java.lang.Throwable -> Lc4
            r12.close()     // Catch: java.lang.Throwable -> Lcb
            btvo r12 = r11.b     // Catch: java.lang.Throwable -> Lcb
            dkyr r12 = r12.getUgcParameters()     // Catch: java.lang.Throwable -> Lcb
            int r12 = r12.d()     // Catch: java.lang.Throwable -> Lcb
            if (r2 > r12) goto L68
            goto Lc9
        L68:
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = "last_accessed_millis"
            r4[r13] = r3     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r5 = 11
            r3.<init>(r5)     // Catch: java.lang.Throwable -> Lcb
            int r2 = r2 - r12
            float r12 = (float) r12
            r5 = 1036831949(0x3dcccccd, float:0.1)
            float r12 = r12 * r5
            double r5 = (double) r12
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.Double.isNaN(r5)
            double r5 = r5 + r7
            int r12 = (int) r5
            int r2 = r2 + r12
            r3.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r12 = "interacted_questions"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "last_accessed_millis"
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> Lcb
            r2 = r1
            r3 = r12
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lcb
            r12.moveToLast()     // Catch: java.lang.Throwable -> Lbf
            long r2 = r12.getLong(r13)     // Catch: java.lang.Throwable -> Lbf
            r12.close()     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r13 = 44
            r12.<init>(r13)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r13 = "last_accessed_millis <= "
            r12.append(r13)     // Catch: java.lang.Throwable -> Lcb
            r12.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r13 = "interacted_questions"
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Lcb
            r1.delete(r13, r12, r0)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r11)
            return
        Lbf:
            r13 = move-exception
            r12.close()     // Catch: java.lang.Throwable -> Lcb
            throw r13     // Catch: java.lang.Throwable -> Lcb
        Lc4:
            r13 = move-exception
            r12.close()     // Catch: java.lang.Throwable -> Lcb
            throw r13     // Catch: java.lang.Throwable -> Lcb
        Lc9:
            monitor-exit(r11)
            return
        Lcb:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bloq.b(java.lang.String, dspd):void");
    }

    @Override // defpackage.blpg
    public final synchronized boolean c(String str, dspd dspdVar) {
        bvrj.UI_THREAD.d();
        try {
            SQLiteDatabase b = this.d.b();
            String[] strArr = {str, dspdVar.J()};
            Cursor query = b.query("interacted_questions", new String[]{"similarity_token"}, "user_account_id = ? and similarity_token = ?", strArr, null, null, null);
            try {
                int count = query.getCount();
                query.close();
                if (count != 1) {
                    return false;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_accessed_millis", Long.valueOf(this.c.b()));
                b.update("interacted_questions", contentValues, "user_account_id = ? and similarity_token = ?", strArr);
                return true;
            } catch (RuntimeException e) {
                bvoo.i(e);
                query.close();
                return true;
            }
        } catch (bvjv e2) {
            bvoo.i(new RuntimeException(e2));
            return true;
        }
    }

    @Override // defpackage.blpg
    public final synchronized void d() {
        this.d.close();
        this.e.deleteDatabase("riddler.db");
    }
}

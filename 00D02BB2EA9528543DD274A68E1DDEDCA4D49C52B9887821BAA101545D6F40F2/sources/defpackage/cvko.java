package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvko  reason: default package */
/* loaded from: classes5.dex */
public final class cvko implements cvki {
    public final Context a;
    private final cvkf b;
    private final HashMap<Long, cvkn> c = new HashMap<>();

    public cvko(Context context, cvkf cvkfVar) {
        this.a = context;
        this.b = cvkfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
        return null;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0066: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:24:0x0066 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #4 {, blocks: (B:9:0x003f, B:13:0x0046, B:26:0x0069, B:27:0x006c), top: B:37:0x0003 }] */
    @Override // defpackage.cvki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.cvkh a(@defpackage.dzsi java.lang.String r10, int r11, byte[] r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 2
            r1 = 0
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4c
            java.lang.String r4 = "job_type"
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4c
            java.lang.String r4 = "payload"
            r2.put(r4, r12)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4c
            cvkn r4 = r9.d(r10)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4c
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4c
            java.lang.String r5 = "tasks"
            long r5 = r4.insert(r5, r1, r2)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L65
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L44
            cvjy r2 = defpackage.cvkh.d()     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L65
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L65
            r2.a = r5     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L65
            r2.b = r3     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L65
            r2.b(r12)     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L65
            cvkh r10 = r2.a()     // Catch: java.lang.Throwable -> L4d java.lang.Throwable -> L65
            if (r4 == 0) goto L42
            r4.close()     // Catch: java.lang.Throwable -> L6d
        L42:
            monitor-exit(r9)
            return r10
        L44:
            if (r4 == 0) goto L63
        L46:
            r4.close()     // Catch: java.lang.Throwable -> L6d
            goto L63
        L4a:
            r10 = move-exception
            goto L67
        L4c:
            r4 = r1
        L4d:
            java.lang.String r12 = "ChimeTaskDataStorageImpl"
            java.lang.String r2 = "Error inserting ChimeTaskData %d for account: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L65
            r3 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L65
            r0[r3] = r11     // Catch: java.lang.Throwable -> L65
            r11 = 1
            r0[r11] = r10     // Catch: java.lang.Throwable -> L65
            defpackage.cvlw.e(r12, r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L63
            goto L46
        L63:
            monitor-exit(r9)
            return r1
        L65:
            r10 = move-exception
            r1 = r4
        L67:
            if (r1 == 0) goto L6c
            r1.close()     // Catch: java.lang.Throwable -> L6d
        L6c:
            throw r10     // Catch: java.lang.Throwable -> L6d
        L6d:
            r10 = move-exception
            monitor-exit(r9)
            goto L71
        L70:
            throw r10
        L71:
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvko.a(java.lang.String, int, byte[]):cvkh");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
        if (r5 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
        if (r5 != null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #4 {, blocks: (B:3:0x0001, B:12:0x007d, B:14:0x0082, B:29:0x00b6, B:31:0x00bb, B:32:0x00be, B:23:0x00ac), top: B:42:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[Catch: all -> 0x00bf, TryCatch #4 {, blocks: (B:3:0x0001, B:12:0x007d, B:14:0x0082, B:29:0x00b6, B:31:0x00bb, B:32:0x00be, B:23:0x00ac), top: B:42:0x0001 }] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.sqlite.SQLiteDatabase, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // defpackage.cvki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<defpackage.cvkh> b(java.lang.String r16, int r17) {
        /*
            r15 = this;
            monitor-enter(r15)
            cxnk r0 = defpackage.cxnk.a()     // Catch: java.lang.Throwable -> Lbf
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = java.lang.Integer.toString(r17)     // Catch: java.lang.Throwable -> Lbf
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = "job_type=?"
            r0.d(r3, r2)     // Catch: java.lang.Throwable -> Lbf
            cxnj r0 = r0.b()     // Catch: java.lang.Throwable -> Lbf
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbf
            r2.<init>()     // Catch: java.lang.Throwable -> Lbf
            r3 = 0
            cvkn r5 = r15.d(r16)     // Catch: java.lang.Throwable -> L88 java.lang.Throwable -> L8b
            android.database.sqlite.SQLiteDatabase r5 = r5.getReadableDatabase()     // Catch: java.lang.Throwable -> L88 java.lang.Throwable -> L8b
            java.lang.String r7 = "tasks"
            r6 = r0
            cxni r6 = (defpackage.cxni) r6     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            java.lang.String r9 = r6.a     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            r8 = 0
            java.lang.String[] r10 = r0.c()     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            r11 = 0
            r12 = 0
            java.lang.String r13 = "_id ASC"
            r14 = 0
            r6 = r5
            android.database.Cursor r3 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
        L3c:
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            if (r6 == 0) goto L7b
            cvjy r6 = defpackage.cvkh.d()     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            java.lang.String r7 = "_id"
            int r7 = r3.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            long r7 = r3.getLong(r7)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            r6.a = r7     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            java.lang.String r7 = "job_type"
            int r7 = r3.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            int r7 = r3.getInt(r7)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            r6.b = r7     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            java.lang.String r7 = "payload"
            int r7 = r3.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            byte[] r7 = r3.getBlob(r7)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            r6.b(r7)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            cvkh r6 = r6.a()     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            r2.add(r6)     // Catch: java.lang.Throwable -> L86 java.lang.Throwable -> L8c
            goto L3c
        L7b:
            if (r3 == 0) goto L80
            r3.close()     // Catch: java.lang.Throwable -> Lbf
        L80:
            if (r5 == 0) goto Lb2
        L82:
            r5.close()     // Catch: java.lang.Throwable -> Lbf
            goto Lb2
        L86:
            r0 = move-exception
            goto Lb4
        L88:
            r0 = move-exception
            r5 = r3
            goto Lb4
        L8b:
            r5 = r3
        L8c:
            java.lang.String r6 = "ChimeTaskDataStorageImpl"
            java.lang.String r7 = "Error getting ChimeTaskData for account: %s. Query: %s %s"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L86
            r8[r4] = r16     // Catch: java.lang.Throwable -> L86
            r4 = r0
            cxni r4 = (defpackage.cxni) r4     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = r4.a     // Catch: java.lang.Throwable -> L86
            r8[r1] = r4     // Catch: java.lang.Throwable -> L86
            r1 = 2
            java.lang.String[] r0 = r0.c()     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch: java.lang.Throwable -> L86
            r8[r1] = r0     // Catch: java.lang.Throwable -> L86
            defpackage.cvlw.e(r6, r7, r8)     // Catch: java.lang.Throwable -> L86
            if (r3 == 0) goto Laf
            r3.close()     // Catch: java.lang.Throwable -> Lbf
        Laf:
            if (r5 == 0) goto Lb2
            goto L82
        Lb2:
            monitor-exit(r15)
            return r2
        Lb4:
            if (r3 == 0) goto Lb9
            r3.close()     // Catch: java.lang.Throwable -> Lbf
        Lb9:
            if (r5 == 0) goto Lbe
            r5.close()     // Catch: java.lang.Throwable -> Lbf
        Lbe:
            throw r0     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r0 = move-exception
            monitor-exit(r15)
            goto Lc3
        Lc2:
            throw r0
        Lc3:
            goto Lc2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvko.b(java.lang.String, int):java.util.List");
    }

    @Override // defpackage.cvki
    public final synchronized void c(@dzsi String str, List<cvkh> list) {
        SQLiteDatabase writableDatabase;
        if (list.isEmpty()) {
            return;
        }
        String[] strArr = new String[list.size()];
        int i = 0;
        for (cvkh cvkhVar : list) {
            strArr[i] = Long.toString(cvkhVar.a().longValue());
            i++;
        }
        dcdc<cxnj> a = cvks.a("", "_id", strArr);
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = d(str).getWritableDatabase();
            writableDatabase.beginTransaction();
        } catch (cvke | RuntimeException unused) {
            cvlw.e("ChimeTaskDataStorageImpl", "Error deleting ChimeTaskData for account: %s", str);
            if (0 != 0) {
                sQLiteDatabase.close();
                return;
            }
        }
        try {
            for (cxnj cxnjVar : a) {
                writableDatabase.delete("tasks", cxnjVar.a(), cxnjVar.c());
            }
            writableDatabase.setTransactionSuccessful();
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final synchronized cvkn d(@dzsi String str) {
        Long l;
        l = -1L;
        if (!TextUtils.isEmpty(str)) {
            l = this.b.b(str).a();
        }
        if (!this.c.containsKey(l)) {
            this.c.put(l, new cvkn(this.a, l.longValue()));
        }
        return this.c.get(l);
    }
}

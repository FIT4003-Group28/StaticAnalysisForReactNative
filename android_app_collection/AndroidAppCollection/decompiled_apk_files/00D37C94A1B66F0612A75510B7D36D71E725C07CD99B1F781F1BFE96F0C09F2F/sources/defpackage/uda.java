package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: uda  reason: default package */
/* loaded from: classes4.dex */
public final class uda implements ucv {
    private final Context a;
    private final ucs b;
    private final HashMap c = new HashMap();

    public uda(Context context, ucs ucsVar) {
        this.a = context;
        this.b = ucsVar;
    }

    private final synchronized ucz e(String str) {
        Long l;
        l = -1L;
        if (!TextUtils.isEmpty(str)) {
            l = this.b.b(str).a;
        }
        if (!this.c.containsKey(l)) {
            this.c.put(l, new ucz(this.a, l.longValue()));
        }
        return (ucz) this.c.get(l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r4 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        return null;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x006d: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:31:0x006d */
    @Override // defpackage.ucv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.ucu a(java.lang.String r10, int r11, byte[] r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 2
            r1 = 0
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L4e defpackage.ucr -> L50 java.lang.RuntimeException -> L52
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4e defpackage.ucr -> L50 java.lang.RuntimeException -> L52
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L4e defpackage.ucr -> L50 java.lang.RuntimeException -> L52
            java.lang.String r4 = "job_type"
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L4e defpackage.ucr -> L50 java.lang.RuntimeException -> L52
            java.lang.String r4 = "payload"
            r2.put(r4, r12)     // Catch: java.lang.Throwable -> L4e defpackage.ucr -> L50 java.lang.RuntimeException -> L52
            ucz r4 = r9.e(r10)     // Catch: java.lang.Throwable -> L4e defpackage.ucr -> L50 java.lang.RuntimeException -> L52
            android.database.sqlite.SQLiteDatabase r4 = r4.getWritableDatabase()     // Catch: java.lang.Throwable -> L4e defpackage.ucr -> L50 java.lang.RuntimeException -> L52
            java.lang.String r5 = "tasks"
            long r5 = r4.insert(r5, r1, r2)     // Catch: defpackage.ucr -> L4a java.lang.RuntimeException -> L4c java.lang.Throwable -> L6c
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L44
            ucn r2 = defpackage.ucu.a()     // Catch: defpackage.ucr -> L4a java.lang.RuntimeException -> L4c java.lang.Throwable -> L6c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: defpackage.ucr -> L4a java.lang.RuntimeException -> L4c java.lang.Throwable -> L6c
            r2.a = r5     // Catch: defpackage.ucr -> L4a java.lang.RuntimeException -> L4c java.lang.Throwable -> L6c
            r2.b = r3     // Catch: defpackage.ucr -> L4a java.lang.RuntimeException -> L4c java.lang.Throwable -> L6c
            r2.b(r12)     // Catch: defpackage.ucr -> L4a java.lang.RuntimeException -> L4c java.lang.Throwable -> L6c
            ucu r10 = r2.a()     // Catch: defpackage.ucr -> L4a java.lang.RuntimeException -> L4c java.lang.Throwable -> L6c
            if (r4 == 0) goto L42
            r4.close()     // Catch: java.lang.Throwable -> L74
        L42:
            monitor-exit(r9)
            return r10
        L44:
            if (r4 == 0) goto L6a
        L46:
            r4.close()     // Catch: java.lang.Throwable -> L74
            goto L6a
        L4a:
            r12 = move-exception
            goto L54
        L4c:
            r12 = move-exception
            goto L54
        L4e:
            r10 = move-exception
            goto L6e
        L50:
            r12 = move-exception
            goto L53
        L52:
            r12 = move-exception
        L53:
            r4 = r1
        L54:
            java.lang.String r2 = "ChimeTaskDataStorageImpl"
            java.lang.String r3 = "Error inserting ChimeTaskData %d for account: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6c
            r5 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L6c
            r0[r5] = r11     // Catch: java.lang.Throwable -> L6c
            r11 = 1
            r0[r11] = r10     // Catch: java.lang.Throwable -> L6c
            defpackage.uev.c(r2, r12, r3, r0)     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L6a
            goto L46
        L6a:
            monitor-exit(r9)
            return r1
        L6c:
            r10 = move-exception
            r1 = r4
        L6e:
            if (r1 == 0) goto L73
            r1.close()     // Catch: java.lang.Throwable -> L74
        L73:
            throw r10     // Catch: java.lang.Throwable -> L74
        L74:
            r10 = move-exception
            monitor-exit(r9)
            goto L78
        L77:
            throw r10
        L78:
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uda.a(java.lang.String, int, byte[]):ucu");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
        if (r15 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
        if (r15 == null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad A[Catch: all -> 0x00c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x007a, B:14:0x007f, B:36:0x00b7, B:38:0x00bc, B:39:0x00bf, B:30:0x00ad), top: B:45:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7 A[Catch: all -> 0x00c0, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x007a, B:14:0x007f, B:36:0x00b7, B:38:0x00bc, B:39:0x00bf, B:30:0x00ad), top: B:45:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[Catch: all -> 0x00c0, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x007a, B:14:0x007f, B:36:0x00b7, B:38:0x00bc, B:39:0x00bf, B:30:0x00ad), top: B:45:0x0001 }] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.database.sqlite.SQLiteDatabase, android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // defpackage.ucv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List b(java.lang.String r17, int r18) {
        /*
            r16 = this;
            monitor-enter(r16)
            vfm r0 = defpackage.vfm.b()     // Catch: java.lang.Throwable -> Lc0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = java.lang.Integer.toString(r18)     // Catch: java.lang.Throwable -> Lc0
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = "job_type=?"
            r0.d(r3, r2)     // Catch: java.lang.Throwable -> Lc0
            vfl r2 = r0.a()     // Catch: java.lang.Throwable -> Lc0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc0
            r3.<init>()     // Catch: java.lang.Throwable -> Lc0
            r5 = 0
            ucz r0 = r16.e(r17)     // Catch: java.lang.Throwable -> L89 defpackage.ucr -> L8c java.lang.RuntimeException -> L8e
            android.database.sqlite.SQLiteDatabase r15 = r0.getReadableDatabase()     // Catch: java.lang.Throwable -> L89 defpackage.ucr -> L8c java.lang.RuntimeException -> L8e
            java.lang.String r7 = "tasks"
            java.lang.String r9 = r2.a     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            r8 = 0
            java.lang.String[] r10 = r2.a()     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            r11 = 0
            r12 = 0
            java.lang.String r13 = "_id ASC"
            r14 = 0
            r6 = r15
            android.database.Cursor r5 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
        L39:
            boolean r0 = r5.moveToNext()     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            if (r0 == 0) goto L78
            ucn r0 = defpackage.ucu.a()     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            java.lang.String r6 = "_id"
            int r6 = r5.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            long r6 = r5.getLong(r6)     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            r0.a = r6     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            java.lang.String r6 = "job_type"
            int r6 = r5.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            int r6 = r5.getInt(r6)     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            r0.b = r6     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            java.lang.String r6 = "payload"
            int r6 = r5.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            byte[] r6 = r5.getBlob(r6)     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            r0.b(r6)     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            ucu r0 = r0.a()     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            r3.add(r0)     // Catch: java.lang.Throwable -> L83 defpackage.ucr -> L85 java.lang.RuntimeException -> L87
            goto L39
        L78:
            if (r5 == 0) goto L7d
            r5.close()     // Catch: java.lang.Throwable -> Lc0
        L7d:
            if (r15 == 0) goto Lb3
        L7f:
            r15.close()     // Catch: java.lang.Throwable -> Lc0
            goto Lb3
        L83:
            r0 = move-exception
            goto Lb5
        L85:
            r0 = move-exception
            goto L90
        L87:
            r0 = move-exception
            goto L90
        L89:
            r0 = move-exception
            r15 = r5
            goto Lb5
        L8c:
            r0 = move-exception
            goto L8f
        L8e:
            r0 = move-exception
        L8f:
            r15 = r5
        L90:
            java.lang.String r6 = "ChimeTaskDataStorageImpl"
            java.lang.String r7 = "Error getting ChimeTaskData for account: %s. Query: %s %s"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L83
            r8[r4] = r17     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = r2.a     // Catch: java.lang.Throwable -> L83
            r8[r1] = r4     // Catch: java.lang.Throwable -> L83
            r1 = 2
            java.lang.String[] r2 = r2.a()     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = java.util.Arrays.toString(r2)     // Catch: java.lang.Throwable -> L83
            r8[r1] = r2     // Catch: java.lang.Throwable -> L83
            defpackage.uev.c(r6, r0, r7, r8)     // Catch: java.lang.Throwable -> L83
            if (r5 == 0) goto Lb0
            r5.close()     // Catch: java.lang.Throwable -> Lc0
        Lb0:
            if (r15 == 0) goto Lb3
            goto L7f
        Lb3:
            monitor-exit(r16)
            return r3
        Lb5:
            if (r5 == 0) goto Lba
            r5.close()     // Catch: java.lang.Throwable -> Lc0
        Lba:
            if (r15 == 0) goto Lbf
            r15.close()     // Catch: java.lang.Throwable -> Lc0
        Lbf:
            throw r0     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r0 = move-exception
            monitor-exit(r16)
            goto Lc4
        Lc3:
            throw r0
        Lc4:
            goto Lc3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uda.b(java.lang.String, int):java.util.List");
    }

    @Override // defpackage.ucv
    public final void c(String str) {
        try {
            this.a.deleteDatabase(e(str).getDatabaseName());
        } catch (RuntimeException | ucr e) {
            uev.c("ChimeTaskDataStorageImpl", e, "Error deleting database for %s", str);
        }
    }

    @Override // defpackage.ucv
    public final synchronized void d(String str, List list) {
        if (list.isEmpty()) {
            return;
        }
        String[] strArr = new String[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr[i] = Long.toString(((ucu) it.next()).a.longValue());
            i++;
        }
        SQLiteDatabase sQLiteDatabase = null;
        amuk g = uid.g(null, "_id", strArr);
        try {
            SQLiteDatabase writableDatabase = e(str).getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                amzt listIterator = g.listIterator();
                while (listIterator.hasNext()) {
                    vfl vflVar = (vfl) listIterator.next();
                    writableDatabase.delete("tasks", vflVar.a, vflVar.a());
                }
                writableDatabase.setTransactionSuccessful();
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (RuntimeException | ucr e) {
            uev.c("ChimeTaskDataStorageImpl", e, "Error deleting ChimeTaskData for account: %s", str);
            if (0 != 0) {
                sQLiteDatabase.close();
            }
        }
    }
}

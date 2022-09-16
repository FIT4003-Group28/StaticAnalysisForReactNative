package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvqk  reason: default package */
/* loaded from: classes5.dex */
public final class cvqk implements cvqi {
    private final Context a;
    private final cqat b;
    private final HashMap<Long, cvqj> c = new HashMap<>();

    public cvqk(Context context, cqat cqatVar) {
        this.a = context;
        this.b = cqatVar;
    }

    private final boolean h(dbsg<cvkc> dbsgVar, List<cxnj> list) {
        boolean z = true;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = j(dbsgVar).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    int i = 0;
                    for (cxnj cxnjVar : list) {
                        i += writableDatabase.delete("optimized_threads", cxnjVar.a(), cxnjVar.c());
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (i <= 0) {
                        z = false;
                    }
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                    return z;
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (RuntimeException unused) {
                cvlw.e("OptimizedThreadStorageImpl", "Error deleting OptimizedThreads for %s. Queries: %s", dbsgVar, list);
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    private static List<cvqh> i(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            cvqf d = cvqh.d();
            d.b(cursor.getString(cursor.getColumnIndex("thread_id")));
            d.c(Long.valueOf(cursor.getLong(cursor.getColumnIndex("last_updated__version"))));
            dsfr dsfrVar = dsfr.d;
            dssj dssjVar = null;
            try {
                byte[] blob = cursor.getBlob(cursor.getColumnIndex("schedule"));
                if (blob != null) {
                    dsqp dsqpVar = (dsqp) dsfrVar.cu(5);
                    dsqpVar.bC(dsfrVar);
                    dssjVar = dsqpVar.bx(blob, dsqa.c()).bK();
                }
            } catch (dsrm unused) {
                cvlw.e("OptimizedThreadStorageImpl", "Error parsing column %s for notification %s", "schedule", cursor.getString(cursor.getColumnIndex("thread_id")));
            }
            d.d((dsfr) dssjVar);
            arrayList.add(d.a());
        }
        return arrayList;
    }

    private final synchronized cvqj j(dbsg<cvkc> dbsgVar) {
        Long valueOf;
        long longValue = dbsgVar.a() ? dbsgVar.b().a().longValue() : -1L;
        HashMap<Long, cvqj> hashMap = this.c;
        valueOf = Long.valueOf(longValue);
        if (!hashMap.containsKey(valueOf)) {
            this.c.put(valueOf, new cvqj(this.a, longValue));
        }
        return this.c.get(valueOf);
    }

    @Override // defpackage.cvqi
    public final synchronized long a(dbsg<cvkc> dbsgVar) {
        SQLiteDatabase writableDatabase;
        long j = 0;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                writableDatabase = j(dbsgVar).getWritableDatabase();
            } catch (RuntimeException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            j = DatabaseUtils.queryNumEntries(writableDatabase, "optimized_threads", null, null);
            if (writableDatabase != null) {
                writableDatabase.close();
                return j;
            }
        } catch (RuntimeException unused2) {
            sQLiteDatabase = writableDatabase;
            cvlw.e("OptimizedThreadStorageImpl", "Error counting OptimizedThreads for %s", dbsgVar);
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                return 0L;
            }
            return j;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[Catch: all -> 0x0055, TRY_ENTER, TryCatch #0 {all -> 0x0055, blocks: (B:7:0x001f, B:10:0x0025, B:28:0x0051, B:32:0x0059, B:33:0x005c, B:20:0x0043, B:24:0x004a), top: B:37:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:7:0x001f, B:10:0x0025, B:28:0x0051, B:32:0x0059, B:33:0x005c, B:20:0x0043, B:24:0x004a), top: B:37:0x0002 }] */
    @Override // defpackage.cvqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<defpackage.cvqh> b(defpackage.dbsg<defpackage.cvkc> r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            cvqj r1 = r11.j(r12)     // Catch: java.lang.Throwable -> L2c java.lang.RuntimeException -> L2f
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L2c java.lang.RuntimeException -> L2f
            java.lang.String r3 = "optimized_threads"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "_id"
            r10 = 0
            r2 = r1
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2a java.lang.RuntimeException -> L30
            java.util.List r12 = i(r0)     // Catch: java.lang.Throwable -> L2a java.lang.RuntimeException -> L30
            if (r0 == 0) goto L22
            r0.close()     // Catch: java.lang.Throwable -> L55
        L22:
            if (r1 != 0) goto L25
            goto L48
        L25:
            r1.close()     // Catch: java.lang.Throwable -> L55
            monitor-exit(r11)
            return r12
        L2a:
            r12 = move-exception
            goto L4f
        L2c:
            r12 = move-exception
            r1 = r0
            goto L4f
        L2f:
            r1 = r0
        L30:
            java.lang.String r2 = "OptimizedThreadStorageImpl"
            java.lang.String r3 = "Error getting all OptimizedThreads for %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L2a
            r5 = 0
            r4[r5] = r12     // Catch: java.lang.Throwable -> L2a
            defpackage.cvlw.e(r2, r3, r4)     // Catch: java.lang.Throwable -> L2a
            java.util.List r12 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L46
            r0.close()     // Catch: java.lang.Throwable -> L55
        L46:
            if (r1 != 0) goto L4a
        L48:
            monitor-exit(r11)
            return r12
        L4a:
            r1.close()     // Catch: java.lang.Throwable -> L55
            monitor-exit(r11)
            return r12
        L4f:
            if (r0 == 0) goto L57
            r0.close()     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r12 = move-exception
            goto L5d
        L57:
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.lang.Throwable -> L55
        L5c:
            throw r12     // Catch: java.lang.Throwable -> L55
        L5d:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvqk.b(dbsg):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r2 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: all -> 0x0097, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:8:0x003e, B:10:0x0043, B:22:0x0077, B:24:0x007d, B:25:0x0080, B:29:0x008e, B:31:0x0093, B:32:0x0096, B:19:0x0071), top: B:40:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: all -> 0x0097, TryCatch #1 {, blocks: (B:3:0x0001, B:8:0x003e, B:10:0x0043, B:22:0x0077, B:24:0x007d, B:25:0x0080, B:29:0x008e, B:31:0x0093, B:32:0x0096, B:19:0x0071), top: B:40:0x0001 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v1 */
    @Override // defpackage.cvqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.dbsg<defpackage.cvqh> c(defpackage.dbsg<defpackage.cvkc> r14, java.lang.String r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            cxnk r0 = defpackage.cxnk.a()     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "thread_id"
            r0.c(r1)     // Catch: java.lang.Throwable -> L97
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L97
            r3 = 0
            r2[r3] = r15     // Catch: java.lang.Throwable -> L97
            java.lang.String r15 = "=?"
            r0.d(r15, r2)     // Catch: java.lang.Throwable -> L97
            cxnj r15 = r0.b()     // Catch: java.lang.Throwable -> L97
            r0 = 0
            cvqj r2 = r13.j(r14)     // Catch: java.lang.Throwable -> L49 java.lang.RuntimeException -> L4c
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L49 java.lang.RuntimeException -> L4c
            java.lang.String r5 = "optimized_threads"
            r4 = r15
            cxni r4 = (defpackage.cxni) r4     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4d
            java.lang.String r7 = r4.a     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4d
            r6 = 0
            java.lang.String[] r8 = r15.c()     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4d
            r9 = 0
            r10 = 0
            java.lang.String r11 = "_id"
            r12 = 0
            r4 = r2
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4d
            java.util.List r14 = i(r0)     // Catch: java.lang.Throwable -> L47 java.lang.RuntimeException -> L4d
            if (r0 == 0) goto L41
            r0.close()     // Catch: java.lang.Throwable -> L97
        L41:
            if (r2 == 0) goto L77
        L43:
            r2.close()     // Catch: java.lang.Throwable -> L97
            goto L77
        L47:
            r14 = move-exception
            goto L8c
        L49:
            r14 = move-exception
            r2 = r0
            goto L8c
        L4c:
            r2 = r0
        L4d:
            java.lang.String r4 = "OptimizedThreadStorageImpl"
            java.lang.String r5 = "Error getting OptimizedThreads for %s. Query: %s %s"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L47
            r6[r3] = r14     // Catch: java.lang.Throwable -> L47
            r14 = r15
            cxni r14 = (defpackage.cxni) r14     // Catch: java.lang.Throwable -> L47
            java.lang.String r14 = r14.a     // Catch: java.lang.Throwable -> L47
            r6[r1] = r14     // Catch: java.lang.Throwable -> L47
            r14 = 2
            java.lang.String[] r15 = r15.c()     // Catch: java.lang.Throwable -> L47
            java.lang.String r15 = java.util.Arrays.toString(r15)     // Catch: java.lang.Throwable -> L47
            r6[r14] = r15     // Catch: java.lang.Throwable -> L47
            defpackage.cvlw.e(r4, r5, r6)     // Catch: java.lang.Throwable -> L47
            java.util.List r14 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L74
            r0.close()     // Catch: java.lang.Throwable -> L97
        L74:
            if (r2 == 0) goto L77
            goto L43
        L77:
            boolean r15 = r14.isEmpty()     // Catch: java.lang.Throwable -> L97
            if (r15 == 0) goto L80
            dbpy<java.lang.Object> r14 = defpackage.dbpy.a     // Catch: java.lang.Throwable -> L97
            goto L8a
        L80:
            java.lang.Object r14 = r14.get(r3)     // Catch: java.lang.Throwable -> L97
            cvqh r14 = (defpackage.cvqh) r14     // Catch: java.lang.Throwable -> L97
            dbsg r14 = defpackage.dbsg.i(r14)     // Catch: java.lang.Throwable -> L97
        L8a:
            monitor-exit(r13)
            return r14
        L8c:
            if (r0 == 0) goto L91
            r0.close()     // Catch: java.lang.Throwable -> L97
        L91:
            if (r2 == 0) goto L96
            r2.close()     // Catch: java.lang.Throwable -> L97
        L96:
            throw r14     // Catch: java.lang.Throwable -> L97
        L97:
            r14 = move-exception
            monitor-exit(r13)
            goto L9b
        L9a:
            throw r14
        L9b:
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvqk.c(dbsg, java.lang.String):dbsg");
    }

    @Override // defpackage.cvqi
    public final synchronized boolean d(dbsg<cvkc> dbsgVar) {
        SQLiteDatabase writableDatabase;
        boolean z = true;
        boolean z2 = false;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                writableDatabase = j(dbsgVar).getWritableDatabase();
            } catch (RuntimeException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (writableDatabase.delete("optimized_threads", null, null) <= 0) {
                z = false;
            }
        } catch (RuntimeException unused2) {
            sQLiteDatabase = writableDatabase;
            cvlw.e("OptimizedThreadStorageImpl", "Error deleting all OptimizedThreads for %s", dbsgVar);
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                return false;
            }
            return z2;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
        if (writableDatabase != null) {
            writableDatabase.close();
            return z;
        }
        z2 = z;
        return z2;
    }

    @Override // defpackage.cvqi
    public final synchronized boolean e(dbsg<cvkc> dbsgVar, List<String> list) {
        return h(dbsgVar, cvks.a("", "thread_id", (String[]) list.toArray(new String[list.size()])));
    }

    @Override // defpackage.cvqi
    public final synchronized boolean f(dbsg<cvkc> dbsgVar, long j) {
        cxnk a;
        a = cxnk.a();
        a.c("thread_stored_timestamp");
        a.d("<= ?", Long.valueOf(System.currentTimeMillis() - j));
        return h(dbsgVar, dcdc.f(a.b()));
    }

    /* JADX WARN: Incorrect return type in method signature: (Ldbsg<Lcvkc;>;Lcvqh;)Ljava/lang/Object; */
    @Override // defpackage.cvqi
    public final synchronized int g(dbsg dbsgVar, cvqh cvqhVar) {
        ContentValues contentValues;
        SQLiteDatabase writableDatabase;
        int i = 2;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                contentValues = new ContentValues(3);
                contentValues.put("thread_id", ((cvqg) cvqhVar).a);
                contentValues.put("last_updated__version", ((cvqg) cvqhVar).b);
                contentValues.put("thread_stored_timestamp", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("schedule", ((cvqg) cvqhVar).c.bS());
                writableDatabase = j(dbsgVar).getWritableDatabase();
            } catch (Throwable th) {
                th = th;
            }
        } catch (RuntimeException unused) {
        }
        try {
            if (writableDatabase.insertWithOnConflict("optimized_threads", null, contentValues, 4) > 0) {
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                return 1;
            }
            cxnk a = cxnk.a();
            a.c("thread_id");
            a.d("=?", ((cvqg) cvqhVar).a);
            a.c(" AND ");
            a.c("last_updated__version");
            a.d("<?", Long.toString(((cvqg) cvqhVar).b.longValue()));
            cxnj b = a.b();
            if (writableDatabase.update("optimized_threads", contentValues, ((cxni) b).a, b.c()) <= 0) {
                i = 3;
            }
            if (writableDatabase != null) {
                writableDatabase.close();
            }
            return i;
        } catch (RuntimeException unused2) {
            sQLiteDatabase = writableDatabase;
            cvlw.e("OptimizedThreadStorageImpl", "Error inserting OptimizedThread for account: %s, %s", dbsgVar, cvqhVar);
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            return 4;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }
}

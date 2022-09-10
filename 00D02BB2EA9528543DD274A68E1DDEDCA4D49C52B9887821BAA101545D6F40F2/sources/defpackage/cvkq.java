package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: cvkq  reason: default package */
/* loaded from: classes5.dex */
public final class cvkq implements cvkk {
    public final Context a;
    private final cvkf b;
    private final dxio<cvlr> c;
    private final cqat d;
    private final HashMap<Long, cvkp> e = new HashMap<>();

    public cvkq(Context context, cvkf cvkfVar, dxio<cvlr> dxioVar, cqat cqatVar) {
        this.a = context;
        this.b = cvkfVar;
        this.c = dxioVar;
        this.d = cqatVar;
    }

    private final dcdc<cvkj> m(String str, List<cxnj> list) {
        SQLiteDatabase writableDatabase;
        dccx F = dcdc.F();
        SQLiteDatabase sQLiteDatabase = null;
        Cursor cursor = null;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            try {
                writableDatabase = l(str).getWritableDatabase();
            } catch (Throwable th) {
                th = th;
            }
        } catch (cvke | RuntimeException unused) {
        }
        try {
            writableDatabase.beginTransaction();
            for (cxnj cxnjVar : list) {
                try {
                    Cursor query = writableDatabase.query("threads", null, cxnjVar.a(), cxnjVar.c(), null, null, "last_notification_version DESC", null);
                    try {
                        dccx F2 = dcdc.F();
                        while (query.moveToNext()) {
                            try {
                                cvka w = cvkj.w();
                                w.e(query.getString(cvks.b(query, "thread_id")));
                                w.i(dsdh.a(query.getInt(cvks.b(query, "read_state"))));
                                w.g(dscj.a(query.getInt(cvks.b(query, "count_behavior"))));
                                w.k(dsdz.a(query.getInt(cvks.b(query, "system_tray_behavior"))));
                                w.a = Long.valueOf(query.getLong(cvks.b(query, "last_updated__version")));
                                w.b = Long.valueOf(query.getLong(cvks.b(query, "last_notification_version")));
                                w.d = query.getString(cvks.b(query, "payload_type"));
                                w.f(cvks.f(query, dscq.a, "notification_metadata"));
                                List<dsbi> f = cvks.f(query, dsbi.j, "actions");
                                ArrayList arrayList = new ArrayList();
                                for (dsbi dsbiVar : f) {
                                    dbsg<cvkg> k = cvkg.k(dsbiVar);
                                    if (k.a()) {
                                        arrayList.add(k.b());
                                    }
                                }
                                w.b(arrayList);
                                w.c = Long.valueOf(query.getLong(cvks.b(query, "creation_id")));
                                w.c((dsch) cvks.e(query, dsch.v, "rendered_message"));
                                w.e = (dsok) cvks.e(query, dsok.c, "payload");
                                w.f = query.getString(cvks.b(query, "update_thread_state_token"));
                                w.d(query.getString(cvks.b(query, "group_id")));
                                w.g = Long.valueOf(query.getLong(cvks.b(query, "expiration_timestamp")));
                                w.h = Long.valueOf(query.getLong(cvks.b(query, "thread_stored_timestamp")));
                                w.j(dsdl.a(query.getInt(cvks.b(query, "storage_mode"))));
                                F2.g(w.a());
                            } catch (cvkr unused2) {
                                cvlp b = this.c.a().b(41);
                                b.j(str);
                                b.a();
                            }
                        }
                        dcdc f2 = F2.f();
                        if (query != null) {
                            query.close();
                        }
                        F.i(f2);
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            dcdc<cvkj> f3 = F.f();
            if (writableDatabase != null) {
                writableDatabase.close();
            }
            return f3;
        } catch (cvke | RuntimeException unused3) {
            sQLiteDatabase = writableDatabase;
            cvlw.e("ChimeThreadStorageImpl", "Error getting ChimeThreads for %s. Queries: %s", str, list);
            dcdc<cvkj> e = dcdc.e();
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            return e;
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase2 = writableDatabase;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.close();
            }
            throw th;
        }
    }

    private final void n(String str, List<cxnj> list) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase writableDatabase = l(str).getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    for (cxnj cxnjVar : list) {
                        writableDatabase.delete("threads", cxnjVar.a(), cxnjVar.c());
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (writableDatabase == null) {
                        return;
                    }
                    writableDatabase.close();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (cvke | RuntimeException unused) {
                cvlw.e("ChimeThreadStorageImpl", "Error deleting ChimeThreads for %s. Queries: %s", str, list);
                if (0 == 0) {
                    return;
                }
                sQLiteDatabase.close();
            }
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    @Override // defpackage.cvkk
    public final synchronized long a(String str) {
        cxnk a = cxnk.a();
        a.c("locally_removed=0");
        cxnj b = a.b();
        long j = 0;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = l(str).getWritableDatabase();
            j = DatabaseUtils.queryNumEntries(sQLiteDatabase, "threads", ((cxni) b).a, b.c());
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                return j;
            }
        } catch (cvke | RuntimeException unused) {
            cvlw.e("ChimeThreadStorageImpl", "Error counting ChimeThreads for %s. Query: %s %s", str, ((cxni) b).a, Arrays.toString(b.c()));
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                return 0L;
            }
        }
        return j;
    }

    @Override // defpackage.cvkk
    public final synchronized List<cvkj> b(String str) {
        cxnk a;
        a = cxnk.a();
        a.c("locally_removed=0");
        return m(str, dcdc.f(a.b()));
    }

    @Override // defpackage.cvkk
    public final synchronized List<cvkj> c(String str) {
        cxnk a;
        a = cxnk.a();
        a.c("1");
        return m(str, dcdc.f(a.b()));
    }

    @Override // defpackage.cvkk
    public final synchronized List<cvkj> d(String str, String... strArr) {
        return m(str, cvks.a("locally_removed=0", "thread_id", strArr));
    }

    @Override // defpackage.cvkk
    public final synchronized List<cvkj> e(String str, String str2) {
        cxnk a;
        a = cxnk.a();
        a.c("locally_removed=0");
        a.c(" AND ");
        a.c("group_id");
        a.d("=?", str2);
        return m(str, dcdc.f(a.b()));
    }

    @Override // defpackage.cvkk
    public final synchronized List<cvkj> f(String str, long j) {
        cxnk a;
        a = cxnk.a();
        a.c("last_updated__version");
        a.d(">?", Long.valueOf(j));
        return m(str, dcdc.f(a.b()));
    }

    @Override // defpackage.cvkk
    public final synchronized int g(String str, cvkj cvkjVar) {
        int i = 2;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                ContentValues contentValues = new ContentValues(15);
                contentValues.put("thread_id", cvkjVar.a());
                int p = cvkjVar.p();
                int i2 = p - 1;
                if (p == 0) {
                    throw null;
                }
                contentValues.put("read_state", Integer.valueOf(i2));
                int r = cvkjVar.r();
                int i3 = r - 1;
                if (r == 0) {
                    throw null;
                }
                contentValues.put("count_behavior", Integer.valueOf(i3));
                int s = cvkjVar.s();
                int i4 = s - 1;
                if (s == 0) {
                    throw null;
                }
                contentValues.put("system_tray_behavior", Integer.valueOf(i4));
                contentValues.put("last_updated__version", cvkjVar.b());
                contentValues.put("last_notification_version", cvkjVar.c());
                contentValues.put("payload_type", cvkjVar.g());
                contentValues.put("update_thread_state_token", cvkjVar.i());
                contentValues.put("group_id", cvkjVar.j());
                contentValues.put("expiration_timestamp", cvkjVar.k());
                contentValues.put("thread_stored_timestamp", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("locally_removed", (Boolean) false);
                int t = cvkjVar.t();
                int i5 = t - 1;
                if (t != 0) {
                    contentValues.put("storage_mode", Integer.valueOf(i5));
                    contentValues.put("creation_id", cvkjVar.f());
                    if (cvkjVar.d() != null) {
                        contentValues.put("rendered_message", cvkjVar.d().bS());
                    }
                    if (!cvkjVar.e().isEmpty()) {
                        cvtb bZ = cvtc.b.bZ();
                        for (dscq dscqVar : cvkjVar.e()) {
                            dsoj bZ2 = dsok.c.bZ();
                            dspd bR = dscqVar.bR();
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            bR.getClass();
                            ((dsok) bZ2.b).b = bR;
                            bZ.a(bZ2.bK());
                        }
                        contentValues.put("notification_metadata", bZ.bK().bS());
                    }
                    if (!cvkjVar.n().isEmpty()) {
                        cvtb bZ3 = cvtc.b.bZ();
                        for (cvkg cvkgVar : cvkjVar.n()) {
                            dsoj bZ4 = dsok.c.bZ();
                            dspd bR2 = cvkgVar.l().bR();
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            bR2.getClass();
                            ((dsok) bZ4.b).b = bR2;
                            bZ3.a(bZ4.bK());
                        }
                        contentValues.put("actions", bZ3.bK().bS());
                    }
                    if (cvkjVar.h() != null) {
                        contentValues.put("payload", cvkjVar.h().bS());
                    }
                    SQLiteDatabase writableDatabase = l(str).getWritableDatabase();
                    try {
                        if (writableDatabase.insertWithOnConflict("threads", null, contentValues, 4) > 0) {
                            if (writableDatabase != null) {
                                writableDatabase.close();
                            }
                            return 1;
                        }
                        cxnk a = cxnk.a();
                        a.c("thread_id");
                        a.d(" = ?", cvkjVar.a());
                        a.c(" AND ");
                        a.c("last_updated__version");
                        a.d(" < ?", Long.toString(cvkjVar.b().longValue()));
                        cxnj b = a.b();
                        if (writableDatabase.update("threads", contentValues, ((cxni) b).a, b.c()) <= 0) {
                            i = 3;
                        }
                        if (writableDatabase != null) {
                            writableDatabase.close();
                        }
                        return i;
                    } catch (cvke | RuntimeException unused) {
                        sQLiteDatabase = writableDatabase;
                        cvlw.e("ChimeThreadStorageImpl", "Error inserting ChimeThread for account: %s, %s", str, cvkjVar);
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        return 4;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = writableDatabase;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                throw null;
            } catch (cvke | RuntimeException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.cvkk
    public final synchronized void h(String str, String... strArr) {
        SQLiteDatabase writableDatabase;
        ContentValues contentValues;
        dcdc<cxnj> a = cvks.a("", "thread_id", strArr);
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = l(str).getWritableDatabase();
            contentValues = new ContentValues(1);
            contentValues.put("locally_removed", (Boolean) true);
            writableDatabase.beginTransaction();
        } catch (cvke | RuntimeException unused) {
            cvlw.e("ChimeThreadStorageImpl", "Error moving ChimeThread to trash for %s. Queries: %s", str, a);
            if (0 != 0) {
                sQLiteDatabase.close();
                return;
            }
        }
        try {
            for (cxnj cxnjVar : a) {
                writableDatabase.update("threads", contentValues, cxnjVar.a(), cxnjVar.c());
            }
            writableDatabase.setTransactionSuccessful();
            if (writableDatabase != null) {
                writableDatabase.close();
            }
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // defpackage.cvkk
    public final synchronized void i(String str) {
        cxnk a = cxnk.a();
        a.c("1");
        n(str, dcdc.f(a.b()));
    }

    @Override // defpackage.cvkk
    public final synchronized void j(String str, String... strArr) {
        n(str, cvks.a("", "thread_id", strArr));
    }

    @Override // defpackage.cvkk
    public final synchronized void k(String str, long j) {
        cxnk a = cxnk.a();
        a.c("thread_stored_timestamp");
        a.d("<= ?", Long.valueOf(System.currentTimeMillis() - j));
        n(str, dcdc.f(a.b()));
    }

    public final synchronized cvkp l(String str) {
        Long l;
        l = -1L;
        if (str != null) {
            l = this.b.b(str).a();
        }
        if (!this.e.containsKey(l)) {
            this.e.put(l, new cvkp(this.a, l.longValue()));
        }
        return this.e.get(l);
    }
}

package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: akzp  reason: default package */
/* loaded from: classes.dex */
public final class akzp {
    public final Map a;
    private final Context b;
    private final ScheduledExecutorService c;
    private final albh d;
    private ScheduledFuture e;
    private SQLiteDatabase f;

    public akzp(Context context, ScheduledExecutorService scheduledExecutorService, alht alhtVar) {
        albh albhVar = new albh(alhtVar);
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = albhVar;
        this.a = new ConcurrentHashMap();
    }

    private final alcw j(String str, byte[] bArr, int i) {
        albh albhVar = this.d;
        alcw alcwVar = null;
        try {
            alcw alcwVar2 = (alcw) aopi.parseFrom(alcw.a, bArr, aoos.b());
            if (i != 1) {
                if (i == 2) {
                    aopa mo52toBuilder = alcwVar2.mo52toBuilder();
                    if (!((alcw) mo52toBuilder.instance).S) {
                        mo52toBuilder.copyOnWrite();
                        alcw.a((alcw) mo52toBuilder.instance);
                        alcw alcwVar3 = (alcw) mo52toBuilder.instance;
                        if (!alcwVar3.ad) {
                            if (alcwVar3.ac) {
                                alct alctVar = alcwVar3.ag;
                                if (alctVar == null) {
                                    alctVar = alct.a;
                                }
                                int z = araa.z(alctVar.c);
                                if (z == 0 || z != 2) {
                                    alct alctVar2 = ((alcw) mo52toBuilder.instance).ak;
                                    if (alctVar2 == null) {
                                        alctVar2 = alct.a;
                                    }
                                    int z2 = araa.z(alctVar2.c);
                                    if (z2 == 0 || z2 != 2) {
                                        alctVar2 = alct.a;
                                    }
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar4 = (alcw) mo52toBuilder.instance;
                                    alctVar2.getClass();
                                    alcwVar4.ak = alctVar2;
                                    alcwVar4.c |= 536870912;
                                    alct alctVar3 = alcwVar4.M;
                                    if (alctVar3 == null) {
                                        alctVar3 = alct.a;
                                    }
                                    alct a = albhVar.a(alctVar3);
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar5 = (alcw) mo52toBuilder.instance;
                                    a.getClass();
                                    alcwVar5.M = a;
                                    alcwVar5.c |= 256;
                                    alct alctVar4 = alcwVar5.Y;
                                    if (alctVar4 == null) {
                                        alctVar4 = alct.a;
                                    }
                                    alct a2 = albhVar.a(alctVar4);
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar6 = (alcw) mo52toBuilder.instance;
                                    a2.getClass();
                                    alcwVar6.Y = a2;
                                    alcwVar6.c |= 131072;
                                    alct alctVar5 = alcwVar6.w;
                                    if (alctVar5 == null) {
                                        alctVar5 = alct.a;
                                    }
                                    alct a3 = albhVar.a(alctVar5);
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar7 = (alcw) mo52toBuilder.instance;
                                    a3.getClass();
                                    alcwVar7.w = a3;
                                    alcwVar7.b |= 16777216;
                                    alct alctVar6 = alcwVar7.w;
                                    if (alctVar6 == null) {
                                        alctVar6 = alct.a;
                                    }
                                    alct a4 = albhVar.a(alctVar6);
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar8 = (alcw) mo52toBuilder.instance;
                                    a4.getClass();
                                    alcwVar8.aa = a4;
                                    alcwVar8.c |= 524288;
                                    alct alctVar7 = alcwVar8.ai;
                                    if (alctVar7 == null) {
                                        alctVar7 = alct.a;
                                    }
                                    alct a5 = albhVar.a(alctVar7);
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar9 = (alcw) mo52toBuilder.instance;
                                    a5.getClass();
                                    alcwVar9.ai = a5;
                                    alcwVar9.c |= 134217728;
                                    alct alctVar8 = alcwVar9.L;
                                    if (alctVar8 == null) {
                                        alctVar8 = alct.a;
                                    }
                                    alct a6 = albhVar.a(alctVar8);
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar10 = (alcw) mo52toBuilder.instance;
                                    a6.getClass();
                                    alcwVar10.L = a6;
                                    alcwVar10.c |= 128;
                                    alct alctVar9 = alcwVar10.I;
                                    if (alctVar9 == null) {
                                        alctVar9 = alct.a;
                                    }
                                    alct a7 = albhVar.a(alctVar9);
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar11 = (alcw) mo52toBuilder.instance;
                                    a7.getClass();
                                    alcwVar11.I = a7;
                                    alcwVar11.c |= 16;
                                    alct alctVar10 = alcwVar11.H;
                                    if (alctVar10 == null) {
                                        alctVar10 = alct.a;
                                    }
                                    alct a8 = albhVar.a(alctVar10);
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar12 = (alcw) mo52toBuilder.instance;
                                    a8.getClass();
                                    alcwVar12.H = a8;
                                    alcwVar12.c |= 8;
                                    alct alctVar11 = alcwVar12.K;
                                    if (alctVar11 == null) {
                                        alctVar11 = alct.a;
                                    }
                                    alct a9 = albhVar.a(alctVar11);
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar13 = (alcw) mo52toBuilder.instance;
                                    a9.getClass();
                                    alcwVar13.K = a9;
                                    alcwVar13.c |= 64;
                                    alct alctVar12 = alcwVar13.ab;
                                    if (alctVar12 == null) {
                                        alctVar12 = alct.a;
                                    }
                                    alct a10 = albhVar.a(alctVar12);
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar14 = (alcw) mo52toBuilder.instance;
                                    a10.getClass();
                                    alcwVar14.ab = a10;
                                    alcwVar14.c |= 1048576;
                                } else {
                                    alct e = albhVar.a.e();
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar15 = (alcw) mo52toBuilder.instance;
                                    e.getClass();
                                    alcwVar15.ak = e;
                                    alcwVar15.c |= 536870912;
                                    alct e2 = albhVar.a.e();
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar16 = (alcw) mo52toBuilder.instance;
                                    e2.getClass();
                                    alcwVar16.M = e2;
                                    alcwVar16.c |= 256;
                                    alct e3 = albhVar.a.e();
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar17 = (alcw) mo52toBuilder.instance;
                                    e3.getClass();
                                    alcwVar17.Y = e3;
                                    alcwVar17.c |= 131072;
                                    alct e4 = albhVar.a.e();
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar18 = (alcw) mo52toBuilder.instance;
                                    e4.getClass();
                                    alcwVar18.w = e4;
                                    alcwVar18.b |= 16777216;
                                    alct e5 = albhVar.a.e();
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar19 = (alcw) mo52toBuilder.instance;
                                    e5.getClass();
                                    alcwVar19.aa = e5;
                                    alcwVar19.c |= 524288;
                                    alct e6 = albhVar.a.e();
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar20 = (alcw) mo52toBuilder.instance;
                                    e6.getClass();
                                    alcwVar20.ai = e6;
                                    alcwVar20.c |= 134217728;
                                    alct e7 = albhVar.a.e();
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar21 = (alcw) mo52toBuilder.instance;
                                    e7.getClass();
                                    alcwVar21.L = e7;
                                    alcwVar21.c |= 128;
                                    alct e8 = albhVar.a.e();
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar22 = (alcw) mo52toBuilder.instance;
                                    e8.getClass();
                                    alcwVar22.I = e8;
                                    alcwVar22.c |= 16;
                                    alct e9 = albhVar.a.e();
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar23 = (alcw) mo52toBuilder.instance;
                                    e9.getClass();
                                    alcwVar23.H = e9;
                                    alcwVar23.c |= 8;
                                    alct e10 = albhVar.a.e();
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar24 = (alcw) mo52toBuilder.instance;
                                    e10.getClass();
                                    alcwVar24.K = e10;
                                    alcwVar24.c |= 64;
                                    alct e11 = albhVar.a.e();
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar25 = (alcw) mo52toBuilder.instance;
                                    e11.getClass();
                                    alcwVar25.ab = e11;
                                    alcwVar25.c |= 1048576;
                                }
                            } else {
                                alct alctVar13 = alct.a;
                                mo52toBuilder.copyOnWrite();
                                alcw alcwVar26 = (alcw) mo52toBuilder.instance;
                                alctVar13.getClass();
                                alcwVar26.Y = alctVar13;
                                int i2 = alcwVar26.c | 131072;
                                alcwVar26.c = i2;
                                if ((i2 & 2) == 0) {
                                    alct alctVar14 = alct.a;
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar27 = (alcw) mo52toBuilder.instance;
                                    alctVar14.getClass();
                                    alcwVar27.I = alctVar14;
                                    alcwVar27.c |= 16;
                                } else {
                                    alct e12 = albhVar.a.e();
                                    mo52toBuilder.copyOnWrite();
                                    alcw alcwVar28 = (alcw) mo52toBuilder.instance;
                                    e12.getClass();
                                    alcwVar28.I = e12;
                                    alcwVar28.c |= 16;
                                }
                            }
                        }
                        alcwVar = (alcw) mo52toBuilder.mo39build();
                    } else {
                        alcwVar = (alcw) mo52toBuilder.mo39build();
                    }
                } else if (i == 3) {
                    alcwVar = alcwVar2;
                }
            }
        } catch (aopx unused) {
        }
        if (alcwVar == null) {
            g(str);
        } else if (i < 3) {
            i(str, alcwVar);
        }
        return alcwVar;
    }

    private final void k(String str, alcw alcwVar) {
        azpm azpmVar = (azpm) this.a.get(str);
        if (azpmVar == null) {
            azpmVar = azpm.e();
            this.a.put(str, azpmVar);
        }
        azpmVar.c(alcwVar);
    }

    private final synchronized void l() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        f();
        this.e = this.c.schedule(new Runnable() { // from class: akzn
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    akzp.this.e();
                } catch (akzq e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zep.b(valueOf.length() != 0 ? "JobStorageException on closing db for idleness: ".concat(valueOf) : new String("JobStorageException on closing db for idleness: "));
                }
            }
        }, 60L, TimeUnit.SECONDS);
    }

    private static final ContentValues m(String str, alcw alcwVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", str);
        contentValues.put("version", (Integer) 3);
        contentValues.put("data", alcwVar.toByteArray());
        return contentValues;
    }

    public final synchronized albg a(String str, akzs akzsVar) {
        l();
        try {
            this.f.beginTransaction();
            try {
                alcw b = b(str);
                alcw a = akzsVar.a(b);
                if (akzj.f(a, b)) {
                    return new albg(b, a);
                }
                if (b != null || a == null) {
                    if (a == null) {
                        if (!g(str)) {
                            throw new AssertionError("Delete failed after a read, in a transaction");
                        }
                    } else if (!i(str, a)) {
                        throw new AssertionError("Update failed after a read, in a transaction");
                    }
                } else if (!h(str, a)) {
                    throw new AssertionError("Insert failed after an empty read, in a transaction");
                }
                SQLiteDatabase sQLiteDatabase = this.f;
                sQLiteDatabase.getClass();
                sQLiteDatabase.setTransactionSuccessful();
                return new albg(b, a);
            } finally {
            }
        } catch (SQLiteException e) {
            throw new akzq("Error updating the database in a transaction", e);
        }
    }

    public final synchronized alcw b(String str) {
        l();
        Cursor query = this.f.query("job_storage_jobs", new String[]{"version", "data"}, "id = ?", new String[]{str}, null, null, null);
        try {
            if (!query.moveToFirst()) {
                return null;
            }
            int i = query.getInt(query.getColumnIndexOrThrow("version"));
            byte[] blob = query.getBlob(query.getColumnIndexOrThrow("data"));
            if (query.moveToNext()) {
                throw new AssertionError("Multiple jobs with the same id were found");
            }
            return j(str, blob, i);
        } finally {
            query.close();
        }
    }

    public final synchronized Map c() {
        HashMap hashMap;
        l();
        hashMap = new HashMap();
        Cursor query = this.f.query("job_storage_jobs", new String[]{"id", "version", "data"}, null, null, null, null, null);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("version");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("data");
            while (query.moveToNext()) {
                String string = query.getString(columnIndexOrThrow);
                alcw j = j(string, query.getBlob(columnIndexOrThrow3), query.getInt(columnIndexOrThrow2));
                if (j != null) {
                    if (hashMap.put(string, j) == null) {
                        k(string, j);
                    } else {
                        throw new AssertionError("Multiple jobs with the same id were found");
                    }
                }
            }
        } finally {
            query.close();
        }
        return hashMap;
    }

    public final synchronized Map d(ampt amptVar) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList = new ArrayList(c().entrySet());
        Collections.sort(arrayList, new ahdo(3));
        linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i);
            if (amptVar.a((alcw) entry.getValue())) {
                linkedHashMap.put((String) entry.getKey(), (alcw) entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void e() {
        try {
            SQLiteDatabase sQLiteDatabase = this.f;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.close();
            this.f = null;
        } catch (Throwable th) {
            throw new akzq("Could not close the database", th);
        }
    }

    protected final synchronized void f() {
        try {
            if (this.f != null) {
                return;
            }
            this.f = new akzo(this.b).getWritableDatabase();
        } catch (Throwable th) {
            throw new akzq("Could not open the database", th);
        }
    }

    public final synchronized boolean g(String str) {
        boolean z;
        azpm azpmVar;
        l();
        z = true;
        int delete = this.f.delete("job_storage_jobs", "id = ?", new String[]{str});
        if (delete > 1) {
            throw new AssertionError("Multiple jobs with the same id were found");
        }
        if (delete != 1) {
            z = false;
        }
        if (z && (azpmVar = (azpm) this.a.remove(str)) != null) {
            azpmVar.sm();
        }
        return z;
    }

    public final synchronized boolean h(String str, alcw alcwVar) {
        boolean z;
        aqxo.p(alcwVar.S);
        l();
        z = this.f.insertOrThrow("job_storage_jobs", null, m(str, alcwVar)) >= 0;
        if (z) {
            k(str, alcwVar);
        }
        return z;
    }

    public final synchronized boolean i(String str, alcw alcwVar) {
        boolean z;
        l();
        z = true;
        int update = this.f.update("job_storage_jobs", m(str, alcwVar), "id = ?", new String[]{str});
        if (update > 1) {
            throw new AssertionError("Multiple jobs with the same id were found");
        }
        if (update != 1) {
            z = false;
        }
        if (z) {
            k(str, alcwVar);
        }
        return z;
    }
}

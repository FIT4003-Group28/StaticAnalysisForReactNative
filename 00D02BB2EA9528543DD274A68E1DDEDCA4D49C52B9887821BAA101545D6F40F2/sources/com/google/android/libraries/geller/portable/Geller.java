package com.google.android.libraries.geller.portable;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.google.android.libraries.geller.portable.callbacks.GellerContactsCallback;
import com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback;
import com.google.android.libraries.geller.portable.database.GellerDatabase;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Geller {
    public static final /* synthetic */ int g = 0;
    private static final dcdc<dsyl> h = dcdc.g(dsyl.INTERNAL_METRICS_CACHE_STATUS, dsyl.INTERNAL_METRICS_CACHE_ACCESS);
    public final Executor a;
    public final Executor b;
    public long c;
    public final GellerStorageOperationsCallback e;
    private final Context i;
    private final boolean l;
    private final Map<dsyl, cqzq> m;
    private final cqzq n;
    private final Map<String, Long> j = new HashMap();
    private final Map<String, GellerDatabase> k = new HashMap();
    public final boolean d = false;
    public final boolean f = false;

    public Geller(cqzk cqzkVar) {
        this.i = cqzkVar.a;
        this.l = cqzkVar.e;
        this.m = cqzkVar.f.b();
        this.n = cqzkVar.i;
        this.a = cqzkVar.b;
        this.b = dehx.b(cqzkVar.c);
        cqzn cqznVar = new cqzn(this, cqzkVar.c);
        this.e = cqznVar;
        this.c = nativeCreate(cqzkVar.h, cqznVar);
    }

    private native long nativeCreate(GellerContactsCallback gellerContactsCallback, GellerStorageOperationsCallback gellerStorageOperationsCallback);

    private native long nativeCreateDatabase(GellerDatabase gellerDatabase, String str);

    public final synchronized void a(dcep<String> dcepVar) {
        File parentFile = this.i.getDatabasePath("geller").getParentFile();
        if (parentFile == null) {
            return;
        }
        File[] listFiles = parentFile.listFiles(cqzg.a);
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            String substring = file.getName().substring(0, file.getName().indexOf(".db"));
            String substring2 = substring.substring(16);
            if (!dcepVar.contains(substring2)) {
                this.i.deleteDatabase(String.valueOf(substring).concat(".db"));
                this.k.remove(substring2);
                this.j.remove(substring2);
                GellerDatabase.b(new File(this.i.getFilesDir(), deeb.a("geller", substring2)));
            }
        }
    }

    public final synchronized long b(String str) {
        Long l;
        l = this.j.get(str);
        if (l == null) {
            l = Long.valueOf(nativeCreateDatabase(c(str), str));
            if (l.longValue() != 0) {
                this.j.put(str, l);
            }
        }
        return l.longValue();
    }

    @dzsi
    public final synchronized GellerDatabase c(String str) {
        GellerDatabase gellerDatabase;
        gellerDatabase = this.k.get(str);
        if (gellerDatabase == null) {
            try {
                GellerDatabase gellerDatabase2 = new GellerDatabase(this.i, str, this.l);
                try {
                    this.k.put(str, gellerDatabase2);
                } catch (SQLiteException | IllegalStateException unused) {
                }
                gellerDatabase = gellerDatabase2;
            } catch (SQLiteException | IllegalStateException unused2) {
            }
        }
        return gellerDatabase;
    }

    public final void d(dsyl dsylVar) {
        if (h.contains(dsylVar)) {
            return;
        }
        this.m.get(dsylVar);
    }

    public final void e(String str, dsyl dsylVar, dsvx dsvxVar) {
        int a = dsvw.a(dsvxVar.b);
        if (a != 0 && a == 3) {
            return;
        }
        GellerDatabase c = c(str);
        if (c == null) {
            dsylVar.name();
        } else {
            c.a(dsylVar.name(), dsvxVar);
        }
    }

    public native void nativeCleanupAll(long j, long j2);

    public native void nativePropagateDeletion(long j, long j2, byte[] bArr);

    public native byte[] nativeReadAndClearUsage(long j, long j2, String str, String[] strArr);

    public native byte[] nativeReadElements(long j, long j2, String str, byte[] bArr, byte[] bArr2);

    public native String[] nativeReadMetadata(long j, long j2, String str, String str2);

    public native byte[] nativeReadSnapshot(long j, long j2, String[] strArr, int i);

    public native String[] nativeUpdate(long j, long j2, byte[] bArr);

    public native void nativeWrite(long j, long j2, String str, String[] strArr, long j3, byte[] bArr);
}

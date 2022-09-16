package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cma  reason: default package */
/* loaded from: classes2.dex */
public final class cma implements clt {
    private final File b;
    private final long c;
    private cgn e;
    private final cly d = new cly();
    private final cmi a = new cmi();

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public cma(File file, long j) {
        this.b = file;
        this.c = j;
    }

    private final synchronized cgn c() {
        if (this.e == null) {
            File file = this.b;
            long j = this.c;
            if (j <= 0) {
                throw new IllegalArgumentException("maxSize <= 0");
            }
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    cgn.f(file2, file3, false);
                }
            }
            cgn cgnVar = new cgn(file, j);
            if (cgnVar.b.exists()) {
                try {
                    cgnVar.d();
                    cgn.c(cgnVar.c);
                    Iterator it = cgnVar.g.values().iterator();
                    while (it.hasNext()) {
                        cgl cglVar = (cgl) it.next();
                        if (cglVar.f == null) {
                            for (int i = 0; i < cgnVar.d; i = 1) {
                                cgnVar.e += cglVar.b[0];
                            }
                        } else {
                            cglVar.f = null;
                            for (int i2 = 0; i2 < cgnVar.d; i2 = 1) {
                                cgn.c(cglVar.c());
                                cgn.c(cglVar.d());
                            }
                            it.remove();
                        }
                    }
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    String valueOf = String.valueOf(file);
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(message).length());
                    sb.append("DiskLruCache ");
                    sb.append(valueOf);
                    sb.append(" is corrupt: ");
                    sb.append(message);
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    cgnVar.close();
                    cgq.b(cgnVar.a);
                }
                this.e = cgnVar;
            }
            file.mkdirs();
            cgnVar = new cgn(file, j);
            cgnVar.e();
            this.e = cgnVar;
        }
        return this.e;
    }

    @Override // defpackage.clt
    public final File a(chy chyVar) {
        try {
            cgm a = c().a(this.a.a(chyVar));
            if (a == null) {
                return null;
            }
            return a.a[0];
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.clt
    public final void b(chy chyVar, cjp cjpVar) {
        clw clwVar;
        cly clyVar;
        cgn c;
        File d;
        String a = this.a.a(chyVar);
        cly clyVar2 = this.d;
        synchronized (clyVar2) {
            clwVar = (clw) clyVar2.a.get(a);
            if (clwVar == null) {
                clx clxVar = clyVar2.b;
                synchronized (clxVar.a) {
                    clwVar = (clw) clxVar.a.poll();
                }
                if (clwVar == null) {
                    clwVar = new clw();
                }
                clyVar2.a.put(a, clwVar);
            }
            clwVar.b++;
        }
        clwVar.a.lock();
        try {
            try {
                c = c();
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            if (c.a(a) == null) {
                cgk i = c.i(a);
                if (i == null) {
                    throw new IllegalStateException(a.length() != 0 ? "Had two simultaneous puts for: ".concat(a) : new String("Had two simultaneous puts for: "));
                }
                try {
                    synchronized (i.d) {
                        cgl cglVar = i.a;
                        if (cglVar.f == i) {
                            if (!cglVar.e) {
                                i.b[0] = true;
                            }
                            d = cglVar.d();
                            i.d.a.mkdirs();
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (cjpVar.a.a(cjpVar.b, d, cjpVar.c)) {
                        i.d.b(i, true);
                        i.c = true;
                    }
                    clyVar = this.d;
                    clyVar.a(a);
                } finally {
                    i.b();
                }
            }
            clyVar = this.d;
            clyVar.a(a);
        } catch (Throwable th) {
            this.d.a(a);
            throw th;
        }
    }
}

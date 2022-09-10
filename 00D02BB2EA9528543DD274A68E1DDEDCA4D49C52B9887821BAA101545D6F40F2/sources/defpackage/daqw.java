package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: daqw  reason: default package */
/* loaded from: classes5.dex */
public class daqw implements darz, dase, dask {
    static final Logger a = Logger.getLogger(daqw.class.getName());
    private final Lock b = new ReentrantLock();
    private final daua c;
    private String d;
    private Long e;
    private String f;
    private final String g;
    private final Collection<daqx> h;

    /* JADX INFO: Access modifiers changed from: protected */
    public daqw(daqv daqvVar) {
        darw darwVar = daqvVar.a;
        this.g = darwVar == null ? null : darwVar.c();
        this.h = Collections.unmodifiableCollection(daqvVar.c);
        this.c = daqvVar.b;
    }

    @Override // defpackage.dase
    public final void a(dasc dascVar) {
        dascVar.a = this;
        dascVar.j = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r5.d != null) goto L13;
     */
    @Override // defpackage.darz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.dasc r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.Lock r0 = r5.b
            r0.lock()
            java.util.concurrent.locks.Lock r0 = r5.b     // Catch: java.lang.Throwable -> L6b
            r0.lock()     // Catch: java.lang.Throwable -> L6b
            java.lang.Long r0 = r5.e     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L15
            java.util.concurrent.locks.Lock r0 = r5.b     // Catch: java.lang.Throwable -> L6b
            r0.unlock()     // Catch: java.lang.Throwable -> L6b
            r0 = 0
            goto L2a
        L15:
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L64
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L64
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L64
            java.util.concurrent.locks.Lock r1 = r5.b     // Catch: java.lang.Throwable -> L6b
            r1.unlock()     // Catch: java.lang.Throwable -> L6b
        L2a:
            java.lang.String r1 = r5.d     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L3a
            if (r0 == 0) goto L41
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L6b
            r2 = 60
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L41
        L3a:
            r5.d()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r5.d     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L5e
        L41:
            java.lang.String r0 = r5.d     // Catch: java.lang.Throwable -> L6b
            dasa r6 = r6.b     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = "Bearer "
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L56
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L6b
            goto L5b
        L56:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L6b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6b
        L5b:
            r6.i(r0)     // Catch: java.lang.Throwable -> L6b
        L5e:
            java.util.concurrent.locks.Lock r6 = r5.b
            r6.unlock()
            return
        L64:
            r6 = move-exception
            java.util.concurrent.locks.Lock r0 = r5.b     // Catch: java.lang.Throwable -> L6b
            r0.unlock()     // Catch: java.lang.Throwable -> L6b
            throw r6     // Catch: java.lang.Throwable -> L6b
        L6b:
            r6 = move-exception
            java.util.concurrent.locks.Lock r0 = r5.b
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daqw.b(dasc):void");
    }

    public daqw c(Long l) {
        g(l == null ? null : Long.valueOf(System.currentTimeMillis() + (l.longValue() * 1000)));
        return this;
    }

    public final boolean d() {
        this.b.lock();
        try {
            try {
            } catch (darb e) {
                int i = e.b;
                boolean z = i >= 400 && i < 500;
                if (e.a != null && z) {
                    f(null);
                    c(null);
                }
                for (daqx daqxVar : this.h) {
                    daqxVar.a();
                }
                if (z) {
                    throw e;
                }
            }
            if (this.f == null) {
                return false;
            }
            new daqy(new darw(this.g), this.f);
            throw null;
        } finally {
            this.b.unlock();
        }
    }

    @Override // defpackage.dask
    public final boolean e(dasc dascVar, dasf dasfVar) {
        boolean z;
        boolean z2;
        List<String> list = dasfVar.a().authenticate;
        boolean z3 = true;
        if (list != null) {
            for (String str : list) {
                if (str.startsWith("Bearer ")) {
                    z = daqu.a.matcher(str).find();
                    z2 = true;
                    break;
                }
            }
        }
        z = false;
        z2 = false;
        if (!z2) {
            z = dasfVar.c == 401;
        }
        if (z) {
            try {
                this.b.lock();
                String str2 = this.d;
                List<String> list2 = dascVar.b.authorization;
                String str3 = null;
                if (list2 != null) {
                    Iterator<String> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        if (next.startsWith("Bearer ")) {
                            str3 = next.substring(7);
                            break;
                        }
                    }
                }
                if (dbsd.a(str2, str3) && !d()) {
                    z3 = false;
                }
                this.b.unlock();
                return z3;
            } catch (IOException e) {
                a.logp(Level.SEVERE, "com.google.api.client.auth.oauth2.Credential", "handleResponse", "unable to refresh token", (Throwable) e);
            }
        }
        return false;
    }

    public void f(String str) {
        this.b.lock();
        try {
            this.d = str;
        } finally {
            this.b.unlock();
        }
    }

    public void g(Long l) {
        this.b.lock();
        try {
            this.e = l;
        } finally {
            this.b.unlock();
        }
    }
}

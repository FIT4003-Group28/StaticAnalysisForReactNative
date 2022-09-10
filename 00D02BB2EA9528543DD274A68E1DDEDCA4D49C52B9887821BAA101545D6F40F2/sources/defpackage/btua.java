package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: btua  reason: default package */
/* loaded from: classes4.dex */
public final class btua implements btue {
    static final long a = TimeUnit.SECONDS.toMillis(10);
    static final Set<String> b = dcnm.g();
    final ExecutorService c;
    public final AtomicBoolean d;
    private final Context e;
    private final cqat f;
    private final ckcw g;
    private final btlu h;
    private final String i;
    private final btrm j;
    private final btvo k;
    @dzsi
    private String l;
    private long m;
    private final Object n;

    public btua(Application application, cqat cqatVar, ckcw ckcwVar, btlu btluVar, String str, btrm btrmVar, btvo btvoVar) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.d = new AtomicBoolean(false);
        this.n = new Object();
        this.e = application;
        this.f = cqatVar;
        this.g = ckcwVar;
        this.h = btluVar;
        this.i = str;
        this.j = btrmVar;
        this.k = btvoVar;
        this.c = newSingleThreadExecutor;
    }

    @dzsi
    private final Integer m(TokenData tokenData) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f.b());
        Long l = tokenData.c;
        if (l == null) {
            return null;
        }
        return Integer.valueOf((int) TimeUnit.SECONDS.toMinutes(l.longValue() - seconds));
    }

    @dzsi
    private final String n() {
        String str = null;
        if (!btsj.d(this.e)) {
            try {
                str = h(true);
                if (str != null) {
                    l(5);
                }
            } catch (OperationCanceledException unused) {
                l(7);
            } catch (IOException unused2) {
                l(8);
            }
        }
        return str;
    }

    @Override // defpackage.btue
    @dzsi
    public final btlu a() {
        return this.h;
    }

    @Override // defpackage.btue
    @dzsi
    public final synchronized String b() {
        return this.l;
    }

    @Override // defpackage.btue
    public final synchronized void c(@dzsi String str) {
        this.m = 0L;
        AccountManager.get(this.e).invalidateAuthToken("com.google", str);
        b.remove(str);
    }

    @Override // defpackage.btue
    public final void d() {
        if (!this.d.getAndSet(true)) {
            this.c.submit(new bttz(this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r3 < 0) goto L33;
     */
    @Override // defpackage.btue
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e() {
        /*
            r7 = this;
            r0 = 1
            r7.l(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r0 = r7.n     // Catch: java.lang.Throwable -> Lb0
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = r7.i()     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto L14
            r2 = 2
            r7.l(r2)     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            goto Lac
        L14:
            r1 = 0
            btlu r2 = r7.h     // Catch: java.io.IOException -> L2a defpackage.cmra -> L30 defpackage.cmrl -> L43 java.lang.Throwable -> Lad
            android.accounts.Account r2 = r2.s()     // Catch: java.io.IOException -> L2a defpackage.cmra -> L30 defpackage.cmrl -> L43 java.lang.Throwable -> Lad
            java.lang.String r3 = r7.i     // Catch: java.io.IOException -> L2a defpackage.cmra -> L30 defpackage.cmrl -> L43 java.lang.Throwable -> Lad
            com.google.android.gms.auth.TokenData r1 = r7.g(r2, r3)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L47
            r2 = 3
            r7.l(r2)     // Catch: java.io.IOException -> L2a defpackage.cmra -> L30 defpackage.cmrl -> L43 java.lang.Throwable -> Lad
            goto L47
        L28:
            r2 = move-exception
            throw r2     // Catch: java.io.IOException -> L2a defpackage.cmra -> L30 defpackage.cmrl -> L43 java.lang.Throwable -> Lad
        L2a:
            r2 = 8
            r7.l(r2)     // Catch: java.lang.Throwable -> Lad
            goto L47
        L30:
            android.content.Context r2 = r7.e     // Catch: java.lang.Throwable -> Lad
            boolean r2 = defpackage.btsj.d(r2)     // Catch: java.lang.Throwable -> Lad
            if (r2 != 0) goto L3e
            r2 = 9
            r7.l(r2)     // Catch: java.lang.Throwable -> Lad
            goto L47
        L3e:
            r2 = 6
            r7.l(r2)     // Catch: java.lang.Throwable -> Lad
            goto L47
        L43:
            r2 = 4
            r7.l(r2)     // Catch: java.lang.Throwable -> Lad
        L47:
            if (r1 == 0) goto L8d
            java.lang.String r2 = r1.b     // Catch: java.lang.Throwable -> Lad
            btvo r3 = r7.k     // Catch: java.lang.Throwable -> Lad
            dixz r3 = r3.getNetworkParameters()     // Catch: java.lang.Throwable -> Lad
            boolean r3 = r3.j     // Catch: java.lang.Throwable -> Lad
            if (r3 == 0) goto L89
            java.lang.Long r1 = r1.c     // Catch: java.lang.Throwable -> Lad
            if (r1 != 0) goto L69
            ckcw r1 = r7.g     // Catch: java.lang.Throwable -> Lad
            ckgu r3 = defpackage.ckja.V     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r1 = r1.a(r3)     // Catch: java.lang.Throwable -> Lad
            ckcn r1 = (defpackage.ckcn) r1     // Catch: java.lang.Throwable -> Lad
            r1.a()     // Catch: java.lang.Throwable -> Lad
            long r3 = defpackage.btua.a     // Catch: java.lang.Throwable -> Lad
            goto L8b
        L69:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lad
            long r4 = r1.longValue()     // Catch: java.lang.Throwable -> Lad
            long r3 = r3.toMillis(r4)     // Catch: java.lang.Throwable -> Lad
            cqat r1 = r7.f     // Catch: java.lang.Throwable -> Lad
            long r5 = r1.b()     // Catch: java.lang.Throwable -> Lad
            long r3 = r3 - r5
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.Throwable -> Lad
            r5 = 10
            long r5 = r1.toMillis(r5)     // Catch: java.lang.Throwable -> Lad
            long r3 = r3 - r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L8b
        L89:
            long r3 = defpackage.btua.a     // Catch: java.lang.Throwable -> Lad
        L8b:
            r1 = r2
            goto L93
        L8d:
            java.lang.String r1 = r7.n()     // Catch: java.lang.Throwable -> Lad
            long r3 = defpackage.btua.a     // Catch: java.lang.Throwable -> Lad
        L93:
            if (r1 == 0) goto L9f
            cqat r2 = r7.f     // Catch: java.lang.Throwable -> Lad
            long r5 = r2.e()     // Catch: java.lang.Throwable -> Lad
            long r5 = r5 + r3
            r7.k(r1, r5)     // Catch: java.lang.Throwable -> Lad
        L9f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto Lac
            btrm r0 = r7.j     // Catch: java.lang.Throwable -> Lb0
            btuc r2 = new btuc     // Catch: java.lang.Throwable -> Lb0
            r2.<init>()     // Catch: java.lang.Throwable -> Lb0
            r0.b(r2)     // Catch: java.lang.Throwable -> Lb0
        Lac:
            return r1
        Lad:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            throw r1     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btua.e():java.lang.String");
    }

    @dzsi
    public final String f() {
        synchronized (this.n) {
            String i = i();
            if (i != null) {
                return i;
            }
            String h = h(false);
            if (h == null) {
                h = g(this.h.s(), this.i).b;
            }
            if (h != null) {
                k(h, this.f.e() + a);
            }
            if (h != null) {
                this.j.b(new btuc());
            }
            return h;
        }
    }

    final TokenData g(Account account, String str) {
        TokenData b2 = cmrb.b(this.e, account, str, null);
        Integer m = m(b2);
        if (m != null) {
            Set<String> set = b;
            if (set.add(b2.b)) {
                ((ckco) this.g.a(ckja.T)).a(m.intValue());
            }
            if (m.intValue() < 10) {
                cmrb.c(this.e, b2.b);
                set.remove(b2.b);
                ((ckcn) this.g.a(ckja.W)).a();
                b2 = cmrb.b(this.e, account, str, null);
                Integer m2 = m(b2);
                if (m2 != null) {
                    ((ckco) this.g.a(ckja.U)).a(m2.intValue());
                }
            }
        }
        return b2;
    }

    @dzsi
    final String h(boolean z) {
        try {
            return AccountManager.get(this.e).blockingGetAuthToken(this.h.s(), this.i, z);
        } catch (AuthenticatorException unused) {
            return null;
        }
    }

    @Override // defpackage.btue
    @dzsi
    public final synchronized String i() {
        if (j()) {
            return null;
        }
        return this.l;
    }

    final synchronized boolean j() {
        return this.m <= this.f.e();
    }

    final synchronized void k(String str, long j) {
        this.l = str;
        this.m = j;
    }

    final void l(int i) {
        ((ckco) this.g.a(ckja.J)).a(i);
    }
}

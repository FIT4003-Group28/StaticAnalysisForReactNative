package defpackage;

import com.google.android.apps.gmm.map.internal.store.diskcache.NativeSqliteDiskCacheImpl;
import java.io.File;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amda  reason: default package */
/* loaded from: classes.dex */
public final class amda {
    public static final dcqe a = dcqe.c("amda");
    static final long b = TimeUnit.SECONDS.toMillis(30);
    static final long c = TimeUnit.SECONDS.toMillis(1);
    public final amcw d;
    public final ckcw e;
    private final File g;
    private final dehq h;
    private final cqat i;
    private final aluj m;
    public boolean f = false;
    private boolean j = false;
    private long k = 0;
    private long l = 0;

    public amda(amcw amcwVar, File file, ckcw ckcwVar, dehq dehqVar, cqat cqatVar, aluj alujVar) {
        this.d = amcwVar;
        this.g = file;
        this.e = ckcwVar;
        this.h = dehqVar;
        this.i = cqatVar;
        this.m = alujVar;
        amcwVar.x(alujVar.a.sh().e);
    }

    public static amda p(File file, File file2, ckcw ckcwVar, dehq dehqVar, cqat cqatVar, aluj alujVar) {
        if ((!file.exists() && !file.mkdirs()) || (!file2.exists() && !file2.mkdirs())) {
            ((ckcn) ckcwVar.a(ckev.j)).a();
            if (file.getParentFile() == null || file.getParentFile().getFreeSpace() > 4096) {
                ((ckco) ckcwVar.a(ckev.k)).a(7946);
            } else {
                ((ckco) ckcwVar.a(ckev.k)).a(7949);
            }
            throw new amcx();
        }
        file.getPath();
        file2.getPath();
        try {
            amda amdaVar = new amda(NativeSqliteDiskCacheImpl.y(file, file2), file, ckcwVar, dehqVar, cqatVar, alujVar);
            ((ckco) ckcwVar.a(ckev.k)).a(0);
            return amdaVar;
        } catch (amcx e) {
            ((ckcn) ckcwVar.a(ckev.j)).a();
            ((ckco) ckcwVar.a(ckev.k)).a(e.a);
            throw e;
        }
    }

    private static void q(ckco ckcoVar, akry akryVar, int i) {
        int i2 = akryVar.I.Z;
        for (int i3 = 0; i3 < i; i3++) {
            ckcoVar.a(i2);
        }
    }

    private static void r(ckcn ckcnVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ckcnVar.a();
        }
    }

    private final void s() {
        try {
            amyp u = this.d.u();
            r((ckcn) this.e.a(ckev.g), u.d);
            r((ckcn) this.e.a(ckev.h), u.e);
            r((ckcn) this.e.a(ckev.i), u.c);
            if ((u.a & 64) != 0) {
                ((ckcp) this.e.a(ckev.x)).a(u.f);
            }
            if ((u.a & 128) != 0) {
                ((ckcp) this.e.a(ckev.y)).a(u.g);
            }
            if ((u.a & 256) != 0) {
                ((ckcp) this.e.a(ckev.z)).a(u.h);
            }
            for (amyr amyrVar : u.b) {
                akry akryVar = akry.G.get(amyrVar.a);
                if (akryVar == null) {
                    bvoo.h("Disk cache reported stats for an unknown pipe name '%s'", amyrVar.a);
                } else {
                    q((ckco) this.e.a(ckev.d), akryVar, amyrVar.d);
                    q((ckco) this.e.a(ckev.e), akryVar, amyrVar.e);
                    q((ckco) this.e.a(ckev.a), akryVar, amyrVar.b);
                    q((ckco) this.e.a(ckev.c), akryVar, amyrVar.c);
                }
            }
        } catch (amcx unused) {
        }
    }

    public final synchronized void b() {
        this.j = true;
    }

    public final boolean c(amyv amyvVar) {
        try {
            return this.d.c(amyvVar);
        } catch (amcx e) {
            o(e);
            throw e;
        }
    }

    @dzsi
    public final amyt d(amyv amyvVar) {
        ckcq a2 = ((ckcr) this.e.a(ckev.s)).a();
        try {
            amyt d = this.d.d(amyvVar);
            if (d != null) {
                a2.b();
            }
            return d;
        } catch (amcx e) {
            o(e);
            throw e;
        }
    }

    public final void f(amyx amyxVar, byte[] bArr) {
        ckcq a2 = ((ckcr) this.e.a(ckev.u)).a();
        try {
            this.d.e(amyxVar, bArr);
            n();
            a2.b();
        } catch (amcx e) {
            o(e);
            throw e;
        }
    }

    @dzsi
    public final amzc g(amza amzaVar) {
        ckcq a2 = ((ckcr) this.e.a(ckev.t)).a();
        try {
            amzc h = this.d.h(amzaVar);
            if (h != null) {
                a2.b();
            }
            return h;
        } catch (amcx e) {
            o(e);
            throw e;
        }
    }

    @dzsi
    public final amze h(amza amzaVar) {
        try {
            return this.d.i(amzaVar);
        } catch (amcx e) {
            o(e);
            throw e;
        }
    }

    public final long l() {
        try {
            return this.d.q();
        } catch (amcx e) {
            o(e);
            bvoo.h("Failed to get database size %s", e);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(long r21, final long r23) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amda.m(long, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void n() {
        if (this.j && !this.f && this.i.e() - this.k >= b) {
            this.k = this.i.e();
            final long l = l();
            double freeSpace = this.g.getFreeSpace() + l;
            double d = this.m.a.sh().b;
            Double.isNaN(freeSpace);
            long j = (long) (freeSpace * d);
            long j2 = this.m.a.sh().a;
            if (j2 > 0) {
                j = Math.min(j2, j);
            }
            if (l < j) {
                return;
            }
            this.f = true;
            this.k = this.i.e();
            this.l = 0L;
            final long j3 = j;
            this.h.execute(new Runnable(this, l, j3) { // from class: amcz
                private final amda a;
                private final long b;
                private final long c;

                {
                    this.a = this;
                    this.b = l;
                    this.c = j3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.m(this.b, this.c);
                }
            });
        }
    }

    public final void o(amcx amcxVar) {
        s();
        Throwable cause = amcxVar.getCause();
        if (cause instanceof anam) {
            anam anamVar = (anam) cause;
            if (!drtc.INVALID_ARGUMENT.equals(anamVar.a) && !drtc.INTERNAL.equals(anamVar.a)) {
                return;
            }
            bvoo.f(anamVar);
        }
    }

    public final void a(int i) {
        try {
            this.d.b(i);
        } catch (amcx e) {
            o(e);
            throw e;
        }
    }

    public final void e(amyv amyvVar) {
        try {
            this.d.f(amyvVar);
        } catch (amcx e) {
            o(e);
            throw e;
        }
    }

    public final void i(amze amzeVar) {
        try {
            this.d.l(amzeVar);
        } catch (amcx e) {
            o(e);
            throw e;
        }
    }

    public final void j(amze amzeVar) {
        try {
            this.d.m(amzeVar);
        } catch (amcx e) {
            o(e);
            throw e;
        }
    }

    public final void k(amza amzaVar) {
        try {
            this.d.n(amzaVar);
        } catch (amcx e) {
            o(e);
            throw e;
        }
    }
}

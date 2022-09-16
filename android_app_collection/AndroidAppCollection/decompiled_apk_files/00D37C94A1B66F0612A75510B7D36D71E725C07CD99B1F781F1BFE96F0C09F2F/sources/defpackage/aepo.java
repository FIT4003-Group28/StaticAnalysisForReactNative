package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aepo  reason: default package */
/* loaded from: classes.dex */
public final class aepo implements aepl {
    private final aant b;
    private final aadd c;
    private final aepv d;
    private long f;
    private aepy g;
    private long i;
    private apmv j;
    private long k;
    private long l;
    private int m;
    private aepy h = aepy.u;
    private int n = 0;
    private long e = -1;
    private final awv a = new awv();

    public aepo(aant aantVar, aepv aepvVar, aadd aaddVar) {
        this.b = aantVar;
        this.c = aaddVar;
        this.d = aepvVar;
    }

    private final aepy l() {
        if (this.i <= 0 || SystemClock.elapsedRealtime() - this.i >= 900000) {
            this.i = SystemClock.elapsedRealtime();
            arhd a = this.c.a();
            if (a != null) {
                atdy atdyVar = a.i;
                if (atdyVar == null) {
                    atdyVar = atdy.a;
                }
                apmv apmvVar = atdyVar.e;
                if (apmvVar == null) {
                    apmvVar = apmv.a;
                }
                if ((apmvVar.b & 2) != 0) {
                    atdy atdyVar2 = a.i;
                    if (atdyVar2 == null) {
                        atdyVar2 = atdy.a;
                    }
                    apmv apmvVar2 = atdyVar2.e;
                    if (apmvVar2 == null) {
                        apmvVar2 = apmv.a;
                    }
                    if (!apmvVar2.equals(this.j)) {
                        this.h = i(true);
                        atdy atdyVar3 = a.i;
                        if (atdyVar3 == null) {
                            atdyVar3 = atdy.a;
                        }
                        apmv apmvVar3 = atdyVar3.e;
                        if (apmvVar3 == null) {
                            apmvVar3 = apmv.a;
                        }
                        this.j = apmvVar3;
                        aepv aepvVar = this.d;
                        if (aepvVar != null) {
                            j(aepvVar.a(), this.h);
                        }
                    }
                }
            }
            this.h = aepy.u;
        }
        return this.h;
    }

    private final aepy q() {
        Class cls;
        if (this.g != null) {
            int be = this.b.get().be(2) - 1;
            if (be == 2) {
                cls = aeqa.class;
            } else if (be != 3) {
                cls = be != 4 ? aeps.class : aepn.class;
            } else {
                cls = aepw.class;
            }
            if (cls.isInstance(this.g)) {
                return this.g;
            }
        }
        this.g = i(false);
        aepv aepvVar = this.d;
        if (aepvVar != null) {
            j(aepvVar.a(), this.g);
        }
        return this.g;
    }

    private final void r(int i, long j, long j2) {
        this.a.b(i, j, j2);
    }

    private final void s() {
        float b = this.g.b();
        long j = -1;
        this.e = Float.isNaN(b) ? -1L : b;
        float b2 = this.h.b();
        if (!Float.isNaN(b2)) {
            j = b2;
        }
        this.f = j;
    }

    @Override // defpackage.atk
    public final synchronized void a(asv asvVar, asy asyVar, boolean z, int i) {
        this.k += i;
    }

    @Override // defpackage.atk
    public final synchronized void b(asv asvVar, asy asyVar, boolean z) {
        ptx.e(this.m > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.l);
        if (i > 0) {
            long j = this.k;
            if (j >= this.n) {
                long j2 = (j * 8000) / i;
                float f = (float) j2;
                q().f(f);
                l().f(f);
                s();
                r(i, this.k, this.e);
                aepv aepvVar = this.d;
                if (aepvVar != null) {
                    aepvVar.b(this.k, j2);
                }
            }
        }
        int i2 = this.m - 1;
        this.m = i2;
        if (i2 > 0) {
            this.l = elapsedRealtime;
        }
        this.k = 0L;
    }

    @Override // defpackage.atk
    public final void c(asv asvVar, asy asyVar, boolean z) {
    }

    @Override // defpackage.atk
    public final synchronized void d(asv asvVar, asy asyVar, boolean z) {
        PlayerConfigModel playerConfigModel = this.b.get();
        if (playerConfigModel != null) {
            this.n = playerConfigModel.l();
        }
        if (this.m == 0) {
            this.l = SystemClock.elapsedRealtime();
        }
        this.m++;
    }

    @Override // defpackage.awx
    public final synchronized long e() {
        return this.e;
    }

    @Override // defpackage.awx
    public final void f(Handler handler, aww awwVar) {
        this.a.a(handler, awwVar);
    }

    @Override // defpackage.awx
    public final void g(aww awwVar) {
        this.a.c(awwVar);
    }

    @Override // defpackage.aepl
    public final synchronized long h() {
        return this.f;
    }

    protected final aepy i(boolean z) {
        PlayerConfigModel playerConfigModel = this.b.get();
        int be = playerConfigModel.be(2) - 1;
        if (be == 2) {
            return new aeqa(playerConfigModel.bd(), playerConfigModel.bc());
        }
        if (be != 3) {
            if (be == 4) {
                return new aepn(playerConfigModel.bd(), playerConfigModel.bc());
            }
            if (be != 5) {
                return new aeps(playerConfigModel.bd(), playerConfigModel.bc());
            }
        }
        aepw k = aepw.k(this.c, z);
        return k != null ? k : new aeps(12, 0.5f);
    }

    protected final void j(List list, aepy aepyVar) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aepyVar.f((float) ((Long) it.next()).longValue());
            }
            s();
        }
    }

    @Override // defpackage.aepl
    public final void k() {
        aepy aepyVar = this.g;
        if (aepyVar != null) {
            aepyVar.h();
        }
        this.h.h();
    }

    @Override // defpackage.aepl
    public final void m(long j) {
        float f = (float) j;
        q().f(f);
        l().f(f);
        aepv aepvVar = this.d;
        if (aepvVar != null) {
            aepvVar.b(1L, j);
        }
        s();
        r(0, 0L, this.e);
    }

    @Override // defpackage.aepl
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.aepl
    public final /* synthetic */ void o(PlayerConfigModel playerConfigModel) {
    }

    @Override // defpackage.aepl
    public final /* synthetic */ int p() {
        return 1;
    }
}

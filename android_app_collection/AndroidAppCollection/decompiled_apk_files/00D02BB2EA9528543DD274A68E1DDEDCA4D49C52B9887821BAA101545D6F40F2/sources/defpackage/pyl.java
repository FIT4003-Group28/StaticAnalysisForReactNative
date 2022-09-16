package defpackage;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pyl  reason: default package */
/* loaded from: classes7.dex */
public final class pyl implements degu<dbsg<amte>> {
    static final long a = TimeUnit.MINUTES.toMillis(30);
    public final prx b;
    public final cqat c;
    public final btvo d;
    public final Executor e;
    public final xlu f;
    public final xkl g;
    public long h;
    @dzsi
    private pyk l;
    private final pyj k = new pyj(this);
    public long i = 0;
    private long m = 0;
    public boolean j = false;

    public pyl(cqat cqatVar, btvo btvoVar, bvrb bvrbVar, xlu xluVar, xkl xklVar, prx prxVar) {
        this.c = cqatVar;
        this.d = btvoVar;
        this.f = xluVar;
        this.g = xklVar;
        this.b = prxVar;
        this.h = f(xluVar, btvoVar);
        this.e = bvrbVar.h();
    }

    public static long f(xlu xluVar, btvo btvoVar) {
        if (xluVar.c()) {
            return btvoVar.getTransitPagesParameters().s;
        }
        return TimeUnit.SECONDS.toMillis(btvoVar.getDirectionsPageParameters().a);
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!(th instanceof qdw)) {
            try {
                bvoo.f(th);
            } catch (Throwable th2) {
                throw new RuntimeException(th2);
            }
        }
        long j = a;
        long j2 = this.h;
        this.h = Math.min(j, j2 + j2);
        this.k.d();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dbsg<amte> dbsgVar) {
        Long valueOf;
        dbsg<amte> dbsgVar2 = dbsgVar;
        long f = f(this.f, this.d);
        if (!dbsgVar2.a()) {
            long j = a;
            long j2 = this.h;
            f = Math.min(j, j2 + j2);
        } else if (!this.f.c()) {
            amve[] amveVarArr = dbsgVar2.b().a.d;
            int length = amveVarArr.length;
            long j3 = 0;
            loop0: for (int i = 0; i < length; i++) {
                amtr[] amtrVarArr = amveVarArr[i].b;
                int length2 = amtrVarArr.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    amtr amtrVar = amtrVarArr[i2];
                    int i3 = 0;
                    while (i3 < amtrVar.e()) {
                        amuq d = amtrVar.d(i3);
                        dpgw dpgwVar = d.g().c;
                        if (dpgwVar == null) {
                            dpgwVar = dpgw.r;
                        }
                        dpbw b = dpbw.b(dpgwVar.p);
                        if (b == null) {
                            b = dpbw.UNKNOWN;
                        }
                        if (b == dpbw.UNKNOWN) {
                            Iterator<doyp> it = d.h().b.iterator();
                            amtr[] amtrVarArr2 = amtrVarArr;
                            long j4 = 0;
                            while (it.hasNext()) {
                                amve[] amveVarArr2 = amveVarArr;
                                doyp next = it.next();
                                int i4 = length;
                                dpbw b2 = dpbw.b(next.c);
                                if (b2 == null) {
                                    b2 = dpbw.UNKNOWN;
                                }
                                Iterator<doyp> it2 = it;
                                if (b2 == dpbw.UNKNOWN) {
                                    dgaw dgawVar = next.b;
                                    if (dgawVar == null) {
                                        dgawVar = dgaw.g;
                                    }
                                    j4 = Math.max(j4, dgawVar.b);
                                    length = i4;
                                    amveVarArr = amveVarArr2;
                                    it = it2;
                                }
                            }
                            amve[] amveVarArr3 = amveVarArr;
                            int i5 = length;
                            if (j3 == 0 || j4 < j3) {
                                j3 = j4;
                            }
                            i3++;
                            amtrVarArr = amtrVarArr2;
                            length = i5;
                            amveVarArr = amveVarArr3;
                        }
                        valueOf = null;
                    }
                }
            }
            valueOf = Long.valueOf(j3);
            if (valueOf != null) {
                f = valueOf.longValue() == 0 ? 0L : Math.max(TimeUnit.SECONDS.toMillis(valueOf.longValue() - 60) - this.c.b(), f);
            }
        }
        e(f);
    }

    public final synchronized void c(vnu vnuVar, qbs qbsVar, boolean z) {
        if (vnuVar.a() == dqvj.TRANSIT && vnuVar.d().t()) {
            qbs qbsVar2 = qbs.DEFAULT;
            int ordinal = qbsVar.ordinal();
            if ((ordinal == 0 || ordinal == 2) && !z) {
                pyk pykVar = new pyk(qbsVar, vnuVar);
                pyk pykVar2 = this.l;
                boolean z2 = false;
                if (pykVar2 != null && (pykVar2.a != pykVar.a || pykVar2.b != pykVar.b)) {
                    z2 = true;
                }
                if (this.c.b() - this.i <= f(this.f, this.d) && !z2) {
                    this.k.b();
                    this.l = pykVar;
                    return;
                }
                if (this.l == null || z2) {
                    this.j = true;
                }
                this.k.a();
                this.l = pykVar;
                return;
            }
        }
        d();
    }

    public final synchronized void d() {
        this.k.c();
        this.b.e.c();
        long j = this.m;
        if (j < this.i) {
            this.i = j;
        }
    }

    public final void e(long j) {
        if (j == 0) {
            this.k.c();
        } else if (this.h != j) {
            this.h = j;
            this.k.d();
        }
        this.m = this.c.b();
    }
}

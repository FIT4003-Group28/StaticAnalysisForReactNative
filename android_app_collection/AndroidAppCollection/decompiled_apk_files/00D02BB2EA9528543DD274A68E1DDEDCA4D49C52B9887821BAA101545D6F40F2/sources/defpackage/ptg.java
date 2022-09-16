package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ptg  reason: default package */
/* loaded from: classes7.dex */
public final class ptg extends itb {
    public final gga a;
    public final Application b;
    public final eeu c;
    public final dxio<ahjq> d;
    public final cqat e;
    public final bvjj f;
    public final btvo g;
    public final dxio<qbt> h;
    private final crfm i;
    private final Executor j;
    private final Executor k;
    private final cjqy o;
    private final asik p;
    private final vyy q = new ptf(this);

    public ptg(Application application, gga ggaVar, eeu eeuVar, dxio<ahjq> dxioVar, Executor executor, Executor executor2, cqat cqatVar, bvjj bvjjVar, btvo btvoVar, cjqy cjqyVar, dxio<qbt> dxioVar2, crfm crfmVar, asik asikVar) {
        this.a = ggaVar;
        this.c = eeuVar;
        this.d = dxioVar;
        this.i = crfmVar;
        this.b = application;
        this.j = executor;
        this.k = executor2;
        this.e = cqatVar;
        this.f = bvjjVar;
        this.g = btvoVar;
        this.o = cjqyVar;
        this.h = dxioVar2;
        this.p = asikVar;
    }

    public static long i(bvjj bvjjVar) {
        return Math.max(bvjjVar.w(bvjk.eb, 0L), bvjjVar.w(bvjk.ec, 0L));
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        if (e()) {
            bvjj bvjjVar = this.f;
            if (bvjjVar.w(bvjk.ea, 0L) <= i(bvjjVar)) {
                return;
            }
            vyz.c(this.b, this.j, this.k, this.q);
        }
    }

    public final boolean e() {
        return !this.p.a() && !this.c.c() && this.i.e() != arym.GUIDED_NAV;
    }

    public final void f(ddda dddaVar) {
        cjqy cjqyVar = this.o;
        cjsx i = cjsy.i();
        i.b(dddaVar);
        cjqyVar.k(i.a());
    }
}

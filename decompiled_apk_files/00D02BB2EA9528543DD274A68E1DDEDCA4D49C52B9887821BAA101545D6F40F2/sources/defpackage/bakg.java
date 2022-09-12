package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bakg  reason: default package */
/* loaded from: classes3.dex */
public final class bakg implements akfd {
    public final gga a;
    public final dxio<afwt> b;
    private final dxio<axwq> c;
    private final Executor d;
    private final dehq e;

    public bakg(gga ggaVar, dxio<axwq> dxioVar, dxio<afwt> dxioVar2, Executor executor, dehq dehqVar) {
        this.a = ggaVar;
        this.c = dxioVar;
        this.b = dxioVar2;
        this.d = executor;
        this.e = dehqVar;
    }

    @Override // defpackage.akfd
    public final dehn<Boolean> a(@dzsi String str) {
        bvrj.UI_THREAD.c();
        boolean d = dbsj.d(str);
        dehn<Boolean> h = deew.h(deee.g(degp.q(this.c.a().j()).r(5L, TimeUnit.SECONDS, this.e), axxc.class, bakd.a, dege.a), bake.a, dege.a);
        deha.q(h, new bakf(this, d, str), this.d);
        return h;
    }
}

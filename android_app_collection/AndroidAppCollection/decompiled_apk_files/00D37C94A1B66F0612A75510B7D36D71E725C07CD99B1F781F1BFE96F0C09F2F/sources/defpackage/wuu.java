package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wuu  reason: default package */
/* loaded from: classes4.dex */
public final class wuu implements wuw, wlq {
    public final xdu a;
    public final xdb b;
    public final Executor c;
    public final wvh e;
    private final wuv f;
    private final ajbf g;
    private final yni h;
    private final aadd i;
    private final wun j;
    private final wnp l;
    public boolean d = false;
    private boolean k = false;

    public wuu(wuv wuvVar, aadd aaddVar, wnp wnpVar, wvh wvhVar, xdu xduVar, yni yniVar, Executor executor, wun wunVar) {
        this.f = wuvVar;
        this.i = aaddVar;
        this.l = wnpVar;
        this.e = wvhVar;
        this.a = xduVar;
        this.g = (ajbf) xduVar.d(xbw.class);
        this.b = (xdb) xduVar.d(xao.class);
        this.h = yniVar;
        this.c = executor;
        this.j = wunVar;
    }

    @Override // defpackage.wuw
    public final void a() {
        this.d = true;
        if (!xrz.d(this.i) || !this.j.k().contains(this.a.a)) {
            try {
                wnp wnpVar = this.l;
                ajbf ajbfVar = this.g;
                if (ajbfVar == null) {
                    throw new wlb("VideoPlayback wasn't available when trying to request interrupt");
                }
                ajfa g = ajbfVar.g();
                if (g != null) {
                    if (wnpVar.a != null) {
                        throw new wlb("Tried to enter PlayerBytesSlot when interrupt already acquired");
                    }
                    g.c(new wno(wnpVar, this));
                } else {
                    throw new wlb("VideoInterrupt.Controller wasn't available when trying to request interrupt");
                }
            } catch (wlb e) {
                this.f.j(this.a, new wuq(e.toString()));
                return;
            }
        } else {
            this.d = false;
            this.f.h(this.a);
        }
        if (this.b != xdb.PRE_ROLL) {
            this.h.d(new wxu());
        }
        if (!xrz.d(this.i) || !this.j.k().contains(this.a.a)) {
            this.h.d(new wxw());
        }
    }

    @Override // defpackage.wuw
    public final void b() {
        this.h.d(new wxt());
        if (this.d) {
            this.k = true;
            this.f.k(this.a);
            return;
        }
        this.k = false;
        this.f.k(this.a);
        this.l.a();
    }

    public final void c() {
        this.d = false;
        if (this.k) {
            this.l.a();
            return;
        }
        this.h.d(new wxv());
        this.f.h(this.a);
    }

    @Override // defpackage.wlq
    public final /* synthetic */ void i() {
    }
}

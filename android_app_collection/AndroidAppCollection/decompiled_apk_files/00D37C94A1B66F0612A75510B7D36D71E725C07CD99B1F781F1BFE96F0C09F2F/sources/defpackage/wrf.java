package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wrf  reason: default package */
/* loaded from: classes4.dex */
public final class wrf implements wri, wlx {
    private final wkn a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final azqb i;
    private final azqb j;
    private final azqb k;
    private final aiji l;
    private final Executor m;
    private final yni n;
    private final wwf o;
    private wlw p;

    public wrf(wkn wknVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, wlw wlwVar, aiji aijiVar, Executor executor, yni yniVar, wwf wwfVar) {
        this.a = wknVar;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.e = azqbVar4;
        this.g = azqbVar6;
        this.h = azqbVar7;
        this.i = azqbVar8;
        this.j = azqbVar9;
        this.k = azqbVar10;
        this.f = azqbVar5;
        this.p = wlwVar;
        this.l = aijiVar;
        this.m = executor;
        this.n = yniVar;
        this.o = wwfVar;
    }

    @Override // defpackage.wri
    public final wqg a(wqf wqfVar, xdu xduVar, xci xciVar) {
        if (wwf.e(wqe.class, xduVar, xciVar)) {
            return new wqe((wqf) this.b.get(), (aadd) this.d.get(), this.a, (wzx) this.f.get(), (wxc) this.c.get(), (wmv) this.j.get(), (wlh) this.e.get(), this.n, this.m, this.l, (wmt) this.k.get(), (xgp) this.i.get(), this.p, (wll) this.g.get(), (wne) this.h.get(), xduVar, xciVar);
        }
        if (wwf.e(wqi.class, xduVar, xciVar)) {
            return new wqi((wqf) this.b.get(), this.m, (xgp) this.i.get(), xduVar, xciVar);
        }
        if (wwf.e(wqa.class, xduVar, xciVar)) {
            if (this.p != wlw.b) {
                return new wqa((wqf) this.b.get(), (wxc) this.c.get(), this.p, (wll) this.g.get(), (wmt) this.k.get(), (wmv) this.j.get(), this.l, xduVar, xciVar);
            }
            throw new wrh("No-op cta overlay api set when trying to build discovery InPlayer LRA");
        } else if (wwf.e(wpz.class, xduVar, xciVar)) {
            return new wpz((wqf) this.b.get(), (xgp) this.i.get(), (wmt) this.k.get(), this.m, xduVar, xciVar);
        } else {
            throw new wrh("InPlayerLayoutRenderingAdapterFactory received unrecognized slot/layout pairing");
        }
    }

    @Override // defpackage.wlx
    public final void b(wlw wlwVar) {
        if (wlwVar == null) {
            wwf.a(null, "Received null CtaOverlayApi for registration request");
        } else {
            this.p = wlwVar;
        }
    }

    @Override // defpackage.wlx
    public final void c() {
        this.p = wlw.b;
    }
}

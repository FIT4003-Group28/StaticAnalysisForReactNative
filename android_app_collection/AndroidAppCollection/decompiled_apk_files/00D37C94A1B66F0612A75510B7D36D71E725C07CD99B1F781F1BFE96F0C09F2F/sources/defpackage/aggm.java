package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aggm  reason: default package */
/* loaded from: classes.dex */
public final class aggm implements wpm {
    private final azqb a;
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
    private final azqb l;
    private final azqb m;
    private final azqb n;
    private final azqb o;
    private final azqb p;
    private final azqb q;
    private final Executor r;
    private final Executor s;

    public aggm(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14, azqb azqbVar15, azqb azqbVar16, azqb azqbVar17, Executor executor, Executor executor2) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = azqbVar7;
        this.h = azqbVar8;
        this.i = azqbVar9;
        this.j = azqbVar10;
        this.k = azqbVar11;
        this.l = azqbVar12;
        this.m = azqbVar13;
        this.n = azqbVar14;
        this.o = azqbVar15;
        this.p = azqbVar16;
        this.q = azqbVar17;
        this.r = executor2;
        this.s = executor;
    }

    @Override // defpackage.wpm
    public final wok a(xdu xduVar) {
        if (((wkn) this.a.get()).k) {
            if (wwf.d(wpf.class, xduVar)) {
                return new wpf(new woo((woj) this.d.get(), xduVar));
            }
            throw new wpl("Unable to build PlayerBytesEmptyFulfillmentAdapter despite ads being blocked");
        } else if (wwf.d(wpe.class, xduVar)) {
            return new wpe(new woo((woj) this.d.get(), xduVar));
        } else {
            if (wwf.d(wpi.class, xduVar)) {
                return new wpi(new woo((woj) this.d.get(), xduVar), this.r, this.s, (aadd) this.h.get(), (wlc) this.b.get(), (ahiu) this.c.get(), (wwa) this.f.get(), (wvx) this.e.get(), (wkn) this.a.get(), (wtg) this.i.get(), (wtq) this.j.get(), (snc) this.p.get());
            }
            if (wwf.d(wpd.class, xduVar)) {
                return new wpd(new woo((woj) this.d.get(), xduVar), this.r, this.s, (wlc) this.b.get(), (ahiu) this.c.get(), (wkn) this.a.get(), (wvx) this.e.get(), (wwa) this.f.get(), (wul) this.g.get(), (wtg) this.i.get(), (aadd) this.h.get(), (snc) this.p.get());
            }
            if (wwf.d(aggl.class, xduVar)) {
                return new aggl(new woo((woj) this.d.get(), xduVar), (aggh) this.k.get(), (wvx) this.e.get(), (wtg) this.i.get(), (wwz) this.l.get(), new acwm((afwu) this.m.get(), (afzo) this.n.get(), "adtracking"), (aanz) this.o.get(), (snc) this.p.get(), this.r, this.s, (agkp) this.q.get());
            }
            throw new wpl("No supported adapters for PlayerBytesFulfillmentAdapterFactory");
        }
    }
}

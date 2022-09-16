package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wpq  reason: default package */
/* loaded from: classes4.dex */
public final class wpq implements wpm {
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
    private final Executor l;
    private final Executor m;

    public wpq(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, Executor executor, Executor executor2) {
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
        this.l = executor2;
        this.m = executor;
    }

    @Override // defpackage.wpm
    public final wok a(xdu xduVar) {
        if (wwf.d(wpe.class, xduVar)) {
            return new wpe(new woo((woj) this.d.get(), xduVar));
        }
        if (wwf.d(wpi.class, xduVar)) {
            return new wpi(new woo((woj) this.d.get(), xduVar), this.l, this.m, (aadd) this.h.get(), (wlc) this.b.get(), (ahiu) this.c.get(), (wwa) this.f.get(), (wvx) this.e.get(), (wkn) ((axov) this.a).a, (wtg) this.i.get(), (wtq) this.j.get(), (snc) this.k.get());
        }
        if (wwf.d(wpd.class, xduVar)) {
            return new wpd(new woo((woj) this.d.get(), xduVar), this.l, this.m, (wlc) this.b.get(), (ahiu) this.c.get(), (wkn) ((axov) this.a).a, (wvx) this.e.get(), (wwa) this.f.get(), (wul) this.g.get(), (wtg) this.i.get(), (aadd) this.h.get(), (snc) this.k.get());
        }
        throw new wpl("No supported adapters for PlayerBytesFulfillmentAdapterFactory");
    }
}

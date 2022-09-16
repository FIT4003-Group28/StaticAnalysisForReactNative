package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wrd  reason: default package */
/* loaded from: classes4.dex */
public final class wrd implements wri {
    private final azqb a;
    private final azqb b;
    private final Executor c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final azqb g;

    public wrd(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, Executor executor) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = executor;
        this.d = azqbVar3;
        this.e = azqbVar4;
        this.f = azqbVar5;
        this.g = azqbVar6;
    }

    @Override // defpackage.wri
    public final wqg a(wqf wqfVar, xdu xduVar, xci xciVar) {
        if (wwf.e(wqk.class, xduVar, xciVar)) {
            return new wqk((wqf) this.a.get(), (wzx) this.b.get(), (xgp) this.d.get(), this.c, (wll) this.e.get(), (wmt) this.f.get(), (adwd) this.g.get(), xduVar, xciVar);
        }
        throw new wrh("FixedFooterLayoutRenderingAdapterFactory received unrecognized slot/layout pairing");
    }
}

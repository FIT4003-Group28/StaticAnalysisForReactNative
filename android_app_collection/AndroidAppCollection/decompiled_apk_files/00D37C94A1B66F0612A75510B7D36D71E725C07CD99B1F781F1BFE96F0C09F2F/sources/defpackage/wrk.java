package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wrk  reason: default package */
/* loaded from: classes4.dex */
public final class wrk implements wri {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final Executor e;

    public wrk(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, Executor executor) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = executor;
    }

    @Override // defpackage.wri
    public final wqg a(wqf wqfVar, xdu xduVar, xci xciVar) {
        if (wwf.e(wqo.class, xduVar, xciVar)) {
            return new wqo((wqf) this.a.get(), this.e, (wzx) this.b.get(), (wll) this.c.get(), (wly) this.d.get(), xduVar, xciVar);
        }
        if (wwf.e(wqm.class, xduVar, xciVar)) {
            return new wqm((wqf) this.a.get(), this.e, (wzx) this.b.get(), (wll) this.c.get(), (wly) this.d.get(), xduVar, xciVar);
        }
        throw new wrh("LockScreenLayoutRenderingAdapterFactory received unrecognized slot/layout pairing");
    }
}

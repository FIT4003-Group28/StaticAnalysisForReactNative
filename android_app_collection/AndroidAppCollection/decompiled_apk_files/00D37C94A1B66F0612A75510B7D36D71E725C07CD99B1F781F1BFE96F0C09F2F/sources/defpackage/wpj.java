package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wpj  reason: default package */
/* loaded from: classes4.dex */
public final class wpj implements wpm {
    private final azqb a;
    private final azqb b;
    private final Executor c;
    private final Executor d;
    private final wwf e;

    public wpj(azqb azqbVar, azqb azqbVar2, Executor executor, Executor executor2, wwf wwfVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = executor;
        this.d = executor2;
        this.e = wwfVar;
    }

    @Override // defpackage.wpm
    public final wok a(xdu xduVar) {
        if (wwf.d(wnw.class, xduVar)) {
            return new wnw(new woo((woj) this.a.get(), xduVar), this.c, this.d, (wvx) this.b.get(), xduVar);
        }
        if (wwf.d(wny.class, xduVar)) {
            return new wny(new woo((woj) this.a.get(), xduVar), (wvx) this.b.get());
        }
        if (wwf.d(wnu.class, xduVar)) {
            return new wnu(new woo((woj) this.a.get(), xduVar), (wvx) this.b.get(), xduVar);
        }
        throw new wpl("No supported adapters for BelowPlayerFulfillmentAdapterFactory");
    }
}

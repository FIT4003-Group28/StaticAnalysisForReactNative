package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: edg  reason: default package */
/* loaded from: classes3.dex */
public final class edg implements wpm {
    private final azqb a;
    private final azqb b;
    private final Executor c;
    private final Executor d;
    private final /* synthetic */ int e;

    public edg(azqb azqbVar, azqb azqbVar2, Executor executor, Executor executor2) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.d = executor;
        this.c = executor2;
    }

    public edg(azqb azqbVar, azqb azqbVar2, Executor executor, Executor executor2, int i) {
        this.e = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = executor2;
        this.d = executor;
    }

    public edg(azqb azqbVar, azqb azqbVar2, Executor executor, Executor executor2, int i, byte[] bArr) {
        this.e = i;
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = executor;
        this.d = executor2;
    }

    @Override // defpackage.wpm
    public final wok a(xdu xduVar) {
        int i = this.e;
        if (i == 0) {
            if (!wwf.d(edf.class, xduVar)) {
                throw new wpl("No supported adapters for SequenceItemInPlayerFulfillmentAdapterFactory");
            }
            return new edf(new woo((woj) this.a.get(), xduVar), this.c, this.d, (wvx) this.b.get());
        } else if (i == 1) {
            if (wwf.d(ecn.class, xduVar)) {
                return new ecn(new woo((woj) this.a.get(), xduVar), (wvx) this.b.get(), this.c, this.d, xduVar);
            }
            throw new wpl("No supported adapters for FullscreenEngagementSlotFulfillmentAdapterFactory");
        } else if (wwf.d(woc.class, xduVar)) {
            return new woc(new woo((woj) this.a.get(), xduVar), this.c, this.d, (wvx) this.b.get(), xduVar);
        } else {
            if (wwf.d(woa.class, xduVar)) {
                return new woa(new woo((woj) this.a.get(), xduVar), (wvx) this.b.get(), xduVar);
            }
            throw new wpl("No supported adapters for BelowPlayerImmersiveFulfillmentAdapterFactory");
        }
    }
}

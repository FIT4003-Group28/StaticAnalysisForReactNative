package defpackage;
/* compiled from: PG */
/* renamed from: wpo  reason: default package */
/* loaded from: classes4.dex */
public final class wpo implements wpm {
    private final azqb a;
    private final azqb b;
    private final /* synthetic */ int c;

    public wpo(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public wpo(azqb azqbVar, azqb azqbVar2, int i) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    public wpo(azqb azqbVar, azqb azqbVar2, int i, byte[] bArr) {
        this.c = i;
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.wpm
    public final wok a(xdu xduVar) {
        int i = this.c;
        if (i == 0) {
            if (wwf.d(wos.class, xduVar)) {
                return new wos(new woo((woj) this.a.get(), xduVar), (wvx) this.b.get());
            }
            if (wwf.d(wou.class, xduVar)) {
                return new wou(new woo((woj) this.a.get(), xduVar), (wvx) this.b.get());
            }
            if (wwf.d(wow.class, xduVar)) {
                return new wow(new woo((woj) this.a.get(), xduVar), (wvx) this.b.get());
            }
            if (wwf.d(woq.class, xduVar)) {
                return new woq(new woo((woj) this.a.get(), xduVar), (wvx) this.b.get());
            }
            throw new wpl("No supported adapters for InPlayerSlotFulfillmentAdapterFactory");
        } else if (i == 1) {
            if (wwf.d(woe.class, xduVar)) {
                return new woe(new woo((woj) this.a.get(), xduVar), (wvx) this.b.get());
            }
            throw new wpl("No supported adapters for FixedFooterSlotFulfillmentAdapterFactory");
        } else if (i == 2) {
            if (wwf.d(woy.class, xduVar)) {
                return new woy(new woo((woj) this.a.get(), xduVar), (wvx) this.b.get());
            }
            throw new wpl("No supported adapters for LockscreenSlotFulfillmentAdapterFactory");
        } else if (wwf.d(wpa.class, xduVar)) {
            return new wpa(new woo((woj) this.a.get(), xduVar), (wvx) this.b.get(), xduVar);
        } else {
            throw new wpl("No supported adapters for PlaybackTrackingSlotFulfillmentAdapterFactory");
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: wpk  reason: default package */
/* loaded from: classes4.dex */
public final class wpk implements wpm {
    private final azqb a;
    private final azqb b;
    private final snc c;
    private final wnb d;

    public wpk(azqb azqbVar, wnb wnbVar, azqb azqbVar2, snc sncVar) {
        this.a = azqbVar;
        this.d = wnbVar;
        this.b = azqbVar2;
        this.c = sncVar;
    }

    @Override // defpackage.wpm
    public final wok a(xdu xduVar) {
        if (wwf.d(wog.class, xduVar)) {
            return new wog(new woo((woj) this.a.get(), xduVar), (wvx) this.b.get());
        }
        if (wwf.d(woi.class, xduVar)) {
            return new woi(new woo((woj) this.a.get(), xduVar), this.d, (wvx) this.b.get(), this.c);
        }
        throw new wpl("No supported adapters for ForecastingSlotFulfillmentAdapterFactory");
    }
}

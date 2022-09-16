package defpackage;
/* compiled from: PG */
/* renamed from: wre  reason: default package */
/* loaded from: classes4.dex */
public final class wre implements wri {
    private final azqb a;
    private final azqb b;
    private final azqb c;

    public wre(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
    }

    @Override // defpackage.wri
    public final wqg a(wqf wqfVar, xdu xduVar, xci xciVar) {
        if (wwf.e(wqc.class, xduVar, xciVar)) {
            return new wqc((wqf) this.a.get(), (wvk) this.b.get(), (wlh) this.c.get(), xduVar, xciVar);
        }
        throw new wrh("ForecastingAdRenderingAdapterFactory received unsupported metadata");
    }
}

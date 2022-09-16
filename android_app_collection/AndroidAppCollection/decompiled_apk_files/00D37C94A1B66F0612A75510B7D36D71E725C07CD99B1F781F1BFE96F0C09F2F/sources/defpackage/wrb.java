package defpackage;
/* compiled from: PG */
/* renamed from: wrb  reason: default package */
/* loaded from: classes4.dex */
public final class wrb implements wri {
    public final wwf a;
    public ecf b;
    private final azqb c;
    private final azqb d;

    public wrb(azqb azqbVar, azqb azqbVar2, wwf wwfVar) {
        this.c = azqbVar;
        this.d = azqbVar2;
        this.a = wwfVar;
    }

    @Override // defpackage.wri
    public final wqg a(wqf wqfVar, xdu xduVar, xci xciVar) {
        if (wwf.e(wpw.class, xduVar, xciVar)) {
            if (this.b == null) {
                throw new wrh("No adsEngagementPanelApi set when trying to build immersive LRA");
            }
            return new wpw((wqf) this.c.get(), xduVar, xciVar, this.b, (wmt) this.d.get());
        }
        throw new wrh("BelowPlayerImmersiveLayoutRenderingAdapterFactory invalid metadata");
    }
}

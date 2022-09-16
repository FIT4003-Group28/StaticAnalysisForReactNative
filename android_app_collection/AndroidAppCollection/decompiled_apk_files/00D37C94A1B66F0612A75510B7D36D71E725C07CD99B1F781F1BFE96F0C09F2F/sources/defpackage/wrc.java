package defpackage;
/* compiled from: PG */
/* renamed from: wrc  reason: default package */
/* loaded from: classes4.dex */
public final class wrc implements wri {
    public final wwf a;
    public wlt b;
    private final azqb c;

    public wrc(azqb azqbVar, wwf wwfVar) {
        this.c = azqbVar;
        this.a = wwfVar;
    }

    @Override // defpackage.wri
    public final wqg a(wqf wqfVar, xdu xduVar, xci xciVar) {
        if (wwf.e(wpv.class, xduVar, xciVar)) {
            if (this.b != null) {
                return new wpv((wqf) this.c.get(), xduVar, xciVar, this.b);
            }
            throw new wrh("No companionApi set when trying to build companion LRA");
        } else if (!wwf.e(wpx.class, xduVar, xciVar)) {
            throw new wrh("BelowPlayerLayoutRenderingAdapterFactory invalid metadata");
        } else {
            wlt wltVar = this.b;
            if (wltVar == null) {
                throw new wrh("No companionApi set when trying to build discovery companion LRA");
            }
            return new wpx(wqfVar, wltVar, xduVar, xciVar);
        }
    }
}

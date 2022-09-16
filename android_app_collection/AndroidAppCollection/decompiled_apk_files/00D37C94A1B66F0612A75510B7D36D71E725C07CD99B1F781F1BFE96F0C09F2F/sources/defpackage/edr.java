package defpackage;
/* compiled from: PG */
/* renamed from: edr  reason: default package */
/* loaded from: classes3.dex */
public final class edr implements wri, ecv {
    private final azqb a;
    private ecw b;

    public edr(azqb azqbVar, udt udtVar, byte[] bArr) {
        this.a = azqbVar;
        udtVar.a(this);
    }

    @Override // defpackage.wri
    public final wqg a(wqf wqfVar, xdu xduVar, xci xciVar) {
        if (wwf.e(edp.class, xduVar, xciVar)) {
            ecw ecwVar = this.b;
            if (ecwVar == null) {
                throw new wrh("No elementsRenderingApiFactory set");
            }
            return new edp(ecwVar.a(), (wqf) this.a.get(), xduVar, xciVar, (aqtb) xciVar.e(xay.class), (xdo) xciVar.e(xbn.class));
        }
        throw new wrh("SequenceItemInPlayerLayoutRenderingAdapterFactory received unrecognized slot/layout pairing");
    }

    @Override // defpackage.ecv
    public final void b(ecw ecwVar) {
        this.b = ecwVar;
    }

    @Override // defpackage.ecv
    public final void c() {
        this.b = null;
    }
}

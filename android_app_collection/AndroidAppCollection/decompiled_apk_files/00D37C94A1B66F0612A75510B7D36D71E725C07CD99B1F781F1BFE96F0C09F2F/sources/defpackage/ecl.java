package defpackage;
/* compiled from: PG */
/* renamed from: ecl  reason: default package */
/* loaded from: classes3.dex */
public final class ecl implements wri {
    public ecj a;
    private final azqb b;

    public ecl(azqb azqbVar) {
        azqbVar.getClass();
        this.b = azqbVar;
    }

    @Override // defpackage.wri
    public final wqg a(wqf wqfVar, xdu xduVar, xci xciVar) {
        if (xduVar.c() != apcd.SLOT_TYPE_FULLSCREEN_ENGAGEMENT) {
            throw new wrh("FullscreenEngagementLayoutRenderingAdapterFactory received unsupported slot");
        }
        if (!wwf.e(eck.class, xduVar, xciVar)) {
            throw new wrh("FullscreenEngagementLayoutRenderingAdapterFactory received unsupported metadata");
        }
        ecj ecjVar = this.a;
        if (ecjVar == null) {
            throw new wrh("FullscreenEngagementLayoutRenderingAdapterFactory has no controller registered yet.");
        }
        return new eck(ecjVar, (wqf) this.b.get(), xduVar, xciVar);
    }
}

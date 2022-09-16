package defpackage;
/* compiled from: PG */
/* renamed from: wrl  reason: default package */
/* loaded from: classes4.dex */
public final class wrl implements wri {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final wwf g;

    public wrl(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, wwf wwfVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = azqbVar5;
        this.f = azqbVar6;
        this.g = wwfVar;
    }

    @Override // defpackage.wri
    public final wqg a(wqf wqfVar, xdu xduVar, xci xciVar) {
        if (wwf.e(wqb.class, xduVar, xciVar)) {
            try {
                return new wqb((wqf) this.a.get(), ((wwh) this.e.get()).a(xduVar, xciVar), (wll) this.b.get(), (wty) this.c.get(), (wli) this.d.get(), (acti) this.f.get(), xduVar, xciVar);
            } catch (wuo e) {
                throw new wrh(e.toString());
            }
        }
        throw new wrh("PlaybackTrackingLayoutRenderingAdapterFactory received unsupported metadata");
    }
}

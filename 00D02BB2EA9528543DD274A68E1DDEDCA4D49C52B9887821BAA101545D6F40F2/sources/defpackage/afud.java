package defpackage;
/* compiled from: PG */
/* renamed from: afud  reason: default package */
/* loaded from: classes2.dex */
public class afud implements afuc {
    private final afwo a;
    private final cjtd b = cjtd.a(dtxv.K);
    @dzsi
    private Runnable c;

    public afud(afwo afwoVar) {
        this.a = afwoVar;
    }

    @Override // defpackage.afuc
    public Boolean a() {
        return Boolean.valueOf(!this.a.d(afwm.SATELLITE));
    }

    @Override // defpackage.afuc
    public cqkl b() {
        boolean z = !this.a.d(afwm.SATELLITE);
        if (z) {
            this.a.h(false);
        }
        this.a.g(z);
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.afuc
    public void c(Runnable runnable) {
        this.c = runnable;
    }

    @Override // defpackage.afuc
    public void d() {
        this.c = null;
    }

    @Override // defpackage.afuc
    public cjtd e() {
        cjta c = cjtd.c(this.b);
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = a().booleanValue() ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        c.a = bZ.bK();
        return c.a();
    }
}

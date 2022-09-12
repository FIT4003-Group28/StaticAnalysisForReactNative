package defpackage;
/* compiled from: PG */
/* renamed from: bmoq  reason: default package */
/* loaded from: classes3.dex */
public final class bmoq implements bmnj {
    private final bmnh a;
    private final dxio<akfa> b;
    private final dxio<ckcw> c;

    public bmoq(dxio<akfa> dxioVar, dxio<ckcw> dxioVar2, bmnh bmnhVar) {
        this.b = dxioVar;
        this.c = dxioVar2;
        this.a = bmnhVar;
    }

    @Override // defpackage.bmnj
    public final void a(eapd eapdVar) {
        btlu j = this.b.a().j();
        if (!j.l()) {
            ((ckco) this.c.a().a(ckgo.x)).a(ckgk.a(25));
        } else {
            this.a.a(j, eapdVar, dmjz.GMM_ORGANIC);
        }
    }
}

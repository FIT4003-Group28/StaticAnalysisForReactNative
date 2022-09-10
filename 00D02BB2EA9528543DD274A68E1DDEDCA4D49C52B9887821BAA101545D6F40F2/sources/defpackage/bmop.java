package defpackage;
/* compiled from: PG */
/* renamed from: bmop  reason: default package */
/* loaded from: classes3.dex */
public final class bmop implements bmni {
    private final bmnh a;
    private final dxio<akfa> b;
    private final dxio<ckcw> c;

    public bmop(dxio<akfa> dxioVar, dxio<ckcw> dxioVar2, bmnh bmnhVar) {
        this.b = dxioVar;
        this.c = dxioVar2;
        this.a = bmnhVar;
    }

    @Override // defpackage.bmni
    public final dehn<Boolean> a(eapd eapdVar, String str) {
        bvrj.UI_THREAD.d();
        if (this.b.a().j().m()) {
            ((ckco) this.c.a().a(ckgo.x)).a(ckgk.a(29));
            return deha.a(false);
        }
        btlu n = this.b.a().n(str);
        if (n == null || dbsj.d(n.d) || dbsj.d(n.s().name)) {
            ((ckco) this.c.a().a(ckgo.x)).a(ckgk.a(25));
            return deha.a(false);
        }
        return (dehn) this.a.a(n, eapdVar, dmjz.AGSA_LOCAL_UNIVERSAL).a().h(bmnk.a).c(deha.a(false));
    }
}

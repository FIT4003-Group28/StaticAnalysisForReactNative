package defpackage;
/* compiled from: PG */
/* renamed from: cwac  reason: default package */
/* loaded from: classes5.dex */
public final class cwac<T> {
    public final gn a;
    private final cvze<T> b;

    public cwac(gn gnVar, cvze<T> cvzeVar) {
        this.a = gnVar;
        this.b = cvzeVar;
        cwql b = b(gnVar);
        if (b != null) {
            a(b);
        }
    }

    public static cwql b(gn gnVar) {
        return (cwql) gnVar.H(cwql.ad);
    }

    public final void a(cwql cwqlVar) {
        czhz.b();
        cvze<T> cvzeVar = this.b;
        dtga bZ = dtgb.g.bZ();
        dtgh dtghVar = dtgh.ACCOUNT_MENU_COMPONENT;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dtgb dtgbVar = (dtgb) bZ.b;
        dtgbVar.c = dtghVar.u;
        dtgbVar.a |= 2;
        dtgb dtgbVar2 = (dtgb) bZ.b;
        dtgbVar2.e = 8;
        dtgbVar2.a |= 32;
        dtgb dtgbVar3 = (dtgb) bZ.b;
        dtgbVar3.d = 3;
        dtgbVar3.a = 8 | dtgbVar3.a;
        new cwgx(cvzeVar, cwqlVar, bZ.bK());
    }
}

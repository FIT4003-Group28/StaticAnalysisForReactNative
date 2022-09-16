package defpackage;
/* compiled from: PG */
/* renamed from: bkjc  reason: default package */
/* loaded from: classes3.dex */
public final class bkjc extends befr<bkjg> {
    private final btvo b;

    public bkjc(bkjg bkjgVar, btvo btvoVar) {
        super(bkjgVar, 1, 1);
        this.b = btvoVar;
    }

    @Override // defpackage.befz
    public final void a(cqiv cqivVar) {
        for (bkje bkjeVar : ((bkjg) this.a).a()) {
            cqivVar.a(ict.p(false, new cqmp[0]), bkjeVar);
            cqivVar.a(new bfyi(), bkjeVar);
        }
        if (this.b.getEnableFeatureParameters().M) {
            cqivVar.a(ict.p(false, new cqmp[0]), (bkjg) this.a);
        } else {
            cqivVar.a(new hsd(), hsd.e(irh.c()));
        }
    }

    @Override // defpackage.befr, defpackage.befz
    public final boolean d() {
        return true;
    }
}

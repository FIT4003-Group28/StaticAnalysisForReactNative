package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: vkm  reason: default package */
/* loaded from: classes7.dex */
final class vkm extends cqiw<zfr> {
    private final cqmp<zfr> a;

    public vkm(cqmp<zfr> cqmpVar) {
        super(false, cqmpVar);
        this.a = cqmpVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zfr> a() {
        cqmp[] cqmpVarArr = {irn.A(), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eE(B().c())};
        cqmj gq = cqgr.gq(ibq.p(), irn.E(), cqgr.eI(B().b()));
        gq.f(this.a);
        cqmj gq2 = cqgr.gq(cqic.d(false, new cqmp[0]), ibq.p(), irn.E(), cqgr.eI(B().a()));
        gq2.f(this.a);
        return jgi.d(cqgr.dr(0), jgi.e(irh.m()), cqgr.aJ(16), cqgr.gc(cqmpVarArr), gq, gq2);
    }
}

package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aacw  reason: default package */
/* loaded from: classes2.dex */
class aacw extends aafy {
    public final aadi e;
    private final gga f;

    public aacw(aafv aafvVar, gga ggaVar, aadj aadjVar, aacv aacvVar) {
        super(aafvVar, aacvVar);
        this.f = ggaVar;
        Activity activity = (Activity) ((dxjd) aadjVar.a).a;
        aadj.a(activity, 1);
        aadj.a(aadjVar.b.a(), 2);
        aadj.a(aacvVar, 3);
        this.e = new aadi(activity, aacvVar);
    }

    @Override // defpackage.ivk, defpackage.izs
    @dzsi
    public izg U() {
        if (btpf.b(this.f)) {
            return null;
        }
        return this.e;
    }

    @Override // defpackage.ivk, defpackage.izs
    public cjtd V() {
        return cjtd.a(dtxo.bB);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ag(aacn aacnVar) {
        dprx dprxVar = aacnVar.a().b;
        if (dprxVar == null) {
            dprxVar = dprx.h;
        }
        if ((dprxVar.a & 1) != 0) {
            I(dprxVar.b);
        }
        cqkx.p(this);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: ascm  reason: default package */
/* loaded from: classes2.dex */
final class ascm implements jkh {
    final /* synthetic */ ascu a;

    public ascm(ascu ascuVar) {
        this.a = ascuVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        ascu ascuVar = this.a;
        if (!ascuVar.aD) {
            return;
        }
        ascuVar.am.c = jjnVar2;
        if ((jjnVar == jjn.HIDDEN || jjnVar == jjn.COLLAPSED) && jjnVar2 == jjn.FULLY_EXPANDED) {
            ((ckcn) this.a.ar.a(ckhi.aT)).a();
        } else if ((jjnVar == jjn.FULLY_EXPANDED || jjnVar == jjn.COLLAPSED) && jjnVar2 == jjn.HIDDEN) {
            ((ckcn) this.a.ar.a(ckhi.aU)).a();
        }
        if (!this.a.b.M(jjnVar2).booleanValue()) {
            return;
        }
        cqkx.p(this.a.b);
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
    }
}

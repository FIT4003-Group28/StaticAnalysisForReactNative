package defpackage;
/* compiled from: PG */
/* renamed from: ygz  reason: default package */
/* loaded from: classes7.dex */
final class ygz implements jkh {
    final /* synthetic */ yha a;

    public ygz(yha yhaVar) {
        this.a = yhaVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
        if (this.a.ak == null || jjnVar.b()) {
            return;
        }
        yth ythVar = this.a.ak;
        dbsk.s(ythVar);
        if (!ythVar.e || ythVar.f || !ythVar.g) {
            return;
        }
        ythVar.f = true;
        ythVar.b().setStartDelay(0L).start();
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
    }
}

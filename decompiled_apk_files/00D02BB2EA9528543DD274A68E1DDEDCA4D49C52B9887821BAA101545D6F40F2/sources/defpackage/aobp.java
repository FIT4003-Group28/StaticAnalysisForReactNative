package defpackage;
/* compiled from: PG */
/* renamed from: aobp  reason: default package */
/* loaded from: classes2.dex */
public final class aobp implements jkh {
    private final aobn a;

    public aobp(aobn aobnVar) {
        this.a = aobnVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        boolean z = true;
        if (jkgVar != jkg.AUTOMATED || jjnVar2 != jjn.FULLY_EXPANDED) {
            aobn aobnVar = this.a;
            if (!aobnVar.b().booleanValue() && jjnVar2 == jjn.FULLY_EXPANDED) {
                z = false;
            }
            aobnVar.s(z);
            return;
        }
        this.a.s(true);
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

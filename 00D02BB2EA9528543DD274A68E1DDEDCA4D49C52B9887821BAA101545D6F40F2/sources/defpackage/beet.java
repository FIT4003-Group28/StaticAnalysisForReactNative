package defpackage;
/* compiled from: PG */
/* renamed from: beet  reason: default package */
/* loaded from: classes3.dex */
public final class beet implements jkh {
    private final beev a;

    public beet(beev beevVar) {
        this.a = beevVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
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
        if (!this.a.h().booleanValue()) {
            return;
        }
        jjn D = jkjVar.D(jjnVar);
        Float valueOf = Float.valueOf(-1.0f);
        if (jjnVar == jjn.HIDDEN && D == jjn.COLLAPSED) {
            valueOf = Float.valueOf(-f);
        }
        this.a.l(valueOf);
        cqkx.p(this.a);
    }
}

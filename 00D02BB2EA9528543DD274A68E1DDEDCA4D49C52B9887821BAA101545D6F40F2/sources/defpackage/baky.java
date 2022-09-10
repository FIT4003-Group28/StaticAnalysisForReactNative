package defpackage;
/* compiled from: PG */
/* renamed from: baky  reason: default package */
/* loaded from: classes3.dex */
public final class baky implements jkh {
    public final jkf a;
    private final baql b;

    public baky(jkf jkfVar, baql baqlVar) {
        this.b = baqlVar;
        this.a = jkfVar;
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
        int g = jjnVar == jjn.HIDDEN ? 0 : (int) bfki.g(jkjVar, jjnVar, f);
        this.b.c(jkjVar.M() - jkjVar.C(jjn.EXPANDED));
        this.b.e(-g);
        cqkx.p(this.b);
    }
}

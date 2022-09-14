package defpackage;
/* compiled from: PG */
/* renamed from: jkl  reason: default package */
/* loaded from: classes7.dex */
public final class jkl implements jkh {
    private static final dcqe a = dcqe.c("jkl");
    private final jkk b;

    public jkl(jkk jkkVar) {
        this.b = jkkVar;
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
        int i;
        int C = jkjVar.C(jjn.FULLY_EXPANDED) - jkjVar.C(jjn.EXPANDED);
        int i2 = 0;
        if (jjnVar == jjn.EXPANDED) {
            double d = f;
            Double.isNaN(d);
            double d2 = 1.0d - d;
            double d3 = C;
            Double.isNaN(d3);
            i = (int) (d2 * d3);
        } else {
            i = jjnVar == jjn.COLLAPSED ? (int) (C * f) : 0;
        }
        if (i < 0) {
            bvoo.h("Calculated a negative shift amount for banner: base state = %s, ratio = %s, exposure pixels delta = %s", jjnVar, Float.valueOf(f), Integer.valueOf(C));
        } else {
            i2 = i;
        }
        this.b.g(-i2);
    }
}

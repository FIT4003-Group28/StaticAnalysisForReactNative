package defpackage;
/* compiled from: PG */
/* renamed from: ckox  reason: default package */
/* loaded from: classes.dex */
public abstract class ckox {
    public abstract ckoy a(ckpa ckpaVar, dszg dszgVar, ckow ckowVar, boolean z, boolean z2, boolean z3, boolean z4);

    public final ckoy b(ckpa ckpaVar, dszg dszgVar, ckow ckowVar, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        if (!ckowVar.a()) {
            if (z || z2) {
                z5 = z3;
            } else if (z3) {
                z5 = true;
            }
            return a(ckpaVar, dszgVar, ckowVar, z, z2, z5, z4);
        }
        bvoo.f(new IllegalStateException("One or more of the mandatory fields have not been set"));
        return new ckou();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: jjx  reason: default package */
/* loaded from: classes.dex */
public final class jjx extends jkc {
    public jjx() {
        super(dcdc.h(jjn.HIDDEN, jjn.COLLAPSED, jjn.FULLY_EXPANDED));
    }

    @Override // defpackage.jkc
    public final jjn a(jjn jjnVar, jjn jjnVar2) {
        return jjnVar == jjn.EXPANDED ? jjn.FULLY_EXPANDED : jjnVar;
    }

    @Override // defpackage.jkc
    public final jjn b(jjn jjnVar) {
        if (jjnVar != jjn.COLLAPSED) {
            jjn jjnVar2 = jjnVar.e;
            return jjnVar2 == jjn.EXPANDED ? jjn.COLLAPSED : jjnVar2;
        }
        return jjn.HIDDEN;
    }

    @Override // defpackage.jkc
    public final jjn c(jjn jjnVar) {
        return jjnVar == jjn.HIDDEN ? jjn.COLLAPSED : super.c(jjnVar);
    }
}

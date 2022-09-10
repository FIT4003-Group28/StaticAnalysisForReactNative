package defpackage;
/* compiled from: PG */
/* renamed from: jjy  reason: default package */
/* loaded from: classes7.dex */
public final class jjy extends jkc {
    public jjy() {
        super(dcdc.h(jjn.HIDDEN, jjn.COLLAPSED, jjn.EXPANDED));
    }

    @Override // defpackage.jkc
    public final jjn a(jjn jjnVar, jjn jjnVar2) {
        return jjnVar == jjn.FULLY_EXPANDED ? jjn.EXPANDED : jjnVar;
    }

    @Override // defpackage.jkc
    public final jjn b(jjn jjnVar) {
        return jjnVar == jjn.COLLAPSED ? jjn.HIDDEN : jjnVar.e;
    }

    @Override // defpackage.jkc
    public final jjn c(jjn jjnVar) {
        if (jjnVar == jjn.HIDDEN) {
            return jjn.COLLAPSED;
        }
        jjn c = super.c(jjnVar);
        return c == jjn.FULLY_EXPANDED ? jjn.EXPANDED : c;
    }
}

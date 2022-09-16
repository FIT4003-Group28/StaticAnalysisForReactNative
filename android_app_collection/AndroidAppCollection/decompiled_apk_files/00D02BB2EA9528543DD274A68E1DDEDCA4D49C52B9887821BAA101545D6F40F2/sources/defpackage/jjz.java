package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: jjz  reason: default package */
/* loaded from: classes.dex */
public final class jjz extends jkc {
    public jjz() {
        super(dcdc.i(jjn.HIDDEN, jjn.COLLAPSED, jjn.EXPANDED, jjn.FULLY_EXPANDED));
    }

    @Override // defpackage.jkc
    public final jjn a(jjn jjnVar, jjn jjnVar2) {
        if (!jjnVar2.b() || jjnVar != jjn.HIDDEN) {
            return (jjnVar2.b() || jjnVar != jjn.FULLY_EXPANDED) ? jjnVar : jjn.EXPANDED;
        }
        return jjn.COLLAPSED;
    }

    @Override // defpackage.jkc
    public final jjn b(jjn jjnVar) {
        return jjnVar == jjn.COLLAPSED ? jjn.HIDDEN : jjnVar.e;
    }

    @Override // defpackage.jkc
    public final jjn c(jjn jjnVar) {
        return jjnVar == jjn.HIDDEN ? jjn.COLLAPSED : super.c(jjnVar);
    }

    @Override // defpackage.jkc
    public final List<jjn> d(jjn jjnVar) {
        if (jjnVar.b()) {
            return dcdc.h(jjn.COLLAPSED, jjn.EXPANDED, jjn.FULLY_EXPANDED);
        }
        return dcdc.h(jjn.HIDDEN, jjn.COLLAPSED, jjn.EXPANDED);
    }
}

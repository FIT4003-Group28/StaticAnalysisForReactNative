package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: jka  reason: default package */
/* loaded from: classes.dex */
public final class jka extends jkc {
    public jka() {
        super(dcdc.i(jjn.HIDDEN, jjn.COLLAPSED, jjn.EXPANDED, jjn.FULLY_EXPANDED));
    }

    @Override // defpackage.jkc
    public final jjn a(jjn jjnVar, jjn jjnVar2) {
        return (!jjnVar2.b() || jjnVar != jjn.HIDDEN) ? jjnVar : jjn.COLLAPSED;
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
        return jjnVar.b() ? dcdc.h(jjn.COLLAPSED, jjn.EXPANDED, jjn.FULLY_EXPANDED) : this.r;
    }
}

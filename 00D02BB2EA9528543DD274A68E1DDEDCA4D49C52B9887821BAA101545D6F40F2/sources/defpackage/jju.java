package defpackage;
/* compiled from: PG */
/* renamed from: jju  reason: default package */
/* loaded from: classes7.dex */
public final class jju extends jkc {
    public jju() {
        super(dcdc.g(jjn.HIDDEN, jjn.EXPANDED));
    }

    @Override // defpackage.jkc
    public final jjn a(jjn jjnVar, jjn jjnVar2) {
        return jjnVar == jjn.COLLAPSED ? jjn.HIDDEN : jjnVar == jjn.FULLY_EXPANDED ? jjn.EXPANDED : jjnVar;
    }

    @Override // defpackage.jkc
    public final jjn b(jjn jjnVar) {
        return jjn.HIDDEN;
    }

    @Override // defpackage.jkc
    public final jjn c(jjn jjnVar) {
        return jjn.EXPANDED;
    }
}

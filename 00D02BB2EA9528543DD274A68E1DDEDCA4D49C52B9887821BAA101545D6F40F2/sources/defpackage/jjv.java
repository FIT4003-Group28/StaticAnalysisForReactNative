package defpackage;
/* compiled from: PG */
/* renamed from: jjv  reason: default package */
/* loaded from: classes.dex */
public final class jjv extends jkc {
    public jjv() {
        super(dcdc.g(jjn.HIDDEN, jjn.FULLY_EXPANDED));
    }

    @Override // defpackage.jkc
    public final jjn a(jjn jjnVar, jjn jjnVar2) {
        return jjnVar == jjn.COLLAPSED ? jjn.HIDDEN : jjnVar == jjn.EXPANDED ? jjn.FULLY_EXPANDED : jjnVar;
    }

    @Override // defpackage.jkc
    public final jjn b(jjn jjnVar) {
        jjn jjnVar2 = jjnVar.e;
        return jjnVar2 == jjn.EXPANDED ? jjn.HIDDEN : jjnVar2;
    }
}

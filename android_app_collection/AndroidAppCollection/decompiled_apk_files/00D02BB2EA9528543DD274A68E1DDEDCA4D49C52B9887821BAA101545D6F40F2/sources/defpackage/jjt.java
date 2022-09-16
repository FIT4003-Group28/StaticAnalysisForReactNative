package defpackage;
/* compiled from: PG */
/* renamed from: jjt  reason: default package */
/* loaded from: classes.dex */
public final class jjt extends jkc {
    public jjt() {
        super(dcdc.g(jjn.HIDDEN, jjn.COLLAPSED));
    }

    @Override // defpackage.jkc
    public final jjn a(jjn jjnVar, jjn jjnVar2) {
        return (jjnVar == jjn.EXPANDED || jjnVar == jjn.FULLY_EXPANDED) ? jjn.COLLAPSED : jjnVar;
    }

    @Override // defpackage.jkc
    public final jjn b(jjn jjnVar) {
        return jjn.HIDDEN;
    }

    @Override // defpackage.jkc
    public final jjn c(jjn jjnVar) {
        return jjn.COLLAPSED;
    }
}

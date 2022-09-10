package defpackage;
/* compiled from: PG */
/* renamed from: jjq  reason: default package */
/* loaded from: classes.dex */
public final class jjq extends jkc {
    public jjq() {
        super(dcdc.g(jjn.COLLAPSED, jjn.FULLY_EXPANDED));
    }

    @Override // defpackage.jkc
    public final jjn a(jjn jjnVar, jjn jjnVar2) {
        return jjnVar == jjn.EXPANDED ? jjn.FULLY_EXPANDED : jjnVar;
    }

    @Override // defpackage.jkc
    public final jjn b(jjn jjnVar) {
        jjn jjnVar2 = jjnVar.e;
        return jjnVar2 == jjn.EXPANDED ? jjn.COLLAPSED : jjnVar2;
    }
}

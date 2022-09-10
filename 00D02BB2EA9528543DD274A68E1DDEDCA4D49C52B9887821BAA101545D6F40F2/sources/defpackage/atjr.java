package defpackage;
/* renamed from: atjr  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atjr implements cqlc {
    static final cqlc a = new atjr();

    private atjr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        atna atnaVar = (atna) cqkpVar;
        int i = atjt.a;
        boolean z = true;
        if (!cqjv.v(atnaVar.w()).booleanValue() && !cqjv.v(atnaVar.z().g()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

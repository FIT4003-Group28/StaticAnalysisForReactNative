package defpackage;
/* renamed from: atkw  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atkw implements cqlc {
    static final cqlc a = new atkw();

    private atkw() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        atna atnaVar = (atna) cqkpVar;
        int i = atkx.a;
        boolean z = false;
        if (!atnaVar.O().booleanValue() && !atnaVar.N().booleanValue() && !atnaVar.M().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

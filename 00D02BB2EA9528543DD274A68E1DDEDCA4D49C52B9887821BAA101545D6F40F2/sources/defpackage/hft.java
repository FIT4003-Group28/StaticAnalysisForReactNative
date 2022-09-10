package defpackage;
/* renamed from: hft  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class hft implements cqlc {
    static final cqlc a = new hft();

    private hft() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        jbq jbqVar = (jbq) cqkpVar;
        cqfc cqfcVar = hfy.a;
        boolean z = true;
        if (jbqVar.d().booleanValue() && !jbqVar.e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

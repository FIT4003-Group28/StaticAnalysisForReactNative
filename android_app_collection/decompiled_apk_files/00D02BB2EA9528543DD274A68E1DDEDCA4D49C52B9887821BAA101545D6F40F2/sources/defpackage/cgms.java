package defpackage;
/* renamed from: cgms  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cgms implements cqlc {
    static final cqlc a = new cgms();

    private cgms() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i = cgmt.a;
        boolean z = true;
        if (((bopv) cqkpVar).p().intValue() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

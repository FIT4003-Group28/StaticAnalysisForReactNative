package defpackage;
/* renamed from: cibp  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cibp implements cqlc {
    static final cqlc a = new cibp();

    private cibp() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cict cictVar = (cict) cqkpVar;
        int i = cics.a;
        boolean z = false;
        if (!cqjv.v(cictVar.f()).booleanValue() && !cqjv.v(cictVar.i()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

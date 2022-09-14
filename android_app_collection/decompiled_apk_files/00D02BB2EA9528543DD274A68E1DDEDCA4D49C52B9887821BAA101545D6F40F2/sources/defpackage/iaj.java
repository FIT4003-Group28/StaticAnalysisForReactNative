package defpackage;
/* renamed from: iaj  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class iaj implements cqlc {
    static final cqlc a = new iaj();

    private iaj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        iao iaoVar = (iao) cqkpVar;
        int i = iam.b;
        boolean z = false;
        if (!cqjv.v(iaoVar.e()).booleanValue() && iaoVar.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

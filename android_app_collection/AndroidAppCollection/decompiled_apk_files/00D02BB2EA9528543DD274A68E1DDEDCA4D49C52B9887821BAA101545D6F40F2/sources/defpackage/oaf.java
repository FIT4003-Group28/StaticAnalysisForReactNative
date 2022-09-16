package defpackage;
/* renamed from: oaf  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class oaf implements cqlc {
    static final cqlc a = new oaf();

    private oaf() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        oxg oxgVar = (oxg) cqkpVar;
        boolean z = false;
        if (oxgVar.d().booleanValue() && oxgVar.b().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

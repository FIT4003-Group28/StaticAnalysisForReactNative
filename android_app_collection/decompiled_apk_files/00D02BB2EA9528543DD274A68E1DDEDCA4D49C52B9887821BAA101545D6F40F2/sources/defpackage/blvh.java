package defpackage;
/* renamed from: blvh  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blvh implements cqlc {
    static final cqlc a = new blvh();

    private blvh() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blwt blwtVar = (blwt) cqkpVar;
        cqtv cqtvVar = blvp.a;
        boolean z = true;
        if (!blwtVar.k().booleanValue() && !blwtVar.z().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

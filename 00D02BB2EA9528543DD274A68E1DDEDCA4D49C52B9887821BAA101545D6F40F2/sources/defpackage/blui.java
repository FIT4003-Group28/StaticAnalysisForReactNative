package defpackage;
/* renamed from: blui  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class blui implements cqlc {
    static final cqlc a = new blui();

    private blui() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        blwt blwtVar = (blwt) cqkpVar;
        cqtv cqtvVar = blvp.a;
        boolean z = true;
        if (!blwtVar.D().booleanValue() && !blwtVar.r().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

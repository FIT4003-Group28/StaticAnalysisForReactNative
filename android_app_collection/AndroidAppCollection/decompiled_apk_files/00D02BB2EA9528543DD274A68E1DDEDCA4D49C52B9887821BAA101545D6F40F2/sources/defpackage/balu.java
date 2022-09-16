package defpackage;
/* renamed from: balu  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class balu implements cqlc {
    static final cqlc a = new balu();

    private balu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        baqb baqbVar = (baqb) cqkpVar;
        int i = balx.a;
        boolean z = true;
        if (!cqjv.v(baqbVar.d()).booleanValue() && cqjv.v(baqbVar.e()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

package defpackage;
/* renamed from: rxv  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class rxv implements cqlc {
    static final cqlc a = new rxv();

    private rxv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        saj sajVar = (saj) cqkpVar;
        cqjg cqjgVar = rxy.a;
        boolean z = false;
        if (sajVar.e().booleanValue() && !sajVar.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

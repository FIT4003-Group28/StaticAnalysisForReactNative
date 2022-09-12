package defpackage;
/* renamed from: bfny  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfny implements cqlc {
    static final cqlc a = new bfny();

    private bfny() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bfrr bfrrVar = (bfrr) cqkpVar;
        int i = bfok.a;
        boolean z = true;
        if (bfrrVar.d().booleanValue() && !cqjv.v(bfrrVar.r()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

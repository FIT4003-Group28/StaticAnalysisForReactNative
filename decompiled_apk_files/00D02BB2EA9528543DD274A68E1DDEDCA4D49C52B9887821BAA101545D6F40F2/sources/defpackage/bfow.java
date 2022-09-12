package defpackage;
/* renamed from: bfow  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfow implements cqlc {
    static final cqlc a = new bfow();

    private bfow() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bfrr bfrrVar = (bfrr) cqkpVar;
        int i = bfoy.a;
        boolean z = true;
        if (!bfrrVar.e().booleanValue() && !bfrrVar.o().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

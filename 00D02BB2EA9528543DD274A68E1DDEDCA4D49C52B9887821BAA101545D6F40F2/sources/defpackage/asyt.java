package defpackage;
/* renamed from: asyt  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asyt implements cqlc {
    static final cqlc a = new asyt();

    private asyt() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aszo aszoVar = (aszo) cqkpVar;
        int i = asyu.a;
        boolean z = false;
        if (aszoVar.q().booleanValue() && cqjv.v(aszoVar.p()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
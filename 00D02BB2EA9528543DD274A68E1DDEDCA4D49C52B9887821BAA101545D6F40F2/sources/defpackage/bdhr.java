package defpackage;
/* renamed from: bdhr  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdhr implements cqlc {
    static final cqlc a = new bdhr();

    private bdhr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bdim bdimVar = (bdim) cqkpVar;
        cqjg cqjgVar = bdhz.a;
        boolean z = false;
        if (bdimVar.g().booleanValue() && bdimVar.j().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

package defpackage;
/* renamed from: bdht  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdht implements cqlc {
    static final cqlc a = new bdht();

    private bdht() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bdim bdimVar = (bdim) cqkpVar;
        cqjg cqjgVar = bdhz.a;
        boolean z = true;
        if (!cqjv.v(bdimVar.i()).booleanValue() && bdimVar.j().booleanValue() && bdimVar.k().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

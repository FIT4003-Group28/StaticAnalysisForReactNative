package defpackage;
/* renamed from: bdhq  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdhq implements cqlc {
    static final cqlc a = new bdhq();

    private bdhq() {
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

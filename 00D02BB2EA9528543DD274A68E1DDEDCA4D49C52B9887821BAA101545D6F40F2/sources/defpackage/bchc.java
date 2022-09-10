package defpackage;
/* renamed from: bchc  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bchc implements cqlc {
    static final cqlc a = new bchc();

    private bchc() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bcme bcmeVar = (bcme) cqkpVar;
        cqjg cqjgVar = bchj.a;
        boolean z = false;
        if (bcmeVar.i().booleanValue() && !cqjv.v(bcmeVar.j()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

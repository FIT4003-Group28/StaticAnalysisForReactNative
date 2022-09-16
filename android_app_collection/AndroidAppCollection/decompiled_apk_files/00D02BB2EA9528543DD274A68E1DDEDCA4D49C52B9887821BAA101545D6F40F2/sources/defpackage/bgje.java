package defpackage;
/* renamed from: bgje  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgje implements cqlc {
    static final cqlc a = new bgje();

    private bgje() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bgns bgnsVar = (bgns) cqkpVar;
        cqjg cqjgVar = bgjj.a;
        boolean z = false;
        if (bgnsVar.k().booleanValue() && bgnsVar.p().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

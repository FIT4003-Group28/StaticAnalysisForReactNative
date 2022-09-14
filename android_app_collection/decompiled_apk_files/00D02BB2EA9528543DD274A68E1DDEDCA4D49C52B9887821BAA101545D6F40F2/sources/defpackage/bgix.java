package defpackage;
/* renamed from: bgix  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgix implements cqlc {
    static final cqlc a = new bgix();

    private bgix() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bgns bgnsVar = (bgns) cqkpVar;
        cqjg cqjgVar = bgjj.a;
        boolean z = false;
        if (!bgnsVar.g().booleanValue() && cqjv.v(bgnsVar.d()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

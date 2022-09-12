package defpackage;
/* renamed from: bgip  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgip implements cqlc {
    static final cqlc a = new bgip();

    private bgip() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bgns bgnsVar = (bgns) cqkpVar;
        cqjg cqjgVar = bgjj.a;
        boolean z = true;
        if (!bgnsVar.k().booleanValue() && bgnsVar.e().t().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

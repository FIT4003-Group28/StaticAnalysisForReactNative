package defpackage;
/* renamed from: cgos  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cgos implements cqlc {
    static final cqlc a = new cgos();

    private cgos() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cgwd cgwdVar = (cgwd) cqkpVar;
        int i = cgox.a;
        boolean z = false;
        if (!cgwdVar.g().booleanValue() && !cgwdVar.f().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

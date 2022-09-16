package defpackage;
/* renamed from: asmw  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asmw implements cqlc {
    static final cqlc a = new asmw();

    private asmw() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        asun asunVar = (asun) cqkpVar;
        int i = asnf.a;
        boolean z = true;
        if (!asunVar.c().booleanValue() && !asunVar.j().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

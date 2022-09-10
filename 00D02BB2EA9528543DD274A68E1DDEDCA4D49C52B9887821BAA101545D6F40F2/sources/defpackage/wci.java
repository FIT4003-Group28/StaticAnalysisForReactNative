package defpackage;
/* renamed from: wci  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class wci implements cqlc {
    static final cqlc a = new wci();

    private wci() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        wcn wcnVar = (wcn) cqkpVar;
        int i = wck.a;
        boolean z = true;
        if (wcnVar.d().booleanValue() && !wcnVar.c().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

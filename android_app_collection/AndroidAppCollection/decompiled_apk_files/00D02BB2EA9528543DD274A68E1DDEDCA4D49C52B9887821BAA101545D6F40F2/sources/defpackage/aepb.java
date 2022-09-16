package defpackage;
/* renamed from: aepb  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aepb implements cqlc {
    static final cqlc a = new aepb();

    private aepb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aeqd aeqdVar = (aeqd) cqkpVar;
        int i = aepr.a;
        boolean z = true;
        if (!aeqdVar.e().booleanValue() && cqjv.v(aeqdVar.c()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

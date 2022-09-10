package defpackage;
/* renamed from: gmq  reason: default package */
/* loaded from: classes6.dex */
final /* synthetic */ class gmq implements cqlc {
    static final cqlc a = new gmq();

    private gmq() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        jam jamVar = (jam) cqkpVar;
        int i = gna.a;
        boolean z = false;
        if (jamVar.d().booleanValue() && jamVar.h().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

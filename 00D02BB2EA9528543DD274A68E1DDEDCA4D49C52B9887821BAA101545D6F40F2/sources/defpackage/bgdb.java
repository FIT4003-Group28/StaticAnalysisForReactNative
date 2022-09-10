package defpackage;
/* renamed from: bgdb  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgdb implements cqlc {
    static final cqlc a = new bgdb();

    private bgdb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bnih bnihVar = (bnih) cqkpVar;
        int i = 4;
        if (!bnihVar.m().booleanValue() && !bnihVar.k().booleanValue()) {
            i = 1;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

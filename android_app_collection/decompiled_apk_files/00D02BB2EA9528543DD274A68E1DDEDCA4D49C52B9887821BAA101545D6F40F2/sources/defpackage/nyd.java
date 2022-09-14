package defpackage;
/* renamed from: nyd  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class nyd implements cqlc {
    static final cqlc a = new nyd();

    private nyd() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        oxi oxiVar = (oxi) cqkpVar;
        int i = nyf.a;
        boolean z = true;
        if (!oxiVar.e().booleanValue() && !oxiVar.i().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

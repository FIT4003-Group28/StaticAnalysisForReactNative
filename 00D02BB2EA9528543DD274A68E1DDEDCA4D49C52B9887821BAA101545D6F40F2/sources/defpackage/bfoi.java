package defpackage;
/* renamed from: bfoi  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfoi implements cqlc {
    static final cqlc a = new bfoi();

    private bfoi() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bfrr bfrrVar = (bfrr) cqkpVar;
        int i = bfok.a;
        boolean z = true;
        if (!cqjv.v(bfrrVar.l()).booleanValue() && bfrrVar.o().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

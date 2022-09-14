package defpackage;
/* renamed from: bfog  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfog implements cqlc {
    static final cqlc a = new bfog();

    private bfog() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bfrr bfrrVar = (bfrr) cqkpVar;
        int i = bfok.a;
        boolean z = true;
        if (!cqjv.v(bfrrVar.l()).booleanValue() && !bfrrVar.o().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

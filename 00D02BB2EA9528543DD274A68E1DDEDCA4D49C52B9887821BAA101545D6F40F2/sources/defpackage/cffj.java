package defpackage;
/* renamed from: cffj  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cffj implements cqlc {
    static final cqlc a = new cffj();

    private cffj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        cfhi cfhiVar = (cfhi) cqkpVar;
        int i = cffo.a;
        boolean z = true;
        if (!cfhiVar.b().booleanValue() && !cfhiVar.a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

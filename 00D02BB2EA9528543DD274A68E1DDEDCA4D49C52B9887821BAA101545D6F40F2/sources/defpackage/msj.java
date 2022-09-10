package defpackage;
/* renamed from: msj  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class msj implements cqlc {
    static final cqlc a = new msj();

    private msj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        mtg mtgVar = (mtg) cqkpVar;
        dcdn<mtf, Integer> dcdnVar = msu.a;
        boolean z = false;
        if (mtgVar.b(mtf.DESTINATIONS_LIST).booleanValue() && !mtgVar.m().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

package defpackage;
/* renamed from: msi  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class msi implements cqlc {
    static final cqlc a = new msi();

    private msi() {
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

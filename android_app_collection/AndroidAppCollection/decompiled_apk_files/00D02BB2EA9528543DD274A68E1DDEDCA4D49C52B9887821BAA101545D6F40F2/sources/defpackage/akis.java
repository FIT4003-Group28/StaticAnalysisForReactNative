package defpackage;
/* renamed from: akis  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class akis implements cqlc {
    static final cqlc a = new akis();

    private akis() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        akld akldVar = (akld) cqkpVar;
        int i = akji.a;
        boolean z = false;
        if (!cqjv.v(akldVar.c(0)).booleanValue() && akldVar.b().size() == 1 && !cqjv.v(akldVar.k()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

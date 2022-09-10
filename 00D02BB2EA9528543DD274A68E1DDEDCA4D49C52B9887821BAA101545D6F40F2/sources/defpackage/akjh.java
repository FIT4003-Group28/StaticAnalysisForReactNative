package defpackage;
/* renamed from: akjh  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class akjh implements cqlc {
    static final cqlc a = new akjh();

    private akjh() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        akld akldVar = (akld) cqkpVar;
        int i = akji.a;
        boolean z = false;
        if (cqjv.v(akldVar.k()).booleanValue() && akldVar.b().size() != 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

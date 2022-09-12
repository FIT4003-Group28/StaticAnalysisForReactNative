package defpackage;
/* renamed from: akja  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class akja implements cqlc {
    static final cqlc a = new akja();

    private akja() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        akld akldVar = (akld) cqkpVar;
        int i = akji.a;
        boolean z = false;
        if (akldVar.b().size() == 2 || (akldVar.b().size() > 1 && !cqjv.v(akldVar.k()).booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

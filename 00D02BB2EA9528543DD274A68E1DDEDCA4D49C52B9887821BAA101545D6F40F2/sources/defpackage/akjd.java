package defpackage;
/* renamed from: akjd  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class akjd implements cqlc {
    static final cqlc a = new akjd();

    private akjd() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        akld akldVar = (akld) cqkpVar;
        int i = akji.a;
        boolean z = false;
        if (akldVar.b().size() > 2 && cqjv.v(akldVar.k()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

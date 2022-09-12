package defpackage;
/* renamed from: aexe  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aexe implements cqlc {
    static final cqlc a = new aexe();

    private aexe() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aexo aexoVar = (aexo) cqkpVar;
        int i = aexl.a;
        boolean z = true;
        if (aexoVar.a().booleanValue() && aexoVar.b().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

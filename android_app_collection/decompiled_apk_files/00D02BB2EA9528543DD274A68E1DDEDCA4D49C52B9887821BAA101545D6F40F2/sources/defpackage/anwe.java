package defpackage;
/* renamed from: anwe  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class anwe implements cqlc {
    static final cqlc a = new anwe();

    private anwe() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        anxw anxwVar = (anxw) cqkpVar;
        int i = anwf.a;
        boolean z = false;
        if (!anxwVar.c().booleanValue() && !anxwVar.e().booleanValue() && !anxwVar.s().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

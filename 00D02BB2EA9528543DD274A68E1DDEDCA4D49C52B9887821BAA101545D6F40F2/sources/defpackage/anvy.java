package defpackage;
/* renamed from: anvy  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class anvy implements cqlc {
    static final cqlc a = new anvy();

    private anvy() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        anxw anxwVar = (anxw) cqkpVar;
        int i = anvz.a;
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

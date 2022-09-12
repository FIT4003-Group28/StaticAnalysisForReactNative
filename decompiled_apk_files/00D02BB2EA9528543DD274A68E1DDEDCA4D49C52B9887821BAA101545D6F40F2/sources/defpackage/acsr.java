package defpackage;
/* renamed from: acsr  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class acsr implements cqlc {
    static final cqlc a = new acsr();

    private acsr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        actl actlVar = (actl) cqkpVar;
        int i = acss.a;
        boolean z = false;
        if (actlVar.p().booleanValue() && !actlVar.o().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

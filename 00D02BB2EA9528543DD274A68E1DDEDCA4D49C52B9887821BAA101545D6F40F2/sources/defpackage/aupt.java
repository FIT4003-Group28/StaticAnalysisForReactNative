package defpackage;
/* renamed from: aupt  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aupt implements cqlc {
    static final cqlc a = new aupt();

    private aupt() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aura auraVar = (aura) cqkpVar;
        int i = aupy.a;
        boolean z = true;
        if (!auraVar.b().booleanValue() && !auraVar.c().booleanValue() && !auraVar.e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

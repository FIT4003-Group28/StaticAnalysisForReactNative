package defpackage;
/* renamed from: rrb  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class rrb implements cqlc {
    static final cqlc a = new rrb();

    private rrb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        sae saeVar = (sae) cqkpVar;
        int i = rre.c;
        boolean z = false;
        if (saeVar.o().booleanValue() && !saeVar.k().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

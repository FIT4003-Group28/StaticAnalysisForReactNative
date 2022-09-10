package defpackage;
/* renamed from: afpz  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class afpz implements cqlc {
    static final cqlc a = new afpz();

    private afpz() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        afrk afrkVar = (afrk) cqkpVar;
        int i = afrj.a;
        boolean z = true;
        if (!afrkVar.y().booleanValue() && !afrkVar.u().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

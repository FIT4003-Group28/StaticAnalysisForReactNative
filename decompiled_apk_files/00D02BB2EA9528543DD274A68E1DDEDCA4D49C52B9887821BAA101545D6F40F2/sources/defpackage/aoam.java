package defpackage;
/* renamed from: aoam  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aoam implements cqlc {
    static final cqlc a = new aoam();

    private aoam() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aobh aobhVar = (aobh) cqkpVar;
        cqtv cqtvVar = aobg.a;
        boolean z = true;
        if (!cqjv.v(aobhVar.e()).booleanValue() && !cqjv.v(aobhVar.f()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

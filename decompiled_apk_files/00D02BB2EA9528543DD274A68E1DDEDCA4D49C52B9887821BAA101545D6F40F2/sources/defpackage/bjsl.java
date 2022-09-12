package defpackage;
/* renamed from: bjsl  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bjsl implements cqlc {
    static final cqlc a = new bjsl();

    private bjsl() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bjwn bjwnVar = (bjwn) cqkpVar;
        int i = bjsn.a;
        boolean z = true;
        if (!bjwnVar.c().booleanValue() && bjwnVar.d().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

package defpackage;
/* renamed from: arrj  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class arrj implements cqlc {
    static final cqlc a = new arrj();

    private arrj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aryk arykVar = (aryk) cqkpVar;
        int i = arrs.a;
        boolean z = false;
        if (arykVar.c().booleanValue() && arykVar.b().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

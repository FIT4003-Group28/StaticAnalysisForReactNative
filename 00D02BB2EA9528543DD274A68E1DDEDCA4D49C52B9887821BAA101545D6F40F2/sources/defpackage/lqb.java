package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lqb  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class lqb implements cqlc {
    static final cqlc a = new lqb();

    private lqb() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        lwp lwpVar = (lwp) cqkpVar;
        boolean z = false;
        if (lqi.d(lwpVar) != null && lqi.d(lwpVar).t().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

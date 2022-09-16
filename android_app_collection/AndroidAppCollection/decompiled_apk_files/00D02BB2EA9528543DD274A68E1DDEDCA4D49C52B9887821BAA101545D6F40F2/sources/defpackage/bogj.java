package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bogj  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bogj implements cqlc {
    static final cqlc a = new bogj();

    private bogj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bopv bopvVar = (bopv) cqkpVar;
        int i = bogz.a;
        boolean z = false;
        if (bopvVar.i().booleanValue() && bopvVar.p().intValue() > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

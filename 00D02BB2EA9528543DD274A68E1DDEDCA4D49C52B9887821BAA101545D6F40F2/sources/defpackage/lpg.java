package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lpg  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class lpg implements cqlc {
    static final cqlc a = new lpg();

    private lpg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        lwp lwpVar = (lwp) cqkpVar;
        int i = lqi.a;
        boolean z = true;
        if (!lwpVar.a().k().booleanValue() && !lwpVar.e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wlx  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class wlx implements cqlc {
    static final cqlc a = new wlx();

    private wlx() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        wpl wplVar = (wpl) cqkpVar;
        int i = wmb.a;
        boolean z = false;
        if (wplVar.aa().booleanValue() && !wplVar.Z(donz.ON_TIME).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

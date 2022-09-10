package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wlz  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class wlz implements cqlc {
    static final cqlc a = new wlz();

    private wlz() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        wpl wplVar = (wpl) cqkpVar;
        int i = wmb.a;
        boolean z = true;
        if (!wplVar.ag().booleanValue() && !wplVar.Z(donz.CHANGED).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

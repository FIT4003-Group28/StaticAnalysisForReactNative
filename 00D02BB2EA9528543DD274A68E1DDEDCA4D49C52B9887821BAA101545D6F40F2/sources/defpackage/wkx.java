package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wkx  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class wkx implements cqlc {
    static final cqlc a = new wkx();

    private wkx() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        wpl wplVar = (wpl) cqkpVar;
        int i = wmb.a;
        boolean z = false;
        if (!cqjv.v(wplVar.af()).booleanValue() && !wplVar.ag().booleanValue() && !wplVar.Z(donz.CHANGED).booleanValue() && !wplVar.Z(donz.CANCELED).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

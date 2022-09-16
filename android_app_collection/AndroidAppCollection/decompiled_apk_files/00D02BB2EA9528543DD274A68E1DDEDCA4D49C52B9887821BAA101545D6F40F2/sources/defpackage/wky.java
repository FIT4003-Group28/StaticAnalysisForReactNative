package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wky  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class wky implements cqlc {
    static final cqlc a = new wky();

    private wky() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        wpl wplVar = (wpl) cqkpVar;
        int i = wmb.a;
        boolean z = false;
        if (wmb.n(wplVar.d()).booleanValue() && !wmb.n(wplVar.r()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

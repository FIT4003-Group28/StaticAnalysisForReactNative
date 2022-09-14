package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ofk  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class ofk implements cqlc {
    static final cqlc a = new ofk();

    private ofk() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        oxi oxiVar = (oxi) cqkpVar;
        int i = oft.a;
        boolean z = true;
        if (!oxiVar.n().booleanValue() && cqjv.v(oxiVar.f()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

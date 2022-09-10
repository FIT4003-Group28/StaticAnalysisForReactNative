package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: agni  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class agni implements cqlc {
    static final cqlc a = new agni();

    private agni() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        agwu agwuVar = (agwu) cqkpVar;
        int i = agoc.b;
        boolean z = false;
        if (cqjv.v(agwuVar.g()).booleanValue() && cqjv.v(agwuVar.i()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

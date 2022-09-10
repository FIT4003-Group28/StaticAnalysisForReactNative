package defpackage;
/* renamed from: bgky  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgky implements cqlc {
    static final cqlc a = new bgky();

    private bgky() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bgnw bgnwVar = (bgnw) cqkpVar;
        int i = bglb.a;
        boolean z = true;
        if (!bgnwVar.a().booleanValue() && bgnwVar.c().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

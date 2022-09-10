package defpackage;
/* renamed from: bgkv  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bgkv implements cqlc {
    static final cqlc a = new bgkv();

    private bgkv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bgnw bgnwVar = (bgnw) cqkpVar;
        int i = bglb.a;
        boolean z = true;
        if (!bgnwVar.a().booleanValue() && !bgnwVar.c().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

package defpackage;
/* renamed from: bghi  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bghi implements cqlc {
    static final cqlc a = new bghi();

    private bghi() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bgnp bgnpVar = (bgnp) cqkpVar;
        int i = bgic.a;
        boolean z = true;
        if ((bgnpVar.d().booleanValue() || !cqjv.v(bgnpVar.b()).booleanValue()) && !bgnpVar.e().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

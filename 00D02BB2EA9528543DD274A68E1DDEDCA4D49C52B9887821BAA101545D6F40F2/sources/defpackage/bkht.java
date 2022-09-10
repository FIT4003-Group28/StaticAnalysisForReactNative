package defpackage;
/* renamed from: bkht  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkht implements cqlc {
    static final cqlc a = new bkht();

    private bkht() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bkiw bkiwVar = (bkiw) cqkpVar;
        cqtd cqtdVar = bkiv.a;
        boolean z = false;
        if (bkiwVar.k().booleanValue() && bkiwVar.l().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

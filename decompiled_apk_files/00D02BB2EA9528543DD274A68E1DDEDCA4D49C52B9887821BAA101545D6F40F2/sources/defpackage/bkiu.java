package defpackage;
/* renamed from: bkiu  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkiu implements cqlc {
    static final cqlc a = new bkiu();

    private bkiu() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bkiw bkiwVar = (bkiw) cqkpVar;
        cqtd cqtdVar = bkiv.a;
        boolean z = false;
        if (bkiwVar.k().booleanValue() && !bkiwVar.l().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

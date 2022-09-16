package defpackage;
/* renamed from: bpji  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bpji implements cqlc {
    static final cqlc a = new bpji();

    private bpji() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bpvs bpvsVar = (bpvs) cqkpVar;
        cqjg cqjgVar = bpjo.a;
        boolean z = false;
        if (bpvsVar.c().booleanValue() && bpvsVar.f().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

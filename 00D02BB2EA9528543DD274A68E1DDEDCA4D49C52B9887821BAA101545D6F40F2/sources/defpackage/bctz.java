package defpackage;
/* renamed from: bctz  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bctz implements cqlc {
    static final cqlc a = new bctz();

    private bctz() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bdae bdaeVar = (bdae) cqkpVar;
        cqjg cqjgVar = bcuc.a;
        boolean z = true;
        if (!bdaeVar.b().booleanValue() && bdaeVar.a().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

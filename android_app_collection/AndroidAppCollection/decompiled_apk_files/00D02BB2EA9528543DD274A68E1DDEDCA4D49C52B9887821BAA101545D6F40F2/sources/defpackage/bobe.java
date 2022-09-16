package defpackage;
/* renamed from: bobe  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bobe implements cqlc {
    static final cqlc a = new bobe();

    private bobe() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        boqh boqhVar = (boqh) cqkpVar;
        int i = bobo.a;
        boolean z = false;
        if (boqhVar.f().booleanValue() && !boqhVar.g().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

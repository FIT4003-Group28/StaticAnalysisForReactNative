package defpackage;
/* renamed from: aiqg  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aiqg implements cqlc {
    static final cqlc a = new aiqg();

    private aiqg() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aiqv aiqvVar = (aiqv) cqkpVar;
        cqjg cqjgVar = aiqw.a;
        boolean z = false;
        if (cqjv.v(aiqvVar.e()).booleanValue() || (cqjv.v(aiqvVar.f()).booleanValue() && cqjv.v(aiqvVar.h()).booleanValue())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

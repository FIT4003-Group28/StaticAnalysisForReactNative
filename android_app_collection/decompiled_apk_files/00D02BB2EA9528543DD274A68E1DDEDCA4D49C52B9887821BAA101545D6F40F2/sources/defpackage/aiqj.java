package defpackage;
/* renamed from: aiqj  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aiqj implements cqlc {
    static final cqlc a = new aiqj();

    private aiqj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aiqv aiqvVar = (aiqv) cqkpVar;
        cqjg cqjgVar = aiqw.a;
        boolean z = true;
        if (!cqjv.v(aiqvVar.f()).booleanValue() && !cqjv.v(aiqvVar.h()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

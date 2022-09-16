package defpackage;
/* renamed from: cfxr  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cfxr implements cqlc {
    static final cqlc a = new cfxr();

    private cfxr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i = cfxu.a;
        dccx F = dcdc.F();
        dcdc<cfvr> f = ((cfra) cqkpVar).f();
        int size = f.size();
        for (int i2 = 0; i2 < size; i2++) {
            F.g(cqgr.fT(new cfvq(), f.get(i2)));
        }
        return F.f();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}

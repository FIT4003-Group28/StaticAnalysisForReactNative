package defpackage;
/* compiled from: PG */
/* renamed from: bqhg  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqhg {
    private static final bqha a = new bqha();

    static {
        int i = bqhd.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bqgx e() {
        bqgp bqgpVar = new bqgp();
        bqgpVar.d(1);
        bqgpVar.c(bqhf.d().a());
        bqgpVar.a(dcdc.e());
        bqhq bZ = bqhr.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqhr bqhrVar = (bqhr) bZ.b;
        bqhrVar.a = 1 | bqhrVar.a;
        bqhrVar.b = 0;
        bqgpVar.b(bZ.bK());
        return bqgpVar;
    }

    public static bqhg f(bqif bqifVar) {
        return a.k().NV(bqifVar);
    }

    public abstract dcdc<bqgw> a();

    public abstract bqhf b();

    public abstract bqhr c();

    public abstract int d();
}

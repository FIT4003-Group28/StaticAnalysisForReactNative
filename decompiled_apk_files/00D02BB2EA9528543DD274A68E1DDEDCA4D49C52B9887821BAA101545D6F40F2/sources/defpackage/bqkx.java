package defpackage;
/* compiled from: PG */
/* renamed from: bqkx  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqkx {
    public static bqkw k() {
        bqix bqixVar = new bqix();
        bqixVar.d(dqgr.PUBLISHED);
        bqixVar.b(dcdc.e());
        bqixVar.b = dcdc.r(dcdc.e());
        return bqixVar;
    }

    public static bqkx l(akqi akqiVar) {
        bqkw k = k();
        k.c(akqiVar);
        k.f(0);
        k.e("");
        k.d(dqgr.DRAFT);
        return k.h();
    }

    public abstract akqi a();

    public abstract int b();

    public abstract String c();

    public abstract dqgr d();

    public abstract dbsg<eapy> e();

    public abstract dbsg<dqwy> f();

    public abstract dcdc<dreq> g();

    public abstract dcdc<drfo> h();

    public final docg i() {
        docc bZ = docg.M.bZ();
        int b = b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        docg docgVar = (docg) bZ.b;
        docgVar.a |= 512;
        docgVar.q = b;
        String c = c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        docg docgVar2 = (docg) bZ.b;
        c.getClass();
        docgVar2.a |= 1024;
        docgVar2.r = c;
        drfu j = j();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        docg docgVar3 = (docg) bZ.b;
        j.getClass();
        docgVar3.H = j;
        docgVar3.a |= 134217728;
        if (f().a()) {
            dqwy b2 = f().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            docg docgVar4 = (docg) bZ.b;
            b2.getClass();
            docgVar4.G = b2;
            docgVar4.a |= 67108864;
        }
        bZ.a(g());
        bZ.c(h());
        return bZ.bK();
    }

    public final drfu j() {
        return (drfu) e().h(bqkv.a).c(drfu.c);
    }

    public final boolean m() {
        return b() == 0 && c().isEmpty();
    }
}

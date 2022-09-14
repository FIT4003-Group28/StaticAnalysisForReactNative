package defpackage;
/* compiled from: PG */
/* renamed from: cdrf  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdrf implements cdis {
    private final dbsg<dnfg> i() {
        return h().h(cdra.a);
    }

    private final dnpq j() {
        return g().e((dssr) dnpq.g.cu(7), dnpq.g);
    }

    @Override // defpackage.cdis
    public final dbsg<String> a() {
        if ((j().a & 8) == 0) {
            if (i().a()) {
                dnna dnnaVar = i().b().b;
                if (dnnaVar == null) {
                    dnnaVar = dnna.m;
                }
                if ((dnnaVar.a & 1) != 0) {
                    dnna dnnaVar2 = i().b().b;
                    if (dnnaVar2 == null) {
                        dnnaVar2 = dnna.m;
                    }
                    return dbsg.i(dnnaVar2.b);
                }
            }
            return dbpy.a;
        }
        return dbsg.i(j().d);
    }

    @Override // defpackage.cdis
    public final dbsg<String> b() {
        if ((j().a & 2) == 0) {
            if (i().a()) {
                dnna dnnaVar = i().b().b;
                if (dnnaVar == null) {
                    dnnaVar = dnna.m;
                }
                if ((dnnaVar.a & 32) != 0) {
                    dnna dnnaVar2 = i().b().b;
                    if (dnnaVar2 == null) {
                        dnnaVar2 = dnna.m;
                    }
                    return dbsg.i(dnnaVar2.g);
                }
            }
            return dbpy.a;
        }
        return dbsg.i(j().c);
    }

    @Override // defpackage.cdis
    public final int c() {
        return ((Integer) i().h(cdrb.a).c(0)).intValue();
    }

    @Override // defpackage.cdis
    public final int d() {
        return ((Integer) i().h(cdrc.a).c(0)).intValue();
    }

    @Override // defpackage.cdis
    public final dbsg<String> e() {
        if (i().a()) {
            dnna dnnaVar = i().b().b;
            if (dnnaVar == null) {
                dnnaVar = dnna.m;
            }
            if ((dnnaVar.a & 8) != 0) {
                dnna dnnaVar2 = i().b().b;
                if (dnnaVar2 == null) {
                    dnnaVar2 = dnna.m;
                }
                return dbsg.i(dnnaVar2.e);
            }
        }
        return (j().a & 16) != 0 ? dbsg.i(j().e) : dbpy.a;
    }

    @Override // defpackage.cdis
    public final boolean f() {
        return ((Boolean) i().h(cdrd.a).c(false)).booleanValue();
    }

    public abstract bvrt<dnpq> g();

    public abstract dbsg<bvrt<dnfg>> h();
}

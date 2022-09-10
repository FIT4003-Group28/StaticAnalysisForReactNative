package defpackage;
/* compiled from: PG */
/* renamed from: dmv  reason: default package */
/* loaded from: classes6.dex */
public abstract class dmv {
    public abstract dmr a();

    public abstract dbsg<String> b();

    public abstract dbsg<ilo> c();

    public abstract dbsg<dsza> d();

    public abstract dbsg<dfmg> e();

    public abstract dbsg f();

    public final dbsg<dsza> g() {
        if (d().a()) {
            return d();
        }
        if (a().c().a()) {
            return a().c();
        }
        if (c().a()) {
            ilo b = c().b();
            if ((b.h().a & 1) == 0) {
                if (b.aj() != null) {
                    akqq aj = b.aj();
                    dbsk.s(aj);
                    dsyz bZ = dsza.e.bZ();
                    double d = aj.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dsza dszaVar = (dsza) bZ.b;
                    int i = dszaVar.a | 1;
                    dszaVar.a = i;
                    dszaVar.b = d;
                    double d2 = aj.b;
                    dszaVar.a = i | 2;
                    dszaVar.c = d2;
                    return dbsg.i(bZ.bK());
                }
            } else {
                dhjz dhjzVar = b.h().e;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                dsyz bZ2 = dsza.e.bZ();
                double d3 = dhjzVar.c;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dsza dszaVar2 = (dsza) bZ2.b;
                int i2 = dszaVar2.a | 1;
                dszaVar2.a = i2;
                dszaVar2.b = d3;
                double d4 = dhjzVar.b;
                int i3 = i2 | 2;
                dszaVar2.a = i3;
                dszaVar2.c = d4;
                if ((dhjzVar.a & 4) != 0) {
                    double d5 = dhjzVar.d;
                    dszaVar2.a = i3 | 4;
                    dszaVar2.d = d5;
                }
                return dbsg.i(bZ2.bK());
            }
        }
        return dbpy.a;
    }

    public abstract dmu h();
}

package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cdsa  reason: default package */
/* loaded from: classes4.dex */
public final class cdsa implements cdjd {
    public dbsg<cdjl> c;
    public dbsg<cdis> d;
    private final bvrt<dmbc> f;
    private dbsg<cdiy> g;
    public final cdrx a = new cdrx(this);
    private final cdrz e = new cdrz(this);
    public final cdrw b = new cdrw(this);

    public cdsa(dmbc dmbcVar) {
        this.g = dbpy.a;
        this.c = dbpy.a;
        this.d = dbpy.a;
        this.f = bvrt.b(dmbcVar);
        dmaw dmawVar = dmbcVar.e;
        dmcc dmccVar = (dmawVar == null ? dmaw.n : dmawVar).h;
        if (!(dmccVar == null ? dmcc.i : dmccVar).b.isEmpty()) {
            dmaw dmawVar2 = dmbcVar.e;
            dmawVar2 = dmawVar2 == null ? dmaw.n : dmawVar2;
            dmcc dmccVar2 = dmawVar2.h;
            this.g = dbsg.i(new cdrv(dmawVar2, (dmccVar2 == null ? dmcc.i : dmccVar2).d));
        }
        dmbu dmbuVar = dmbcVar.c;
        if (((dmbuVar == null ? dmbu.i : dmbuVar).a & 16) != 0) {
            dmbu dmbuVar2 = dmbcVar.c;
            dmbe dmbeVar = (dmbuVar2 == null ? dmbu.i : dmbuVar2).e;
            this.d = dbsg.i(new cdru(dmbeVar == null ? dmbe.c : dmbeVar));
        }
        dmbg dmbgVar = dmbcVar.d;
        if (((dmbgVar == null ? dmbg.i : dmbgVar).a & 2) != 0) {
            dmbg dmbgVar2 = dmbcVar.d;
            dmcc dmccVar3 = (dmbgVar2 == null ? dmbg.i : dmbgVar2).c;
            dmccVar3 = dmccVar3 == null ? dmcc.i : dmccVar3;
            dmbg dmbgVar3 = dmbcVar.d;
            dmcc dmccVar4 = (dmbgVar3 == null ? dmbg.i : dmbgVar3).c;
            this.c = dbsg.i(cdsb.i(dmccVar3, (dmccVar4 == null ? dmcc.i : dmccVar4).d));
        }
    }

    @Override // defpackage.cdjd
    public final cdjb a() {
        return this.a;
    }

    @Override // defpackage.cdjd
    public final cdjc b() {
        return this.e;
    }

    @Override // defpackage.cdjd
    public final cdiz c() {
        return this.b;
    }

    @Override // defpackage.cdjd
    public final dbsg<cdiy> d() {
        return this.g;
    }

    @Override // defpackage.cdjd
    public final /* bridge */ /* synthetic */ cdjd e(boolean z) {
        if (this.c.a()) {
            cdsa cdsaVar = new cdsa(j());
            dmbg dmbgVar = j().d;
            if (dmbgVar == null) {
                dmbgVar = dmbg.i;
            }
            dmcc dmccVar = dmbgVar.c;
            if (dmccVar == null) {
                dmccVar = dmcc.i;
            }
            cdsaVar.c = dbsg.i(cdsb.i(dmccVar, z));
            return cdsaVar;
        }
        return this;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cdsa)) {
            return false;
        }
        cdsa cdsaVar = (cdsa) obj;
        return dbsd.a(this.f, cdsaVar.f) && dbsd.a(this.g, cdsaVar.g) && dbsd.a(this.d, cdsaVar.d) && dbsd.a(this.c, cdsaVar.c);
    }

    @Override // defpackage.cdjd
    public final /* bridge */ /* synthetic */ cdjd f(boolean z) {
        if (this.g.a()) {
            cdsa cdsaVar = new cdsa(j());
            dmaw dmawVar = j().e;
            if (dmawVar == null) {
                dmawVar = dmaw.n;
            }
            cdsaVar.g = dbsg.i(new cdrv(dmawVar, z));
            return cdsaVar;
        }
        return this;
    }

    @Override // defpackage.cdjd
    public final /* bridge */ /* synthetic */ cdjd g(int i, dqjh dqjhVar) {
        dmby dmbyVar = j().f;
        if (dmbyVar == null) {
            dmbyVar = dmby.h;
        }
        dmbc j = j();
        dsqp dsqpVar = (dsqp) j.cu(5);
        dsqpVar.bC(j);
        dmbb dmbbVar = (dmbb) dsqpVar;
        dsqp dsqpVar2 = (dsqp) dmbyVar.cu(5);
        dsqpVar2.bC(dmbyVar);
        dmbx dmbxVar = (dmbx) dsqpVar2;
        if (dmbxVar.c) {
            dmbxVar.bF();
            dmbxVar.c = false;
        }
        dmby dmbyVar2 = (dmby) dmbxVar.b;
        int i2 = dmbyVar2.a | 2;
        dmbyVar2.a = i2;
        dmbyVar2.c = i;
        dmbyVar2.b = dqjhVar.e;
        dmbyVar2.a = i2 | 1;
        if (dmbbVar.c) {
            dmbbVar.bF();
            dmbbVar.c = false;
        }
        dmbc dmbcVar = (dmbc) dmbbVar.b;
        dmby bK = dmbxVar.bK();
        bK.getClass();
        dmbcVar.f = bK;
        dmbcVar.a |= 16;
        return new cdsa(dmbbVar.bK());
    }

    @Override // defpackage.cdjd
    public final docg h() {
        return cdpy.a(j());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.g, this.d, this.c});
    }

    @Override // defpackage.cdjd
    public final dmbc i() {
        return j();
    }

    public final dmbc j() {
        return this.f.e((dssr) dmbc.h.cu(7), dmbc.h);
    }
}

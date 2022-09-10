package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdrn  reason: default package */
/* loaded from: classes4.dex */
public final class cdrn implements cdiz {
    final /* synthetic */ cdrr a;

    public cdrn(cdrr cdrrVar) {
        this.a = cdrrVar;
    }

    @Override // defpackage.cdiz
    public final dcdc<cdji> a() {
        dccx F = dcdc.F();
        for (dnwl dnwlVar : this.a.p().B) {
            F.g(new cdql(dnwlVar));
        }
        return F.f();
    }

    @Override // defpackage.cdiz
    public final dbsg<cdjl> b() {
        return this.a.l().h(cdrm.a);
    }

    @Override // defpackage.cdiz
    public final dcdc<drew> c() {
        return dcdc.r(this.a.p().w);
    }

    @Override // defpackage.cdiz
    public final dcdc<drew> d() {
        return dcdc.r(this.a.p().x);
    }

    @Override // defpackage.cdiz
    public final dbsg<Integer> e() {
        return dbsg.j((this.a.p().a & 512) != 0 ? Integer.valueOf(this.a.p().q) : null);
    }

    @Override // defpackage.cdiz
    public final dbsg<eapy> f() {
        return bqsq.e(this.a.p());
    }

    @Override // defpackage.cdiz
    public final dbsg<dqwy> g() {
        dqwy dqwyVar;
        if ((this.a.p().a & 67108864) != 0) {
            dqwyVar = this.a.p().G;
            if (dqwyVar == null) {
                dqwyVar = dqwy.c;
            }
        } else {
            dqwyVar = null;
        }
        return dbsg.j(dqwyVar);
    }

    @Override // defpackage.cdiz
    public final List<dreq> h() {
        return this.a.p().J;
    }

    @Override // defpackage.cdiz
    public final List<drfo> i() {
        return this.a.p().K;
    }
}

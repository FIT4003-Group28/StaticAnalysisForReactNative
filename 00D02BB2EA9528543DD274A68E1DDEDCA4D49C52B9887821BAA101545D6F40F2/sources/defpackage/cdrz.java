package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdrz  reason: default package */
/* loaded from: classes4.dex */
public final class cdrz implements cdjc {
    final /* synthetic */ cdsa a;

    public cdrz(cdsa cdsaVar) {
        this.a = cdsaVar;
    }

    @Override // defpackage.cdjc
    public final int a() {
        dmby dmbyVar = this.a.j().f;
        if (dmbyVar == null) {
            dmbyVar = dmby.h;
        }
        return dmbyVar.c;
    }

    @Override // defpackage.cdjc
    public final dqjh b() {
        dmby dmbyVar = this.a.j().f;
        if (dmbyVar == null) {
            dmbyVar = dmby.h;
        }
        dqjh b = dqjh.b(dmbyVar.b);
        return b == null ? dqjh.UNKNOWN_VOTE_TYPE : b;
    }

    @Override // defpackage.cdjc
    public final dbsg<String> c() {
        String str;
        dmby dmbyVar = this.a.j().f;
        if (dmbyVar == null) {
            dmbyVar = dmby.h;
        }
        dnpq dnpqVar = dmbyVar.f;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        if ((dnpqVar.a & 2) != 0) {
            dmby dmbyVar2 = this.a.j().f;
            if (dmbyVar2 == null) {
                dmbyVar2 = dmby.h;
            }
            dnpq dnpqVar2 = dmbyVar2.f;
            if (dnpqVar2 == null) {
                dnpqVar2 = dnpq.g;
            }
            str = dnpqVar2.c;
        } else {
            str = null;
        }
        return dbsg.j(str);
    }

    @Override // defpackage.cdjc
    public final dbsg<dnpq> d() {
        dnpq dnpqVar;
        dmby dmbyVar = this.a.j().f;
        if (dmbyVar == null) {
            dmbyVar = dmby.h;
        }
        if ((dmbyVar.a & 32) != 0) {
            dmby dmbyVar2 = this.a.j().f;
            if (dmbyVar2 == null) {
                dmbyVar2 = dmby.h;
            }
            dnpqVar = dmbyVar2.g;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
        } else {
            dnpqVar = null;
        }
        return dbsg.j(dnpqVar);
    }

    @Override // defpackage.cdjc
    public final long e() {
        dmby dmbyVar = this.a.j().f;
        if (dmbyVar == null) {
            dmbyVar = dmby.h;
        }
        return dmbyVar.e;
    }
}

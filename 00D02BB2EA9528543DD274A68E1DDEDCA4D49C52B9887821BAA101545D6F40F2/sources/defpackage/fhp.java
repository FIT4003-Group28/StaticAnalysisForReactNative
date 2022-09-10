package defpackage;
/* compiled from: PG */
/* renamed from: fhp  reason: default package */
/* loaded from: classes6.dex */
final class fhp<T> implements dzsj<T> {
    final /* synthetic */ fhq a;
    private final int b;

    public fhp(fhq fhqVar, int i) {
        this.a = fhqVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [buny, T] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fhq fhqVar = this.a;
                dzsj<cqhn> il = fhqVar.c.eW.il();
                dzsj dzsjVar = fhqVar.a;
                if (dzsjVar == null) {
                    dzsjVar = new fhp(fhqVar, 1);
                    fhqVar.a = dzsjVar;
                }
                return (T) new bpca(il, dzsjVar);
            case 1:
                fhq fhqVar2 = this.a;
                return (T) new bpcf(fhqVar2.c.eW.er(), fhqVar2.c.fM(), fhqVar2.c.uR());
            case 2:
                fhq fhqVar3 = this.a;
                return (T) new boss(dxjh.c(fhqVar3.c.cn()), fhqVar3.c.fO());
            case 3:
                fhq fhqVar4 = this.a;
                return (T) new bnxt(fhqVar4.c.eW.K(), fhqVar4.c.eW.n(), fhqVar4.c.eW.nh());
            case 4:
                fhq fhqVar5 = this.a;
                dzsj dzsjVar2 = fhqVar5.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fhp(fhqVar5, 5);
                    fhqVar5.b = dzsjVar2;
                }
                return (T) new bnxx(dzsjVar2);
            case 5:
                fhq fhqVar6 = this.a;
                T t = (T) fhqVar6.d;
                if (t != null) {
                    return t;
                }
                dxio c = dxjc.c(fhqVar6.c.eW.h());
                bvrb tn = fhqVar6.c.eW.a.tn();
                dxjg.e(tn);
                ?? r1 = (T) buoa.b(bunz.b(c, tn));
                fhqVar6.d = r1;
                return r1;
            case 6:
                fhq fhqVar7 = this.a;
                ftt fttVar = fhqVar7.c;
                return (T) new bnyd(fttVar.eV, fttVar.y(), fhqVar7.c.fO());
            case 7:
                fhq fhqVar8 = this.a;
                return (T) new bonw(fhqVar8.c.cD(), fhqVar8.c.y(), fhqVar8.c.eS());
            default:
                fhq fhqVar9 = this.a;
                cztz m = fhqVar9.c.eW.a.m();
                dxjg.e(m);
                btpc sz = fhqVar9.c.eW.a.sz();
                dxjg.e(sz);
                return (T) new bnyj(m, sz);
        }
    }
}

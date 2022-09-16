package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fja  reason: default package */
/* loaded from: classes6.dex */
public final class fja<T> implements dzsj<T> {
    final /* synthetic */ fjb a;
    private final int b;

    public fja(fjb fjbVar, int i) {
        this.a = fjbVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fjb fjbVar = this.a;
                ftt fttVar = fjbVar.g;
                return (T) new bnyd(fttVar.eV, fttVar.y(), fjbVar.g.fO());
            case 1:
                fjb fjbVar2 = this.a;
                dzsj dzsjVar = fjbVar2.c;
                if (dzsjVar == null) {
                    dzsjVar = new fja(fjbVar2, 2);
                    fjbVar2.c = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj<Executor> di = fjbVar2.g.eW.di();
                ftt fttVar2 = fjbVar2.g;
                dzsj<rb> dzsjVar3 = fttVar2.eV;
                dzsj<jjm> kI = fttVar2.kI();
                dzsj<akzh> av = fjbVar2.g.av();
                dzsj<zzn> b = fjbVar2.b();
                dzsj<akox> as = fjbVar2.g.as();
                dzsj<bqdl> uU = fjbVar2.g.uU();
                dzsj dzsjVar4 = fjbVar2.d;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fja(fjbVar2, 6);
                    fjbVar2.d = dzsjVar4;
                }
                dzsj dzsjVar5 = dzsjVar4;
                dzsj<bqdk> uV = fjbVar2.g.uV();
                dzsj dzsjVar6 = fjbVar2.e;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fja(fjbVar2, 7);
                    fjbVar2.e = dzsjVar6;
                }
                return (T) new bqbb(dzsjVar2, di, dzsjVar3, kI, av, b, as, uU, dzsjVar5, uV, dzsjVar6);
            case 2:
                fjb fjbVar3 = this.a;
                dzsj<zzn> b2 = fjbVar3.b();
                dzsj<Executor> di2 = fjbVar3.g.eW.di();
                dzsj<gga> ad = fjbVar3.g.ad();
                dzsj<btrm> n = fjbVar3.g.eW.n();
                dzsj<akzh> av2 = fjbVar3.g.av();
                dzsj<alhv> iR = fjbVar3.g.eW.iR();
                dzsj dzsjVar7 = fjbVar3.a;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fja(fjbVar3, 4);
                    fjbVar3.a = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj<akox> as2 = fjbVar3.g.as();
                dzsj dzsjVar9 = fjbVar3.b;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fja(fjbVar3, 5);
                    fjbVar3.b = dzsjVar9;
                }
                return (T) new bqco(b2, di2, ad, n, av2, iR, dzsjVar8, as2, dzsjVar9);
            case 3:
                ftt fttVar3 = this.a.g;
                return (T) new zzn(fttVar3.a, dxjc.c(fttVar3.av()));
            case 4:
                return (T) new bpsj(this.a.g.au());
            case 5:
                ftt fttVar4 = this.a.g;
                return (T) new bpyj(fttVar4.a, fttVar4.ap());
            case 6:
                return (T) this.a.c();
            case 7:
                return (T) new bqbf(this.a.c());
            case 8:
                fjb fjbVar4 = this.a;
                dzsj<jjm> kI2 = fjbVar4.g.kI();
                dzsj dzsjVar10 = fjbVar4.f;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fja(fjbVar4, 9);
                    fjbVar4.f = dzsjVar10;
                }
                dzsj dzsjVar11 = dzsjVar10;
                ftt fttVar5 = fjbVar4.g;
                return (T) new bpzq(kI2, dzsjVar11, fttVar5.eV, fttVar5.eW.il(), fjbVar4.g.fO());
            case 9:
                ftt fttVar6 = this.a.g;
                return (T) new bpys(fttVar6.eV, fttVar6.eW.il());
            default:
                fjb fjbVar5 = this.a;
                return (T) new bqau(fjbVar5.g.eW.il(), fjbVar5.g.eV);
        }
    }
}

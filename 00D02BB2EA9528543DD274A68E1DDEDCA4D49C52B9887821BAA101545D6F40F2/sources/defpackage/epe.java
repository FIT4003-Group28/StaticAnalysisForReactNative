package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: epe  reason: default package */
/* loaded from: classes6.dex */
public final class epe<T> implements dzsj<T> {
    final /* synthetic */ epf a;
    private final int b;

    public epe(epf epfVar, int i) {
        this.a = epfVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                epf epfVar = this.a;
                dzsj<gga> ad = epfVar.g.ad();
                dzsj<ayrr> dzsjVar = epfVar.f;
                dzsj<ahjq> k = epfVar.g.eW.k();
                dzsj<bvsl> kf = epfVar.g.eW.kf();
                dzsj dzsjVar2 = epfVar.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new epe(epfVar, 1);
                    epfVar.b = dzsjVar2;
                }
                dzsj dzsjVar3 = dzsjVar2;
                dzsj dzsjVar4 = epfVar.c;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new epe(epfVar, 3);
                    epfVar.c = dzsjVar4;
                }
                dzsj dzsjVar5 = dzsjVar4;
                dzsj dzsjVar6 = epfVar.d;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new epe(epfVar, 4);
                    epfVar.d = dzsjVar6;
                }
                return (T) new ayvl(ad, dzsjVar, k, kf, dzsjVar3, dzsjVar5, dzsjVar6);
            case 1:
                epf epfVar2 = this.a;
                dzsj<gga> ad2 = epfVar2.g.ad();
                dzsj<aklj> pF = epfVar2.g.pF();
                dzsj dzsjVar7 = epfVar2.a;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new epe(epfVar2, 2);
                    epfVar2.a = dzsjVar7;
                }
                return (T) new aydo(ad2, pF, dzsjVar7, epfVar2.g.lF(), dxjh.c(epfVar2.g.bm()));
            case 2:
                epf epfVar3 = this.a;
                return (T) aaxp.b(epfVar3.g.wk(), epfVar3.g.eW.sH(), dxjc.c(epfVar3.g.m()));
            case 3:
                epf epfVar4 = this.a;
                return (T) new aybq(epfVar4.g.ad(), epfVar4.g.eW.jd(), dxjh.c(epfVar4.g.tV()));
            case 4:
                epf epfVar5 = this.a;
                return (T) new aywv(epfVar5.g.ad(), epfVar5.g.eW.al(), epfVar5.g.fO());
            case 5:
                return (T) this.a.b();
            case 6:
                return (T) this.a.c();
            case 7:
                return (T) this.a.d();
            case 8:
                return (T) baua.b(this.a.g.fc());
            case 9:
                epf epfVar6 = this.a;
                return (T) new aydu(epfVar6.g.eW.oL(), epfVar6.e(), epfVar6.e());
            case 10:
                epf epfVar7 = this.a;
                dzsj dzsjVar8 = epfVar7.e;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new epe(epfVar7, 11);
                    epfVar7.e = dzsjVar8;
                }
                return (T) new aydr(dzsjVar8);
            case 11:
                caxo ff = this.a.g.ff();
                caxa caxaVar = caxa.LISTS;
                dxjg.f(caxaVar);
                return (T) caxg.b(ff, caxaVar);
            case 12:
                epf epfVar8 = this.a;
                ftt fttVar = epfVar8.g;
                return (T) new ayvj(fttVar.eV, fttVar.eW.il(), epfVar8.g.fe());
            case 13:
                return (T) this.a.f();
            default:
                epf epfVar9 = this.a;
                return (T) new aywl(epfVar9.g.J(), epfVar9.g.wk(), epfVar9.g.eW.qn(), epfVar9.g.eW.qZ(), new aywe(epfVar9.g.ad(), epfVar9.g.eW.k(), epfVar9.g.eW.kf()), epfVar9.b(), epfVar9.c(), epfVar9.d(), epfVar9.g.eW.fm(), epfVar9.g.ur(), epfVar9.f());
        }
    }
}

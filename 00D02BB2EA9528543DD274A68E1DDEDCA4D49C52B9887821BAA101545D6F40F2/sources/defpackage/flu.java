package defpackage;

import android.app.Application;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: flu  reason: default package */
/* loaded from: classes6.dex */
public final class flu<T> implements dzsj<T> {
    final /* synthetic */ flv a;
    private final int b;

    public flu(flv flvVar, int i) {
        this.a = flvVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        switch (this.b) {
            case 0:
                flv flvVar = this.a;
                dzsj dzsjVar = flvVar.d;
                if (dzsjVar == null) {
                    dzsjVar = new flu(flvVar, 1);
                    flvVar.d = dzsjVar;
                }
                return (T) new aolt(dzsjVar, flvVar.j, flvVar.k.kI(), flvVar.f(), flvVar.g(), flvVar.k.ad(), flvVar.k.eW.il());
            case 1:
                flv flvVar2 = this.a;
                dzsj<gga> ad = flvVar2.k.ad();
                dzsj dzsjVar2 = flvVar2.a;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new flu(flvVar2, 2);
                    flvVar2.a = dzsjVar2;
                }
                return (T) new anpb(ad, dzsjVar2, flvVar2.k.eW.K(), flvVar2.k.eW.jB(), flvVar2.k.aX(), flvVar2.k.bf(), flvVar2.b(), flvVar2.c(), flvVar2.d(), flvVar2.k.eW.V(), flvVar2.k.eW.fx(), flvVar2.k.dM(), flvVar2.e());
            case 2:
                return (T) new anpc();
            case 3:
                Application a = this.a.k.eW.a.a();
                dxjg.e(a);
                return (T) new anqx(a);
            case 4:
                return (T) new anru();
            case 5:
                flv flvVar3 = this.a;
                dzsj dzsjVar3 = flvVar3.b;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new flu(flvVar3, 6);
                    flvVar3.b = dzsjVar3;
                }
                dzsj dzsjVar4 = flvVar3.c;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new flu(flvVar3, 7);
                    flvVar3.c = dzsjVar4;
                }
                return (T) new aoiw(dzsjVar3, dzsjVar4, flvVar3.k.eW.m());
            case 6:
                flv flvVar4 = this.a;
                return (T) new aojt(flvVar4.j, flvVar4.k.bf(), flvVar4.k.eW.m(), flvVar4.k.eW.ow(), flvVar4.k.eW.fx(), flvVar4.k.ad());
            case 7:
                flv flvVar5 = this.a;
                return (T) aoja.b(flvVar5.k.dM(), flvVar5.k.aX());
            case 8:
                return (T) new aojq();
            case 9:
                return (T) new anri(this.a.k.dg());
            case 10:
                flv flvVar6 = this.a;
                dzsj<bbut> bf = flvVar6.k.bf();
                ftt fttVar = flvVar6.k;
                dzsj dzsjVar5 = fttVar.cN;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fns(fttVar, 1315);
                    fttVar.cN = dzsjVar5;
                }
                return (T) new aoiq(bf, dzsjVar5, flvVar6.k.eW.m());
            case 11:
                flv flvVar7 = this.a;
                ftt fttVar2 = flvVar7.k;
                rb rbVar = fttVar2.a;
                dzsj<cjyb> sx = fttVar2.sx();
                dzsj dzsjVar6 = flvVar7.f;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new flu(flvVar7, 12);
                    flvVar7.f = dzsjVar6;
                }
                dzsj dzsjVar7 = flvVar7.g;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new flu(flvVar7, 13);
                    flvVar7.g = dzsjVar7;
                }
                aniz anizVar = new aniz(sx, dzsjVar6, dzsjVar7, flvVar7.k.eW.al());
                apjz ho = flvVar7.k.eW.ho();
                Application a2 = flvVar7.k.eW.a.a();
                dxjg.e(a2);
                aobv aobvVar = new aobv(a2, flvVar7.k.eW.ho(), flvVar7.h());
                anhg aW = flvVar7.k.aW();
                cjqy tr = flvVar7.k.eW.a.tr();
                dxjg.e(tr);
                return (T) new aobn(rbVar, anizVar, ho, aobvVar, aW, tr, new cpv());
            case 12:
                flv flvVar8 = this.a;
                cqat rR = flvVar8.k.eW.a.rR();
                dxjg.e(rR);
                angw jF = flvVar8.k.eW.jF();
                Object obj2 = flvVar8.e;
                if (obj2 instanceof dxjf) {
                    synchronized (obj2) {
                        obj = flvVar8.e;
                        if (obj instanceof dxjf) {
                            obj = new aovf();
                            dxjc.d(flvVar8.e, obj);
                            flvVar8.e = obj;
                        }
                    }
                    obj2 = obj;
                }
                cjqy tr2 = flvVar8.k.eW.a.tr();
                dxjg.e(tr2);
                return (T) anja.b(rR, jF, (aovf) obj2, tr2);
            case 13:
                cqat rR2 = this.a.k.eW.a.rR();
                dxjg.e(rR2);
                return (T) anjb.b(rR2);
            case 14:
                flv flvVar9 = this.a;
                return (T) new aoog(flvVar9.k.kI(), flvVar9.f(), flvVar9.i(), flvVar9.g(), flvVar9.j, flvVar9.k.ad(), flvVar9.k.eW.er(), flvVar9.k.eW.il());
            case 15:
                flv flvVar10 = this.a;
                dzsj<gga> ad2 = flvVar10.k.ad();
                dzsj<cqat> K = flvVar10.k.eW.K();
                dzsj<angp> jB = flvVar10.k.eW.jB();
                dzsj<anhg> aX = flvVar10.k.aX();
                dzsj<bbut> bf2 = flvVar10.k.bf();
                dzsj<anqx> b = flvVar10.b();
                dzsj<cjqy> al = flvVar10.k.eW.al();
                dzsj<apkf> oD = flvVar10.k.eW.oD();
                dzsj<anru> c = flvVar10.c();
                dzsj<anrz> i = flvVar10.i();
                dzsj<anpw> ug = flvVar10.k.ug();
                dzsj<aoiw> d = flvVar10.d();
                dzsj c2 = dxjh.c(flvVar10.k.az());
                dzsj<btvo> V = flvVar10.k.eW.V();
                dzsj<aogw> fx = flvVar10.k.eW.fx();
                dzsj<aokw> dM = flvVar10.k.dM();
                dzsj dzsjVar8 = flvVar10.i;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new flu(flvVar10, 16);
                    flvVar10.i = dzsjVar8;
                }
                return (T) new anrz(ad2, K, jB, aX, bf2, b, al, oD, c, i, ug, d, c2, V, fx, dM, dzsjVar8, flvVar10.e());
            case 16:
                flv flvVar11 = this.a;
                dzsj dzsjVar9 = flvVar11.h;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new flu(flvVar11, 17);
                    flvVar11.h = dzsjVar9;
                }
                return (T) new aofe(dzsjVar9, flvVar11.k.eW.m(), flvVar11.k.uh());
            case 17:
                return (T) aofh.b(this.a.k.uh());
            default:
                return (T) this.a.h();
        }
    }
}

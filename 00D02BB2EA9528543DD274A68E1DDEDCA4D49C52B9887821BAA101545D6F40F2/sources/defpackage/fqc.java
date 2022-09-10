package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: fqc  reason: default package */
/* loaded from: classes6.dex */
final class fqc<T> implements dzsj<T> {
    final /* synthetic */ fqd a;
    private final int b;

    public fqc(fqd fqdVar, int i) {
        this.a = fqdVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        switch (this.b) {
            case 0:
                return (T) new qqh();
            case 1:
                fqd fqdVar = this.a;
                dzsj<Application> m = fqdVar.i.eW.m();
                dzsj<cqhn> il = fqdVar.i.eW.il();
                dzsj<qjk> hK = fqdVar.i.eW.hK();
                dzsj dzsjVar = fqdVar.a;
                if (dzsjVar == null) {
                    dzsjVar = new fqc(fqdVar, 2);
                    fqdVar.a = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj<sic> nt = fqdVar.i.eW.nt();
                dzsj dzsjVar3 = fqdVar.b;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fqc(fqdVar, 3);
                    fqdVar.b = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = fqdVar.c;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fqc(fqdVar, 4);
                    fqdVar.c = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj dzsjVar7 = fqdVar.d;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fqc(fqdVar, 5);
                    fqdVar.d = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj dzsjVar9 = fqdVar.e;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fqc(fqdVar, 6);
                    fqdVar.e = dzsjVar9;
                }
                dzsj dzsjVar10 = dzsjVar9;
                dzsj<akox> as = fqdVar.i.as();
                dzsj dzsjVar11 = fqdVar.h;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fqc(fqdVar, 7);
                    fqdVar.h = dzsjVar11;
                }
                return (T) new shc(m, il, hK, dzsjVar2, nt, dzsjVar4, dzsjVar6, dzsjVar8, dzsjVar10, as, dzsjVar11, fqdVar.i.eW.V());
            case 2:
                cqat rR = this.a.i.eW.a.rR();
                dxjg.e(rR);
                return (T) new shu(rR);
            case 3:
                Application a = this.a.i.eW.a.a();
                dxjg.e(a);
                return (T) new sdz(a);
            case 4:
                fqd fqdVar2 = this.a;
                btrm rz = fqdVar2.i.eW.a.rz();
                dxjg.e(rz);
                return (T) new qsm(rz, fqdVar2.i.eW.dH(), fqdVar2.i.eW.ry());
            case 5:
                fqd fqdVar3 = this.a;
                dxio c = dxjc.c(fqdVar3.i.H());
                vsf g = fqdVar3.i.eW.g();
                ftt fttVar = fqdVar3.i;
                return (T) new vox(c, g, fttVar.a, fttVar.bB());
            case 6:
                fqd fqdVar4 = this.a;
                Application a2 = fqdVar4.i.eW.a.a();
                dxjg.e(a2);
                return (T) new sgc(a2, fqdVar4.i.ap());
            case 7:
                fqd fqdVar5 = this.a;
                Object obj3 = fqdVar5.g;
                if (obj3 instanceof dxjf) {
                    synchronized (obj3) {
                        obj = fqdVar5.g;
                        if (obj instanceof dxjf) {
                            Object obj4 = fqdVar5.f;
                            if (obj4 instanceof dxjf) {
                                synchronized (obj4) {
                                    obj2 = fqdVar5.f;
                                    if (obj2 instanceof dxjf) {
                                        btrm rz2 = fqdVar5.i.eW.a.rz();
                                        dxjg.e(rz2);
                                        obj2 = qsi.b(rz2, fqdVar5.i.eW.ry());
                                        dxjc.d(fqdVar5.f, obj2);
                                        fqdVar5.f = obj2;
                                    }
                                }
                                obj4 = obj2;
                            }
                            Application a3 = fqdVar5.i.eW.a.a();
                            dxjg.e(a3);
                            obj = rlo.b((qsg) obj4, a3, fqdVar5.i.eW.dH());
                            dxjc.d(fqdVar5.g, obj);
                            fqdVar5.g = obj;
                        }
                    }
                    obj3 = obj;
                }
                return (T) ((rln) obj3);
            default:
                fqd fqdVar6 = this.a;
                Application a4 = fqdVar6.i.eW.a.a();
                dxjg.e(a4);
                return (T) new sgt(a4, fqdVar6.i.eW.bK(), fqdVar6.i.vv());
        }
    }
}

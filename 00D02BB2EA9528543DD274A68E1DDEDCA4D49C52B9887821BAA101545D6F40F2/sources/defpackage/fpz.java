package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: fpz  reason: default package */
/* loaded from: classes6.dex */
final class fpz<T> implements dzsj<T> {
    final /* synthetic */ fqa a;
    private final int b;

    public fpz(fqa fqaVar, int i) {
        this.a = fqaVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        int i = this.b;
        if (i == 0) {
            fqa fqaVar = this.a;
            dzsj<Application> m = fqaVar.i.eW.m();
            dzsj<cqhn> il = fqaVar.i.eW.il();
            dzsj<qjk> hK = fqaVar.i.eW.hK();
            dzsj dzsjVar = fqaVar.a;
            if (dzsjVar == null) {
                dzsjVar = new fpz(fqaVar, 1);
                fqaVar.a = dzsjVar;
            }
            dzsj dzsjVar2 = dzsjVar;
            dzsj<sic> nt = fqaVar.i.eW.nt();
            dzsj dzsjVar3 = fqaVar.b;
            if (dzsjVar3 == null) {
                dzsjVar3 = new fpz(fqaVar, 2);
                fqaVar.b = dzsjVar3;
            }
            dzsj dzsjVar4 = dzsjVar3;
            dzsj dzsjVar5 = fqaVar.c;
            if (dzsjVar5 == null) {
                dzsjVar5 = new fpz(fqaVar, 3);
                fqaVar.c = dzsjVar5;
            }
            dzsj dzsjVar6 = dzsjVar5;
            dzsj dzsjVar7 = fqaVar.d;
            if (dzsjVar7 == null) {
                dzsjVar7 = new fpz(fqaVar, 4);
                fqaVar.d = dzsjVar7;
            }
            dzsj dzsjVar8 = dzsjVar7;
            dzsj dzsjVar9 = fqaVar.e;
            if (dzsjVar9 == null) {
                dzsjVar9 = new fpz(fqaVar, 5);
                fqaVar.e = dzsjVar9;
            }
            dzsj dzsjVar10 = dzsjVar9;
            dzsj<akox> as = fqaVar.i.as();
            dzsj dzsjVar11 = fqaVar.h;
            if (dzsjVar11 == null) {
                dzsjVar11 = new fpz(fqaVar, 6);
                fqaVar.h = dzsjVar11;
            }
            return (T) new shc(m, il, hK, dzsjVar2, nt, dzsjVar4, dzsjVar6, dzsjVar8, dzsjVar10, as, dzsjVar11, fqaVar.i.eW.V());
        } else if (i == 1) {
            cqat rR = this.a.i.eW.a.rR();
            dxjg.e(rR);
            return (T) new shu(rR);
        } else if (i == 2) {
            Application a = this.a.i.eW.a.a();
            dxjg.e(a);
            return (T) new sdz(a);
        } else if (i == 3) {
            fqa fqaVar2 = this.a;
            btrm rz = fqaVar2.i.eW.a.rz();
            dxjg.e(rz);
            return (T) new qsm(rz, fqaVar2.i.eW.dH(), fqaVar2.i.eW.ry());
        } else if (i == 4) {
            fqa fqaVar3 = this.a;
            dxio c = dxjc.c(fqaVar3.i.H());
            vsf g = fqaVar3.i.eW.g();
            ftt fttVar = fqaVar3.i;
            return (T) new vox(c, g, fttVar.a, fttVar.bB());
        } else if (i != 5) {
            fqa fqaVar4 = this.a;
            Object obj3 = fqaVar4.g;
            if (obj3 instanceof dxjf) {
                synchronized (obj3) {
                    obj = fqaVar4.g;
                    if (obj instanceof dxjf) {
                        Object obj4 = fqaVar4.f;
                        if (obj4 instanceof dxjf) {
                            synchronized (obj4) {
                                obj2 = fqaVar4.f;
                                if (obj2 instanceof dxjf) {
                                    btrm rz2 = fqaVar4.i.eW.a.rz();
                                    dxjg.e(rz2);
                                    obj2 = qsi.b(rz2, fqaVar4.i.eW.ry());
                                    dxjc.d(fqaVar4.f, obj2);
                                    fqaVar4.f = obj2;
                                }
                            }
                            obj4 = obj2;
                        }
                        Application a2 = fqaVar4.i.eW.a.a();
                        dxjg.e(a2);
                        obj = rlo.b((qsg) obj4, a2, fqaVar4.i.eW.dH());
                        dxjc.d(fqaVar4.g, obj);
                        fqaVar4.g = obj;
                    }
                }
                obj3 = obj;
            }
            return (T) ((rln) obj3);
        } else {
            fqa fqaVar5 = this.a;
            Application a3 = fqaVar5.i.eW.a.a();
            dxjg.e(a3);
            return (T) new sgc(a3, fqaVar5.i.ap());
        }
    }
}

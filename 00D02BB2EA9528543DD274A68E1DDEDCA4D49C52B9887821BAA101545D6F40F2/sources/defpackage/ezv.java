package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ezv  reason: default package */
/* loaded from: classes6.dex */
final class ezv<T> implements dzsj<T> {
    final /* synthetic */ ezw a;
    private final int b;

    public ezv(ezw ezwVar, int i) {
        this.a = ezwVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) new sec();
            case 1:
                return (T) new see();
            case 2:
                ezw ezwVar = this.a;
                return (T) new seg(ezwVar.d.eW.m(), ezwVar.d.eW.il());
            case 3:
                ezw ezwVar2 = this.a;
                dzsj<Application> m = ezwVar2.d.eW.m();
                dzsj<cqhn> il = ezwVar2.d.eW.il();
                dzsj<qjk> hK = ezwVar2.d.eW.hK();
                dzsj dzsjVar = ezwVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new ezv(ezwVar2, 4);
                    ezwVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj dzsjVar3 = ezwVar2.b;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new ezv(ezwVar2, 5);
                    ezwVar2.b = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = ezwVar2.c;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new ezv(ezwVar2, 6);
                    ezwVar2.c = dzsjVar5;
                }
                return (T) new sgm(m, il, hK, dzsjVar2, dzsjVar4, dzsjVar5);
            case 4:
                cqat rR = this.a.d.eW.a.rR();
                dxjg.e(rR);
                return (T) new shu(rR);
            case 5:
                ezw ezwVar3 = this.a;
                btrm rz = ezwVar3.d.eW.a.rz();
                dxjg.e(rz);
                return (T) new qsm(rz, ezwVar3.d.eW.dH(), ezwVar3.d.eW.ry());
            case 6:
                Application a = this.a.d.eW.a.a();
                dxjg.e(a);
                return (T) new sdz(a);
            case 7:
                ezw ezwVar4 = this.a;
                Application a2 = ezwVar4.d.eW.a.a();
                dxjg.e(a2);
                return (T) new sgt(a2, ezwVar4.d.eW.bK(), ezwVar4.d.vv());
            case 8:
                return (T) this.a.b();
            case 9:
                ezw ezwVar5 = this.a;
                return (T) new sdc(ezwVar5.d.eW.nD(), ezwVar5.b(), ezwVar5.d.eW.bK());
            case 10:
                return (T) new she(new cqhn());
            case 11:
                return (T) new rzs();
            default:
                ezw ezwVar6 = this.a;
                return (T) new scr(ezwVar6.d.wk(), ezwVar6.d.wl(), new scw(ezwVar6.d.eW.m()));
        }
    }
}

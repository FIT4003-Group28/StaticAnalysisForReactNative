package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fdw  reason: default package */
/* loaded from: classes6.dex */
final class fdw<T> implements dzsj<T> {
    final /* synthetic */ fdx a;
    private final int b;

    public fdw(fdx fdxVar, int i) {
        this.a = fdxVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            fdx fdxVar = this.a;
            gga wk = fdxVar.a.wk();
            fdxVar.a.eC();
            cqkj wl = fdxVar.a.wl();
            dzsj<Resources> fr = fdxVar.a.eW.fr();
            fyu fyuVar = fdxVar.a.eW;
            dzsj dzsjVar = fyuVar.dz;
            if (dzsjVar == null) {
                dzsjVar = new fxy(fyuVar, 678);
                fyuVar.dz = dzsjVar;
            }
            ajot ajotVar = new ajot(fr, dzsjVar, fdxVar.a.eW.il());
            ajsm b = fdxVar.b();
            cjqy tr = fdxVar.a.eW.a.tr();
            dxjg.e(tr);
            cjqq tp = fdxVar.a.eW.a.tp();
            dxjg.e(tp);
            Executor sU = fdxVar.a.eW.a.sU();
            dxjg.e(sU);
            return (T) new ajoj(wk, wl, ajotVar, b, tr, tp, sU);
        }
        fdx fdxVar2 = this.a;
        ftt fttVar = fdxVar2.a;
        rb rbVar = fttVar.a;
        bvjj rB = fttVar.eW.a.rB();
        dxjg.e(rB);
        fdxVar2.a.eC();
        cqkj wl2 = fdxVar2.a.wl();
        dxjg.e(fdxVar2.a.eW.a.rp());
        cjqy tr2 = fdxVar2.a.eW.a.tr();
        dxjg.e(tr2);
        cjqq tp2 = fdxVar2.a.eW.a.tp();
        dxjg.e(tp2);
        return (T) new ajpg(rbVar, rB, wl2, tr2, tp2);
    }
}

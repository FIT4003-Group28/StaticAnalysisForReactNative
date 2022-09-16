package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: erj  reason: default package */
/* loaded from: classes6.dex */
public final class erj implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<bxqd> b;

    public erj(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        btlg btlgVar = (btlg) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        btlgVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        btlgVar.aI = tr;
        btlgVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        btlgVar.aK = sU;
        btlgVar.aL = new cpv();
        btlgVar.aM = dxjc.c(this.a.eW.ie());
        btlgVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        btlgVar.a = this.a.wl();
        this.a.wq();
        this.a.cz();
        btlgVar.b = this.a.wd();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new eri(this);
            this.b = dzsjVar;
        }
        btlgVar.c = new bxqi(dzsjVar);
        btlgVar.d = new btlo(this.a.eW.il());
        btlgVar.e = this.a.cv();
    }
}

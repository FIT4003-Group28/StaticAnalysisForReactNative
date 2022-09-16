package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fel  reason: default package */
/* loaded from: classes6.dex */
public final class fel implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj b;
    private volatile dzsj c;
    private volatile Object d = new dxjf();

    public fel(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bxag bxagVar = (bxag) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bxagVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bxagVar.aI = tr;
        bxagVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bxagVar.aK = sU;
        bxagVar.aL = new cpv();
        bxagVar.aM = dxjc.c(this.a.eW.ie());
        bxagVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bxagVar.f = dxjc.c(this.a.cz());
        bxagVar.a = this.a.wl();
        Object obj3 = this.d;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.d;
                if (obj2 instanceof dxjf) {
                    ftt fttVar = this.a;
                    dzsj<rb> dzsjVar = fttVar.eV;
                    dzsj<cqhn> il = fttVar.eW.il();
                    dzsj dzsjVar2 = this.b;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new fek(this, 0);
                        this.b = dzsjVar2;
                    }
                    dzsj dzsjVar3 = dzsjVar2;
                    dzsj<begg> az = this.a.az();
                    dzsj<huc> jg = this.a.jg();
                    dzsj dzsjVar4 = this.c;
                    if (dzsjVar4 == null) {
                        dzsjVar4 = new fek(this, 1);
                        this.c = dzsjVar4;
                    }
                    obj2 = new bxct(dzsjVar, il, dzsjVar3, az, jg, dzsjVar4);
                    dxjc.d(this.d, obj2);
                    this.d = obj2;
                }
            }
            obj3 = obj2;
        }
        bxagVar.b = (bxct) obj3;
    }
}

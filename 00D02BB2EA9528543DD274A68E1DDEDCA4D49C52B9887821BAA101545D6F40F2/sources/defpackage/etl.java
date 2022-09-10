package defpackage;

import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: etl  reason: default package */
/* loaded from: classes6.dex */
public final class etl implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<PublicDisclosureLayout$PublicDisclosureViewModelImpl> b;

    public etl(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bjle bjleVar = (bjle) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bjleVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bjleVar.aI = tr;
        bjleVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bjleVar.aK = sU;
        bjleVar.aL = new cpv();
        bjleVar.aM = dxjc.c(this.a.eW.ie());
        bjleVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bjleVar.a = rD;
        bjleVar.b = this.a.wq();
        bjleVar.c = this.a.wl();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new etk(this);
            this.b = dzsjVar;
        }
        bjleVar.d = new bjoe(dzsjVar, this.a.ad());
    }
}

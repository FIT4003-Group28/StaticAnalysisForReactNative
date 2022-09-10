package defpackage;

import com.google.android.apps.gmm.ugc.post.editor.VisitDateFragment;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fsl  reason: default package */
/* loaded from: classes6.dex */
final class fsl implements dxis {
    final /* synthetic */ ftt a;

    public fsl(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        VisitDateFragment visitDateFragment = (VisitDateFragment) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        visitDateFragment.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        visitDateFragment.aI = tr;
        visitDateFragment.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        visitDateFragment.aK = sU;
        visitDateFragment.aL = new cpv();
        visitDateFragment.aM = dxjc.c(this.a.eW.ie());
        visitDateFragment.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        visitDateFragment.a = new cebd(this.a.eW.al(), this.a.uv());
        visitDateFragment.b = bqtw.b(new cqhn());
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        ftt fttVar = this.a;
        visitDateFragment.c = bqrw.b(rp, fttVar.a, fttVar.wl(), this.a.eC());
    }
}

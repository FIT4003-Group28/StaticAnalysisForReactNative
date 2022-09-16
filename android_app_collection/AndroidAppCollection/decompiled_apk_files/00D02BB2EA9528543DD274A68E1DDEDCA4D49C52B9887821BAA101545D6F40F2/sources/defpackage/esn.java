package defpackage;

import com.google.android.apps.gmm.ugc.post.editor.DraftStatusFragment;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: esn  reason: default package */
/* loaded from: classes6.dex */
final class esn implements dxis {
    final /* synthetic */ ftt a;

    public esn(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        DraftStatusFragment draftStatusFragment = (DraftStatusFragment) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        draftStatusFragment.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        draftStatusFragment.aI = tr;
        draftStatusFragment.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        draftStatusFragment.aK = sU;
        draftStatusFragment.aL = new cpv();
        draftStatusFragment.aM = dxjc.c(this.a.eW.ie());
        draftStatusFragment.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        draftStatusFragment.a = this.a.jm();
        draftStatusFragment.b = cdnl.b(dxjc.c(this.a.aG()), this.a.aC(), bqsp.b(this.a.fL()), cdjn.b(), fyu.vy(), this.a.eW.jc());
        ftt fttVar = this.a;
        draftStatusFragment.c = new cdmx(fttVar.a, fttVar.eC());
        draftStatusFragment.d = new cebd(this.a.eW.al(), this.a.uv());
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        ftt fttVar2 = this.a;
        draftStatusFragment.e = bqrw.b(rp, fttVar2.a, fttVar2.wl(), this.a.eC());
        ftt fttVar3 = this.a;
        draftStatusFragment.f = cdlw.b(new bquw(fttVar3.a, fttVar3.wk(), this.a.wd()));
    }
}

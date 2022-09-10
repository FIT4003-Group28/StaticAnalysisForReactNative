package defpackage;

import com.google.android.apps.gmm.ugc.post.photo.MediaCarouselFragment;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eys  reason: default package */
/* loaded from: classes6.dex */
final class eys implements dxis {
    final /* synthetic */ ftt a;

    public eys(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        MediaCarouselFragment mediaCarouselFragment = (MediaCarouselFragment) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        mediaCarouselFragment.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        mediaCarouselFragment.aI = tr;
        mediaCarouselFragment.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        mediaCarouselFragment.aK = sU;
        mediaCarouselFragment.aL = new cpv();
        mediaCarouselFragment.aM = dxjc.c(this.a.eW.ie());
        mediaCarouselFragment.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        mediaCarouselFragment.a = new cdwu(new cebd(this.a.eW.al(), this.a.uv()));
    }
}

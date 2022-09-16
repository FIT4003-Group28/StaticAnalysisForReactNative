package defpackage;

import android.content.SharedPreferences;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerOverlayLayout;
import com.google.android.apps.youtube.app.player.overlay.ControlsRelativeLayout;
import com.google.android.apps.youtube.app.player.overlay.FullscreenEngagementPanelCoordinatorLayout;
import com.google.android.apps.youtube.app.ui.MainRtlAwareViewPager;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.WatchEngagementPanelViewContainerController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.FullscreenExitController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.UpForFullController;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.metadataeditor.geo.EditLocation;
/* compiled from: PG */
/* renamed from: eas  reason: default package */
/* loaded from: classes3.dex */
public final class eas implements ezp, ffp, fzi, izi, kbi, kdb, kia, lpo, nfu, nzf, nzz, zmc, afqp, axom {
    private final dyo a;
    private final dwq b;

    public eas() {
    }

    public eas(dyo dyoVar, dwq dwqVar) {
        this.a = dyoVar;
        this.b = dwqVar;
    }

    @Override // defpackage.zmc
    public final void a(CameraView cameraView) {
        cameraView.A = new zlg();
        cameraView.q = new zlh((vne) this.a.a.bw.get());
        cameraView.x = (hkl) this.a.yP.get();
    }

    @Override // defpackage.kbi
    public final void b(ControlsRelativeLayout controlsRelativeLayout) {
        controlsRelativeLayout.a = (aacz) this.a.D.get();
    }

    @Override // defpackage.afqp
    public final void c(EditLocation editLocation) {
        editLocation.b = this.a.cI();
        editLocation.c = this.b.iV();
    }

    @Override // defpackage.kdb
    public final void d(FullscreenEngagementPanelCoordinatorLayout fullscreenEngagementPanelCoordinatorLayout) {
        Long l;
        Long l2;
        fullscreenEngagementPanelCoordinatorLayout.i = (axxt) this.a.yn.get();
        aqxe aqxeVar = fullscreenEngagementPanelCoordinatorLayout.i.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        long j = 0;
        if (aqxeVar.a(45354827L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45354827L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45354827L);
            l = Long.valueOf(aqxfVar.b == 2 ? ((Long) aqxfVar.c).longValue() : 0L);
        } else {
            l = 0L;
        }
        fullscreenEngagementPanelCoordinatorLayout.k = l.intValue();
        aqxe aqxeVar2 = fullscreenEngagementPanelCoordinatorLayout.i.a.b().C;
        if (aqxeVar2 == null) {
            aqxeVar2 = aqxe.a;
        }
        if (aqxeVar2.a(45354760L)) {
            aoqp aoqpVar2 = aqxeVar2.b;
            if (!aoqpVar2.containsKey(45354760L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar2 = (aqxf) aoqpVar2.get(45354760L);
            if (aqxfVar2.b == 2) {
                j = ((Long) aqxfVar2.c).longValue();
            }
            l2 = Long.valueOf(j);
        } else {
            l2 = 0L;
        }
        fullscreenEngagementPanelCoordinatorLayout.j = l2.intValue();
    }

    @Override // defpackage.fzi
    public final void e(InlinePlayerOverlayLayout inlinePlayerOverlayLayout) {
        inlinePlayerOverlayLayout.d = (ViewGroup) this.b.bQ.get();
    }

    @Override // defpackage.ffp
    public final void f(ffh ffhVar) {
        ffhVar.a = (aadd) this.a.K.get();
        ffhVar.b = amvn.s((aibq) this.b.fa.get(), (aibq) this.b.jD.get());
        ffhVar.c = new ffi(this.b.a(), (aacz) this.a.D.get());
        ffhVar.d = (ffk) this.b.nu.get();
        ffhVar.e = new ahwu((snc) this.a.v.get(), (ahwz) this.b.aT.get());
        ffhVar.f = (axxu) this.a.hZ.get();
    }

    @Override // defpackage.lpo
    public final void g(MainRtlAwareViewPager mainRtlAwareViewPager) {
        mainRtlAwareViewPager.i = (ayom) this.a.a.bv.get();
    }

    @Override // defpackage.nzf
    public final void h(NextGenWatchContainerLayout nextGenWatchContainerLayout) {
        nextGenWatchContainerLayout.d = (nxh) this.b.r.get();
    }

    @Override // defpackage.nzz
    public final void i(NextGenWatchLayout nextGenWatchLayout) {
        nextGenWatchLayout.b = (gcf) this.b.fr.get();
        nextGenWatchLayout.H = (aacz) this.a.D.get();
        nextGenWatchLayout.c = (nzy) this.b.gO.get();
        nextGenWatchLayout.d = (acti) this.b.au.get();
        nextGenWatchLayout.e = (oah) this.b.w.get();
        nextGenWatchLayout.f = (aynx) this.b.C.get();
        nextGenWatchLayout.g = (nyv) this.b.ju.get();
        nextGenWatchLayout.h = (UpForFullController) this.b.jx.get();
        nextGenWatchLayout.i = (FullscreenExitController) this.b.fq.get();
        nextGenWatchLayout.j = (nml) this.b.bq.get();
        nextGenWatchLayout.k = (ghs) this.b.bu.get();
        nextGenWatchLayout.l = (oad) this.b.nv.get();
        nextGenWatchLayout.m = (WatchEngagementPanelViewContainerController) this.b.it.get();
        nextGenWatchLayout.n = new nxf(this.b.bq);
        nextGenWatchLayout.o = (aadd) this.a.K.get();
        nextGenWatchLayout.p = (khy) this.b.bs.get();
        nextGenWatchLayout.q = ((Boolean) this.b.gL.get()).booleanValue();
        nextGenWatchLayout.c.e(nextGenWatchLayout);
        nextGenWatchLayout.e.a(new nzk(nextGenWatchLayout));
        nextGenWatchLayout.G = eog.aB(nextGenWatchLayout.H);
    }

    @Override // defpackage.ezp
    public final void j(SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout) {
        dwq dwqVar = this.b;
        specificNetworkErrorViewLoadingFrameLayout.i = new jqa(dwqVar.s, dwqVar.a.kI, dwqVar.cW);
        specificNetworkErrorViewLoadingFrameLayout.h = (yrj) this.a.as.get();
    }

    @Override // defpackage.nfu
    public final void k(SwipeToContainerFrameLayout swipeToContainerFrameLayout) {
        swipeToContainerFrameLayout.j = (aacz) this.a.D.get();
        swipeToContainerFrameLayout.a = ((azpx) this.a.a.bv.get()).R();
        swipeToContainerFrameLayout.b = (SharedPreferences) this.a.t.get();
    }

    @Override // defpackage.kia
    public final void l(kdu kduVar) {
        kduVar.a = (kok) this.b.bw.get();
        kduVar.b = (ayor) this.a.iz.get();
    }

    @Override // defpackage.izi
    public final void m() {
    }
}

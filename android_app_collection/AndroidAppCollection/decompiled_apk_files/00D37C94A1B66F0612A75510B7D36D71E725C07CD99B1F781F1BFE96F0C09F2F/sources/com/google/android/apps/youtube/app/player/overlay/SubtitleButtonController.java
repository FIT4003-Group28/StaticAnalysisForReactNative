package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SubtitleButtonController implements f, kbk {
    public final jyu a;
    public final airr b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public acth g;
    public final actj h;
    private final Context i;
    private final airw j;
    private final boolean l;
    private TouchImageView n;
    public aijx f = aijx.NEW;
    private SubtitleTrack m = null;
    private final aypf k = new aypf();

    public SubtitleButtonController(Context context, airw airwVar, jyu jyuVar, aacz aaczVar, kbl kblVar, acth acthVar, actj actjVar) {
        this.g = acthVar;
        this.i = context;
        this.j = airwVar;
        this.a = jyuVar;
        this.b = airwVar.E();
        this.g = acthVar;
        this.l = eog.aM(aaczVar);
        this.c = eog.aN(aaczVar);
        asxj asxjVar = aaczVar.b().e;
        this.d = (asxjVar == null ? asxj.a : asxjVar).cn;
        this.h = actjVar;
        if (kblVar != null) {
            kblVar.a(this);
        }
    }

    private final ayob w() {
        return new ayob() { // from class: kgu
            @Override // defpackage.ayob
            public final bamd a(aynx aynxVar) {
                return SubtitleButtonController.this.d ? aynxVar.I().G(aypa.a()) : aynxVar;
            }
        };
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        if (this.f.b(aijx.VIDEO_PLAYBACK_LOADED)) {
            this.g.oi().q(new acte(this.h), null);
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void l(ezx ezxVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.k.qr();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.k.c();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        if (this.f.b(aijx.VIDEO_PLAYBACK_LOADED)) {
            this.g.oi().u(new acte(this.h), null);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (this.l) {
            aypf aypfVar = this.k;
            airw airwVar = this.j;
            aypfVar.g(airwVar.ae(jvb.n, jvb.p).h(w()).aa(new kgv(this, 2), jww.s), airwVar.ae(jvb.n, jvb.o).h(w()).aa(new kgv(this), jww.s), airwVar.ao().h(w()).aa(new kgv(this, 1), jww.s));
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void od(ControlsState controlsState) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void oe(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void og(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void q(boolean z) {
    }

    public final void s(TouchImageView touchImageView) {
        this.n = touchImageView;
        v(this.b.m());
    }

    public final void t(Runnable runnable) {
        if (!this.l || this.n == null) {
            return;
        }
        this.n.setOnClickListener(new kgx(this, runnable));
    }

    public final void u(List list) {
        if (!this.e || list.size() <= 1) {
            this.a.c();
        } else if (this.b.m() == null || this.b.m().p()) {
            SubtitleTrack subtitleTrack = this.m;
            if (subtitleTrack == null || !list.contains(subtitleTrack)) {
                aiyi aiyiVar = this.b.g.n;
                subtitleTrack = aiyiVar == null ? null : aiyiVar.b();
                if (subtitleTrack == null) {
                    subtitleTrack = (SubtitleTrack) list.get(1);
                }
            }
            this.b.H(subtitleTrack);
            this.a.k(subtitleTrack);
            this.a.d(subtitleTrack);
        } else {
            this.m = this.b.m();
            this.b.H((SubtitleTrack) list.get(0));
            this.a.k((SubtitleTrack) list.get(0));
            this.a.d((SubtitleTrack) list.get(0));
        }
    }

    public final void v(SubtitleTrack subtitleTrack) {
        TouchImageView touchImageView = this.n;
        if (touchImageView == null) {
            return;
        }
        if (!this.e) {
            touchImageView.setImageResource(2131232442);
            this.n.setSelected(false);
            this.n.setContentDescription(this.i.getResources().getString(R.string.accessibility_captions_unavailable));
            return;
        }
        touchImageView.setContentDescription(this.i.getResources().getString(R.string.accessibility_captions_button_name));
        if (subtitleTrack == null || subtitleTrack.p()) {
            this.n.setImageResource(2131232443);
            this.n.setSelected(false);
            return;
        }
        this.n.setImageResource(2131232444);
        this.n.setSelected(true);
    }
}

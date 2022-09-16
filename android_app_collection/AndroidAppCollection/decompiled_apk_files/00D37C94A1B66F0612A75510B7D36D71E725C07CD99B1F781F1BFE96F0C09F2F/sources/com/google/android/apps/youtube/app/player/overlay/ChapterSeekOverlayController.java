package com.google.android.apps.youtube.app.player.overlay;

import android.widget.TextView;
import com.google.android.apps.youtube.app.player.overlay.ChapterSeekOverlayController;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ChapterSeekOverlayController implements kbk, f, ahwy {
    public int a;
    private final airw b;
    private final aifm c;
    private final boolean d;
    private final aypf e;
    private final ahwz f;
    private boolean g;

    public ChapterSeekOverlayController(ahwz ahwzVar, airw airwVar, aifm aifmVar, kbl kblVar, aacz aaczVar) {
        this.f = ahwzVar;
        this.b = airwVar;
        this.c = aifmVar;
        asxj asxjVar = aaczVar.b().e;
        this.d = (asxjVar == null ? asxj.a : asxjVar).bC;
        this.e = new aypf();
        kblVar.a(this);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.ahwy
    public final /* synthetic */ void c(aicb aicbVar, boolean z) {
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
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (!this.d) {
            return;
        }
        this.e.c();
        this.f.l(aicb.CHAPTER, this);
    }

    @Override // defpackage.ahwy
    public final void nD(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, aicb aicbVar, int i) {
        if (aicbVar != aicb.CHAPTER || timelineMarker2 == null) {
            return;
        }
        long j = timelineMarker != null ? timelineMarker.a : 0L;
        if (this.g) {
            return;
        }
        int i2 = this.a;
        if (i2 != 9 && i2 != 10) {
            return;
        }
        aifm aifmVar = this.c;
        if (aifmVar.d) {
            return;
        }
        CharSequence charSequence = timelineMarker2.e;
        char c = timelineMarker2.a > j ? (char) 1 : (char) 2;
        final aifw aifwVar = aifmVar.h;
        if (aifwVar == null) {
            return;
        }
        aifwVar.a();
        ((TextView) aifwVar.f.b).setText(charSequence);
        ((TextView) aifwVar.f.b).setWidth(aifwVar.c.getWidth() / 2);
        ((TextView) aifwVar.f.b).setTranslationX(0.0f);
        aifwVar.b.setTranslationX(0.0f);
        aifwVar.b.setScaleX(c == 1 ? 1.0f : -1.0f);
        aifwVar.d.I();
        aifwVar.e.c(true);
        aifwVar.a.c();
        aifwVar.f.c(true);
        ((TextView) aifwVar.f.b).postDelayed(new Runnable() { // from class: aift
            @Override // java.lang.Runnable
            public final void run() {
                aifw.this.b();
            }
        }, 650L);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nL(boolean z) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.ahwy
    public final /* synthetic */ void nw(aicb aicbVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (!this.d) {
            return;
        }
        this.e.d(this.b.G().i.I().G(aypa.a()).aa(new ayqb() { // from class: kaz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ChapterSeekOverlayController chapterSeekOverlayController = ChapterSeekOverlayController.this;
                ahia ahiaVar = (ahia) obj;
                if (ahiaVar.c()) {
                    return;
                }
                chapterSeekOverlayController.a = ahiaVar.a();
            }
        }, jww.h));
        this.f.i(aicb.CHAPTER, this);
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
    public final void q(boolean z) {
        this.g = z;
    }
}

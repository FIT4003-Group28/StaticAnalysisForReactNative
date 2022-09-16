package com.google.android.apps.youtube.app.player.overlay.accessibility;

import com.google.android.apps.youtube.app.player.overlay.accessibility.TimebarAccessibilityController;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TimebarAccessibilityController implements f, kbk {
    public boolean a;
    private final aypf b = new aypf();
    private final ffo c;
    private final ahxv d;
    private boolean e;

    public TimebarAccessibilityController(ffo ffoVar, ahxv ahxvVar, kbl kblVar) {
        this.c = ffoVar;
        this.d = ahxvVar;
        kblVar.a(this);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.kbk
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        boolean z = this.e;
        boolean z2 = controlsOverlayStyle.s;
        if (z != z2) {
            this.e = z2;
            s();
        }
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
        this.b.c();
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

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.b.d(this.d.a().n().Z(new ayqb() { // from class: kjw
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                TimebarAccessibilityController timebarAccessibilityController = TimebarAccessibilityController.this;
                boolean z = timebarAccessibilityController.a;
                boolean z2 = ((ahxu) obj).a;
                if (z != z2) {
                    timebarAccessibilityController.a = z2;
                    timebarAccessibilityController.s();
                }
            }
        }));
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

    public final void s() {
        ffo ffoVar = this.c;
        boolean z = false;
        if (this.e && this.a) {
            z = true;
        }
        ffoVar.setClickable(z);
    }
}

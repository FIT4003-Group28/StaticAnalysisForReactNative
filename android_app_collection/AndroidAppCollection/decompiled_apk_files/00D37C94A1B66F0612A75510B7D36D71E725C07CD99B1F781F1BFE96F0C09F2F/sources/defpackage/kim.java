package defpackage;

import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
/* compiled from: PG */
/* renamed from: kim  reason: default package */
/* loaded from: classes3.dex */
public final class kim implements aigm {
    final /* synthetic */ YouTubeControlsOverlay a;

    public kim(YouTubeControlsOverlay youTubeControlsOverlay) {
        this.a = youTubeControlsOverlay;
    }

    @Override // defpackage.aigm
    public final void e(float f, boolean z) {
        if (!z || !this.a.h.c.g()) {
            return;
        }
        this.a.B();
    }

    @Override // defpackage.aigm
    public final void nF(int i, int i2, int i3) {
        YouTubeControlsOverlay youTubeControlsOverlay = this.a;
        youTubeControlsOverlay.D = true;
        if (!youTubeControlsOverlay.X(!youTubeControlsOverlay.h.c.e())) {
            boolean z = (i == 2 || i == 1) && this.a.h.c.f() && i3 != 0 && this.a.W() && this.a.y.a == ahzb.PLAYING;
            if (z) {
                this.a.B();
                this.a.R();
            }
            if (i != i2) {
                if (this.a.h.c.e() || this.a.h.getParent() != null) {
                    if (this.a.h.c.e() && this.a.h.getParent() != null) {
                        this.a.h.clearAnimation();
                        YouTubeControlsOverlay youTubeControlsOverlay2 = this.a;
                        youTubeControlsOverlay2.l.removeView(youTubeControlsOverlay2.h);
                    }
                } else {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    this.a.h.setLayoutParams(layoutParams);
                    YouTubeControlsOverlay youTubeControlsOverlay3 = this.a;
                    youTubeControlsOverlay3.l.addView(youTubeControlsOverlay3.h);
                    this.a.h.bringToFront();
                    this.a.U();
                }
                if (!z && this.a.h.c.d()) {
                    this.a.B();
                }
                YouTubeControlsOverlay youTubeControlsOverlay4 = this.a;
                youTubeControlsOverlay4.i.a(!youTubeControlsOverlay4.h.c.e());
            }
        }
        this.a.D = false;
    }
}

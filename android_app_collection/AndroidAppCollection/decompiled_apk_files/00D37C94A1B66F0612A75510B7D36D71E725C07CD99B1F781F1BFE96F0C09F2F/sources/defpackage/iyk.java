package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import j$.util.Optional;
import java.util.List;
/* compiled from: PG */
/* renamed from: iyk  reason: default package */
/* loaded from: classes3.dex */
public final class iyk extends ahyn implements aibg, ahxz, aich, aiaq, adwm {
    private final aibt a;
    private Optional b;
    private Optional c;
    private final ControlsOverlayStyle d;
    private boolean e;
    private boolean f;
    private adwj g;

    static {
        zep.a("MDX.PlayerControlsOverlay");
    }

    public iyk(adoa adoaVar) {
        adoaVar.getClass();
        this.d = ControlsOverlayStyle.a;
        aibt aibtVar = new aibt();
        this.a = aibtVar;
        aibtVar.l = true;
        new Handler(Looper.getMainLooper());
        this.g = adwj.a().a();
        this.c = Optional.empty();
        this.b = Optional.empty();
        Optional.empty();
    }

    @Override // defpackage.aibg
    public final void e(boolean z) {
    }

    @Override // defpackage.ahyn, defpackage.ahyp
    public final void f(ControlsState controlsState) {
        if (controlsState == null) {
            controlsState = ControlsState.b();
        }
        if (!this.c.isPresent() || !controlsState.equals(this.c.get())) {
            this.c = Optional.of(controlsState);
            int i = this.g.a;
            zag.o(null, true);
            zag.o(null, true);
            zag.o(null, true);
            zag.o(null, true);
        }
    }

    @Override // defpackage.aibg
    public final void g(boolean z) {
    }

    @Override // defpackage.adwm
    public final void h(int i, adwj adwjVar) {
        this.g = adwjVar;
    }

    @Override // defpackage.ahyn, defpackage.ahyp
    public final void i(ahyo ahyoVar) {
        aqxo.z(!this.b.isPresent(), "Must not override an existing listener.");
        this.b = Optional.of(ahyoVar);
    }

    @Override // defpackage.ahyn, defpackage.ahyp
    public final void j(boolean z) {
    }

    @Override // defpackage.aibg
    public final void k(SubtitleTrack subtitleTrack) {
    }

    @Override // defpackage.ahyn, defpackage.ahyp
    public final void l(ControlsOverlayStyle controlsOverlayStyle) {
        akzj.f(this.d, controlsOverlayStyle);
    }

    @Override // defpackage.aibg
    public final void m(aibf aibfVar) {
    }

    @Override // defpackage.aiaq
    public final void nK(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
    }

    @Override // defpackage.ahyn, defpackage.ahyp
    public final void ny() {
    }

    @Override // defpackage.ahyn, defpackage.ahyp
    public final void o(long j, long j2, long j3, long j4) {
    }

    @Override // defpackage.aiaq
    public final void pB(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
    }

    @Override // defpackage.aiaq
    public final void pD(aiap aiapVar) {
        Optional.of(aiapVar);
    }

    @Override // defpackage.aich
    public final void pG(boolean z) {
    }

    @Override // defpackage.aich
    public final void pH(VideoQuality[] videoQualityArr, int i, boolean z) {
    }

    @Override // defpackage.aich
    public final void q(aicg aicgVar) {
    }

    @Override // defpackage.aibg
    public final void r(List list) {
    }
}

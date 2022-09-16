package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.MinimalTimeBar;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class am extends aizc implements View.OnClickListener, Animation.AnimationListener, Handler.Callback, ahyp, aizf, aibg, aich, aiaq, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h {
    public MinimalTimeBar a;
    public ProgressBar b;
    public ahzi c;
    public TouchImageView d;
    public TouchImageView e;
    public TouchImageView f;
    public TextView g;
    public Animation h;
    public Animation i;
    public Handler j;
    private final as k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private ControlsOverlayStyle p;
    private ControlsState q;

    public am(Context context, com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k kVar) {
        super(context);
        this.k = new as(new com.google.android.apps.youtube.embeddedplayer.service.jar.q(kVar));
        this.q = ControlsState.b();
    }

    private final void A(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.h);
        } else if (!this.p.o) {
        } else {
            nf();
        }
    }

    private final void B(boolean z) {
        this.h.setDuration(true != z ? 500L : 100L);
        A(this.d);
        A(this.e);
        A(this.f);
    }

    private final void C(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.i);
        }
    }

    private final void D() {
        boolean z;
        this.j.removeMessages(2);
        this.c.a(this.q);
        zag.o(this.g, this.q.i());
        ProgressBar progressBar = this.b;
        boolean z2 = true;
        if (!ControlsOverlayStyle.d(this.p)) {
            ControlsState controlsState = this.q;
            if (controlsState.b || controlsState.a == ahzb.NEW) {
                z = true;
                zag.o(progressBar, z);
                zag.o(this.a, !this.n);
                if (!this.n || this.o || this.q.i()) {
                    zag.o(this.d, false);
                    zag.o(this.e, false);
                    zag.o(this.f, false);
                }
                TouchImageView touchImageView = this.d;
                int i = 4;
                if (this.q.k() && this.p.t) {
                    i = 0;
                }
                touchImageView.setVisibility(i);
                if (!this.p.u || ((!this.l && !this.m) || this.q.a == ahzb.NEW)) {
                    z2 = false;
                }
                zag.o(this.e, z2);
                zag.o(this.f, z2);
                this.e.setEnabled(this.l);
                this.f.setEnabled(this.m);
                return;
            }
        }
        z = false;
        zag.o(progressBar, z);
        zag.o(this.a, !this.n);
        if (!this.n) {
        }
        zag.o(this.d, false);
        zag.o(this.e, false);
        zag.o(this.f, false);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void b(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g gVar) {
        this.k.f = gVar;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.aibg
    public final void e(boolean z) {
    }

    @Override // defpackage.ahyp
    public final void f(ControlsState controlsState) {
        if (this.q.equals(controlsState)) {
            if ((this.q.a != ahzb.PLAYING && !this.q.b) || this.j.hasMessages(1)) {
                return;
            }
            this.j.sendEmptyMessageDelayed(1, 2500L);
            return;
        }
        this.q = controlsState;
        pI();
    }

    @Override // defpackage.aibg
    public final void g(boolean z) {
    }

    protected final void h() {
        this.j.removeMessages(1);
        this.e.clearAnimation();
        this.f.clearAnimation();
        this.d.clearAnimation();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            B(false);
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            D();
            return true;
        }
    }

    @Override // defpackage.ahyp
    public final void i(ahyo ahyoVar) {
        this.k.a = ahyoVar;
    }

    @Override // defpackage.ahyp
    public final void j(boolean z) {
    }

    @Override // defpackage.aibg
    public final void k(SubtitleTrack subtitleTrack) {
    }

    @Override // defpackage.aizc, defpackage.aizf
    public final View kZ() {
        return this;
    }

    @Override // defpackage.ahyp
    public final void l(ControlsOverlayStyle controlsOverlayStyle) {
        this.p = controlsOverlayStyle;
        this.a.a(controlsOverlayStyle);
    }

    @Override // defpackage.aibg
    public final void m(aibf aibfVar) {
        this.k.b = aibfVar;
    }

    @Override // defpackage.aiaq
    public final void nK(boolean z) {
        this.m = z;
        D();
    }

    @Override // defpackage.ahyp
    public final void nN(CharSequence charSequence) {
    }

    @Override // defpackage.ahyp
    public final void nO(boolean z) {
    }

    @Override // defpackage.ahyp
    public final void nP(Map map) {
    }

    @Override // defpackage.ahyp
    public final void nf() {
        h();
        this.o = true;
        D();
        as asVar = this.k;
        if (asVar != null) {
            asVar.d();
        }
    }

    @Override // defpackage.ahyp
    public final void ng() {
        this.q = ControlsState.b();
        this.l = false;
        this.m = false;
        l(ControlsOverlayStyle.a);
        ny();
        D();
    }

    @Override // defpackage.ahyp
    public final void nh(String str, boolean z) {
        String string;
        String str2;
        this.q = z ? ControlsState.g() : ControlsState.h();
        if (zew.u(getContext())) {
            string = getContext().getString(R.string.tap_to_retry);
        } else {
            string = getContext().getString(R.string.click_to_retry);
        }
        TextView textView = this.g;
        String valueOf = String.valueOf(str);
        if (z) {
            String valueOf2 = String.valueOf(string);
            str2 = valueOf2.length() != 0 ? "\n\n".concat(valueOf2) : new String("\n\n");
        } else {
            str2 = "";
        }
        String valueOf3 = String.valueOf(str2);
        textView.setText(valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf));
        pI();
    }

    @Override // defpackage.ahyp
    public final void ni(boolean z) {
    }

    @Override // defpackage.ahyp
    public final void nj(boolean z) {
    }

    @Override // defpackage.ahyp
    public final void ny() {
        this.a.b(0L, 0L, 0L);
    }

    @Override // defpackage.ahyp
    public final void o(long j, long j2, long j3, long j4) {
        this.a.b(j, j3, j4);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (animation == this.h) {
            nf();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.k != null) {
            if (view == this.e) {
                nf();
                this.k.a();
            } else if (view == this.f) {
                nf();
                this.k.b();
            } else if (view != this.d) {
            } else {
                if (this.q.a == ahzb.ENDED) {
                    this.k.n();
                } else if (this.q.a == ahzb.PLAYING) {
                    this.k.e();
                } else if (this.q.a != ahzb.PAUSED) {
                } else {
                    this.k.f();
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        as asVar = this.k;
        boolean z = true;
        if (1 != (motionEvent.getFlags() & 1)) {
            z = false;
        }
        asVar.g(z);
        return super.onFilterTouchEventForSecurity(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback, defpackage.ahyp
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback, defpackage.ahyp
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        as asVar;
        if (!super.onTouchEvent(motionEvent) && motionEvent.getActionMasked() == 1) {
            if (this.q.a != ahzb.RECOVERABLE_ERROR || (asVar = this.k) == null) {
                if (this.o) {
                    if (!this.p.o) {
                        pI();
                        C(this.d);
                        C(this.e);
                        C(this.f);
                    }
                } else {
                    h();
                    B(true);
                }
            } else {
                asVar.o();
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.aiaq
    public final void pB(boolean z) {
        this.l = z;
        D();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pC(boolean z) {
    }

    @Override // defpackage.aiaq
    public final void pD(aiap aiapVar) {
        this.k.d = aiapVar;
    }

    @Override // defpackage.aich
    public final void pG(boolean z) {
    }

    @Override // defpackage.aich
    public final void pH(VideoQuality[] videoQualityArr, int i, boolean z) {
    }

    @Override // defpackage.ahyp
    public final void pI() {
        h();
        this.o = false;
        D();
        as asVar = this.k;
        if (asVar != null) {
            asVar.u();
        }
        if ((this.q.a == ahzb.PLAYING || this.q.b) && !this.o && !this.j.hasMessages(1)) {
            this.j.sendEmptyMessageDelayed(1, 2500L);
        }
    }

    @Override // defpackage.ahyp
    public final void pJ() {
    }

    @Override // defpackage.aich
    public final void q(aicg aicgVar) {
        this.k.c = aicgVar;
    }

    @Override // defpackage.aibg
    public final void r(List list) {
    }

    @Override // defpackage.ahyp
    public final /* synthetic */ void x() {
        ahfo.a(this);
    }

    @Override // defpackage.ahyp
    public final /* synthetic */ void y(auad auadVar, boolean z) {
        ahfo.b(this, auadVar, z);
    }

    public final void z(boolean z) {
        this.n = z;
        if (z) {
            nf();
        } else if (this.q.a == ahzb.PAUSED || this.q.a == ahzb.ENDED) {
            pI();
        } else {
            D();
        }
    }
}

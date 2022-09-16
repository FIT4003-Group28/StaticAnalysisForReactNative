package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.player.overlay.DefaultInlineMutedControlsOverlay;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultInlineMutedControlsOverlay extends InlineMutedControlsOverlay {
    public Runnable a;
    public boq b;
    public boolean c;
    public FrameLayout d;
    ProgressBar e;
    ImageView f;
    TextView g;
    private final azqb h;
    private final aibs i;
    private final aypf j;
    private final axwt k;
    private ked l;
    private boolean m;
    private kea n;
    private kdz o;

    public DefaultInlineMutedControlsOverlay(Context context, aibs aibsVar, azqb azqbVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, axwt axwtVar) {
        super(context);
        kea a = kea.a().a();
        this.n = a;
        this.o = a.b();
        this.h = azqbVar;
        this.i = aibsVar;
        this.j = new aypf();
        this.k = axwtVar;
        inlinePlaybackLifecycleController.l(this);
    }

    private final void z() {
        this.d.removeCallbacks(this.a);
        this.f.setVisibility(8);
        this.f.animate().cancel();
        this.f.setAlpha(0.0f);
        boq boqVar = this.b;
        if (boqVar != null) {
            boqVar.stop();
        }
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.d = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.inline_muted_controls_overlay, this.d);
        this.e = (ProgressBar) this.d.findViewById(R.id.player_loading_view);
        this.f = (ImageView) this.d.findViewById(R.id.audio_indicator);
        this.g = (TextView) this.d.findViewById(R.id.countdown_badge);
        ((ViewGroup) this.d.findViewById(R.id.subtitle)).addView((View) this.h.get());
        kej kejVar = new kej(new yye(this.g, 0L, 8));
        ked kedVar = new ked(context, new kei(this.i, kejVar), kejVar, this.e, this.g);
        this.l = kedVar;
        kedVar.c(this.n);
        this.j.d(this.k.a().as(new ayqb() { // from class: kbo
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                DefaultInlineMutedControlsOverlay.this.c = ((Boolean) obj).booleanValue();
            }
        }));
        return this.d;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        kea a = this.o.a();
        this.n = a;
        this.o = a.b();
        if (aa(1)) {
            this.l.c(this.n);
            A();
        }
        if (aa(2)) {
            kea keaVar = this.n;
            int i = keaVar.a;
            if (i == 1) {
                this.l.d(keaVar.c.d(), this.n.c.g());
            } else if (i == 0) {
                this.l.a();
                z();
            }
            this.l.c(this.n);
            A();
        }
        if (aa(4)) {
            keb kebVar = this.n.e;
            this.l.f(kebVar.a, kebVar.b, kebVar.c, kebVar.d);
        }
        if (aa(8)) {
            this.l.e(this.n.f);
        }
    }

    @Override // defpackage.ahyp
    public final void f(ControlsState controlsState) {
        this.o.a = controlsState;
        Y(1);
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        if (this.o.a().d != ezxVar) {
            this.o.c = ezxVar;
            if (ezxVar.d()) {
                Z();
            } else {
                W();
            }
            X();
        }
    }

    @Override // defpackage.ahyp
    public final void i(ahyo ahyoVar) {
    }

    @Override // defpackage.ahyp
    public final void j(boolean z) {
    }

    @Override // defpackage.ahyf
    public final ahyk kS(Context context) {
        ahyk kS = super.kS(context);
        kS.e = false;
        kS.b();
        return kS;
    }

    @Override // defpackage.ahyp
    public final void l(ControlsOverlayStyle controlsOverlayStyle) {
        this.o.f = controlsOverlayStyle;
        Y(8);
    }

    @Override // com.google.android.apps.youtube.app.player.overlay.InlineMutedControlsOverlay, defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.j.qr();
    }

    @Override // defpackage.fze
    public final void lh(fyp fypVar, int i) {
        kdz kdzVar = this.o;
        kdzVar.b = fypVar.b;
        kdzVar.b(i);
        Y(2);
    }

    @Override // defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        return ezxVar.d();
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.o.a().d.d();
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
    }

    @Override // defpackage.ahyp
    public final void ng() {
    }

    @Override // defpackage.ahyp
    public final void nh(String str, boolean z) {
        ControlsState g = z ? ControlsState.g() : ControlsState.h();
        kdz kdzVar = this.o;
        kdzVar.d = str;
        kdzVar.a = g;
        Y(1);
    }

    @Override // defpackage.ahyp
    public final void ni(boolean z) {
    }

    @Override // defpackage.ahyp
    public final void nj(boolean z) {
    }

    @Override // defpackage.ahyp
    public final void ny() {
        if (nI()) {
            this.l.b();
        }
    }

    @Override // defpackage.ahyp
    public final void o(long j, long j2, long j3, long j4) {
        if (!nI() || this.n.b.a != ahzb.PLAYING || this.n.b.b) {
            return;
        }
        this.o.e = keb.a(j, j2, j3, j4);
        Y(4);
    }

    @Override // defpackage.ahyp
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.d.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.ahyp
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.d.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.ahyp
    public final void pI() {
    }

    @Override // defpackage.ahyp
    public final void pJ() {
    }

    private final void A() {
        kea keaVar = this.n;
        if (keaVar.a != 3 || keaVar.b.a != ahzb.PLAYING || this.n.b.b) {
            z();
        } else if (this.c) {
        } else {
            this.f.setAlpha(0.0f);
            this.f.setVisibility(0);
            if (!this.m) {
                boq a = boq.a(this.d.getContext(), R.drawable.audio_indicator_24dp_animation);
                this.b = a;
                this.f.setImageDrawable(a);
                this.a = new Runnable() { // from class: kbp
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultInlineMutedControlsOverlay defaultInlineMutedControlsOverlay = DefaultInlineMutedControlsOverlay.this;
                        defaultInlineMutedControlsOverlay.b.start();
                        defaultInlineMutedControlsOverlay.d.postDelayed(defaultInlineMutedControlsOverlay.a, 2140L);
                    }
                };
                this.m = true;
            }
            this.b.start();
            this.d.postDelayed(this.a, 2140L);
            this.f.animate().alpha(0.8f).start();
        }
    }
}

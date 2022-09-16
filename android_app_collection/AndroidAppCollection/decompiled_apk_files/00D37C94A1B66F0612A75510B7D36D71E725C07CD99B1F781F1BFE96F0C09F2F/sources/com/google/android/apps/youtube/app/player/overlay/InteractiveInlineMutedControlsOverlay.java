package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class InteractiveInlineMutedControlsOverlay extends InlineMutedControlsOverlay implements airt {
    TouchImageView A;
    View B;
    TouchImageView C;
    View D;
    TouchImageView E;
    ViewGroup F;
    public kea G;
    private final azqb I;

    /* renamed from: J  reason: collision with root package name */
    private ffh f148J;
    private final SubtitleButtonController K;
    private final aihr L;
    private final ahwz M;
    private final aign N;
    private final kce O;
    private final ker P;
    private final ViewGroup Q;
    private final axwt R;
    private ked S;
    private Runnable T;
    private boolean U;
    private final airw V;
    private final aypf W;
    private kdz X;
    private final aacz Y;
    public final Context d;
    public final InlinePlaybackController e;
    public final acth f;
    public kek g;
    public final aadd h;
    public final mcz i;
    public Runnable j;
    public boq k;
    public TransitionDrawable l;
    public final aizn m;
    public final acrr n;
    public final InlineMutedScrimOverlayRedirectController o;
    public String p;
    public boolean q;
    public FrameLayout r;
    ProgressBar s;
    ViewGroup t;
    ViewGroup u;
    ImageView v;
    TextView w;
    LinearLayout x;
    public TouchImageView y;
    View z;
    public static final acte a = new acte(actj.INLINE_PLAYER_USER_TRIGGER_BUTTON);
    public static final acte b = new acte(actj.INLINE_PLAYER_FULLSCREEN_BUTTON);
    public static final acte c = new acte(actj.INLINE_PLAYER_MUTED_TOGGLE_BUTTON);
    private static final acte H = new acte(actj.INLINE_PLAYER_SUBTITLE_TOGGLE_BUTTON);

    public InteractiveInlineMutedControlsOverlay(Context context, azqb azqbVar, InlinePlaybackController inlinePlaybackController, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, aadd aaddVar, aacz aaczVar, SubtitleButtonController subtitleButtonController, acth acthVar, aihr aihrVar, ahwz ahwzVar, aign aignVar, kce kceVar, aizn aiznVar, ViewGroup viewGroup, ViewGroup viewGroup2, airw airwVar, mcz mczVar, acrr acrrVar, InlineMutedScrimOverlayRedirectController inlineMutedScrimOverlayRedirectController, axwt axwtVar) {
        super(context);
        kea a2 = kea.a().a();
        this.G = a2;
        this.X = a2.b();
        this.d = context;
        this.I = azqbVar;
        this.e = inlinePlaybackController;
        this.K = subtitleButtonController;
        this.f = acthVar;
        this.L = aihrVar;
        this.M = ahwzVar;
        this.N = aignVar;
        this.O = kceVar;
        this.Y = aaczVar;
        this.h = aaddVar;
        this.m = aiznVar;
        this.P = new ker(this);
        this.Q = viewGroup;
        this.F = viewGroup2;
        this.V = airwVar;
        this.i = mczVar;
        this.W = new aypf();
        this.n = acrrVar;
        this.o = inlineMutedScrimOverlayRedirectController;
        this.R = axwtVar;
        inlinePlaybackLifecycleController.l(this);
    }

    private final void C() {
        if (!A()) {
            this.r.removeCallbacks(this.j);
            this.v.setVisibility(8);
            this.v.animate().cancel();
            this.v.setAlpha(0.0f);
            boq boqVar = this.k;
            if (boqVar == null) {
                return;
            }
            boqVar.stop();
        } else if (this.q) {
        } else {
            this.v.setAlpha(0.0f);
            this.v.setVisibility(0);
            if (!this.U) {
                boq a2 = boq.a(this.r.getContext(), R.drawable.audio_indicator_24dp_animation);
                this.k = a2;
                this.v.setImageDrawable(a2);
                this.j = new keo(this);
                this.U = true;
            }
            this.k.start();
            this.r.postDelayed(this.j, 2140L);
            this.v.animate().alpha(0.8f).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void D() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay.D():void");
    }

    private final void E() {
        if (this.S.a.b) {
            this.E.setImageDrawable(null);
        } else {
            this.E.setImageDrawable(this.d.getResources().getDrawable(true != A() ? 2131233274 : 2131233272));
        }
    }

    private final boolean F() {
        return ((Boolean) this.G.d().b(jvb.l).e(false)).booleanValue();
    }

    public final boolean A() {
        kea keaVar = this.G;
        return keaVar.a == 3 && keaVar.b.a == ahzb.PLAYING && !this.G.b.b;
    }

    public final boolean B() {
        return ((Boolean) this.G.c().b(jvb.k).e(false)).booleanValue();
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        this.r = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.inline_muted_controls_overlay, this.r);
        this.r.findViewById(R.id.top_ui_controls_stub).setVisibility(0);
        this.s = (ProgressBar) this.r.findViewById(R.id.player_loading_view);
        this.t = (ViewGroup) this.r.findViewById(R.id.user_triggered_inline_loading_view_container);
        this.u = (ViewGroup) this.r.findViewById(R.id.autoplay_loading_view_container);
        this.v = (ImageView) this.r.findViewById(R.id.audio_indicator);
        this.w = (TextView) this.r.findViewById(R.id.countdown_badge);
        this.x = (LinearLayout) this.r.findViewById(R.id.top_ui_controls);
        this.y = (TouchImageView) this.r.findViewById(R.id.audio_toggle);
        this.z = this.r.findViewById(R.id.audio_caption_divider);
        this.A = (TouchImageView) this.r.findViewById(R.id.caption_toggle);
        this.B = this.r.findViewById(R.id.caption_fullscreen_divider);
        this.C = (TouchImageView) this.r.findViewById(R.id.fullscreen_button);
        this.D = this.r.findViewById(R.id.controls_user_triggered_divider);
        this.E = (TouchImageView) this.r.findViewById(R.id.user_triggered_inline_button);
        ((ViewGroup) this.r.findViewById(R.id.subtitle)).addView((View) this.I.get());
        ffh ffhVar = ((InlineTimeBarWrapper) ((ViewStub) this.Q.findViewById(R.id.inline_playback_time_bar_stub)).inflate()).a;
        this.f148J = ffhVar;
        ffhVar.u = true;
        this.r.addView(this.F, 1);
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.x.getBackground();
        this.l = transitionDrawable;
        transitionDrawable.setCrossFadeEnabled(true);
        this.T = new keo(this, 1);
        kmk kmkVar = new kmk((ViewStub) this.r.findViewById(R.id.scrubbed_preview_extended), this.r, this.f148J, this.L, this.M, this.N, this.O, this.Y);
        kej kejVar = new kej(new yye(this.w, 0L, 8));
        kek kekVar = new kek(this.f148J, kejVar);
        this.g = kekVar;
        kekVar.h(this.P);
        kek kekVar2 = this.g;
        kekVar2.d = kmkVar;
        ked kedVar = new ked(context, kekVar2, kejVar, this.s, this.w);
        this.S = kedVar;
        kedVar.c(this.G);
        int orElse = zhn.j(context, R.attr.ytOverlayButtonSecondary).orElse(0);
        TouchImageView touchImageView = this.y;
        akef.d(touchImageView, orElse, -1, touchImageView.getBackground());
        TouchImageView touchImageView2 = this.A;
        akef.d(touchImageView2, orElse, -1, touchImageView2.getBackground());
        TouchImageView touchImageView3 = this.C;
        akef.d(touchImageView3, orElse, -1, touchImageView3.getBackground());
        this.y.setOnClickListener(new kep(this, 1));
        this.K.s(this.A);
        this.K.t(new keo(this, 2));
        this.C.setOnClickListener(new kep(this));
        this.E.setOnClickListener(new kep(this, 2));
        this.W.g(g(this.V));
        this.W.d(this.R.a().as(new keq(this, 2)));
        return this.r;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        Drawable drawable;
        FrameLayout frameLayout = (FrameLayout) view;
        kea a2 = this.X.a();
        this.G = a2;
        this.X = a2.b();
        if (aa(1)) {
            this.S.c(this.G);
            E();
            D();
            C();
        }
        if (aa(2)) {
            kea keaVar = this.G;
            int i = keaVar.a;
            if (i == 2) {
                this.S.d(keaVar.c.d(), this.G.c.g());
            } else if (i == 0) {
                this.S.a();
                this.o.i();
                this.F.setVisibility(8);
                this.l.resetTransition();
            } else if (i == 3) {
                z();
            }
            this.S.c(this.G);
            C();
            E();
            D();
        }
        if (aa(4)) {
            keb kebVar = this.G.e;
            this.S.f(kebVar.a, kebVar.b, kebVar.c, kebVar.d);
        }
        if (aa(8)) {
            this.S.e(this.G.f);
        }
        ProgressBar progressBar = this.s;
        ViewGroup viewGroup = F() ? this.t : this.u;
        ViewParent parent = progressBar.getParent();
        if ((parent instanceof ViewGroup) && parent != viewGroup) {
            ((ViewGroup) parent).removeView(progressBar);
            viewGroup.addView(progressBar);
        }
        TouchImageView touchImageView = this.y;
        if (this.e.w()) {
            drawable = context.getResources().getDrawable(2131233488);
        } else {
            drawable = context.getResources().getDrawable(2131233490);
        }
        touchImageView.setImageDrawable(drawable);
        ggt ggtVar = this.G.c;
        if (ggtVar == null || ggtVar.b() == null) {
            return;
        }
        acti oi = this.f.oi();
        acte acteVar = new acte(this.G.c.b().c);
        oi.E(a, acteVar);
        oi.E(b, acteVar);
        oi.E(c, acteVar);
        oi.E(H, acteVar);
        E();
    }

    @Override // defpackage.ahyp
    public final void f(ControlsState controlsState) {
        kek kekVar;
        this.X.a = controlsState;
        Y(1);
        if (controlsState.a != ahzb.ENDED || (kekVar = this.g) == null) {
            return;
        }
        kekVar.d();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.s().d.Z(new keq(this, 1)), airwVar.G().c.I().aa(new keq(this), jww.l)};
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        if (this.X.a().d != ezxVar) {
            this.X.c = ezxVar;
            if (ezxVar.c()) {
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
        this.X.f = controlsOverlayStyle;
        Y(8);
    }

    @Override // com.google.android.apps.youtube.app.player.overlay.InlineMutedControlsOverlay, defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.W.qr();
    }

    @Override // defpackage.fze
    public final void lh(fyp fypVar, int i) {
        kdz kdzVar = this.X;
        kdzVar.b = fypVar.b;
        kdzVar.b(i);
        Y(2);
    }

    @Override // defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        return ezxVar.c();
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.X.a().d.c();
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
        kdz kdzVar = this.X;
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
            this.S.b();
        }
    }

    @Override // defpackage.ahyp
    public final void o(long j, long j2, long j3, long j4) {
        if (!nI() || this.G.b.a != ahzb.PLAYING) {
            return;
        }
        this.X.e = keb.a(j, j2, j3, j4);
        Y(4);
    }

    @Override // defpackage.ahyp
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.r.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.ahyp
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.r.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.ahyp
    public final void pI() {
    }

    @Override // defpackage.ahyp
    public final void pJ() {
    }

    public final void z() {
        this.l.resetTransition();
        this.x.removeCallbacks(this.T);
        this.x.postDelayed(this.T, 2000L);
    }
}

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.jar.q;
import com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.MinimalTimeBar;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.as;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c extends aize implements View.OnClickListener, Animation.AnimationListener, Handler.Callback, ahyp, aizf, aibg, aich, aiaq, h {
    public final as a;
    public final com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a b;
    public final MinimalTimeBar c;
    public final ProgressBar d;
    public final ImageButton e;
    public final ImageButton f;
    public final ImageButton g;
    public final ImageView h;
    public final TextView i;
    public Handler j;
    public final Animation k;
    public boolean l;
    private final aibe m;
    private ControlsOverlayStyle n;
    private ControlsState o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;

    public c(Context context, k kVar) {
        super(context);
        this.a = new as(new q(kVar));
        a aVar = new a(this);
        b bVar = new b(this);
        com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a aVar2 = new com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a(context);
        Context context2 = aVar2.getContext();
        float f = aVar2.getResources().getDisplayMetrics().density;
        aVar2.a = (int) ((50.0f * f) + 0.5f);
        aVar2.b = (int) ((45.0f * f) + 0.5f);
        aVar2.c = (int) ((f * 7.0f) + 0.5f);
        aVar2.d = com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.c.a(context2, aVar);
        aVar2.addView(aVar2.d);
        aVar2.e = new View(context2);
        aVar2.e.setBackgroundResource(2131230900);
        aVar2.addView(aVar2.e);
        f fVar = new f(context2, bVar);
        Context context3 = fVar.getContext();
        DisplayMetrics displayMetrics = fVar.getResources().getDisplayMetrics();
        float f2 = displayMetrics.density;
        fVar.c = (int) ((230.0f * f2) + 0.5f);
        fVar.e = (int) ((5.0f * f2) + 0.5f);
        fVar.f = (int) ((12.0f * f2) + 0.5f);
        fVar.d = (int) ((f2 * 8.0f) + 0.5f);
        fVar.a = new e(context3);
        fVar.b = new StateListDrawable();
        fVar.b.addState(View.PRESSED_ENABLED_STATE_SET, akf.a(context3, 2131230905));
        fVar.b.addState(View.ENABLED_STATE_SET, akf.a(context3, 2131230904));
        fVar.b.setState(View.ENABLED_STATE_SET);
        fVar.g = new Rect();
        fVar.k = new Paint();
        fVar.k.setTextSize(TypedValue.applyDimension(2, 14.0f, displayMetrics));
        fVar.k.setColor(-1);
        fVar.k.setAntiAlias(true);
        fVar.k.getTextBounds("00:00", 0, 5, fVar.g);
        fVar.h = new Rect();
        fVar.i = new Rect();
        fVar.j = new Rect();
        fVar.l = new Paint();
        fVar.l.setColor(Color.parseColor("#B2FFFF00"));
        fVar.a(ControlsOverlayStyle.a);
        fVar.b(0L, 0L, 0L);
        aVar2.f = fVar;
        aVar2.addView(aVar2.f);
        aVar2.j = new TextView(context2);
        aVar2.j.setBackgroundResource(2131230894);
        aVar2.j.setText("LIVE");
        aVar2.j.setTextSize(16.0f);
        aVar2.j.setTextColor(-1);
        aVar2.j.setGravity(16);
        aVar2.addView(aVar2.j);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, akf.a(context2, 2131230896));
        stateListDrawable.addState(View.ENABLED_STATE_SET, akf.a(context2, 2131230895));
        aVar2.g = new ImageButton(context2);
        aVar2.g.setBackground(null);
        aVar2.g.setImageDrawable(stateListDrawable);
        ImageButton imageButton = aVar2.g;
        int i = aVar2.c;
        imageButton.setPadding(i, i, i, i);
        aVar2.g.setOnClickListener(aVar2);
        aVar2.g.setContentDescription(context2.getText(R.string.accessibility_show_options_menu));
        aVar2.addView(aVar2.g);
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(View.PRESSED_ENABLED_SELECTED_STATE_SET, akf.a(context2, 2131230898));
        stateListDrawable2.addState(View.ENABLED_SELECTED_STATE_SET, akf.a(context2, 2131230897));
        stateListDrawable2.addState(View.PRESSED_ENABLED_STATE_SET, akf.a(context2, 2131230893));
        stateListDrawable2.addState(View.ENABLED_STATE_SET, akf.a(context2, 2131230892));
        aVar2.h = new ImageButton(context2);
        aVar2.h.setBackground(null);
        aVar2.h.setImageDrawable(stateListDrawable2);
        ImageButton imageButton2 = aVar2.g;
        int i2 = aVar2.c;
        imageButton2.setPadding(i2, i2, i2, i2);
        aVar2.h.setOnClickListener(aVar2);
        aVar2.h.setContentDescription(context2.getText(R.string.accessibility_enter_fullscreen));
        aVar2.addView(aVar2.h);
        this.b = aVar2;
        this.c = new MinimalTimeBar(context);
        this.o = ControlsState.b();
        ProgressBar progressBar = new ProgressBar(context);
        this.d = progressBar;
        progressBar.setIndeterminate(true);
        ImageButton imageButton3 = new ImageButton(context);
        this.e = imageButton3;
        imageButton3.setBackgroundResource(2131230888);
        imageButton3.setContentDescription(context.getText(R.string.accessibility_play));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        imageView.setBackgroundResource(2131230891);
        TextView textView = new TextView(context);
        this.i = textView;
        textView.setGravity(17);
        textView.setBackgroundResource(2131230900);
        textView.setTextColor(-1);
        textView.setMinimumHeight(aVar2.a);
        ImageButton imageButton4 = new ImageButton(context);
        this.f = imageButton4;
        imageButton4.setBackgroundResource(2131230886);
        imageButton4.setContentDescription(context.getText(R.string.accessibility_next));
        ImageButton imageButton5 = new ImageButton(context);
        this.g = imageButton5;
        imageButton5.setBackgroundResource(2131230889);
        imageButton5.setContentDescription(context.getText(R.string.accessibility_previous));
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.k = alphaAnimation;
        alphaAnimation.setInterpolator(new LinearInterpolator());
        this.m = new aibe(context);
    }

    private static void D(View view, int i, int i2) {
        int measuredWidth = i - (view.getMeasuredWidth() / 2);
        int measuredHeight = i2 - (view.getMeasuredHeight() / 2);
        view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
    }

    private final void E(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.k);
        }
    }

    private final void F(boolean z) {
        this.v = true;
        this.k.setDuration(true != z ? 500L : 100L);
        if (!this.r) {
            E(this.b);
        }
        E(this.e);
        E(this.f);
        E(this.g);
    }

    private static final void G(View view, boolean z) {
        view.setVisibility(true != z ? 8 : 0);
    }

    public final void A(boolean z) {
        this.t = z;
        if (z) {
            nf();
            C();
        } else if (this.o.a == ahzb.PAUSED || this.o.a == ahzb.ENDED) {
            pI();
        } else {
            C();
        }
    }

    public final void B(boolean z) {
        this.r = z;
        C();
    }

    public final void C() {
        boolean z;
        if (this.o.a == ahzb.PAUSED) {
            this.e.setBackgroundResource(2131230888);
            this.e.setContentDescription(getContext().getText(R.string.accessibility_play));
        } else if (this.o.a == ahzb.PLAYING) {
            this.e.setBackgroundResource(2131230887);
            this.e.setContentDescription(getContext().getText(R.string.accessibility_pause));
        } else {
            this.e.setBackgroundResource(2131230890);
            this.e.setContentDescription(getContext().getText(R.string.accessibility_replay));
        }
        boolean z2 = true;
        boolean z3 = this.l && this.b.getTop() < this.e.getBottom();
        if (this.u || this.o.i() || this.o.a == ahzb.NEW) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                G(childAt, (childAt == this.d && this.o.b) || ((childAt == this.h || childAt == this.i) && this.o.i()) || (childAt == this.c && this.r));
            }
            if (!this.r || this.t) {
                ControlsState controlsState = this.o;
                if (!controlsState.b && !controlsState.i()) {
                    z = false;
                    G(this, z);
                }
            }
            z = true;
            G(this, z);
        } else {
            G(this.h, this.o.i() && !z3);
            G(this.i, this.o.i() && !z3);
            G(this.d, this.o.b && !z3);
            G(this.e, !this.o.i() && !this.o.b && this.n.t && !z3);
            G(this.b, !this.r);
            G(this.c, this.n.p && this.r);
            setVisibility(0);
        }
        boolean z4 = !this.u && !this.o.b && this.n.u && !z3;
        G(this.f, z4 && this.p);
        ImageButton imageButton = this.g;
        if (!z4 || !this.q) {
            z2 = false;
        }
        G(imageButton, z2);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void b(g gVar) {
        this.a.f = gVar;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.aibg
    public final void e(boolean z) {
        this.b.d.b.setSelected(z);
    }

    @Override // defpackage.ahyp
    public final void f(ControlsState controlsState) {
        if (!this.o.equals(controlsState)) {
            this.o = controlsState;
            pI();
            return;
        }
        z();
    }

    @Override // defpackage.aibg
    public final void g(boolean z) {
        this.b.d.b.setVisibility(true != z ? 8 : 0);
    }

    public final void h() {
        this.v = false;
        this.j.removeMessages(1);
        this.k.setAnimationListener(null);
        if (!this.r) {
            this.b.clearAnimation();
        }
        this.f.clearAnimation();
        this.g.clearAnimation();
        this.e.clearAnimation();
        this.k.setAnimationListener(this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            F(false);
            return true;
        }
        return false;
    }

    @Override // defpackage.ahyp
    public final void i(ahyo ahyoVar) {
        as asVar = this.a;
        asVar.a = ahyoVar;
        com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a aVar = this.b;
        aVar.i = asVar;
        com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.c cVar = aVar.d;
        asVar.getClass();
        cVar.h = asVar;
    }

    @Override // defpackage.ahyp
    public final void j(boolean z) {
        this.b.f.setEnabled(z);
    }

    @Override // defpackage.aibg
    public final void k(SubtitleTrack subtitleTrack) {
    }

    @Override // defpackage.ahyp
    public final void l(ControlsOverlayStyle controlsOverlayStyle) {
        this.n = controlsOverlayStyle;
        com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a aVar = this.b;
        if (controlsOverlayStyle == ControlsOverlayStyle.k) {
            aVar.f.setVisibility(8);
            aVar.j.setVisibility(0);
        } else {
            aVar.f.a(controlsOverlayStyle);
            aVar.f.setVisibility(0);
            aVar.j.setVisibility(8);
        }
        this.c.a(controlsOverlayStyle);
    }

    @Override // defpackage.aibg
    public final void m(aibf aibfVar) {
        this.a.b = aibfVar;
    }

    @Override // defpackage.aiaq
    public final void nK(boolean z) {
        this.q = z;
        C();
    }

    @Override // defpackage.ahyp
    public final void nN(CharSequence charSequence) {
    }

    @Override // defpackage.ahyp
    public final void nO(boolean z) {
    }

    @Override // defpackage.ahyp
    public final void nP(Map map) {
        this.b.f.m = map;
    }

    @Override // defpackage.ahyp
    public final void nf() {
        h();
        if (this.u) {
            return;
        }
        this.u = true;
        this.b.d.setVisibility(4);
        C();
        setFocusable(true);
        requestFocus();
        as asVar = this.a;
        if (asVar == null) {
            return;
        }
        asVar.d();
    }

    @Override // defpackage.ahyp
    public final void ng() {
        this.m.a();
        l(ControlsOverlayStyle.a);
    }

    @Override // defpackage.ahyp
    public final void nh(String str, boolean z) {
        this.o = z ? ControlsState.g() : ControlsState.h();
        this.h.setImageResource(true != z ? 2131230891 : 2131230890);
        this.i.setText(str);
        C();
        pI();
    }

    @Override // defpackage.ahyp
    public final void ni(boolean z) {
        this.b.b(z);
    }

    @Override // defpackage.ahyp
    public final void nj(boolean z) {
        this.b.h.setVisibility(true != z ? 0 : 8);
    }

    @Override // defpackage.ahyp
    public final void ny() {
        this.b.c(0L, 0L, 0L);
        this.c.b(0L, 0L, 0L);
    }

    @Override // defpackage.ahyp
    public final void o(long j, long j2, long j3, long j4) {
        this.b.c(j, j3, j4);
        this.c.b(j, j3, j4);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.v = false;
        nf();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a != null) {
            if (view == this.f) {
                nf();
                this.a.a();
            } else if (view == this.g) {
                nf();
                this.a.b();
            } else if (view != this.e) {
            } else {
                if (this.o.a == ahzb.ENDED) {
                    this.a.n();
                } else if (this.o.a == ahzb.PLAYING) {
                    this.a.e();
                } else if (this.o.a != ahzb.PAUSED) {
                } else {
                    this.a.f();
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        as asVar = this.a;
        boolean z = true;
        if (1 != (motionEvent.getFlags() & 1)) {
            z = false;
        }
        asVar.g(z);
        return super.onFilterTouchEventForSecurity(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback, defpackage.ahyp
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!keyEvent.isSystem() || ahfe.c(i)) {
            pI();
            if (this.o.a == ahzb.RECOVERABLE_ERROR) {
                this.a.o();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingBottom = i5 - getPaddingBottom();
        int i6 = (i3 - i) / 2;
        int i7 = i5 / 2;
        View view = this.r ? this.c : this.b;
        view.layout(paddingLeft, paddingBottom - view.getMeasuredHeight(), view.getMeasuredWidth() + paddingLeft, paddingBottom);
        D(this.e, i6, i7);
        D(this.h, i6, i7);
        D(this.d, i6, i7);
        D(this.g, this.e.getLeft() - (this.g.getMeasuredWidth() / 2), i7);
        D(this.f, this.e.getRight() + (this.f.getMeasuredWidth() / 2), i7);
        TextView textView = this.i;
        textView.layout(paddingLeft, paddingBottom - textView.getMeasuredHeight(), this.i.getMeasuredWidth() + paddingLeft, paddingBottom);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        setMeasuredDimension(defaultSize, getDefaultSize(0, i2));
        int i3 = (defaultSize * 10) / 100;
        TextView textView = this.i;
        textView.setPadding(i3, textView.getPaddingTop(), i3, this.i.getPaddingBottom());
        measureChild(this.d, i, i2);
        measureChild(this.e, i, i2);
        measureChild(this.h, i, i2);
        measureChild(this.i, i, i2);
        measureChild(this.f, i, i2);
        measureChild(this.g, i, i2);
        measureChild(this.r ? this.c : this.b, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
        if (r7 <= r4.getBottom()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
        if (r6.v != false) goto L40;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L13
            r7 = 3
            if (r0 == r7) goto Lf
            goto L85
        Lf:
            r6.s = r1
            goto L85
        L13:
            com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState r7 = r6.o
            ahzb r7 = r7.a
            ahzb r0 = defpackage.ahzb.RECOVERABLE_ERROR
            if (r7 != r0) goto L21
            com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.as r7 = r6.a
            r7.o()
            goto L2c
        L21:
            boolean r7 = r6.u
            if (r7 != 0) goto L2c
            boolean r7 = r6.s
            if (r7 != 0) goto L2c
            r6.F(r2)
        L2c:
            r6.s = r1
            goto L85
        L2f:
            boolean r0 = r6.u
            if (r0 != 0) goto L7f
            float r0 = r7.getX()
            float r7 = r7.getY()
            boolean r3 = r6.r
            if (r3 == 0) goto L42
            com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.MinimalTimeBar r4 = r6.c
            goto L44
        L42:
            com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a r4 = r6.b
        L44:
            if (r3 != 0) goto L56
            boolean r3 = r6.l
            if (r3 != 0) goto L56
            com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a r3 = r6.b
            int r3 = r3.getBottom()
            com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.a r5 = r6.b
            int r5 = r5.a
            int r3 = r3 - r5
            goto L5a
        L56:
            int r3 = r4.getTop()
        L5a:
            int r5 = r4.getLeft()
            float r5 = (float) r5
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L7b
            int r5 = r4.getRight()
            float r5 = (float) r5
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L7b
            float r0 = (float) r3
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L7b
            int r0 = r4.getBottom()
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 > 0) goto L7b
            goto L7f
        L7b:
            boolean r7 = r6.v
            if (r7 == 0) goto L80
        L7f:
            r1 = 1
        L80:
            r6.s = r1
            r6.pI()
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.aiaq
    public final void pB(boolean z) {
        this.p = z;
        C();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pC(boolean z) {
    }

    @Override // defpackage.aiaq
    public final void pD(aiap aiapVar) {
        this.a.d = aiapVar;
    }

    @Override // defpackage.aich
    public final void pG(boolean z) {
        this.b.d.a.setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.aich
    public final void pH(VideoQuality[] videoQualityArr, int i, boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded.c cVar = this.b.d;
        cVar.f = videoQualityArr;
        cVar.g = i;
    }

    @Override // defpackage.ahyp
    public final void pI() {
        as asVar;
        if (this.t) {
            return;
        }
        boolean z = this.u;
        h();
        this.u = false;
        C();
        setFocusable(false);
        if (z && (asVar = this.a) != null) {
            asVar.u();
        }
        z();
    }

    @Override // defpackage.ahyp
    public final void pJ() {
        zag.r(getContext(), getContext().getText(R.string.no_subtitles), 0);
    }

    @Override // defpackage.aich
    public final void q(aicg aicgVar) {
        this.a.c = aicgVar;
    }

    @Override // defpackage.aibg
    public final void r(List list) {
        this.m.b(list, this.a);
    }

    @Override // defpackage.ahyp
    public final /* synthetic */ void x() {
        ahfo.a(this);
    }

    @Override // defpackage.ahyp
    public final /* synthetic */ void y(auad auadVar, boolean z) {
        ahfo.b(this, auadVar, z);
    }

    public final void z() {
        if ((this.o.a == ahzb.PLAYING || this.o.b) && !this.u && !this.j.hasMessages(1)) {
            this.j.sendEmptyMessageDelayed(1, 2500L);
        }
    }
}

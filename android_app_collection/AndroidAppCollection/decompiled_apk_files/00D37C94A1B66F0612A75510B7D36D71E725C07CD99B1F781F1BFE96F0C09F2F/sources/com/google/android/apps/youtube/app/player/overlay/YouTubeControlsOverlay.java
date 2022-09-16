package com.google.android.apps.youtube.app.player.overlay;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubeControlsOverlay implements Handler.Callback, ahyp, f, fef, ahyh, fgd, zbs, zbo, ahin, ahim, aigo, ahzv, kbf, aifv, kon, kls, kbd, ynl {
    public ahxu A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final Runnable F;
    public aigm G;
    public final aadd H;
    public final acti I;

    /* renamed from: J  reason: collision with root package name */
    public final kgt f149J;
    public final kgn K;
    public final axxu L;
    public final kfb P;
    public final boolean Q;
    private final khc R;
    private final khd S;
    private final kfi T;
    private final kcz U;
    private final kct V;
    private final ahxx W;
    private final ajgf X;
    private final SuggestedActionsMainController Y;
    private final kdr Z;
    public final kbl a;
    private final kol aA;
    private final koo aB;
    private final khy aC;
    private final aihr aD;
    private final ahwz aE;
    private final kce aG;
    private final kch aH;
    private final kgr aI;
    private final axnm aJ;
    private final axnm aK;
    private final axnm aL;
    private final aikh aN;
    private final aacz aO;
    private final nyx aa;
    private kco ab;
    private ahyg ac;
    private kgm ad;
    private final kin ae;
    private final int af;
    private final int ag;
    private Animation ai;
    private Animation aj;
    private boolean ak;
    private boolean al;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private final oet at;
    private final Context au;
    private final yni av;
    private final airw aw;
    private final aire ax;
    private final ntt ay;
    private final zbq az;
    public final aifm b;
    public final ahjc c;
    public final kay d;
    public final kbu e;
    public kfw f;
    public ahyo g;
    public final aigl h;
    public final jzr i;
    public final klt j;
    public View k;
    public FrameLayout l;
    public View m;
    public final kix n;
    public final kjd o;
    public TextView p;
    public final ket q;
    public final ffr r;
    public ahuh s;
    public long u;
    public long v;
    public long w;
    public long x;
    public int t = 0;
    public ControlsState y = ControlsState.b();
    public ControlsOverlayStyle z = ControlsOverlayStyle.a;
    private ezx am = ezx.NONE;
    private boolean an = true;
    private final Handler ah = new Handler(this);
    public final Set O = new HashSet();
    public final azpm M = azpm.e();
    private final azpm aM = azpm.e();
    public final azpm N = azpm.e();
    private final aypf aF = new aypf();

    /* JADX WARN: Removed duplicated region for block: B:16:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x034a A[LOOP:0: B:21:0x0348->B:22:0x034a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public YouTubeControlsOverlay(android.content.Context r18, defpackage.zbq r19, defpackage.aigl r20, defpackage.kfi r21, defpackage.acti r22, defpackage.oet r23, defpackage.ahwz r24, defpackage.aifm r25, defpackage.ahjc r26, defpackage.khc r27, defpackage.kda r28, defpackage.kcu r29, com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController r30, defpackage.kol r31, defpackage.aikh r32, defpackage.koo r33, defpackage.khd r34, defpackage.klt r35, final defpackage.kgi r36, defpackage.yni r37, defpackage.airw r38, defpackage.aacz r39, defpackage.aadd r40, defpackage.khy r41, defpackage.aihr r42, defpackage.ahxx r43, defpackage.ajgf r44, defpackage.kfb r45, defpackage.ntt r46, android.view.View[] r47, defpackage.nyx r48, defpackage.kbu r49, defpackage.kbl r50, defpackage.aire r51, defpackage.kce r52, defpackage.kch r53, defpackage.kgr r54, defpackage.kgt r55, defpackage.kgn r56, defpackage.kiy r57, defpackage.kje r58, final defpackage.kdo r59, defpackage.axxu r60, defpackage.axnm r61, defpackage.axnm r62, defpackage.axnm r63) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay.<init>(android.content.Context, zbq, aigl, kfi, acti, oet, ahwz, aifm, ahjc, khc, kda, kcu, com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController, kol, aikh, koo, khd, klt, kgi, yni, airw, aacz, aadd, khy, aihr, ahxx, ajgf, kfb, ntt, android.view.View[], nyx, kbu, kbl, aire, kce, kch, kgr, kgt, kgn, kiy, kje, kdo, axxu, axnm, axnm, axnm):void");
    }

    private static void Y(zbq zbqVar, zbr... zbrVarArr) {
        for (zbr zbrVar : zbrVarArr) {
            zbqVar.a(zbrVar);
        }
    }

    private final void Z() {
        jfw.j();
        B();
        if (this.t == 0) {
            return;
        }
        this.t = 0;
        U();
        ahyo ahyoVar = this.g;
        if (ahyoVar == null) {
            return;
        }
        ahyoVar.d();
    }

    private final void aa() {
        if (this.l != null) {
            return;
        }
        this.l = (FrameLayout) LayoutInflater.from(this.au).inflate(R.layout.youtube_controls_overlay, (ViewGroup) null);
        if (eog.v(this.H)) {
            this.l.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: kid
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    YouTubeControlsOverlay youTubeControlsOverlay = YouTubeControlsOverlay.this;
                    int i9 = i3 - i;
                    int i10 = i4 - i2;
                    if (eog.v(youTubeControlsOverlay.H) && youTubeControlsOverlay.B && i9 >= i10) {
                        int i11 = (i9 - ((int) (i10 * 1.7777778f))) / 2;
                        Rect rect = (Rect) youTubeControlsOverlay.M.aJ();
                        int i12 = 0;
                        int i13 = rect == null ? 0 : rect.top;
                        if (rect != null) {
                            i12 = rect.bottom;
                        }
                        youTubeControlsOverlay.M.c(new Rect(i11, i13, i11, i12));
                    }
                }
            });
        }
        this.l.setClipToPadding(false);
        this.l.setFocusableInTouchMode(true);
        aifw aifwVar = new aifw(this.l, (ViewStub) this.l.findViewById(R.id.quick_seek_overlay_stub), this, this.b.a);
        aifm aifmVar = this.b;
        aifmVar.h = aifwVar;
        aifwVar.d(new aifl(aifmVar));
        aqtp aqtpVar = this.H.a().v;
        if (aqtpVar == null) {
            aqtpVar = aqtp.a;
        }
        aifwVar.c(aqtpVar.f);
        this.aA.k(new kor(this.au, (ViewStub) this.l.findViewById(R.id.video_zoom_overlay_stub)), this.aB);
        this.aB.e(this);
        this.l.setTag(R.id.player_overlay_tap_listener, this);
        final kgr kgrVar = this.aI;
        FrameLayout frameLayout = this.l;
        if (!kgrVar.g.h()) {
            kgrVar.g = ampq.j(new yye(((ViewStub) frameLayout.findViewById(R.id.easy_seek_overlay_stub)).inflate()));
            ((yye) kgrVar.g.c()).d = frameLayout.getResources().getInteger(R.integer.fade_duration_fast);
            ((yye) kgrVar.g.c()).h(new zas() { // from class: kgp
                @Override // defpackage.zas
                public final void nH(int i, yye yyeVar) {
                    kgr.this.b.f(i != 0);
                }
            });
            kgrVar.e.D(new acte(actj.SEEK_EDUOVERLAY));
        }
        final kce kceVar = this.aG;
        FrameLayout frameLayout2 = this.l;
        if (!kceVar.s.h() && kceVar.b) {
            View findViewById = frameLayout2.findViewById(R.id.easy_seek_edu_container);
            if (findViewById == null) {
                kceVar.s = ampq.j(new yye(((ViewStub) frameLayout2.findViewById(R.id.easy_seek_overlay_stub)).inflate()));
            } else {
                kceVar.s = ampq.j(new yye(findViewById));
            }
            ((yye) kceVar.s.c()).d = frameLayout2.getResources().getInteger(R.integer.fade_duration_fast);
            ((yye) kceVar.s.c()).h(new zas() { // from class: kcc
                @Override // defpackage.zas
                public final void nH(int i, yye yyeVar) {
                    kce.this.l.f(i != 0);
                }
            });
            kceVar.m.D(new acte(actj.SEEK_EDUOVERLAY));
            kceVar.m.n(new acte(actj.PLAYER_SEEK_OUTSIDE_SCRUBBER));
        }
        Y(this.az, this.aB, this.i, this.aa);
        this.az.b(this.aH);
        zbq zbqVar = new zbq();
        zbp zbpVar = new zbp(ViewConfiguration.get(this.au));
        zbpVar.d = this;
        zbpVar.b = this;
        Y(zbqVar, this.aH, zbpVar, this.aB, this.i, this.aa);
        ImageView imageView = (ImageView) this.l.findViewById(R.id.scrim_overlay);
        zbqVar.c(imageView);
        kgm kgmVar = new kgm(imageView);
        this.ad = kgmVar;
        this.a.a(kgmVar);
        if (this.aC.i) {
            this.aC.f((ViewStub) this.l.findViewById(R.id.watch_while_timebar_overlay_stub), gka.s);
        }
        this.a.a(new keu(this.l, this.aO));
        for (View view : this.O) {
            this.l.addView(view);
        }
        this.O.clear();
        this.h.bringToFront();
        this.C = true;
        ahyg ahygVar = this.ac;
        if (ahygVar == null) {
            return;
        }
        ahygVar.d(this, this.l);
    }

    private final void ab(float f) {
        if (f >= 0.0f || !this.h.c.g() || this.t == 1 || this.z.o) {
            return;
        }
        Q();
    }

    private final void ac(boolean z, boolean z2) {
        if (this.h.getParent() == null) {
            return;
        }
        if (!this.D && !z && this.h.c.d()) {
            this.h.e(0);
        }
        if (!z2) {
            zag.o(this.h, z);
        } else if (z) {
            if (this.aj == null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.au, R.anim.fade_in);
                this.aj = loadAnimation;
                loadAnimation.setDuration(this.af);
            }
            this.h.startAnimation(this.aj);
        } else if (this.h.getVisibility() != 0) {
        } else {
            if (this.ai == null) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(this.au, R.anim.fade_out);
                this.ai = loadAnimation2;
                loadAnimation2.setDuration(this.af);
            }
            this.h.startAnimation(this.ai);
        }
    }

    private final void ad(boolean z) {
        this.aM.c(Boolean.valueOf(z));
    }

    private final void af(boolean z) {
        if (z) {
            D();
        }
        View view = this.k;
        if (view == null) {
            return;
        }
        zag.o(view, z);
    }

    private final boolean ag(MotionEvent motionEvent) {
        if (!this.ao && !ControlsOverlayStyle.a(this.z) && !ControlsOverlayStyle.c(this.z) && !this.y.i() && this.y.a != ahzb.ENDED) {
            return (aifr.b((int) motionEvent.getX(), this.l.getWidth(), false) != 2 || this.w > this.v) && !this.j.i();
        }
        return false;
    }

    private final boolean ah() {
        if (!ai()) {
            return false;
        }
        if (this.t != 1) {
            Q();
        } else {
            B();
        }
        return true;
    }

    private final boolean ai() {
        if (!this.al) {
            if (eog.aK(this.aO)) {
                return this.A.a;
            } else if (!this.ak) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aizf
    /* renamed from: A */
    public final ViewGroup kZ() {
        aa();
        return this.l;
    }

    public final void B() {
        this.ah.removeMessages(1);
        this.ah.removeMessages(2);
        this.h.clearAnimation();
    }

    public final void C(ahhm ahhmVar) {
        if (ahhmVar.c() == aijx.VIDEO_WATCH_LOADED) {
            this.I.n(new acte(actj.FULLSCREEN_OPEN_WITH_BUTTON));
            this.I.n(new acte(actj.FULLSCREEN_OPEN_BY_ROTATE));
            if (this.l != null && ai()) {
                this.l.getRootView().clearFocus();
                this.l.requestFocus();
            }
            kjd kjdVar = this.o;
            WatchNextResponseModel a = ahhmVar.a();
            if (a != null) {
                kjdVar.i.c(a);
            }
        }
        PlayerResponseModel b = ahhmVar.b();
        if (b != null) {
            PlayerConfigModel c = b.c();
            atzw atzwVar = c.c.m;
            if (atzwVar == null) {
                atzwVar = atzw.a;
            }
            ad(atzwVar.b);
            if (eog.bg(this.aO)) {
                return;
            }
            VideoStreamingData videoStreamingData = b.c;
            boolean z = true;
            boolean z2 = videoStreamingData != null && videoStreamingData.H();
            kfb kfbVar = this.P;
            if (!c.al() || (!c.aD() && !z2)) {
                z = false;
            }
            kfbVar.d(kex.l, Boolean.valueOf(z));
        }
    }

    public final void D() {
        aa();
        if (this.k != null) {
            return;
        }
        View inflate = ((ViewStub) this.l.findViewById(R.id.controls_layout_stub)).inflate();
        this.k = inflate;
        ket ketVar = this.q;
        TextView textView = (TextView) inflate.findViewById(R.id.player_learn_more_button);
        textView.getClass();
        ketVar.d = textView;
        ketVar.a.as(new kes(ketVar, 2));
        ketVar.b.as(new kes(ketVar));
        ketVar.c.as(new kes(ketVar, 1));
        kbu kbuVar = this.e;
        TextView textView2 = (TextView) this.k.findViewById(R.id.temp_toast);
        kih kihVar = new kih(this);
        kbt kbtVar = new kbt(kt.o(0.05f, 0.0f, 0.0f, 1.0f));
        kbuVar.e = new yye(textView2, 500L, kbtVar, 8);
        kbuVar.f = new yye((TextView) this.k.findViewById(R.id.persistent_toast), 500L, kbtVar, 8);
        kbuVar.d = kihVar;
        kbuVar.e.h(new kbq(kbuVar, 1));
        kbuVar.f.h(new kbq(kbuVar));
        ((TextView) kbuVar.e.b).addOnAttachStateChangeListener(new kbs(kbuVar));
        ffr ffrVar = kbuVar.a;
        if (ffrVar != null) {
            ((TextView) kbuVar.e.b).setText(ffrVar.a);
        }
        ffr ffrVar2 = kbuVar.b;
        if (ffrVar2 != null) {
            ((TextView) kbuVar.f.b).setText(ffrVar2.a);
        }
        kihVar.a(kbuVar.a != null);
        kbuVar.d(false);
        this.a.a(this.e);
        kfw kfwVar = new kfw((ImageView) this.l.findViewById(R.id.player_control_play_pause_replay_button), this.aO, new axnm() { // from class: kik
            @Override // defpackage.axnm
            public final Object get() {
                return YouTubeControlsOverlay.this.L;
            }
        }, this.aJ, this.aK, this.aL);
        this.f = kfwVar;
        kfwVar.g = this.g;
        this.a.a(kfwVar);
        final khc khcVar = this.R;
        FrameLayout frameLayout = this.l;
        int i = this.af;
        khcVar.m = new khb(frameLayout, i);
        khcVar.k.as(new ayqb() { // from class: kha
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                arhr b;
                khc khcVar2 = khc.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                khb khbVar = khcVar2.m;
                if (khbVar == null) {
                    return;
                }
                apos aposVar = khcVar2.n;
                if (aposVar != null) {
                    int i2 = aposVar.b;
                    if ((i2 & 2048) != 0 && (i2 & 32) != 0) {
                        TouchImageView touchImageView = (TouchImageView) khbVar.d.b;
                        fzr fzrVar = khcVar2.b;
                        if (booleanValue) {
                            arhs arhsVar = aposVar.m;
                            if (arhsVar == null) {
                                arhsVar = arhs.a;
                            }
                            b = arhr.b(arhsVar.c);
                            if (b == null) {
                                b = arhr.UNKNOWN;
                            }
                        } else {
                            arhs arhsVar2 = aposVar.g;
                            if (arhsVar2 == null) {
                                arhsVar2 = arhs.a;
                            }
                            b = arhr.b(arhsVar2.c);
                            if (b == null) {
                                b = arhr.UNKNOWN;
                            }
                        }
                        touchImageView.setImageResource(fzrVar.a(b));
                        ((TouchImageView) khcVar2.m.d.b).setContentDescription(booleanValue ? khcVar2.n.o : khcVar2.n.i);
                        return;
                    }
                }
                khcVar2.a.g = false;
            }
        });
        kbc kbcVar = khcVar.d;
        ezh ezhVar = (ezh) kbcVar.a.get();
        ezhVar.getClass();
        ayom ayomVar = (ayom) kbcVar.b.get();
        ayomVar.getClass();
        acti actiVar = (acti) kbcVar.c.get();
        actiVar.getClass();
        khcVar.o = new kbb(ezhVar, ayomVar, actiVar, (ImageView) khcVar.m.e.b);
        khcVar.a.c = khcVar.m;
        final kgc kgcVar = khcVar.i;
        FrameLayout frameLayout2 = (FrameLayout) LayoutInflater.from(kgcVar.a).inflate(R.layout.player_heading_view_container, (ViewGroup) frameLayout.findViewById(R.id.player_video_heading));
        kgcVar.g = (TextView) frameLayout2.findViewById(R.id.player_video_title_view);
        kgcVar.f = kgcVar.b.a();
        kgcVar.f.setVisibility(8);
        frameLayout2.addView(kgcVar.f);
        kgcVar.e.as(new ayqb() { // from class: kfz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                kgc kgcVar2 = kgc.this;
                if (obj instanceof aqtb) {
                    kga kgaVar = (kga) kgcVar2.i;
                    kgaVar.a.f.setVisibility(0);
                    kgaVar.a.g.setVisibility(8);
                    kgc kgcVar3 = kgaVar.a;
                    ajhl ajhlVar = kgcVar3.b;
                    ajrs ajrsVar = kgcVar3.d;
                    ajin ajinVar = (ajin) kgcVar3.c.get();
                    ajhlVar.oK(ajrsVar, ajhh.a((aqtb) obj));
                } else if (!(obj instanceof CharSequence)) {
                } else {
                    kga kgaVar2 = (kga) kgcVar2.h;
                    kgaVar2.a.g.setVisibility(0);
                    kgaVar2.a.f.setVisibility(8);
                    kgaVar2.a.g.setText((CharSequence) obj);
                }
            }
        });
        khcVar.f.h((ViewStub) frameLayout.findViewById(R.id.autonav_preview_stub), i);
        khcVar.g.h((ViewStub) frameLayout.findViewById(R.id.autonav_toggle), i);
        frameLayout.addOnLayoutChangeListener(khcVar);
        for (View view : khcVar.l) {
            khcVar.b(view);
        }
        khcVar.l.clear();
        khcVar.h.s(khcVar.j);
        final kbb kbbVar = khcVar.o;
        kbbVar.a(kbbVar.a.g().b());
        kbbVar.a.i(kbbVar);
        kbbVar.d.setOnClickListener(new View.OnClickListener() { // from class: kba
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                kbb kbbVar2 = kbb.this;
                kbbVar2.c.H(3, new acte(actj.WATCH_MINIMIZE_BUTTON), null);
                kbbVar2.b.c(njd.a);
            }
        });
        ((TouchImageView) khcVar.m.f.b).setOnClickListener(new kgy(khcVar, 1));
        ((TouchImageView) khcVar.m.d.b).setOnClickListener(new kgy(khcVar));
        khcVar.h.t(anlf.a);
        this.a.a(this.S);
        final kfi kfiVar = this.T;
        FrameLayout frameLayout3 = this.l;
        kfiVar.e = this;
        long integer = frameLayout3.getResources().getInteger(R.integer.fade_duration_fast);
        kfiVar.m = new yye(frameLayout3.findViewById(R.id.player_control_previous_button), integer, 8);
        kfiVar.l = new yye(frameLayout3.findViewById(R.id.player_control_next_button), integer, 8);
        kfiVar.n = new yye(frameLayout3.findViewById(R.id.player_control_rewind_button), integer, 8);
        kfiVar.o = new yye(frameLayout3.findViewById(R.id.player_control_fast_forward_button), integer, 8);
        kfiVar.p = new yye((ImageView) frameLayout3.findViewById(R.id.player_control_play_pause_replay_button), integer, 8);
        Resources resources = frameLayout3.getResources();
        kfiVar.f = resources.getDimensionPixelSize(R.dimen.overlay_midui_default_margin);
        kfiVar.g = resources.getDimensionPixelSize(R.dimen.overlay_midui_fullscreen_margin);
        kfiVar.h = resources.getDimensionPixelSize(R.dimen.overlay_midui_accessibility_margin);
        kfiVar.i = resources.getDimensionPixelSize(R.dimen.overlay_midui_accessibility_fullscreen_margin);
        lj.M(kfiVar.l.b, new kfh(kfiVar));
        kfiVar.l.b.setOnClickListener(new kff(kfiVar, 1));
        kfiVar.m.b.setOnClickListener(new kff(kfiVar));
        kfiVar.o.b.setOnClickListener(new kff(kfiVar, 2));
        kfiVar.n.b.setOnClickListener(new kff(kfiVar, 3));
        kfiVar.d.c();
        kfiVar.d.d(kfiVar.a.c.as(new ayqb() { // from class: kfg
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                int i2;
                kfi kfiVar2 = kfi.this;
                kez kezVar = (kez) obj;
                kfe kfeVar = kezVar.a;
                boolean z = kezVar.b;
                if (!kfeVar.a) {
                    kfiVar2.n.b(z);
                    kfiVar2.o.b(z);
                    kfiVar2.m.b(z);
                    kfiVar2.l.b(z);
                    khk khkVar = kfiVar2.c;
                    if (khkVar.h || khkVar.k != khkVar.c) {
                        return;
                    }
                    khkVar.kT();
                    return;
                }
                kfiVar2.l.a(kfi.c(kfeVar), z);
                kfiVar2.m.a(kfi.c(kfeVar), z);
                kfiVar2.l.b.setEnabled(kfeVar.e);
                kfiVar2.m.b.setEnabled(kfeVar.f);
                kfiVar2.k = kfeVar.l ? kfiVar2.l.b.getResources().getString(R.string.accessibility_autoplay_enabled) : null;
                if (kfeVar.b) {
                    khk khkVar2 = kfiVar2.c;
                    if (!khkVar2.h && khkVar2.p.c() != aika.ENDED) {
                        khkVar2.l(khkVar2.c);
                        khkVar2.kU();
                    }
                }
                boolean z2 = kfeVar.m.s && kfeVar.k && !kfeVar.g && !kfeVar.h && !kfeVar.i && !kfeVar.j;
                kfiVar2.o.a(z2, z);
                kfiVar2.n.a(z2, z);
                if (z2) {
                    int seconds = (int) kfiVar2.b.a().getSeconds();
                    int i3 = seconds == 10 ? 1 : 2;
                    ImageView imageView = (ImageView) kfiVar2.n.b;
                    ImageView imageView2 = (ImageView) kfiVar2.o.b;
                    Resources resources2 = imageView.getContext().getResources();
                    Integer valueOf = Integer.valueOf(seconds);
                    imageView.setContentDescription(resources2.getQuantityString(R.plurals.accessibility_dtts_rewind, seconds, valueOf));
                    imageView2.setContentDescription(imageView2.getContext().getResources().getQuantityString(R.plurals.accessibility_dtts_fast_forward, seconds, valueOf));
                    if (kfiVar2.j != i3) {
                        kfiVar2.j = i3;
                        if (i3 == 1) {
                            imageView.setImageResource(R.drawable.player_replay_10);
                            imageView2.setImageResource(R.drawable.player_forward_10);
                        } else {
                            imageView.setImageResource(R.drawable.player_fast_rewind);
                            imageView2.setImageResource(R.drawable.player_fast_forward);
                        }
                    }
                }
                boolean z3 = kfeVar.d;
                if (z2) {
                    i2 = z3 ? kfiVar2.i : kfiVar2.h;
                    kfi.b(kfiVar2.n.b, i2, 0);
                    kfi.b(kfiVar2.o.b, 0, i2);
                } else {
                    i2 = z3 ? kfiVar2.g : kfiVar2.f;
                }
                kfi.b(kfiVar2.p.b, i2, i2);
                kfiVar2.e.kZ().requestLayout();
            }
        }));
        this.a.a(this.P);
        kmk kmkVar = new kmk((ViewStub) this.l.findViewById(R.id.scrubbed_preview_extended), this.k, this.aC, this.aD, this.aE, this.h.c, this.aG, this.aO);
        this.n.d = kmkVar;
        kjd kjdVar = this.o;
        azpx azpxVar = kmkVar.a;
        kjdVar.n = ampq.j(azpxVar);
        kcb kcbVar = kjdVar.m;
        if (kcbVar != null) {
            kcbVar.i(azpxVar);
        }
        final kcz kczVar = this.U;
        azpx azpxVar2 = kmkVar.a;
        kczVar.a.c();
        kczVar.a.d(azpxVar2.as(new ayqb() { // from class: kcx
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                kcz kczVar2 = kcz.this;
                Rect rect = (Rect) obj;
                yye yyeVar = kczVar2.h;
                if (yyeVar == null || !kczVar2.d) {
                    return;
                }
                yyeVar.b.getGlobalVisibleRect(kczVar2.b);
                kczVar2.b.offset(kczVar2.h.b.getPaddingRight(), 0);
                boolean z = kczVar2.c;
                boolean intersect = kczVar2.b.intersect(rect);
                kczVar2.c = intersect;
                if (z == intersect) {
                    return;
                }
                kczVar2.a();
            }
        }));
        kco kcoVar = new kco(this.l);
        this.ab = kcoVar;
        this.a.a(kcoVar);
        this.aM.B().as(new kic(this, 8));
        this.M.B().as(new kic(this, 1));
    }

    public final void E() {
        if (this.t != 0) {
            if ((this.y.a != ahzb.PLAYING && !this.y.b) || !W() || this.ah.hasMessages(1) || this.j.i() || this.E || this.aI.j) {
                return;
            }
            Handler handler = this.ah;
            ahxu ahxuVar = this.A;
            handler.sendEmptyMessageDelayed(1, ahxuVar.a ? ahxuVar.d : 2000L);
        }
    }

    @Override // defpackage.ahim
    public final void F(boolean z) {
        this.ap = z;
    }

    @Override // defpackage.ahzv
    public final void G(boolean z) {
        this.a.e.c(Boolean.valueOf(z));
    }

    @Override // defpackage.ahzv
    public final void H(boolean z) {
        this.ar = z;
        this.a.f.c(Boolean.valueOf(z));
    }

    @Override // defpackage.aifv
    public final void I() {
        if (this.aq) {
            return;
        }
        this.aq = true;
        this.a.e(true);
        ahuh ahuhVar = this.s;
        if (ahuhVar == null) {
            return;
        }
        ahuhVar.g(true);
    }

    @Override // defpackage.aifv
    public final void J() {
        if (!this.aq) {
            return;
        }
        this.aq = false;
        this.a.e(false);
        ahuh ahuhVar = this.s;
        if (ahuhVar == null) {
            return;
        }
        ahuhVar.g(false);
    }

    @Override // defpackage.aigo
    public final void K(float f) {
        ab(f);
    }

    @Override // defpackage.aigo
    public final void L(float f) {
        ab(f);
    }

    @Override // defpackage.aigo
    public final void M(float f) {
        ab(f);
    }

    protected final void N(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ControlsState g = z ? ControlsState.g() : ControlsState.h();
        this.y = g;
        this.a.c(g);
        U();
        kco kcoVar = this.ab;
        Context context = this.au;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        if (!TextUtils.isEmpty(charSequence2)) {
            spannableStringBuilder.append((CharSequence) "\n\n").append(charSequence2);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) "\n\n");
            if (zew.u(context)) {
                spannableStringBuilder.append((CharSequence) context.getString(R.string.tap_to_retry));
            } else {
                spannableStringBuilder.append((CharSequence) context.getString(R.string.click_to_retry));
            }
        }
        kcoVar.a.setText(spannableStringBuilder);
        this.u = 0L;
        this.v = 0L;
        this.w = 0L;
    }

    public final void O(boolean z) {
        jfw.j();
        if (!this.y.i()) {
            if ((!mY(this.am) && !ai()) || this.ao) {
                return;
            }
            B();
            if (this.t == 1) {
                return;
            }
            this.t = 1;
            V(z);
            if (this.y.a == ahzb.PLAYING || this.y.a == ahzb.PAUSED) {
                this.n.nV();
            }
            ahyo ahyoVar = this.g;
            if (ahyoVar != null) {
                ahyoVar.u();
            }
            E();
        }
    }

    public final void P() {
        pI();
        B();
    }

    public final void Q() {
        if (!this.y.i() && this.t != 1) {
            O(true);
            if (!this.an) {
                return;
            }
            ac(true, true);
        }
    }

    public final void R() {
        ae(true);
    }

    public final void S() {
        if (this.j.i()) {
            return;
        }
        if (this.t != 1) {
            if (this.z.o) {
                return;
            }
            Q();
        } else if (!W()) {
        } else {
            B();
            R();
        }
    }

    public final void T() {
        kix kixVar = this.n;
        boolean z = true;
        if (!this.ak && !this.al) {
            z = false;
        }
        if (kixVar.g != z) {
            kixVar.g = z;
            kixVar.nV();
        }
        if (!ah()) {
            U();
            E();
        }
    }

    public final void U() {
        V(false);
    }

    public final void V(boolean z) {
        boolean z2 = true;
        if ((this.z.o && W()) || this.t == 0 || this.y.i()) {
            this.a.b(z);
            ac(false, false);
            ViewGroup viewGroup = this.Y.l;
            if ((viewGroup == null || viewGroup.getChildCount() <= 0) && !this.U.c() && ((!this.z.v || !this.y.j()) && !this.y.i())) {
                z2 = false;
            }
            af(z2);
            this.t = 0;
            return;
        }
        this.a.a.c(Pair.create(true, Boolean.valueOf(z)));
        ac(true, false);
        af(true);
        this.t = 1;
    }

    public final boolean W() {
        if (eog.aK(this.aO)) {
            ahxu ahxuVar = this.A;
            if (ahxuVar.a && !ahxuVar.c) {
                return false;
            }
        } else if (this.ak) {
            return false;
        }
        return !this.al;
    }

    public final boolean X(boolean z) {
        if (z) {
            aa();
        }
        return !this.C;
    }

    @Override // defpackage.ahin
    public final void a(boolean z) {
        if (this.ao == z) {
            return;
        }
        this.ao = z;
        if (z) {
            Z();
        } else if (this.ap || ai()) {
            pI();
        }
        this.a.b.c(Boolean.valueOf(z));
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new aizh(-1, -1, false);
    }

    @Override // defpackage.kls
    public final void e(int i, boolean z) {
        if (X(this.j.i())) {
            return;
        }
        this.a.c.c(Boolean.valueOf(this.j.i()));
        if (this.j.i()) {
            if (this.j.a().getParent() == null) {
                this.l.addView(this.j.a());
                this.h.bringToFront();
            }
        } else if (!z && this.as != this.j.i()) {
            E();
        }
        this.as = this.j.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
        if (r0.a.equals(r4.y.a) != false) goto L27;
     */
    @Override // defpackage.ahyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState r5) {
        /*
            r4 = this;
            ffr r0 = r4.r
            r0.getClass()
            com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState r0 = r4.y
            r1 = 0
            if (r0 == 0) goto L13
            if (r5 == 0) goto L13
            ahzb r2 = r5.a
            ahzb r0 = r0.a
            if (r2 != r0) goto L13
            r1 = 1
        L13:
            if (r5 == 0) goto L25
            if (r1 == 0) goto L18
            goto L25
        L18:
            ahzb r0 = r5.a
            ahzb r1 = defpackage.ahzb.PLAYING
            if (r0 != r1) goto L25
            kbu r0 = r4.e
            ffr r1 = r4.r
            r0.a(r1)
        L25:
            com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState r0 = r4.y
            r4.y = r5
            aikh r1 = r4.aN
            boolean r1 = r1.h()
            defpackage.jfw.l()
            kbl r2 = r4.a
            r2.c(r5)
            r4.U()
            ahzb r2 = r5.a
            ahzb r3 = defpackage.ahzb.NEW
            if (r2 != r3) goto L52
            r4.ah()
            kix r2 = r4.n
            r2.ob()
            if (r1 == 0) goto L52
            r4.ng()
            kix r2 = r4.n
            r2.oa()
        L52:
            ahzb r2 = r5.a
            ahzb r3 = defpackage.ahzb.ENDED
            if (r2 != r3) goto L5d
            kix r2 = r4.n
            r2.d()
        L5d:
            ahzb r2 = r5.a
            ahzb r3 = defpackage.ahzb.ENDED
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L75
            aire r2 = r4.ax
            aiqk r3 = defpackage.aiqk.c
            boolean r2 = r2.i(r3)
            if (r2 != 0) goto L75
            boolean r2 = r4.ar
            if (r2 == 0) goto L9d
        L75:
            ahzb r2 = r5.a
            ahzb r3 = defpackage.ahzb.PAUSED
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto La0
            if (r1 != 0) goto La0
            aacz r1 = r4.aO
            apyy r1 = r1.b()
            asxj r1 = r1.e
            if (r1 != 0) goto L8d
            asxj r1 = defpackage.asxj.a
        L8d:
            boolean r1 = r1.bB
            if (r1 == 0) goto L9d
            ahzb r0 = r0.a
            com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState r1 = r4.y
            ahzb r1 = r1.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La0
        L9d:
            r4.pI()
        La0:
            ahzb r0 = r5.a
            ahzb r1 = defpackage.ahzb.PLAYING
            if (r0 == r1) goto Lad
            boolean r5 = r5.b
            if (r5 != 0) goto Lad
            r4.B()
        Lad:
            r4.E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay.f(com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState):void");
    }

    @Override // defpackage.kbd
    public final void g() {
        int i = this.t;
        if (i == 0) {
            return;
        }
        if (i == 2) {
            if (this.z.o) {
                return;
            }
            Q();
        } else if (!W()) {
        } else {
            B();
            E();
        }
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        kcb kcbVar;
        if (this.am == ezxVar) {
            return;
        }
        this.am = ezxVar;
        if (mY(ezxVar)) {
            aa();
        }
        this.B = ezxVar.b();
        this.a.d(ezxVar);
        this.W.b();
        if (ezxVar != ezx.NONE || (kcbVar = this.o.m) == null) {
            return;
        }
        kcbVar.f = false;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            ae(false);
            return true;
        } else if (message.what != 2) {
            return false;
        } else {
            Z();
            return true;
        }
    }

    @Override // defpackage.ahyp
    public final void i(ahyo ahyoVar) {
        this.g = ahyoVar;
        kfw kfwVar = this.f;
        if (kfwVar != null) {
            kfwVar.g = ahyoVar;
        }
    }

    @Override // defpackage.ahyp
    public final void j(boolean z) {
        kix kixVar = this.n;
        aibt aibtVar = kixVar.b;
        if (aibtVar.m == z) {
            return;
        }
        aibtVar.m = z;
        if (!z) {
            kixVar.ob();
        }
        kixVar.a.y(kixVar.b);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                C((ahhm) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhm.class};
    }

    @Override // defpackage.ahyp
    public final void l(ControlsOverlayStyle controlsOverlayStyle) {
        if (akzj.f(this.z, controlsOverlayStyle)) {
            return;
        }
        this.z = controlsOverlayStyle;
        this.a.g(controlsOverlayStyle);
        U();
        E();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.kbf
    public final void m(boolean z) {
        if (this.al == z) {
            return;
        }
        this.al = z;
        kdr kdrVar = this.Z;
        kdrVar.c = z;
        kdrVar.u();
        T();
    }

    @Override // defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        return etk.f(ezxVar) && !ezxVar.k();
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        aypg aypgVar;
        if (!eog.aq(this.aO)) {
            this.av.m(this);
        }
        this.aF.c();
        kfw kfwVar = this.f;
        if (kfwVar == null || (aypgVar = kfwVar.k) == null) {
            return;
        }
        ayqi.c((AtomicReference) aypgVar);
        kfwVar.k = null;
    }

    @Override // defpackage.ahyh
    public final boolean nI() {
        return this.C;
    }

    @Override // defpackage.zbo
    public final void nM(MotionEvent motionEvent, boolean z) {
        if (ag(motionEvent)) {
            this.c.a();
            this.b.a(motionEvent, this.l, z);
        }
    }

    @Override // defpackage.ahyp
    public final void nN(CharSequence charSequence) {
        this.N.c(charSequence);
    }

    @Override // defpackage.ahyp
    public final void nO(boolean z) {
        if (this.ak == z) {
            return;
        }
        this.ak = z;
        this.a.d.c(Boolean.valueOf(z));
        T();
    }

    @Override // defpackage.ahyp
    public final void nP(Map map) {
        kix kixVar = this.n;
        ezx ezxVar = kixVar.k;
        if (ezxVar == null || !ezxVar.f() || kixVar.k.d()) {
            return;
        }
        aibt aibtVar = kixVar.b;
        aibtVar.r = map;
        kixVar.a.y(aibtVar);
    }

    @Override // defpackage.zbo
    public final boolean nQ(MotionEvent motionEvent, boolean z) {
        if (this.b.d) {
            return false;
        }
        asxj asxjVar = this.aO.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        return aifr.b((int) motionEvent.getX(), this.l.getWidth(), z && asxjVar.be) != 0;
    }

    @Override // defpackage.ahyp
    public final void nf() {
        if (W()) {
            Z();
        }
    }

    @Override // defpackage.ahyp
    public final void ng() {
        ny();
        l(ControlsOverlayStyle.a);
        ad(false);
    }

    @Override // defpackage.ahyp
    public final void nh(String str, boolean z) {
        N(str, null, z);
    }

    @Override // defpackage.ahyp
    public final void ni(boolean z) {
        this.V.a.c(Boolean.valueOf(z));
        if (this.y.a != ahzb.PLAYING || this.t == 0 || !W()) {
            return;
        }
        B();
        R();
    }

    @Override // defpackage.ahyp
    public final void nj(boolean z) {
    }

    @Override // defpackage.ahyh
    public final void ns(ahyg ahygVar) {
        this.ac = ahygVar;
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.ahyp
    public final void ny() {
        this.u = 0L;
        this.v = 0L;
        this.w = 0L;
        this.x = 0L;
        this.n.oa();
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.aO)) {
            this.aF.d(this.aw.ao().I().G(aypa.a()).aa(new kic(this, 4), jww.t));
        } else {
            this.av.g(this);
        }
        if (eog.aK(this.aO)) {
            this.aF.d(this.W.a().G(aypa.a()).aa(new kic(this, 6), jww.t));
        }
        aypf aypfVar = this.aF;
        aynx aynxVar = this.ay.a;
        final kbl kblVar = this.a;
        kblVar.getClass();
        aypfVar.d(aynxVar.Z(new ayqb() { // from class: kil
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                kbl.this.g.c((zbb) obj);
            }
        }));
        this.aF.d(this.aw.ab().aa(new kic(this, 5), jww.t));
        this.aF.d(this.aw.G().c.I().G(aypa.a()).aa(new kic(this, 3), jww.t));
        this.aF.d(this.aw.G().f.I().G(aypa.a()).aa(new kic(this, 7), jww.t));
    }

    @Override // defpackage.ahyp
    public final void o(long j, long j2, long j3, long j4) {
        this.u = j3;
        this.v = j2;
        this.w = j;
        this.x = j4;
        this.n.nS(j, j2, j3, j4);
    }

    @Override // defpackage.ahyp
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = i != 0 && (!keyEvent.isSystem() || ahfe.c(i));
        if (z) {
            pI();
        }
        if (this.g == null || this.y.a != ahzb.RECOVERABLE_ERROR || !z || i == 20 || i == 21 || i == 22 || i == 19) {
            return this.C && this.l.onKeyDown(i, keyEvent);
        }
        this.g.o();
        return true;
    }

    @Override // defpackage.ahyp
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.C && this.l.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.ahyp
    public final void pI() {
        O(false);
    }

    @Override // defpackage.ahyp
    public final void pJ() {
        zag.q(this.au, R.string.no_subtitles, 0);
    }

    @Override // defpackage.kon
    public final void s() {
        B();
        R();
        ahuh ahuhVar = this.s;
        if (ahuhVar != null) {
            ahuhVar.h(true);
        }
        this.l.getParent().requestDisallowInterceptTouchEvent(true);
    }

    @Override // defpackage.kon
    public final void t(boolean z) {
        ahuh ahuhVar = this.s;
        if (ahuhVar != null) {
            ahuhVar.h(false);
        }
    }

    @Override // defpackage.kon
    public final void u(float f) {
    }

    @Override // defpackage.ahyp
    public final void x() {
        if (this.ak) {
            return;
        }
        Z();
    }

    @Override // defpackage.ahyp
    public final void y(auad auadVar, boolean z) {
        arag aragVar = auadVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned c = ajgl.c(aragVar, this.X);
        arag aragVar2 = auadVar.d;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        N(c, ajgl.c(aragVar2, this.X), z);
    }

    public final int z() {
        return this.au.getResources().getDimensionPixelSize(R.dimen.controls_overlay_bottom_ui_size);
    }

    @Override // defpackage.zbs
    public final void b(MotionEvent motionEvent) {
        DefaultWatchPanelViewController defaultWatchPanelViewController;
        nun nunVar;
        ahyo ahyoVar;
        if (!this.ao) {
            kce kceVar = this.aG;
            if (kceVar.b && kceVar.w) {
                return;
            }
            if (this.y.a != ahzb.RECOVERABLE_ERROR || (ahyoVar = this.g) == null) {
                if (!this.b.d || !ag(motionEvent)) {
                    S();
                    oeu oeuVar = this.at.a;
                    if (oeuVar == null || (nunVar = (defaultWatchPanelViewController = (DefaultWatchPanelViewController) oeuVar).h) == null) {
                        return;
                    }
                    nunVar.g(0, true);
                    ocq ocqVar = defaultWatchPanelViewController.t;
                    if (ocqVar == null) {
                        return;
                    }
                    ValueAnimator valueAnimator = ocqVar.f;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        ocqVar.f = null;
                    }
                    ocqVar.e = 0;
                    ocqVar.b.setTranslationY(0.0f);
                    return;
                }
                this.c.a();
                this.b.a(motionEvent, this.l, false);
                return;
            }
            ahyoVar.o();
        }
    }

    private final void ae(boolean z) {
        if (this.t == 0) {
            return;
        }
        this.t = 2;
        int i = z ? this.af : this.ag;
        khd khdVar = this.S;
        khd.d(khdVar.c.a, i);
        khd.d(khdVar.c.f, i);
        khd.d(khdVar.c.e, i);
        khd.d(khdVar.c.b, i);
        khd.d(khdVar.c.d, i);
        khd.d(khdVar.c.g, i);
        khd.c(khdVar.a, i);
        khd.c(khdVar.b, i);
        kfw kfwVar = this.f;
        if (kfwVar != null) {
            kfwVar.l.d = i;
        }
        kfi kfiVar = this.T;
        kfi.d(kfiVar.m, i);
        kfi.d(kfiVar.l, i);
        kfi.d(kfiVar.n, i);
        kfi.d(kfiVar.o, i);
        kfi.d(kfiVar.p, i);
        kay kayVar = this.d;
        yye yyeVar = kayVar.l;
        if (yyeVar != null) {
            kayVar.j = i;
            long j = i;
            yyeVar.d = j;
            SuggestedActionsMainController suggestedActionsMainController = kayVar.e;
            yye yyeVar2 = suggestedActionsMainController.s;
            if (yyeVar2 != null) {
                suggestedActionsMainController.o = i;
                yyeVar2.d = j;
                suggestedActionsMainController.j.d.d = i;
            }
        }
        yye yyeVar3 = this.U.h;
        if (yyeVar3 != null) {
            yyeVar3.d = i;
        }
        this.n.e.A(i);
        kcb kcbVar = this.o.m;
        if (kcbVar != null) {
            long j2 = i;
            kcbVar.j.d = j2;
            kcbVar.k.d = j2;
            kcbVar.l.d = j2;
            kcbVar.m.d = j2;
            kcbVar.n.d = j2;
        }
        Animation animation = this.ai;
        if (animation != null) {
            animation.setDuration(i);
        }
        kgm kgmVar = this.ad;
        if (kgmVar != null) {
            kgmVar.a.d = i;
        }
        long j3 = i;
        this.e.c = j3;
        this.a.b(true);
        ac(false, true);
        this.ah.removeMessages(2);
        this.ah.sendEmptyMessageDelayed(2, j3);
    }
}

package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.model.VideoDetails;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.WatchLaterButton;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class al extends ahyf implements ahyp, aizf, aibg, aich, aiaq, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.a, com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c, com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.b, com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b {
    public Animation A;
    public Animation B;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d C;
    public com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b D;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b E;
    public ar F;
    public aafo G;
    public Context H;
    public ControlsState I;

    /* renamed from: J  reason: collision with root package name */
    public ControlsOverlayStyle f156J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public Optional U;
    private final ah W;
    private final View.OnClickListener X;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a Y;
    private com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d Z;
    private SubscribeButtonData aA;
    private SubscriptionNotificationButtonData aB;
    private SubscriptionNotificationMenuData aC;
    private WatchLaterButtonData aD;
    private CharSequence aE;
    private boolean aF;
    private CharSequence aG;
    private boolean aH;
    private boolean aI;
    private boolean aJ;
    private boolean aK;
    private boolean aL;
    private boolean aM;
    private boolean aN;
    private boolean aO;
    private boolean aP;
    private final aypg aQ;
    private pcu aS;
    private final zbo aa;
    private final aifv ab;
    private View ac;
    private ViewGroup ad;
    private Drawable ae;
    private Drawable af;
    private View ag;
    private Drawable ah;
    private View ai;
    private LinearLayout aj;
    private TextView ak;
    private FrameLayout al;
    private aicd am;
    private Animation an;
    private int ao;
    private int ap;
    private Animation aq;
    private Animation ar;
    private Animation as;
    private Handler at;
    private final com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.e au;
    private ahzi av;
    private int aw;
    private String ax;
    private Bitmap ay;
    private VideoDetails az;
    public final as b;
    public final zbp c;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a d;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d e;
    public final zbs f;
    public FrameLayout g;
    TimeBar h;
    public final aibt i;
    public TouchImageView j;
    public TouchImageView k;
    TextView l;
    public WatchLaterButton m;
    public YouTubeButton n;
    public TouchImageView o;
    public TouchImageView p;
    public TouchImageView q;
    public TouchImageView r;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d s;
    public RelativeLayout t;
    public ProgressBar u;
    public TextView v;
    public aifw w;
    public boolean x;
    public TouchImageView y;
    public TouchImageView z;
    private static final pcu aR = new pcu();
    public static final amuk a = amuk.u(Integer.valueOf((int) R.id.player_share_button), Integer.valueOf((int) R.id.related_videos_screen_button), Integer.valueOf((int) R.id.api_watch_in_youtube_button), Integer.valueOf((int) R.id.player_video_title_view));

    private al(Context context, com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k kVar, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.e eVar) {
        super(context);
        this.e = com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d.g;
        this.D = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.aA = SubscribeButtonData.a;
        this.aB = SubscriptionNotificationButtonData.a;
        this.aC = SubscriptionNotificationMenuData.a;
        this.aD = WatchLaterButtonData.a;
        this.aK = true;
        this.O = true;
        this.S = 0;
        this.U = Optional.empty();
        this.H = context;
        this.au = eVar;
        this.f156J = ControlsOverlayStyle.a;
        this.I = ControlsState.b();
        this.i = new aibt();
        this.b = new as(new com.google.android.apps.youtube.embeddedplayer.service.jar.q(kVar));
        this.W = new ah(this);
        this.X = new ae(this);
        ak akVar = new ak(this);
        this.f = akVar;
        aj ajVar = new aj(this);
        this.aa = ajVar;
        zbp zbpVar = new zbp(ViewConfiguration.get(this.H));
        this.c = zbpVar;
        zbpVar.b = ajVar;
        zbpVar.d = akVar;
        this.ab = new ai(this);
        this.aQ = com.google.android.apps.youtube.embeddedplayer.service.jar.c.a.b.ae(azpj.c()).X(aypa.a()).as(new ac(this, 2));
    }

    public static al A(Context context, final com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k kVar, com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.e eVar, ayoi ayoiVar, ayos ayosVar, ayoi ayoiVar2) {
        final al alVar = new al(context, kVar, eVar);
        alVar.at = new Handler(new Handler.Callback() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.y
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                al alVar2 = al.this;
                if (message.what == 1) {
                    alVar2.P(false);
                } else if (message.what == 2) {
                    alVar2.U();
                } else if (message.what == 3) {
                    zag.o(alVar2.u, true);
                } else if (message.what == 4) {
                    zag.o(alVar2.u, false);
                } else if (message.what != 5) {
                    return false;
                } else {
                    alVar2.pI();
                    return true;
                }
                return true;
            }
        });
        Context context2 = alVar.H;
        ad adVar = new ad(alVar);
        Animation loadAnimation = AnimationUtils.loadAnimation(context2, R.anim.fade_out);
        alVar.A = loadAnimation;
        loadAnimation.setAnimationListener(adVar);
        alVar.an = AnimationUtils.loadAnimation(context2, R.anim.fade_in);
        alVar.ar = AnimationUtils.loadAnimation(context2, R.anim.bottom_translate_out);
        alVar.as = AnimationUtils.loadAnimation(context2, R.anim.top_translate_out);
        alVar.ao = context2.getResources().getInteger(R.integer.fade_duration_fast);
        alVar.ap = context2.getResources().getInteger(R.integer.fade_duration_slow);
        alVar.an.setDuration(alVar.ao);
        alVar.aq = AnimationUtils.loadAnimation(context2, R.anim.fade_in);
        alVar.B = AnimationUtils.loadAnimation(context2, R.anim.fade_out);
        long integer = context2.getResources().getInteger(R.integer.fade_overlay_fade_duration);
        alVar.aq.setDuration(integer);
        alVar.B.setDuration(integer);
        alVar.B.setAnimationListener(adVar);
        ayoiVar.B().as(new ac(alVar, 1));
        ayosVar.T(new ac(alVar), com.google.android.apps.youtube.embeddedplayer.service.jar.client.ab.m);
        ayoiVar2.as(new ac(alVar, 3));
        DialogInterface.OnShowListener onShowListener = new DialogInterface.OnShowListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.x
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k kVar2 = com.google.android.apps.youtube.embeddedplayer.service.layoutpolicy.remoteloaded.k.this;
                amuk amukVar = al.a;
                kVar2.e();
            }
        };
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.v
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                al alVar2 = al.this;
                kVar.d();
                alVar2.I();
            }
        };
        alVar.E = new com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b(alVar.H, onShowListener, onDismissListener, new com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.d(alVar.H, onShowListener, onDismissListener), new com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.f(alVar.H, onShowListener, onDismissListener), new pce(), null, null);
        ag agVar = new ag(alVar);
        alVar.E.m(agVar);
        alVar.E.q(agVar);
        return alVar;
    }

    private final ajgf ab() {
        if (this.G != null) {
            final aafs a2 = aaft.a(true);
            return new ajgf() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.ab
                @Override // defpackage.ajgf
                public final ClickableSpan a(apzg apzgVar) {
                    return a2.a(al.this.G, null, apzgVar);
                }
            };
        }
        return null;
    }

    private final void ac() {
        this.at.removeMessages(3);
        this.at.sendEmptyMessage(4);
    }

    private final void ad() {
        ar arVar = this.F;
        if (arVar != null) {
            arVar.b();
        }
    }

    private final void ae(CharSequence charSequence, boolean z) {
        String string;
        String str;
        this.aH = z;
        if (zew.u(this.H)) {
            string = this.H.getString(R.string.tap_to_retry);
        } else {
            string = this.H.getString(R.string.click_to_retry);
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append(charSequence);
        if (z) {
            String valueOf = String.valueOf(string);
            str = valueOf.length() != 0 ? "\n\n".concat(valueOf) : new String("\n\n");
        } else {
            str = "";
        }
        this.aE = append.append((CharSequence) str);
        ag();
    }

    private final void af(Drawable drawable) {
        this.n.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
    }

    private final void ag() {
        this.I = this.aH ? ControlsState.g() : ControlsState.h();
        if (nI()) {
            this.v.setText(this.aE);
            if (this.aF) {
                this.v.setMovementMethod(LinkMovementMethod.getInstance());
            }
            H(actj.EMBEDS_ERROR.II);
            pI();
            return;
        }
        Y(2);
    }

    private final void ah(asaa asaaVar, boolean z) {
        aqxo.y(this.U.isPresent());
        ((com.google.android.apps.youtube.embeddedplayer.service.ui.errorscreen.remoteloaded.c) this.U.get()).b(asaaVar, z, z ? Optional.of(new aa(this.b)) : Optional.empty());
    }

    private final void aj() {
        if (this.Q) {
            this.n.setOnClickListener(this.X);
            DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
            this.n.setPadding(zew.i(displayMetrics, 5), zew.i(displayMetrics, 18), zew.i(displayMetrics, 5), zew.i(displayMetrics, 10));
            af(this.g.getResources().getDrawable(R.drawable.share_button_icon));
            this.n.setText(this.H.getResources().getString(R.string.share));
            return;
        }
        this.au.b(this.n);
        DisplayMetrics displayMetrics2 = this.g.getResources().getDisplayMetrics();
        this.n.setPadding(zew.i(displayMetrics2, 6), zew.i(displayMetrics2, 14), zew.i(displayMetrics2, 6), zew.i(displayMetrics2, 14));
        af(this.g.getResources().getDrawable(R.drawable.player_share));
        this.n.setText((CharSequence) null);
    }

    private final void ak() {
        DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
        if (this.Q) {
            this.ai.getLayoutParams().height = zew.i(displayMetrics, 70);
            return;
        }
        this.ai.getLayoutParams().height = zew.i(displayMetrics, 56);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void B(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.b bVar) {
        this.b.e = bVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void C(VideoDetails videoDetails) {
        if (this.Q) {
            this.az = videoDetails;
            if (!nI()) {
                return;
            }
            this.s.j(videoDetails);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void D(com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.a aVar) {
        this.d = aVar;
        this.E.p = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.shared.b
    public final void E(WatchLaterButtonData watchLaterButtonData) {
        if (this.Q) {
            this.aD = watchLaterButtonData;
            if (nI()) {
                this.m.a(watchLaterButtonData);
            }
            this.E.q = watchLaterButtonData;
        }
    }

    public final aicd F() {
        if (nI() && this.am == null) {
            this.am = new aicd((TextView) this.g.findViewById(R.id.player_learn_more_button));
        }
        return this.am;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G() {
        if (!nI()) {
            return;
        }
        this.at.removeMessages(1);
        this.au.a(khv.j);
        this.h.clearAnimation();
        this.ad.clearAnimation();
        this.l.clearAnimation();
        this.ai.clearAnimation();
        this.ag.clearAnimation();
        if (this.Q) {
            this.s.c.clearAnimation();
            this.m.clearAnimation();
            this.n.clearAnimation();
        } else {
            this.ak.clearAnimation();
        }
        this.q.clearAnimation();
        this.r.clearAnimation();
        this.z.clearAnimation();
        this.y.clearAnimation();
        this.p.clearAnimation();
        this.o.clearAnimation();
    }

    public final void H(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar = this.C;
        if (dVar != null) {
            try {
                dVar.h(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void I() {
        if ((this.I.a == ahzb.PLAYING || this.I.b) && S() && !this.at.hasMessages(1)) {
            this.at.sendEmptyMessageDelayed(1, 2500L);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.a
    public final void J(int i) {
        this.aN = i == 3;
        U();
        I();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.remoteloaded.b
    public final void K(int i) {
        if (i == 0 || i == 1) {
            this.aM = false;
        } else {
            this.aM = true;
        }
    }

    public final void L(int i) {
        this.aw = i;
        if (!nI()) {
            return;
        }
        if (i == 0) {
            this.aS = null;
            this.ag.setBackground(this.ah);
            return;
        }
        this.aS = aR;
        this.ag.setBackgroundColor(i);
    }

    public final void M(String str) {
        if (!this.Q) {
            this.ax = str;
            if (!nI()) {
                return;
            }
            this.ak.setText(str);
        }
    }

    public final void N() {
        pI();
        this.au.a(new w(this, 1));
        if (!this.f156J.v) {
            Q(this.h);
        }
        Q(this.ai);
        Q(this.ag);
        Q(this.ad);
        Q(this.l);
        if (this.Q) {
            Q(this.s.c);
            if (!this.aN) {
                if (this.aM) {
                    Q(this.m);
                }
                Q(this.n);
                Q(this.o);
            }
        } else {
            Q(this.ak);
            Q(this.o);
        }
        Q(this.p);
        Q(this.q);
        Q(this.r);
        Q(this.z);
        Q(this.y);
    }

    public final void O(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.A);
        } else if (!this.f156J.o || !S()) {
        } else {
            nf();
        }
    }

    public final void Q(View view) {
        if (view.getVisibility() == 0) {
            view.startAnimation(this.an);
        }
    }

    public final void R(boolean z) {
        kz.u(this.l, z ? this.ae : this.af, null, null);
    }

    public final boolean S() {
        return !this.K && !this.aL;
    }

    public final boolean T(MotionEvent motionEvent) {
        if (this.O && !ControlsOverlayStyle.a(this.f156J) && !this.I.i() && this.I.a != ahzb.ENDED) {
            if (aifr.b((int) motionEvent.getX(), this.g.getWidth(), false) != 2) {
                return true;
            }
            aibt aibtVar = this.i;
            return aibtVar.c > aibtVar.d;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean U() {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.al.U():boolean");
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        Resources resources = context.getResources();
        af afVar = new af(this, context);
        this.g = afVar;
        afVar.setClipToPadding(false);
        LayoutInflater from = LayoutInflater.from(context);
        if (this.T) {
            try {
                from.inflate(R.layout.embed_controls_overlay, this.g);
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                sb.append("Unable to inflate LazyEmbedsControlsOverlay: ");
                sb.append(valueOf);
                aqvb.k(sb.toString(), new Object[0]);
                return this.g;
            }
        } else {
            from.inflate(R.layout.embed_controls_overlay, this.g);
        }
        if (!this.aQ.e()) {
            ayqi.c((AtomicReference) this.aQ);
        }
        this.aO = true;
        this.t = (RelativeLayout) this.g.findViewById(R.id.controls_layout);
        TimeBar timeBar = (TimeBar) this.g.findViewById(R.id.time_bar);
        this.h = timeBar;
        timeBar.kP(this.W);
        this.h.y(this.i);
        this.h.setEnabled(this.aI);
        ViewGroup viewGroup = (ViewGroup) this.g.findViewById(R.id.bottom_end_container);
        this.ad = viewGroup;
        this.ac = viewGroup.findViewById(R.id.api_watch_in_youtube_button);
        TouchImageView touchImageView = (TouchImageView) this.ad.findViewById(R.id.fullscreen_button);
        this.j = touchImageView;
        touchImageView.setOnClickListener(this.X);
        TouchImageView touchImageView2 = (TouchImageView) this.ad.findViewById(R.id.hide_controls_button);
        this.k = touchImageView2;
        touchImageView2.setOnClickListener(this.X);
        TextView textView = (TextView) this.g.findViewById(R.id.live_label);
        this.l = textView;
        textView.setTypeface(ajgo.ROBOTO_LIGHT.c(context));
        this.l.setOnClickListener(this.X);
        this.ae = akf.a(context, R.drawable.player_live_dot);
        this.af = akf.a(context, R.drawable.player_notlive_dot);
        R(true);
        View findViewById = this.g.findViewById(R.id.bottom_bar_background);
        this.ag = findViewById;
        this.ah = findViewById.getBackground();
        this.ai = this.g.findViewById(R.id.top_bar_background);
        this.aj = (LinearLayout) this.g.findViewById(R.id.time_bar_container);
        this.u = (ProgressBar) this.g.findViewById(R.id.player_loading_view);
        this.u.setIndeterminateDrawable(new tpj(-1.0f, resources.getDimensionPixelSize(R.dimen.player_loading_view_thickness), resources.getDimensionPixelSize(R.dimen.player_loading_view_inset), new int[]{resources.getColor(R.color.player_loading_view_color)}));
        TextView textView2 = (TextView) this.g.findViewById(R.id.player_error_view);
        this.v = textView2;
        lj.au(textView2);
        this.g.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.z
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                al alVar = al.this;
                int i9 = i3 - i;
                int i10 = (int) (i9 * 0.16666667f);
                alVar.v.setPadding(i10, 10, i10, 10);
                int n = zew.n(alVar.g.getResources().getDisplayMetrics(), i9);
                boolean z = false;
                alVar.O = alVar.g != null && (n <= 0 || n >= 300);
                if (alVar.Q) {
                    if (n > 450) {
                        z = true;
                    }
                    alVar.R = z;
                    com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu.b bVar = alVar.E;
                    boolean z2 = !z;
                    bVar.r = z2;
                    bVar.o = z2;
                }
            }
        });
        TouchImageView touchImageView3 = (TouchImageView) this.g.findViewById(R.id.player_control_play_pause_replay_button);
        this.p = touchImageView3;
        touchImageView3.setOnClickListener(this.X);
        this.av = new ahzi(this.p, context);
        TouchImageView touchImageView4 = (TouchImageView) this.g.findViewById(R.id.player_control_previous_button);
        this.r = touchImageView4;
        touchImageView4.setOnClickListener(this.X);
        TouchImageView touchImageView5 = (TouchImageView) this.g.findViewById(R.id.player_control_next_button);
        this.q = touchImageView5;
        touchImageView5.setOnClickListener(this.X);
        TouchImageView touchImageView6 = (TouchImageView) this.g.findViewById(R.id.player_control_seekback_button);
        this.y = touchImageView6;
        touchImageView6.setOnClickListener(this.X);
        TouchImageView touchImageView7 = (TouchImageView) this.g.findViewById(R.id.player_control_seekforward_button);
        this.z = touchImageView7;
        touchImageView7.setOnClickListener(this.X);
        this.ak = (TextView) this.g.findViewById(R.id.player_video_title_view);
        FrameLayout frameLayout = (FrameLayout) this.g.findViewById(R.id.player_video_details_holder);
        this.al = frameLayout;
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d a2 = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.remoteloaded.d.a(context, frameLayout);
        this.s = a2;
        a2.i = this.D;
        a2.g = this.b;
        a2.f = this;
        a2.h = this.Y;
        a2.v(this.Z);
        WatchLaterButton watchLaterButton = (WatchLaterButton) this.g.findViewById(R.id.player_watch_later_button);
        this.m = watchLaterButton;
        watchLaterButton.setOnClickListener(this.X);
        this.m.b = this;
        this.n = (YouTubeButton) this.g.findViewById(R.id.player_share_button);
        TouchImageView touchImageView8 = (TouchImageView) this.g.findViewById(R.id.player_overflow_button);
        this.o = touchImageView8;
        touchImageView8.setOnClickListener(this.X);
        ak();
        aj();
        ai();
        if (this.Q) {
            this.s.j(this.az);
            this.s.e(this.ay);
            this.s.u(this.aA);
            this.s.w(this.aB);
            this.s.pF(this.aC);
            this.m.a(this.aD);
        } else {
            this.ak.setText(this.ax);
        }
        ((TextView) this.g.findViewById(R.id.related_videos_screen_button)).setMaxWidth((int) (((resources.getDisplayMetrics().density * 200.0f) + 0.5f) - (resources.getDimension(R.dimen.related_videos_button_left_padding) + resources.getDimension(R.dimen.related_videos_button_right_padding))));
        final ar arVar = new ar(this.H, this.at, this.b);
        arVar.b = new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.an
            @Override // java.lang.Runnable
            public final void run() {
                ar.this.b();
            }
        };
        this.F = arVar;
        aifw aifwVar = new aifw(this.g, null, this.ab, this.F.d);
        this.w = aifwVar;
        aifwVar.c(this.x);
        ar arVar2 = this.F;
        aifw aifwVar2 = this.w;
        arVar2.f = aifwVar2;
        aifwVar2.d(new ao(arVar2));
        amuk amukVar = a;
        int i = ((amxx) amukVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            View findViewById2 = this.g.findViewById(((Integer) amukVar.get(i2)).intValue());
            if (findViewById2 != null) {
                this.au.b(findViewById2);
            }
        }
        L(this.aw);
        nN(this.aG);
        l(this.f156J);
        nf();
        ac();
        return this.g;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void b(com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.g gVar) {
        this.b.f = gVar;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        if (aa(1)) {
            f(this.I);
        }
        if (aa(2)) {
            ag();
        }
        if (aa(4)) {
            nO(this.aL);
        }
        if (aa(8)) {
            pI();
        }
        if (aa(16)) {
            ni(this.aP);
        }
    }

    @Override // defpackage.aibg
    public final void e(boolean z) {
    }

    @Override // defpackage.ahyp
    public final void f(ControlsState controlsState) {
        if (!this.I.equals(controlsState)) {
            this.I = controlsState;
        }
        if (!this.aO) {
            return;
        }
        if (nI()) {
            U();
            if (controlsState.a == ahzb.ENDED) {
                pI();
                if (this.h.kI() != 0) {
                    aibt aibtVar = this.i;
                    aibtVar.b = 0L;
                    this.h.y(aibtVar);
                }
            } else if (controlsState.a == ahzb.PAUSED && !this.aK) {
                if (this.at.hasMessages(5)) {
                    this.at.removeMessages(5);
                }
                this.at.sendEmptyMessageDelayed(5, 500L);
            }
            I();
        } else {
            Y(1);
        }
        if (!controlsState.i()) {
            return;
        }
        ad();
    }

    @Override // defpackage.aibg
    public final void g(boolean z) {
        this.E.n = z;
    }

    @Override // defpackage.ahyp
    public final void i(ahyo ahyoVar) {
        as asVar = this.b;
        asVar.a = ahyoVar;
        this.E.e = asVar;
    }

    @Override // defpackage.ahyp
    public final void j(boolean z) {
        this.aI = z;
        if (nI()) {
            this.h.setEnabled(z);
        }
    }

    @Override // defpackage.aibg
    public final void k(SubtitleTrack subtitleTrack) {
        this.E.k(subtitleTrack);
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
        this.f156J = controlsOverlayStyle;
        if (this.aS == null || akzj.f(controlsOverlayStyle.n, ControlsOverlayStyle.i.n)) {
            aibt aibtVar = this.i;
            int i = controlsOverlayStyle.q;
            aibtVar.h = i;
            aibtVar.f = -855638017;
            aibtVar.e = 872415231;
            aibtVar.j = i;
            aibtVar.k = controlsOverlayStyle.r;
        } else {
            aibt aibtVar2 = this.i;
            aibtVar2.h = -1;
            aibtVar2.f = -1996488705;
            aibtVar2.e = -2013265920;
            aibtVar2.j = -1;
        }
        aibt aibtVar3 = this.i;
        aibtVar3.l = controlsOverlayStyle.w;
        aibtVar3.m = controlsOverlayStyle.s;
        aibtVar3.n = controlsOverlayStyle.x;
        aibtVar3.m(controlsOverlayStyle.z);
        if (nI()) {
            this.h.y(this.i);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i2 = -2;
            if (akzj.f(controlsOverlayStyle.n, ControlsOverlayStyle.i.n)) {
                arrayDeque.add(zgd.c(11));
                arrayDeque.add(zgd.h(-2));
            } else {
                arrayDeque.add(zgd.n(11));
                arrayDeque.add(zgd.d(0, this.ad.getId()));
                if (this.ad.getHeight() > 0) {
                    i2 = Math.max(this.aj.getLayoutParams().height, this.ad.getHeight());
                }
                arrayDeque.add(zgd.h(i2));
            }
            zgd.t(this.aj, zgd.y(arrayDeque), RelativeLayout.LayoutParams.class);
            U();
            I();
        }
    }

    @Override // defpackage.aibg
    public final void m(aibf aibfVar) {
        this.b.b = aibfVar;
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        return this.aL || this.S == 1;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void n(Bitmap bitmap) {
        if (this.Q) {
            this.ay = bitmap;
            if (!nI()) {
                return;
            }
            this.s.e(bitmap);
        }
    }

    @Override // defpackage.ahyf, defpackage.ahyh
    public final boolean nI() {
        return this.aO && super.nI();
    }

    @Override // defpackage.aiaq
    public final void nK(boolean z) {
        this.M = z;
        if (nI()) {
            U();
        }
    }

    @Override // defpackage.ahyp
    public final void nN(CharSequence charSequence) {
        this.aG = charSequence;
        if (nI()) {
            this.l.setText(charSequence);
        }
    }

    @Override // defpackage.ahyp
    public final void nO(boolean z) {
        if (this.aL != z) {
            this.aL = z;
            if (nI()) {
                zag.o(this.k, this.aL);
                if (this.aL) {
                    N();
                    return;
                } else {
                    U();
                    return;
                }
            }
            Y(4);
        }
    }

    @Override // defpackage.ahyp
    public final void nP(Map map) {
        this.i.r = map;
        if (nI()) {
            this.h.y(this.i);
        }
    }

    @Override // defpackage.ahyp
    public final void nf() {
        if (!nI()) {
            return;
        }
        G();
        this.at.removeMessages(5);
        this.K = true;
        U();
        this.b.d();
    }

    @Override // defpackage.ahyp
    public final void ng() {
        if (nI()) {
            if (this.Q) {
                this.s.d();
            } else {
                this.ak.setText("");
            }
        }
        this.U.ifPresent(khv.k);
        l(ControlsOverlayStyle.a);
        ad();
        nf();
        this.aK = true;
    }

    @Override // defpackage.ahyp
    public final void nh(String str, boolean z) {
        if (this.U.isPresent()) {
            aopa createBuilder = auad.a.createBuilder();
            aopc aopcVar = (aopc) arag.a.createBuilder();
            aopcVar.copyOnWrite();
            arag aragVar = (arag) aopcVar.instance;
            str.getClass();
            aragVar.b |= 1;
            aragVar.d = str;
            createBuilder.copyOnWrite();
            auad auadVar = (auad) createBuilder.instance;
            arag aragVar2 = (arag) aopcVar.mo39build();
            aragVar2.getClass();
            auadVar.c = aragVar2;
            auadVar.b |= 1;
            ah(com.google.android.apps.youtube.embeddedplayer.service.util.a.e((auad) createBuilder.mo39build()), z);
            return;
        }
        ae(str, z);
    }

    @Override // defpackage.ahyp
    public final void ni(boolean z) {
        if (!nI()) {
            this.aP = z;
            Y(16);
            return;
        }
        this.j.setSelected(z);
        this.j.setContentDescription(this.H.getText(true != z ? R.string.accessibility_enter_fullscreen : R.string.accessibility_exit_fullscreen));
        if (this.I.a != ahzb.PLAYING) {
            return;
        }
        G();
        P(true);
    }

    @Override // defpackage.ahyp
    public final void nj(boolean z) {
        this.aJ = z;
        if (nI()) {
            U();
        }
    }

    @Override // defpackage.ahyp
    public final void ny() {
        this.i.l();
        if (nI()) {
            this.h.y(this.i);
        }
    }

    @Override // defpackage.ahyp
    public final void o(long j, long j2, long j3, long j4) {
        this.i.n(j, j2, j3, j4);
        if (nI()) {
            this.h.y(this.i);
        }
    }

    @Override // defpackage.ahyp
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!nI()) {
            return true;
        }
        return this.g.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.ahyp
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!nI()) {
            return true;
        }
        return this.g.onKeyUp(i, keyEvent);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.videodetailsoverlay.shared.b
    public final void p(boolean z) {
        this.Q = z;
        if (!nI()) {
            return;
        }
        ak();
        aj();
        ai();
    }

    @Override // defpackage.aiaq
    public final void pB(boolean z) {
        this.L = z;
        if (nI()) {
            U();
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h
    public final void pC(boolean z) {
        this.aK = z;
    }

    @Override // defpackage.aiaq
    public final void pD(aiap aiapVar) {
        this.b.d = aiapVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.b
    public final void pE(com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d dVar) {
        this.e = dVar;
        this.E.s = dVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void pF(SubscriptionNotificationMenuData subscriptionNotificationMenuData) {
        if (this.Q) {
            this.aC = subscriptionNotificationMenuData;
            if (!nI()) {
                return;
            }
            this.s.pF(subscriptionNotificationMenuData);
        }
    }

    @Override // defpackage.aich
    public final void pG(boolean z) {
        this.E.m = z;
    }

    @Override // defpackage.aich
    public final void pH(VideoQuality[] videoQualityArr, int i, boolean z) {
        this.E.pH(videoQualityArr, i, z);
    }

    @Override // defpackage.ahyp
    public final void pI() {
        if (nI()) {
            G();
            this.at.removeMessages(5);
            this.K = false;
            if (U()) {
                this.b.u();
            }
            I();
            if (this.Q) {
                return;
            }
            H(actj.PLAYER_OVERFLOW_BUTTON.II);
            return;
        }
        Y(8);
    }

    @Override // defpackage.ahyp
    public final void pJ() {
        zag.q(this.H, R.string.no_subtitles, 0);
    }

    @Override // defpackage.aich
    public final void q(aicg aicgVar) {
        this.b.c = aicgVar;
    }

    @Override // defpackage.aibg
    public final void r(List list) {
        this.E.r(list);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void t(com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.a aVar) {
        this.Y = aVar;
        if (nI()) {
            this.s.h = aVar;
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.shared.c
    public final void u(SubscribeButtonData subscribeButtonData) {
        if (this.Q) {
            this.aA = subscribeButtonData;
            if (!nI()) {
                return;
            }
            this.s.u(subscribeButtonData);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void v(com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.d dVar) {
        this.Z = dVar;
        if (nI()) {
            this.s.v(dVar);
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.shared.b
    public final void w(SubscriptionNotificationButtonData subscriptionNotificationButtonData) {
        if (this.Q) {
            this.aB = subscriptionNotificationButtonData;
            if (!nI()) {
                return;
            }
            this.s.w(subscriptionNotificationButtonData);
        }
    }

    @Override // defpackage.ahyp
    public final /* synthetic */ void x() {
        ahfo.a(this);
    }

    @Override // defpackage.ahyp
    public final void y(auad auadVar, boolean z) {
        if (!this.U.isPresent()) {
            arag aragVar = auadVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            CharSequence c = ajgl.c(aragVar, ab());
            apok apokVar = auadVar.e;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) == 0) {
                ae(c, z);
                return;
            }
            apok apokVar2 = auadVar.e;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            this.I = ControlsState.h();
            boolean z2 = false;
            this.aH = false;
            if ((apojVar.b & 32768) != 0) {
                arag aragVar2 = apojVar.i;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                if ((aragVar2.b & 1) != 0) {
                    aoob aoobVar = apojVar.t;
                    com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d dVar = this.C;
                    if (dVar != null) {
                        try {
                            dVar.i(aoobVar.I());
                        } catch (RemoteException unused) {
                        }
                    }
                    arag aragVar3 = apojVar.i;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                    if (1 == (aragVar3.b & 1)) {
                        z2 = true;
                    }
                    aqxo.p(z2);
                    arag aragVar4 = apojVar.i;
                    if (aragVar4 == null) {
                        aragVar4 = arag.a;
                    }
                    String str = aragVar4.d;
                    apzg apzgVar = apojVar.p;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aopc aopcVar = (aopc) arai.a.createBuilder();
                    aopcVar.copyOnWrite();
                    arai araiVar = (arai) aopcVar.instance;
                    str.getClass();
                    araiVar.b |= 1;
                    araiVar.c = str;
                    aopcVar.copyOnWrite();
                    arai araiVar2 = (arai) aopcVar.instance;
                    apzgVar.getClass();
                    araiVar2.m = apzgVar;
                    araiVar2.b |= 512;
                    aopc aopcVar2 = (aopc) arag.a.createBuilder();
                    aopcVar2.ch((arai) aopcVar.mo39build());
                    c = new SpannableStringBuilder().append(c).append((CharSequence) "\n\n").append((CharSequence) ajgl.c((arag) aopcVar2.mo39build(), ab()));
                    this.aE = c;
                    this.aF = true;
                    ag();
                    return;
                }
            }
            aqvb.l("Error UI not filled with link to YouTube app", new Object[0]);
            this.aE = c;
            this.aF = true;
            ag();
            return;
        }
        ah(com.google.android.apps.youtube.embeddedplayer.service.util.a.e(auadVar), z);
    }

    public final int z() {
        if (nI()) {
            return this.h.a;
        }
        return 0;
    }

    private final void ai() {
        if (!this.Q) {
            DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
            this.o.setPadding(zew.i(displayMetrics, 6), zew.i(displayMetrics, 14), zew.i(displayMetrics, 8), zew.i(displayMetrics, 14));
            return;
        }
        DisplayMetrics displayMetrics2 = this.g.getResources().getDisplayMetrics();
        this.o.setPadding(zew.i(displayMetrics2, 6), zew.i(displayMetrics2, 20), zew.i(displayMetrics2, 8), zew.i(displayMetrics2, 14));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void P(boolean z) {
        this.A.setDuration(z ? this.ao : this.ap);
        this.as.setDuration(z ? this.ao : this.ap);
        this.ar.setDuration(z ? this.ao : this.ap);
        this.au.a(new w(this));
        if (!this.f156J.v) {
            O(this.h);
        }
        O(this.o);
        O(this.ai);
        O(this.ag);
        O(this.ad);
        O(this.l);
        if (this.Q) {
            O(this.s.c);
            O(this.m);
            O(this.n);
        } else {
            O(this.ak);
        }
        O(this.p);
        O(this.q);
        O(this.r);
        O(this.z);
        O(this.y);
    }
}

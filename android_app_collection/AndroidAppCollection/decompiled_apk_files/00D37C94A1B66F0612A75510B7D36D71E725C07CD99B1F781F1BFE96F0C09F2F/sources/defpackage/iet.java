package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelPlayerOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: iet  reason: default package */
/* loaded from: classes3.dex */
public final class iet extends aizc implements idn, idi {
    private final View A;
    private final ImageView B;
    private final LinearLayout C;
    private final Animation D;
    private final ImageView E;
    private final ImageView F;
    private final String G;
    private final String H;
    private final acth I;

    /* renamed from: J  reason: collision with root package name */
    private final View f213J;
    private final View K;
    private final View L;
    private final View M;
    private final View N;
    private final boolean O;
    private View P;
    public final idj a;
    public final ido b;
    public final icy c;
    public final ien d;
    public final ReelPlayerProgressPresenter e;
    public final idw f;
    public final View g;
    public final View h;
    public final airr i;
    public final ifj j;
    public final idq k;
    public final View l;
    public final View m;
    public final idy n;
    public final ier o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    private final iew y;
    private final View z;

    public iet(Context context, ajmy ajmyVar, airr airrVar, acth acthVar, ifj ifjVar, icy icyVar, ido idoVar, final idw idwVar, idk idkVar, ier ierVar) {
        super(context);
        this.x = true;
        this.i = airrVar;
        this.I = acthVar;
        this.b = idoVar;
        this.f = idwVar;
        this.c = icyVar;
        ien ienVar = new ien();
        this.d = ienVar;
        this.j = ifjVar;
        this.o = ierVar;
        boolean e = zdg.e(context);
        this.O = e;
        idoVar.u = this;
        idoVar.f = ienVar;
        idoVar.e = this;
        LayoutInflater.from(context).inflate(R.layout.reel_player_overlay2, this);
        View findViewById = findViewById(R.id.reel_loading_spinner);
        findViewById.getClass();
        ienVar.a = findViewById;
        ienVar.c = findViewById(R.id.reel_error_scrim);
        ienVar.b = findViewById(R.id.reel_error_group);
        ienVar.d = findViewById(R.id.reel_error_icon);
        ienVar.e = (TextView) findViewById(R.id.reel_error_message);
        ImageView imageView = (ImageView) findViewById(R.id.reel_frame0_image_view);
        imageView.getClass();
        idwVar.d = imageView;
        idwVar.f = new idu(new ColorDrawable(imageView.getContext().getResources().getColor(R.color.yt_black4)));
        idwVar.g = new ajnj(idwVar.a, idwVar.c, new ajmv() { // from class: idr
            @Override // defpackage.ajmv
            public final yyn a() {
                return idw.this.f;
            }
        }, imageView, true);
        ImageView imageView2 = (ImageView) findViewById(R.id.reel_player_pause_frame_image_view);
        imageView2.getClass();
        idwVar.e = imageView2;
        View findViewById2 = findViewById(R.id.reel_player_overlay_layout);
        this.A = findViewById2;
        ReelPlayerProgressPresenter reelPlayerProgressPresenter = (ReelPlayerProgressPresenter) findViewById(R.id.reel_progress_bar);
        this.e = reelPlayerProgressPresenter;
        reelPlayerProgressPresenter.setAlpha(0.0f);
        this.y = new iew(findViewById2, ajmyVar);
        iez iezVar = (iez) idkVar.a.get();
        iezVar.getClass();
        icx icxVar = (icx) idkVar.b.get();
        icxVar.getClass();
        iel ielVar = (iel) idkVar.c.get();
        ielVar.getClass();
        ajmy ajmyVar2 = (ajmy) idkVar.d.get();
        ajmyVar2.getClass();
        aafo aafoVar = (aafo) idkVar.e.get();
        aafoVar.getClass();
        fzx fzxVar = (fzx) idkVar.f.get();
        acth acthVar2 = (acth) idkVar.g.get();
        acthVar2.getClass();
        fmh fmhVar = (fmh) idkVar.h.get();
        fmhVar.getClass();
        ifc ifcVar = (ifc) idkVar.i.get();
        iex iexVar = (iex) idkVar.j.get();
        iexVar.getClass();
        ajxz ajxzVar = (ajxz) idkVar.k.get();
        ajxzVar.getClass();
        ftb ftbVar = (ftb) idkVar.l.get();
        ftbVar.getClass();
        ajhl ajhlVar = (ajhl) idkVar.m.get();
        ajhlVar.getClass();
        ((ajin) idkVar.n.get()).getClass();
        idj idjVar = new idj(iezVar, icxVar, ielVar, ajmyVar2, aafoVar, fzxVar, acthVar2, fmhVar, ifcVar, iexVar, ajxzVar, ftbVar, ajhlVar, this, this);
        this.a = idjVar;
        idjVar.u = ierVar;
        this.n = idjVar;
        this.k = new idq((ViewGroup) findViewById(R.id.reel_player_overlay_tap_feedback));
        this.D = AnimationUtils.loadAnimation(getContext(), R.anim.reel_seek_feedback_anim);
        this.z = findViewById(R.id.reel_video_link);
        this.E = (ImageView) findViewById(R.id.reel_seek_feedback_prev);
        this.F = (ImageView) findViewById(R.id.reel_seek_feedback_next);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.reel_control_group);
        this.C = linearLayout;
        this.G = context.getString(R.string.reel_accessibility_play_video);
        this.H = context.getString(R.string.reel_accessibility_pause_video);
        this.P = findViewById(R.id.reel_player_overlay_v2_scrims);
        zag.o(linearLayout, e);
        View findViewById3 = findViewById(R.id.reel_back_button);
        this.l = findViewById3;
        View findViewById4 = findViewById(R.id.reel_close_button);
        this.m = findViewById4;
        findViewById3.setOnClickListener(new iep(this, 1));
        findViewById4.setOnClickListener(new iep(this));
        findViewById(R.id.reel_video_link).setOnClickListener(new iep(this, 2));
        View findViewById5 = findViewById(R.id.reel_prev_video_button);
        this.f213J = findViewById5;
        View findViewById6 = findViewById(R.id.reel_next_video_button);
        this.K = findViewById6;
        findViewById5.setOnClickListener(new iep(this, 3));
        findViewById6.setOnClickListener(new iep(this, 4));
        View findViewById7 = findViewById(R.id.reel_prev_reel_button);
        this.L = findViewById7;
        findViewById7.setOnClickListener(new iep(this, 5));
        View findViewById8 = findViewById(R.id.reel_next_reel_button);
        this.M = findViewById8;
        findViewById8.setOnClickListener(new iep(this, 6));
        ImageView imageView3 = (ImageView) findViewById(R.id.reel_play_pause_button);
        this.B = imageView3;
        imageView3.setOnClickListener(new iep(this, 7));
        this.N = findViewById(R.id.reel_player_header_container);
        this.g = findViewById(R.id.reel_player_no_nav_top);
        this.h = findViewById(R.id.reel_player_no_nav_bottom);
        hqs.b(findViewById2, new Runnable() { // from class: ieo
            @Override // java.lang.Runnable
            public final void run() {
                iet ietVar = iet.this;
                hqs.c(ietVar.l, ietVar.x);
            }
        });
    }

    public static void i(final View view, final float f, long j, long j2) {
        view.animate().alpha(f).setStartDelay(j2).setDuration(j).withStartAction(new gys(view, 4)).withEndAction(new Runnable() { // from class: ieq
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(f == 0.0f ? 4 : 0);
            }
        });
    }

    @Override // defpackage.idi
    public final void a() {
        int i;
        ico icoVar = (ico) this.o;
        aulr aJ = icoVar.aJ();
        if (aJ == null || (i = aJ.b & 524288) == 0) {
            return;
        }
        boolean z = i != 0;
        aunb aunbVar = aJ.u;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apoj b = hqp.b(z, aunbVar);
        aafo aafoVar = icoVar.aC;
        apzg apzgVar = b.o;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.a(apzgVar);
    }

    @Override // defpackage.idn
    public final void b() {
        ier ierVar = this.o;
        if (ierVar != null) {
            ierVar.aP();
        }
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.idn
    public final void d() {
        if (this.c.bi() == 2) {
            this.D.setAnimationListener(new ahul(this.F, 1));
            this.F.clearAnimation();
            this.F.startAnimation(this.D);
        }
    }

    @Override // defpackage.idn
    public final void e() {
        if (this.c.bj() == 1) {
            return;
        }
        this.D.setAnimationListener(new ahul(this.E, 1));
        this.E.clearAnimation();
        this.E.startAnimation(this.D);
    }

    public final int f() {
        return this.h.getHeight();
    }

    public final int g() {
        return this.g.getHeight();
    }

    public final void h(boolean z) {
        long j = true != z ? 0L : 800L;
        if (!z) {
            long j2 = j;
            i(this.A, 1.0f, 250L, j2);
            i(this.P, 1.0f, 250L, j2);
            i(this.e, true != this.u ? 1.0f : 0.0f, 200L, j);
        } else if (((ico) this.o).af.q()) {
        } else {
            long j3 = j;
            i(this.A, 0.0f, 250L, j3);
            i(this.P, 0.0f, 250L, j3);
            i(this.e, true != this.u ? 0.0f : 1.0f, 200L, j);
        }
    }

    public final void j() {
        this.c.bk();
    }

    public final void k() {
        this.E.clearAnimation();
        this.F.clearAnimation();
        this.E.setVisibility(4);
        this.F.setVisibility(4);
        this.f.h();
        this.f.b();
        this.d.c();
        this.j.g();
    }

    public final void l(String str, artv artvVar, long j, boolean z, boolean z2, ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        m(str, artvVar, j, false, z, z2, reelWatchEndpointOuterClass$ReelWatchEndpoint);
    }

    public final void m(String str, artv artvVar, long j, boolean z, boolean z2, boolean z3, ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        aulr aulrVar = null;
        if (artvVar != null) {
            auls aulsVar = artvVar.d;
            if (aulsVar == null) {
                aulsVar = auls.a;
            }
            if ((aulsVar.b & 1) != 0) {
                auls aulsVar2 = artvVar.d;
                if (aulsVar2 == null) {
                    aulsVar2 = auls.a;
                }
                aulrVar = aulsVar2.c;
                if (aulrVar == null) {
                    aulrVar = aulr.a;
                }
            }
        }
        n(str, aulrVar, j, z, z2, hqp.h(artvVar), z3, reelWatchEndpointOuterClass$ReelWatchEndpoint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x042d  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r19, defpackage.aulr r20, long r21, boolean r23, boolean r24, boolean r25, boolean r26, com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint r27) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iet.n(java.lang.String, aulr, long, boolean, boolean, boolean, boolean, com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint):void");
    }

    public final void o(aulr aulrVar, final boolean z) {
        if (aulrVar == null) {
            return;
        }
        this.w = true;
        final idj idjVar = this.a;
        aulo auloVar = null;
        if ((aulrVar.b & 134217728) != 0) {
            aunb aunbVar = aulrVar.C;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(ReelPlayerOverlayRendererOuterClass.reelPlayerAgeGateRenderer)) {
                aunb aunbVar2 = aulrVar.C;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                auloVar = (aulo) aunbVar2.qm(ReelPlayerOverlayRendererOuterClass.reelPlayerAgeGateRenderer);
            }
        }
        if (auloVar == null) {
            return;
        }
        View findViewById = idjVar.d.findViewById(R.id.reel_age_gate_group);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.reel_age_gate_icon);
        TextView textView = (TextView) findViewById.findViewById(R.id.reel_age_gate_description);
        YouTubeButton youTubeButton = (YouTubeButton) findViewById.findViewById(R.id.reel_age_gate_watch_button);
        YouTubeButton youTubeButton2 = (YouTubeButton) findViewById.findViewById(R.id.reel_age_gate_skip_button);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            youTubeButton.setLayoutDirection(0);
        } else {
            youTubeButton.setLayoutDirection(1);
        }
        if ((auloVar.b & 1) != 0) {
            ajxz ajxzVar = idjVar.j;
            arhs arhsVar = auloVar.c;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView.setImageResource(ajxzVar.a(b));
        }
        if ((auloVar.b & 2) != 0) {
            arag aragVar = auloVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
        }
        boolean z2 = (auloVar.b & 8) != 0;
        aunb aunbVar3 = auloVar.f;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        final apoj b2 = hqp.b(z2, aunbVar3);
        if (b2 != null) {
            arag aragVar2 = b2.i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            Spanned b3 = ajgl.b(aragVar2);
            youTubeButton2.setText(b3);
            youTubeButton2.setContentDescription(b3);
            if (z && (b2.b & 1048576) != 0) {
                idjVar.c(b2.t);
            }
            youTubeButton2.setOnClickListener(new View.OnClickListener() { // from class: ida
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    idj idjVar2 = idj.this;
                    iet ietVar = this;
                    boolean z3 = z;
                    apoj apojVar = b2;
                    if (z3 && (apojVar.b & 1048576) != 0) {
                        idjVar2.i.oi().H(3, new acte(apojVar.t), null);
                    }
                    ietVar.j();
                }
            });
        }
        boolean z3 = (auloVar.b & 4) != 0;
        aunb aunbVar4 = auloVar.e;
        if (aunbVar4 == null) {
            aunbVar4 = aunb.a;
        }
        apoj b4 = hqp.b(z3, aunbVar4);
        if (b4 != null) {
            arag aragVar3 = b4.i;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            Spanned b5 = ajgl.b(aragVar3);
            youTubeButton.setText(b5);
            youTubeButton.setContentDescription(b5);
            if (z && (1048576 & b4.b) != 0) {
                idjVar.c(b4.t);
            }
            if ((b4.b & 32768) != 0) {
                youTubeButton.setOnClickListener(new idb(idjVar, b4));
            }
        }
        if ((auloVar.b & 16) != 0 && z) {
            idjVar.c(auloVar.g);
        }
        zag.o(findViewById, true);
        zag.o(idjVar.d.findViewById(R.id.reel_loading_spinner), false);
        zag.o(idjVar.f, false);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ier ierVar = this.o;
        if (z) {
            ico icoVar = (ico) ierVar;
            icoVar.ao.c(icoVar.bm);
            icoVar.bm = 0;
            return;
        }
        ico icoVar2 = (ico) ierVar;
        if (icoVar2.bm != 0) {
            return;
        }
        icoVar2.bm = icoVar2.ao.b();
    }

    public final void p() {
        this.B.setImageResource(true != this.i.d() ? 2131232670 : 2131232641);
        this.B.setContentDescription(this.i.d() ? this.H : this.G);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
        if (r1.equals(defpackage.aspb.LIKE) == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(final android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iet.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

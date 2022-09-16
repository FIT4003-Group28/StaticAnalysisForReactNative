package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bfl  reason: default package */
/* loaded from: classes2.dex */
public class bfl extends nx {
    public static final /* synthetic */ int X = 0;
    static final int b = (int) TimeUnit.SECONDS.toMillis(30);
    public final int A;
    Map B;
    ip C;
    final bfg D;
    PlaybackStateCompat E;
    MediaDescriptionCompat F;
    bff G;
    Bitmap H;
    Uri I;

    /* renamed from: J  reason: collision with root package name */
    boolean f141J;
    Bitmap K;
    int L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    boolean Q;
    int R;
    public int S;
    public int T;
    public Interpolator U;
    final AccessibilityManager V;
    final Runnable W;
    private final bfh Y;
    private boolean Z;
    private boolean aa;
    private int ab;
    private Button ac;
    private Button ad;
    private ImageButton ae;
    private ImageButton af;
    private MediaRouteExpandCollapseButton ag;
    private FrameLayout ah;
    private TextView ai;
    private TextView aj;
    private TextView ak;
    private final boolean al;
    private View am;
    private final Interpolator an;
    private final Interpolator ao;
    final bhd c;
    final bhc d;
    final Context e;
    public View f;
    public FrameLayout g;
    public LinearLayout h;
    FrameLayout i;
    public ImageView j;
    final boolean k;
    public LinearLayout l;
    public RelativeLayout m;
    LinearLayout n;
    OverlayListView o;
    bfk p;
    public List q;
    Set r;
    public Set s;
    Set t;
    SeekBar u;
    bfj v;
    bhc w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bfl(android.content.Context r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            android.content.Context r3 = defpackage.kt.H(r3, r4, r0)
            int r4 = defpackage.kt.C(r3)
            r2.<init>(r3, r4)
            r2.al = r0
            bez r4 = new bez
            r4.<init>(r2)
            r2.W = r4
            android.content.Context r4 = r2.getContext()
            r2.e = r4
            bfg r0 = new bfg
            r0.<init>(r2)
            r2.D = r0
            bhd r0 = defpackage.bhd.b(r4)
            r2.c = r0
            boolean r0 = defpackage.bhd.d()
            r2.k = r0
            bfh r0 = new bfh
            r0.<init>(r2)
            r2.Y = r0
            bhc r0 = defpackage.bhd.j()
            r2.d = r0
            android.support.v4.media.session.MediaSessionCompat$Token r0 = defpackage.bhd.h()
            r2.A(r0)
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131167534(0x7f07092e, float:1.7949344E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r2.A = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r4 = (android.view.accessibility.AccessibilityManager) r4
            r2.V = r4
            r4 = 2131558408(0x7f0d0008, float:1.874213E38)
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r3, r4)
            r2.an = r4
            r4 = 2131558407(0x7f0d0007, float:1.8742129E38)
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r3, r4)
            r2.ao = r3
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfl.<init>(android.content.Context, int):void");
    }

    private final void A(MediaSessionCompat$Token mediaSessionCompat$Token) {
        ip ipVar = this.C;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (ipVar != null) {
            ipVar.e(this.D);
            this.C = null;
        }
        if (mediaSessionCompat$Token != null && this.aa) {
            ip ipVar2 = new ip(this.e, mediaSessionCompat$Token);
            this.C = ipVar2;
            bfg bfgVar = this.D;
            if (bfgVar == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            if (ipVar2.c.putIfAbsent(bfgVar, true) != null) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
            } else {
                Handler handler = new Handler();
                bfgVar.e(handler);
                il ilVar = ipVar2.a;
                in inVar = (in) ilVar;
                inVar.a.registerCallback(bfgVar.a, handler);
                synchronized (inVar.b) {
                    if (((in) ilVar).e.a() != null) {
                        im imVar = new im(bfgVar);
                        ((in) ilVar).d.put(bfgVar, imVar);
                        bfgVar.c = imVar;
                        try {
                            ((in) ilVar).e.a().b(imVar);
                            bfgVar.d(13, null, null);
                        } catch (RemoteException e) {
                            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                        }
                    } else {
                        bfgVar.c = null;
                        ((in) ilVar).c.add(bfgVar);
                    }
                }
            }
            MediaMetadataCompat a = this.C.a();
            if (a != null) {
                mediaDescriptionCompat = a.b();
            }
            this.F = mediaDescriptionCompat;
            this.E = this.C.c();
            p();
            o(false);
        }
    }

    public static int g(View view) {
        return view.getLayoutParams().height;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f(int i, int i2) {
        return i >= i2 ? (int) (((this.ab * i2) / i) + 0.5f) : (int) (((this.ab * 9.0f) / 16.0f) + 0.5f);
    }

    public final int h(boolean z) {
        if (z || this.n.getVisibility() == 0) {
            int paddingTop = this.l.getPaddingTop() + this.l.getPaddingBottom();
            if (z) {
                paddingTop += this.m.getMeasuredHeight();
            }
            if (this.n.getVisibility() == 0) {
                paddingTop += this.n.getMeasuredHeight();
            }
            return (!z || this.n.getVisibility() != 0) ? paddingTop : paddingTop + this.am.getMeasuredHeight();
        }
        return 0;
    }

    public final void i(View view, int i) {
        bfc bfcVar = new bfc(g(view), i, view);
        bfcVar.setDuration(this.R);
        bfcVar.setInterpolator(this.U);
        view.startAnimation(bfcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        this.U = this.O ? this.an : this.ao;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void nc(boolean z) {
        Set set;
        int firstVisiblePosition = this.o.getFirstVisiblePosition();
        for (int i = 0; i < this.o.getChildCount(); i++) {
            View childAt = this.o.getChildAt(i);
            bhc bhcVar = (bhc) this.p.getItem(firstVisiblePosition + i);
            if (!z || (set = this.r) == null || !set.contains(bhcVar)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        for (bfp bfpVar : this.o.a) {
            bfpVar.k = true;
            bfpVar.l = true;
            bex bexVar = bfpVar.m;
            if (bexVar != null) {
                bexVar.a();
            }
        }
        if (!z) {
            ne(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void nd() {
        this.f141J = false;
        this.K = null;
        this.L = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ne(boolean z) {
        this.r = null;
        this.s = null;
        this.P = false;
        if (this.Q) {
            this.Q = false;
            r(z);
        }
        this.o.setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(boolean r10) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfl.o(boolean):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.aa = true;
        this.c.q(bgo.a, this.Y, 2);
        A(bhd.h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nx, defpackage.ov, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        bfa bfaVar = new bfa(this, 3);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.g = frameLayout;
        frameLayout.setOnClickListener(new bfa(this, 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.h = linearLayout;
        linearLayout.setOnClickListener(new ija(1));
        Context context = this.e;
        int F = kt.F(context, 0, R.attr.colorPrimary);
        if (gy.a(F, kt.F(context, 0, 16842801)) < 3.0d) {
            F = kt.F(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(16908314);
        this.ac = button;
        button.setText(R.string.mr_controller_disconnect);
        this.ac.setTextColor(F);
        this.ac.setOnClickListener(bfaVar);
        Button button2 = (Button) findViewById(16908313);
        this.ad = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.ad.setTextColor(F);
        this.ad.setOnClickListener(bfaVar);
        this.ak = (TextView) findViewById(R.id.mr_name);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_close);
        this.af = imageButton;
        imageButton.setOnClickListener(bfaVar);
        this.ah = (FrameLayout) findViewById(R.id.mr_custom_control);
        this.i = (FrameLayout) findViewById(R.id.mr_default_control);
        bfa bfaVar2 = new bfa(this);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.j = imageView;
        imageView.setOnClickListener(bfaVar2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(bfaVar2);
        this.l = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.am = findViewById(R.id.mr_control_divider);
        this.m = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.ai = (TextView) findViewById(R.id.mr_control_title);
        this.aj = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.ae = imageButton2;
        imageButton2.setOnClickListener(bfaVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.n = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.u = seekBar;
        seekBar.setTag(this.d);
        bfj bfjVar = new bfj(this);
        this.v = bfjVar;
        this.u.setOnSeekBarChangeListener(bfjVar);
        this.o = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.q = new ArrayList();
        bfk bfkVar = new bfk(this, this.o.getContext(), this.q);
        this.p = bfkVar;
        this.o.setAdapter((ListAdapter) bfkVar);
        this.t = new HashSet();
        Context context2 = this.e;
        LinearLayout linearLayout3 = this.l;
        OverlayListView overlayListView = this.o;
        boolean k = this.d.k();
        int F2 = kt.F(context2, 0, R.attr.colorPrimary);
        int F3 = kt.F(context2, 0, R.attr.colorPrimaryDark);
        if (k && kt.D(context2, 0) == -570425344) {
            F3 = F2;
            F2 = -1;
        }
        linearLayout3.setBackgroundColor(F2);
        overlayListView.setBackgroundColor(F3);
        linearLayout3.setTag(Integer.valueOf(F2));
        overlayListView.setTag(Integer.valueOf(F3));
        kt.I(this.e, (MediaRouteVolumeSlider) this.u, this.l);
        HashMap hashMap = new HashMap();
        this.B = hashMap;
        hashMap.put(this.d, this.u);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.ag = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.f = new bfa(this, 2);
        m();
        this.R = this.e.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.S = this.e.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.T = this.e.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        View z = z();
        this.f = z;
        if (z != null) {
            this.ah.addView(z);
            this.ah.setVisibility(0);
        }
        this.Z = true;
        q();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.c.r(this.Y);
        A(null);
        this.aa = false;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.nx, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p() {
        if (this.f == null) {
            MediaDescriptionCompat mediaDescriptionCompat = this.F;
            Uri uri = null;
            Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.c;
            if (mediaDescriptionCompat != null) {
                uri = mediaDescriptionCompat.d;
            }
            bff bffVar = this.G;
            Bitmap bitmap2 = bffVar == null ? this.H : bffVar.a;
            Uri uri2 = bffVar == null ? this.I : bffVar.b;
            if (bitmap2 == bitmap) {
                if (bitmap2 != null) {
                    return;
                }
                if (uri2 != null && uri2.equals(uri)) {
                    return;
                }
                if (uri2 == null && uri == null) {
                    return;
                }
            }
            if (this.d.k() && !this.k) {
                return;
            }
            bff bffVar2 = this.G;
            if (bffVar2 != null) {
                bffVar2.cancel(true);
            }
            bff bffVar3 = new bff(this);
            this.G = bffVar3;
            bffVar3.execute(new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        int b2 = ks.b(this.e);
        getWindow().setLayout(b2, -2);
        View decorView = getWindow().getDecorView();
        this.ab = (b2 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.e.getResources();
        this.x = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.y = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.z = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.H = null;
        this.I = null;
        p();
        o(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(boolean z) {
        this.i.requestLayout();
        this.i.getViewTreeObserver().addOnGlobalLayoutListener(new bfb(this, z));
    }

    public final void s(boolean z) {
        int i = 0;
        this.am.setVisibility((this.n.getVisibility() != 0 || !z) ? 8 : 0);
        LinearLayout linearLayout = this.l;
        if (this.n.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    public final boolean t() {
        return this.f == null && !(this.F == null && this.E == null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v() {
        return (this.E.e & 514) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w() {
        return (this.E.e & 516) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean x() {
        return (this.E.e & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean y(bhc bhcVar) {
        return this.al && bhcVar.a() == 1;
    }

    public View z() {
        return null;
    }

    @Override // defpackage.nx, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            if (this.k || !this.O) {
                this.d.f(i == 25 ? -1 : 1);
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}

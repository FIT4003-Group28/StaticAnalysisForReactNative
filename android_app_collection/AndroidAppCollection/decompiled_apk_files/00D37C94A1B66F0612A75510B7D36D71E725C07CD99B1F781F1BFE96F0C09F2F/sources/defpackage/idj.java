package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: idj  reason: default package */
/* loaded from: classes3.dex */
public final class idj implements View.OnClickListener, idy, iec {
    public final ied B;
    private final icx C;
    private final iex D;
    private final ajmy E;
    private final ViewGroup F;
    private final TextView G;
    private final fzx H;
    private final fmh I;
    private final ftb K;
    private final ajhl L;
    private int M;
    private int N;
    private int O;
    private ViewGroup P;
    private View Q;
    private View R;
    private View S;
    private TextView T;
    private TextView U;
    private Button V;
    private YouTubeButton W;
    private ViewGroup X;
    private CircularImageView Y;
    private TextView Z;
    public final idi a;
    private TextView aa;
    private ajnj ab;
    private fmf ac;
    public final iez b;
    public final iel c;
    public final ViewGroup d;
    public final View e;
    public final ViewGroup f;
    public final aafo g;
    public final ifb h;
    public final acth i;
    public final ajxz j;
    public View k;
    public View l;
    public LottieAnimationView m;
    public ViewGroup n;
    public View o;
    public TextView p;
    public TextView q;
    public TextView r;
    public long s;
    public boolean t;
    public ier u;
    public fmg v;
    public aulr w;
    public actj x;

    /* renamed from: J  reason: collision with root package name */
    private final aypf f212J = new aypf();
    public final List y = new ArrayList();
    public final List z = new ArrayList();
    public final AnimatorSet A = new AnimatorSet();

    public idj(iez iezVar, icx icxVar, iel ielVar, ajmy ajmyVar, aafo aafoVar, fzx fzxVar, acth acthVar, fmh fmhVar, ifc ifcVar, iex iexVar, ajxz ajxzVar, ftb ftbVar, ajhl ajhlVar, ViewGroup viewGroup, idi idiVar) {
        this.b = iezVar;
        this.C = icxVar;
        this.c = ielVar;
        this.E = ajmyVar;
        this.D = iexVar;
        this.d = viewGroup;
        this.a = idiVar;
        this.i = acthVar;
        this.I = fmhVar;
        this.H = fzxVar;
        this.g = aafoVar;
        acth acthVar2 = (acth) ifcVar.a.get();
        acthVar2.getClass();
        icx icxVar2 = (icx) ifcVar.c.get();
        icxVar2.getClass();
        this.h = new ifb(fzxVar, acthVar2, (gac) ifcVar.b.get(), icxVar2);
        this.B = new ied(ajmyVar, aafoVar, acthVar, ajxzVar);
        this.K = ftbVar;
        this.j = ajxzVar;
        this.L = ajhlVar;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.reel_player_header_container);
        viewGroup2.getClass();
        this.F = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.reel_player_footer_container);
        viewGroup3.getClass();
        this.f = viewGroup3;
        this.e = viewGroup.findViewById(R.id.reel_persistent_edu_button_group);
        this.G = (TextView) viewGroup.findViewById(R.id.reel_persistent_edu_button_label);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A(int r8, defpackage.aulp r9, final defpackage.avaq r10, final boolean r11) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idj.A(int, aulp, avaq, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.CharSequence] */
    private final void B(String str, int i, aulp aulpVar, boolean z, boolean z2) {
        Spanned spanned;
        Spanned spanned2;
        Spanned spanned3;
        boolean z3 = i == 5;
        int i2 = z3 ? R.layout.reel_player_header_video : R.layout.reel_player_header_story;
        View findViewById = this.F.findViewById(R.id.reel_header_group);
        this.k = findViewById;
        if (findViewById != null && (str == null || !str.equals(findViewById.getTag()))) {
            this.F.removeAllViews();
            this.k = null;
            this.ab = null;
        }
        if (this.k == null) {
            View inflate = LayoutInflater.from(this.F.getContext()).inflate(i2, this.F, false);
            this.k = inflate;
            inflate.setTag(str);
            this.F.addView(this.k);
        }
        hqs.c(this.k, true);
        this.p = (TextView) this.k.findViewById(R.id.reel_main_title);
        this.q = (TextView) this.k.findViewById(R.id.reel_byline_text);
        this.T = (TextView) this.k.findViewById(i == 5 ? 0 : R.id.reel_timestamp_story);
        this.o = this.k.findViewById(R.id.reel_byline_separator);
        this.Y = (CircularImageView) this.k.findViewById(R.id.reel_channel_thumbnail);
        if (z3) {
            this.R = this.o;
        }
        icz iczVar = new icz(this, 1);
        CircularImageView circularImageView = this.Y;
        if (circularImageView != null) {
            circularImageView.setOnClickListener(iczVar);
        }
        TextView textView = this.q;
        if (textView != null) {
            textView.setOnClickListener(iczVar);
        }
        if (z && aulpVar != null && (aulpVar.b & 64) != 0) {
            c(aulpVar.h);
        }
        if (z && aulpVar != null && (aulpVar.b & 1) != 0) {
            arag aragVar = aulpVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            aczo.d(aragVar, this.i.oi());
        }
        if (aulpVar == null || (aulpVar.b & 2) == 0) {
            spanned = null;
        } else {
            arag aragVar2 = aulpVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            spanned = ajgl.b(aragVar2);
        }
        if (aulpVar == null || (aulpVar.b & 1) == 0) {
            spanned2 = null;
        } else {
            arag aragVar3 = aulpVar.c;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            spanned2 = ajgl.b(aragVar3);
        }
        if (aulpVar == null || (aulpVar.b & 8) == 0) {
            spanned3 = null;
        } else {
            arag aragVar4 = aulpVar.f;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            spanned3 = ajgl.b(aragVar4);
        }
        if (spanned3 == null || spanned3.length() == 0 || spanned3.equals(spanned2)) {
            spanned3 = spanned2;
            spanned2 = null;
        }
        hqs.c(this.p, spanned2 != null);
        hqs.c(this.q, spanned3 != 0);
        t(this.p, spanned2);
        TextView textView2 = this.q;
        if (textView2 != null) {
            t(textView2, spanned3);
            if (!z3 && spanned2 != null) {
                this.q.setTypeface(Typeface.DEFAULT);
            }
        }
        hqs.c(this.T, spanned != null);
        t(this.T, spanned);
        hqs.c(this.o, (spanned3 == 0 || spanned == null) ? false : true);
        if (aulpVar == null || (aulpVar.b & 16) == 0) {
            this.ab = null;
            this.Y.setImageResource(R.color.yt_black1);
        } else if (this.ab == null) {
            ajnj ajnjVar = new ajnj(this.E, new yyj(), this.Y, false);
            this.ab = ajnjVar;
            avhn avhnVar = aulpVar.g;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajnjVar.k(avhnVar);
        }
        hqs.c(this.Y, true);
        if (i == 3) {
            this.N = R.id.reel_header_subscribe_button;
        } else if (i == 4) {
            this.O = R.id.reel_header_menu_button;
        }
        a(this.d, z3, z2);
    }

    private final TextView C(ViewGroup viewGroup, int i, apoj apojVar, idj idjVar, boolean z) {
        if (apojVar != null) {
            TextView x = x(viewGroup, i, 2131231388);
            x.setId(R.id.reel_dyn_comment);
            q(x, R.string.reel_footer_comment);
            r(x, apojVar);
            x.setContentDescription(w(apojVar));
            x.setOnClickListener(idjVar);
            x.setEnabled(!apojVar.h);
            x.setAlpha(true != apojVar.h ? 1.0f : 0.3f);
            if (z && (apojVar.b & 1048576) != 0) {
                c(apojVar.t);
            }
            return x;
        }
        return null;
    }

    private static final TextView D(int i, ViewGroup viewGroup, int i2, arag aragVar, int i3, int i4, boolean z) {
        if (aragVar != null) {
            TextView x = x(viewGroup, i2, i3);
            x.setId(i);
            s(x, aragVar);
            if (i4 != 0) {
                x.setContentDescription(x.getResources().getString(i4));
            }
            if (z) {
                x.setFocusableInTouchMode(true);
                x.setBackground(null);
            }
            return x;
        }
        return null;
    }

    private final void E(ViewGroup viewGroup, int i, asov asovVar, boolean z) {
        if (asovVar != null) {
            TextView x = x(viewGroup, i, R.drawable.reel_like_icon);
            x.setId(R.id.reel_dyn_like);
            q(x, R.string.reel_footer_like);
            if (z && (asovVar.b & 4096) != 0) {
                c(asovVar.n);
            }
            this.H.c(x);
            this.H.i((aopc) asovVar.mo52toBuilder());
            this.H.e();
            return;
        }
        this.H.i(null);
        this.H.d();
    }

    private static final TextView F(ViewGroup viewGroup, int i, View.OnClickListener onClickListener) {
        TextView x = x(viewGroup, i, 2131232599);
        x.setId(R.id.reel_dyn_overflow_menu);
        q(x, R.string.reel_player_menu_title_text);
        x.setContentDescription(x.getResources().getString(R.string.reel_accessibility_menu));
        x.setOnClickListener(onClickListener);
        return x;
    }

    public static void a(ViewGroup viewGroup, boolean z, boolean z2) {
        View findViewById = viewGroup.findViewById(R.id.reel_close_button);
        zag.o(findViewById, z2);
        if (findViewById == null || !(findViewById.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        zgd.t(findViewById, zgd.p(z ? 0 : findViewById.getContext().getResources().getDimensionPixelSize(R.dimen.reel_close_button_margin_top)), ViewGroup.MarginLayoutParams.class);
    }

    public static View h(ViewGroup viewGroup, int i, int i2, int i3) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        viewGroup.addView(inflate);
        hqs.c(inflate, true);
        if (i2 == R.layout.reel_player_dyn_cell2) {
            inflate = inflate.findViewById(R.id.reel_dyn_icon2);
        }
        if (i3 == 0 || !(inflate instanceof TextView)) {
            if (i3 != 0 && (inflate instanceof ImageView)) {
                ((ImageView) inflate).setImageResource(i3);
            }
        } else {
            TextView textView = (TextView) inflate;
            if (i == 4 || i == 11) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i3, 0, 0, 0);
            } else {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i3, 0, 0);
            }
        }
        return inflate;
    }

    public static int i(aulr aulrVar) {
        int i;
        if ((aulrVar.b & 4096) != 0) {
            i = awwc.bC(aulrVar.o);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        if (i == 0 || i == 1) {
            return 10;
        }
        return i;
    }

    private final ajgf k() {
        return new idh(this);
    }

    private final asov l(aulr aulrVar) {
        boolean z = true;
        int i = aulrVar.b & 1;
        asow asowVar = aulrVar.c;
        if (asowVar == null) {
            asowVar = asow.a;
        }
        if (1 != i) {
            z = false;
        }
        asov c = hqp.c(z, asowVar);
        if (c != null) {
            return this.C.a(c);
        }
        return null;
    }

    private final void m(boolean z, ViewGroup viewGroup) {
        ault aultVar;
        int i;
        int bE;
        viewGroup.removeAllViews();
        aulr aulrVar = this.w;
        if (aulrVar == null || (aulrVar.b & 8388608) == 0) {
            aultVar = null;
        } else {
            aultVar = aulrVar.y;
            if (aultVar == null) {
                aultVar = ault.a;
            }
        }
        if (aultVar == null || (aultVar.b & 1) == 0) {
            i = 2;
        } else {
            i = awwc.bF(aultVar.c);
            if (i == 0) {
                i = 1;
            }
        }
        if (i == 2) {
            this.Q = h(viewGroup, 12, R.layout.reel_player_right_cell_menu_A, 0);
        } else {
            n(viewGroup);
        }
        asov l = l(this.w);
        if (l != null) {
            if (z && (l.b & 4096) != 0) {
                c(l.n);
            }
            TextView textView = (TextView) h(viewGroup, 12, R.layout.reel_player_right_cell, R.drawable.reel_right_like_icon);
            textView.setId(R.id.reel_dyn_like);
            q(textView, R.string.reel_footer_like);
            this.H.c(textView);
            this.D.b(textView, R.drawable.ic_right_like_off_32c, 2131231789);
            aulr aulrVar2 = this.w;
            if ((aulrVar2.b & 262144) != 0 && (bE = awwc.bE(aulrVar2.t)) != 0 && bE == 4) {
                TextView textView2 = (TextView) h(viewGroup, 12, R.layout.reel_player_right_cell, R.drawable.reel_right_dislike_icon);
                textView2.setId(R.id.reel_dyn_dislike);
                q(textView2, R.string.reel_footer_dislike);
                this.H.a(textView2);
                this.D.b(textView2, R.drawable.ic_right_dislike_off_32c, 2131231786);
            }
            this.H.i((aopc) l.mo52toBuilder());
            this.H.e();
        } else {
            this.H.i(null);
            this.H.d();
        }
        aulr aulrVar3 = this.w;
        boolean z2 = (aulrVar3.b & 8192) != 0;
        aunb aunbVar = aulrVar3.p;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apoj b = hqp.b(z2, aunbVar);
        if (b != null) {
            TextView textView3 = (TextView) h(viewGroup, 12, R.layout.reel_player_right_cell, R.drawable.ic_right_comment_32c);
            this.aa = textView3;
            textView3.setId(R.id.reel_dyn_comment);
            q(textView3, R.string.reel_footer_comment);
            r(textView3, b);
            textView3.setContentDescription(w(b));
            textView3.setOnClickListener(this);
            textView3.setEnabled(!b.h);
            textView3.setAlpha(true != b.h ? 1.0f : 0.3f);
            if (z && (b.b & 1048576) != 0) {
                c(b.t);
            }
            this.D.a(textView3, R.dimen.reel_player_right_large_icon_size, R.drawable.ic_right_comment_32c);
        }
        aulr aulrVar4 = this.w;
        boolean z3 = (aulrVar4.b & 524288) != 0;
        aunb aunbVar2 = aulrVar4.u;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        apoj b2 = hqp.b(z3, aunbVar2);
        if (b2 != null) {
            if (z && (b2.b & 1048576) != 0) {
                c(b2.t);
            }
            TextView textView4 = (TextView) h(viewGroup, 12, R.layout.reel_player_right_cell, R.drawable.ic_right_share_32c);
            textView4.setId(R.id.reel_dyn_share);
            arag aragVar = b2.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            s(textView4, aragVar);
            this.D.a(textView4, R.dimen.reel_player_right_large_icon_size, R.drawable.ic_right_share_32c);
            this.f212J.d(axds.m(textView4).aF(TimeUnit.MILLISECONDS).as(new idd(this, 1)));
        }
        if (i == 2) {
            n(viewGroup);
        } else {
            this.Q = h(viewGroup, 12, R.layout.reel_player_right_cell_menu_B, 0);
        }
        View view = this.Q;
        if (view != null) {
            view.setId(R.id.reel_right_cell_menu);
            this.D.a(this.Q, R.dimen.reel_player_right_small_icon_size, 2131232599);
        }
    }

    private final void n(ViewGroup viewGroup) {
        ied iedVar = this.B;
        aulr aulrVar = this.w;
        if (iedVar.f != null && (aulrVar.b & 33554432) != 0) {
            iedVar.c();
        }
        if (iedVar.e != null && (aulrVar.b & 33554432) == 0) {
            iedVar.c();
        }
        View view = iedVar.f;
        if (view != null && view.findViewById(R.id.pivot_button_icon) == null) {
            iedVar.c();
        }
        View view2 = iedVar.e;
        if (view2 != null) {
            ied.b(viewGroup, view2);
            return;
        }
        View view3 = iedVar.f;
        if (view3 != null) {
            ied.b(viewGroup, view3);
        } else if ((aulrVar.b & 33554432) == 0) {
            iedVar.f = ied.a(viewGroup, R.layout.reel_player_right_cell_audio);
            iedVar.f.setId(R.id.reel_pivot_button);
            iedVar.g = (LottieAnimationView) iedVar.f.findViewById(R.id.reel_pivot_anim_icon);
            iedVar.i = iedVar.f.findViewById(R.id.pivot_button_scrim);
            iedVar.h = (ImageView) iedVar.f.findViewById(R.id.pivot_button_icon);
            iedVar.j = new ajnj(iedVar.a, new yyj(), (ImageView) iedVar.f.findViewById(R.id.reel_pivot_thumbnail), false);
        } else {
            iedVar.e = ied.a(viewGroup, R.layout.reel_player_forced_mute_button);
            iedVar.e.setId(R.id.reel_player_forced_mute_button);
        }
    }

    private final void o() {
        this.y.clear();
        TextView textView = this.p;
        if (textView != null) {
            this.y.add(ObjectAnimator.ofFloat(textView, View.ALPHA, 0.0f, 1.0f));
        }
        TextView textView2 = this.q;
        if (textView2 != null) {
            this.y.add(ObjectAnimator.ofFloat(textView2, View.ALPHA, 0.0f, 1.0f));
        }
        TextView textView3 = this.T;
        if (textView3 != null) {
            this.y.add(ObjectAnimator.ofFloat(textView3, View.ALPHA, 0.0f, 1.0f));
        }
        CircularImageView circularImageView = this.Y;
        if (circularImageView != null) {
            this.y.add(ObjectAnimator.ofFloat(circularImageView, View.ALPHA, 0.0f, 1.0f));
        }
        View findViewById = this.d.findViewById(this.N);
        if (findViewById != null) {
            this.y.add(ObjectAnimator.ofFloat(findViewById, View.ALPHA, 0.0f, 1.0f));
        }
        YouTubeButton youTubeButton = this.W;
        if (youTubeButton != null) {
            this.y.add(ObjectAnimator.ofFloat(youTubeButton, View.ALPHA, 0.0f, 1.0f));
        }
        ViewGroup viewGroup = this.P;
        if (viewGroup != null) {
            this.y.add(ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f, 1.0f));
        }
        View view = this.S;
        if (view != null) {
            this.y.add(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f));
        }
        Button button = this.V;
        if (button != null) {
            this.y.add(ObjectAnimator.ofFloat(button, View.ALPHA, 0.0f, 1.0f));
        }
        ViewGroup viewGroup2 = this.X;
        if (viewGroup2 != null) {
            this.y.add(ObjectAnimator.ofFloat(viewGroup2, View.ALPHA, 0.0f, 1.0f));
        }
        this.A.playTogether(this.y);
        this.A.start();
    }

    private final void p() {
        this.A.cancel();
        this.A.setDuration(100L);
        this.A.playTogether(this.z);
        this.A.addListener(new idf(this));
        this.A.start();
    }

    private static void q(TextView textView, int i) {
        if (textView != null) {
            textView.setText(i);
        }
    }

    private static void r(TextView textView, apoj apojVar) {
        if ((apojVar.b & 256) != 0) {
            arag aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            s(textView, aragVar);
        }
    }

    private static void s(TextView textView, arag aragVar) {
        t(textView, ajgl.b(aragVar));
    }

    private static void t(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            textView.setText(charSequence);
        }
    }

    private static void u(View view, int i) {
        if (view != null) {
            zgd.t(view, zgd.r(view.getResources().getDimensionPixelSize(i)), ViewGroup.LayoutParams.class);
        }
    }

    private final void v(View view) {
        ied iedVar = this.B;
        iedVar.e = view.findViewById(R.id.reel_player_forced_mute_button);
        iedVar.f = view.findViewById(R.id.reel_pivot_button);
        iedVar.j = new ajnj(iedVar.a, new yyj(), (ImageView) iedVar.f.findViewById(R.id.reel_pivot_thumbnail), false);
    }

    private static final String w(apoj apojVar) {
        aovs aovsVar = apojVar.s;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        aovr aovrVar = aovsVar.c;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        if ((aovrVar.b & 2) != 0) {
            aovs aovsVar2 = apojVar.s;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar2 = aovsVar2.c;
            if (aovrVar2 == null) {
                aovrVar2 = aovr.a;
            }
            return aovrVar2.c;
        }
        return null;
    }

    private static TextView x(ViewGroup viewGroup, int i, int i2) {
        int i3;
        if (i == 4) {
            i3 = R.layout.reel_player_dyn_cell2;
        } else if (i == 11) {
            i3 = R.layout.reel_player_dyn_cell2_vert;
        } else {
            i3 = hqp.r(i) ? R.layout.reel_player_right_cell : hqp.t(i) ? R.layout.reel_player_dyn_footer_vert_cell : R.layout.reel_player_dyn_cell1;
        }
        return (TextView) h(viewGroup, i, i3, i2);
    }

    private final void y(int i, boolean z, ViewGroup viewGroup) {
        int i2;
        int i3;
        int bE;
        viewGroup.removeAllViews();
        boolean z2 = true;
        boolean z3 = i == 6 || i == 8 || i == 10 || i == 11;
        asov l = l(this.w);
        aulr aulrVar = this.w;
        if ((aulrVar.b & 262144) == 0 || (bE = awwc.bE(aulrVar.t)) == 0 || bE != 4 || i == 11) {
            E(viewGroup, i, l, z);
            if (!z3) {
                h(viewGroup, i, R.layout.reel_player_dyn_space, 0);
            }
        } else if (l != null) {
            TextView x = x(viewGroup, i, R.drawable.reel_like_icon);
            TextView x2 = x(viewGroup, i, R.drawable.reel_dislike_icon);
            x.setId(R.id.reel_dyn_like);
            x2.setId(R.id.reel_dyn_dislike);
            q(x, R.string.reel_footer_like);
            q(x2, R.string.reel_footer_dislike);
            if (z && (l.b & 4096) != 0) {
                c(l.n);
            }
            this.H.c(x);
            this.H.a(x2);
            this.H.i((aopc) l.mo52toBuilder());
            this.H.e();
        } else {
            this.H.i(null);
            this.H.d();
        }
        aulr aulrVar2 = this.w;
        boolean z4 = (aulrVar2.b & 8192) != 0;
        aunb aunbVar = aulrVar2.p;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apoj b = hqp.b(z4, aunbVar);
        if (b != null) {
            this.aa = C(viewGroup, i, b, this, z);
        }
        aulr aulrVar3 = this.w;
        int i4 = aulrVar3.b & 524288;
        if (i4 != 0) {
            if (i4 == 0) {
                z2 = false;
            }
            aunb aunbVar2 = aulrVar3.u;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apoj b2 = hqp.b(z2, aunbVar2);
            b2.getClass();
            if (z && (b2.b & 1048576) != 0) {
                c(b2.t);
            }
            arag aragVar = b2.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            arag aragVar2 = aragVar;
            i3 = R.layout.reel_player_dyn_space;
            i2 = 0;
            this.f212J.d(axds.m(D(R.id.reel_dyn_share, viewGroup, i, aragVar2, R.drawable.ic_share_white_24dp, 0, false)).aF(TimeUnit.MILLISECONDS).as(new idd(this)));
        } else {
            i2 = 0;
            i3 = R.layout.reel_player_dyn_space;
        }
        if (b == null && (this.w.b & 524288) == 0 && !z3) {
            h(viewGroup, i, i3, i2);
            h(viewGroup, i, i3, i2);
        }
        if (this.N == 0) {
            this.r = (TextView) h(viewGroup, i, R.layout.reel_player_dyn_subs_button, i2);
        }
        if (this.O == 0) {
            TextView F = F(viewGroup, i, this);
            this.Q = F;
            z(F, i);
        }
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            View childAt = viewGroup.getChildAt(i5);
            zgd.t(childAt, zgd.r(i2), LinearLayout.LayoutParams.class);
            zgd.t(childAt, zgd.q(1.0f), LinearLayout.LayoutParams.class);
        }
    }

    private final void z(View view, int i) {
        if (view == null || view.getResources() == null || view.getResources().getConfiguration() == null || view.getResources().getConfiguration().fontScale <= 1.0f || i != 4) {
            return;
        }
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), (int) this.k.getResources().getDimension(R.dimen.reel_player_dyn_footer_padding_end_large_font), view.getPaddingBottom());
    }

    public final void b() {
        Context context = this.f.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_player_right_footer, this.f, false);
        this.l = inflate;
        this.f.addView(inflate);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.reel_player_right_footer_bottom_padding);
        this.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        this.f.setPadding(0, 0, 0, dimensionPixelSize);
    }

    public final void c(aoob aoobVar) {
        this.i.oi().n(new acte(aoobVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0467 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x07bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r19, defpackage.aulr r20, boolean r21, boolean r22, com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint r23) {
        /*
            Method dump skipped, instructions count: 2243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idj.d(java.lang.String, aulr, boolean, boolean, com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint):void");
    }

    public final void e() {
        this.H.b.clear();
        hqs.c(this.U, false);
        hqs.c(this.Q, false);
        hqs.c(this.r, false);
        hqs.c(this.W, false);
        hqs.c(null, false);
        hqs.c(null, false);
        hqs.c(this.Z, false);
        hqs.c(this.aa, false);
        hqs.c(this.d.findViewById(this.M), false);
        hqs.c(this.e, false);
        CircularImageView circularImageView = this.Y;
        if (circularImageView != null) {
            circularImageView.setOnClickListener(null);
            this.Y = null;
        }
        this.p = null;
        TextView textView = this.q;
        if (textView != null) {
            textView.setOnClickListener(null);
            this.q = null;
        }
        this.U = null;
        this.Q = null;
        this.r = null;
        this.W = null;
        this.o = null;
        this.R = null;
        this.Z = null;
        this.aa = null;
        this.V = null;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        ViewGroup viewGroup = this.X;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            hqs.c(this.X, false);
            this.X = null;
        }
        this.L.qZ(null);
        this.f212J.c();
    }

    @Override // defpackage.iec
    public final void g(aulm aulmVar) {
        if ((aulmVar.b & 1) != 0) {
            arag aragVar = aulmVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            Spanned b = ajgl.b(aragVar);
            aloh m = aloh.m(this.d.findViewById(R.id.forced_mute_snackbar_layout), b, 5000);
            m.l();
            m.k = new ide();
            if ((aulmVar.b & 2) != 0) {
                aunb aunbVar = aulmVar.d;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                    aunb aunbVar2 = aulmVar.d;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
                    int i = apojVar.b;
                    if ((i & 256) != 0 && (i & 32768) != 0) {
                        View findViewById = m.e.findViewById(R.id.snackbar_action);
                        arag aragVar2 = apojVar.i;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                        Spanned b2 = ajgl.b(aragVar2);
                        findViewById.setContentDescription(b2);
                        findViewById.setBackground(null);
                        m.o(b2, new idb(this, apojVar, 2));
                    }
                }
            }
            alod alodVar = m.e;
            alodVar.setContentDescription(b);
            alodVar.setBackground(this.d.getContext().getDrawable(R.drawable.snackbar_rounded_corner));
            alodVar.setPadding(0, 0, 0, 0);
            if ((aulmVar.b & 4) != 0) {
                c(aulmVar.e);
            }
            m.g();
        }
    }

    public final int j() {
        int bC;
        aulr aulrVar = this.w;
        if (aulrVar == null || (bC = awwc.bC(aulrVar.o)) == 0) {
            return 1;
        }
        return bC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
        if (r7 != 55) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r7, defpackage.avas r8, boolean r9) {
        /*
            r6 = this;
            r0 = 2132083344(0x7f150290, float:1.9806828E38)
            r1 = 2132083345(0x7f150291, float:1.980683E38)
            r2 = 2132083347(0x7f150293, float:1.9806834E38)
            r3 = 1
            r4 = 2132083343(0x7f15028f, float:1.9806826E38)
            if (r7 == 0) goto L6b
            if (r8 == 0) goto L6b
            r7 = 0
            if (r9 == 0) goto L21
            int r5 = r8.b
            r5 = r5 & 2
            if (r5 == 0) goto L21
            avgj r7 = r8.d
            if (r7 != 0) goto L2e
            avgj r7 = defpackage.avgj.a
            goto L2e
        L21:
            if (r9 != 0) goto L2e
            int r5 = r8.b
            r5 = r5 & r3
            if (r5 == 0) goto L2e
            avgj r7 = r8.c
            if (r7 != 0) goto L2e
            avgj r7 = defpackage.avgj.a
        L2e:
            if (r7 == 0) goto L6b
            int r8 = r7.b
            r8 = r8 & 4
            if (r8 == 0) goto L6b
            int r7 = r7.e
            avgg r7 = defpackage.avgg.b(r7)
            if (r7 != 0) goto L40
            avgg r7 = defpackage.avgg.THEME_ATTRIBUTE_UNKNOWN
        L40:
            if (r9 != 0) goto L52
            int r7 = r7.ordinal()
            switch(r7) {
                case 51: goto L4e;
                case 52: goto L4a;
                case 53: goto L63;
                case 54: goto L49;
                case 55: goto L67;
                case 56: goto L6e;
                default: goto L49;
            }
        L49:
            goto L6b
        L4a:
            r0 = 2132083346(0x7f150292, float:1.9806832E38)
            goto L6e
        L4e:
            r0 = 2132083348(0x7f150294, float:1.9806836E38)
            goto L6e
        L52:
            int r7 = r7.ordinal()
            r8 = 49
            if (r7 == r8) goto L67
            r8 = 50
            if (r7 == r8) goto L63
            r8 = 55
            if (r7 == r8) goto L6e
            goto L6b
        L63:
            r0 = 2132083345(0x7f150291, float:1.980683E38)
            goto L6e
        L67:
            r0 = 2132083347(0x7f150293, float:1.9806834E38)
            goto L6e
        L6b:
            r0 = 2132083343(0x7f15028f, float:1.9806826E38)
        L6e:
            android.view.ViewGroup r7 = r6.d
            android.content.Context r7 = r7.getContext()
            android.view.ContextThemeWrapper r8 = new android.view.ContextThemeWrapper
            r8.<init>(r7, r0)
            if (r3 == r9) goto L7f
            r7 = 2131232929(0x7f0808a1, float:1.8081981E38)
            goto L82
        L7f:
            r7 = 2131232930(0x7f0808a2, float:1.8081983E38)
        L82:
            android.graphics.drawable.Drawable r7 = r8.getDrawable(r7)
            if (r7 == 0) goto L8d
            android.widget.TextView r8 = r6.r
            r8.setBackground(r7)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idj.f(boolean, avas, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.Q
            r1 = 1
            r2 = 0
            if (r6 != r0) goto L3a
            idi r6 = r5.a
            iet r6 = (defpackage.iet) r6
            ier r6 = r6.o
            ico r6 = (defpackage.ico) r6
            aulr r0 = r6.aJ()
            if (r0 == 0) goto L38
            int r3 = r0.b
            r4 = r3 & 16
            if (r4 == 0) goto L38
            r3 = r3 & 64
            if (r3 == 0) goto L38
            ates r3 = r0.g
            if (r3 != 0) goto L24
            ates r3 = defpackage.ates.a
        L24:
            int r3 = r3.b
            r1 = r1 & r3
            if (r1 == 0) goto L38
            ates r0 = r0.g
            if (r0 != 0) goto L2f
            ates r0 = defpackage.ates.a
        L2f:
            atep r0 = r0.c
            if (r0 != 0) goto L35
            atep r0 = defpackage.atep.a
        L35:
            r6.r(r0)
        L38:
            r6 = r2
            goto L8e
        L3a:
            r0 = 0
            if (r6 == 0) goto L7a
            android.widget.TextView r3 = r5.Z
            if (r6 == r3) goto L7a
            android.widget.TextView r3 = r5.aa
            if (r6 != r3) goto L46
            goto L7a
        L46:
            android.view.View r3 = r5.S
            if (r6 != r3) goto L60
            aulr r6 = r5.w
            int r3 = r6.b
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r3 = r3 & r4
            if (r3 == 0) goto L54
            goto L55
        L54:
            r1 = 0
        L55:
            aunb r6 = r6.z
            if (r6 != 0) goto L5b
            aunb r6 = defpackage.aunb.a
        L5b:
            apoj r6 = defpackage.hqp.b(r1, r6)
            goto L8e
        L60:
            com.google.android.libraries.youtube.common.ui.YouTubeButton r3 = r5.W
            if (r6 != r3) goto L38
            aulr r6 = r5.w
            int r3 = r6.b
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r4
            if (r3 == 0) goto L6e
            goto L6f
        L6e:
            r1 = 0
        L6f:
            aunb r6 = r6.D
            if (r6 != 0) goto L75
            aunb r6 = defpackage.aunb.a
        L75:
            apoj r6 = defpackage.hqp.b(r1, r6)
            goto L8e
        L7a:
            aulr r6 = r5.w
            int r3 = r6.b
            r3 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L83
            goto L84
        L83:
            r1 = 0
        L84:
            aunb r6 = r6.p
            if (r6 != 0) goto L8a
            aunb r6 = defpackage.aunb.a
        L8a:
            apoj r6 = defpackage.hqp.b(r1, r6)
        L8e:
            if (r6 == 0) goto Lb3
            aafo r0 = r5.g
            apzg r1 = r6.p
            if (r1 != 0) goto L98
            apzg r1 = defpackage.apzg.a
        L98:
            r0.a(r1)
            int r0 = r6.b
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto Lb3
            acth r0 = r5.i
            acti r0 = r0.oi()
            acte r1 = new acte
            aoob r6 = r6.t
            r1.<init>(r6)
            r6 = 3
            r0.H(r6, r1, r2)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idj.onClick(android.view.View):void");
    }
}

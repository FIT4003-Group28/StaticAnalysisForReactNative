package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
/* compiled from: PG */
/* renamed from: mim  reason: default package */
/* loaded from: classes3.dex */
public final class mim extends ajsl implements View.OnClickListener, akbi, fzq, geq {
    private final fta A;
    private final acuh B;
    private final int C;
    private aqlb D;
    private final azqb E;
    private mkl F;
    private final int G;
    private final int H;
    public final Context a;
    public mbx b;
    public final int c;
    final FixedAspectRatioFrameLayout d;
    final LinearLayout e;
    final ImageView f;
    View.OnClickListener g;
    ViewTreeObserver.OnPreDrawListener h;
    final TextView i;
    final TextView j;
    final TextView k;
    final ImageView l;
    final ImageView m;
    final ImageView n;
    final TextureView o;
    final FrameLayout p;
    private final Resources q;
    private final ajmy r;
    private final aafo s;
    private final ajyc t;
    private final akbm u;
    private final ajgj v;
    private final ajwo x;
    private final yzo y;
    private final InlinePlaybackLifecycleController z;

    public mim(Context context, ajmy ajmyVar, aafo aafoVar, akbn akbnVar, ajyc ajycVar, ajwm ajwmVar, azqb azqbVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ftb ftbVar, acuh acuhVar) {
        this.a = context;
        this.r = ajmyVar;
        this.s = aafoVar;
        this.t = ajycVar;
        Resources resources = context.getResources();
        this.q = resources;
        this.E = azqbVar;
        this.z = inlinePlaybackLifecycleController;
        this.B = acuhVar;
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) LayoutInflater.from(context).inflate(R.layout.default_promo_panel, (ViewGroup) null);
        this.d = fixedAspectRatioFrameLayout;
        ImageView imageView = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.background_image);
        this.m = imageView;
        this.l = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.avatar_image);
        this.o = (TextureView) fixedAspectRatioFrameLayout.findViewById(R.id.texture_view);
        this.p = (FrameLayout) fixedAspectRatioFrameLayout.findViewById(R.id.inline_playback_view);
        this.n = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.foreground_image);
        this.f = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.contextual_menu_anchor);
        LinearLayout linearLayout = (LinearLayout) fixedAspectRatioFrameLayout.findViewById(R.id.text_layout);
        this.e = linearLayout;
        TextView textView = (TextView) linearLayout.findViewById(R.id.title);
        this.i = textView;
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.description);
        this.j = textView2;
        TextView textView3 = (TextView) linearLayout.findViewById(R.id.action_button);
        this.k = textView3;
        akbm a = akbnVar.a(textView3);
        this.u = a;
        a.d = this;
        this.y = zdk.d(fixedAspectRatioFrameLayout.findViewById(R.id.background_scrim));
        this.A = ftbVar.b(context, (ViewStub) fixedAspectRatioFrameLayout.findViewById(R.id.featured_badge));
        fixedAspectRatioFrameLayout.setOnClickListener(this);
        this.c = resources.getDimensionPixelSize(R.dimen.promo_panel_text_layout_top_bottom_margin);
        this.G = resources.getDimensionPixelSize(R.dimen.promo_panel_foreground_image_max_height);
        this.H = resources.getDimensionPixelSize(R.dimen.promo_panel_text_layout_active_item_indicator_margin);
        ajgi a2 = ajgj.a();
        a2.a = context;
        a2.c = new ajve(aafoVar);
        this.v = a2.a();
        ColorStateList f = zhn.f(context, R.attr.ytOverlayTextPrimary);
        ajwn ajwnVar = ajwmVar.a;
        ajwnVar.a = textView;
        ajwnVar.b = textView2;
        ajwnVar.c = imageView;
        ajwnVar.d = f;
        ajwnVar.e = f;
        ajwnVar.f = zhn.f(context, 16842907);
        this.x = ajwnVar.a();
        this.C = zhn.d(context, R.attr.ytGeneralBackgroundB);
    }

    public static int h(Context context, int i) {
        return (int) context.getResources().getFraction(R.fraction.promo_panel_avatar_height_width_ratio, i, 1);
    }

    public static jj k(Context context, avhn avhnVar, int i) {
        avhm y = akel.y(avhnVar);
        if (y == null) {
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = zew.i(displayMetrics, y.d);
        int i3 = zew.i(displayMetrics, y.e);
        if (i3 <= i || i == -1) {
            i = i3;
        } else {
            i2 = (int) ((y.d / y.e) * i);
        }
        return new jj(Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static avhn m(aqlb aqlbVar) {
        if (aqlbVar == null || (aqlbVar.b & 64) == 0) {
            return null;
        }
        aqkz aqkzVar = aqlbVar.k;
        if (aqkzVar == null) {
            aqkzVar = aqkz.a;
        }
        if ((aqkzVar.b & 1) == 0) {
            return null;
        }
        aqkz aqkzVar2 = aqlbVar.k;
        if (aqkzVar2 == null) {
            aqkzVar2 = aqkz.a;
        }
        if ((aqkzVar2.b & 2) == 0) {
            return null;
        }
        aqkz aqkzVar3 = aqlbVar.k;
        if (aqkzVar3 == null) {
            aqkzVar3 = aqkz.a;
        }
        int e = aqmv.e(aqkzVar3.d);
        if (e == 0 || e != 2) {
            return null;
        }
        aqkz aqkzVar4 = aqlbVar.k;
        if (aqkzVar4 == null) {
            aqkzVar4 = aqkz.a;
        }
        avhn avhnVar = aqkzVar4.c;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public static avhn n(Context context, aqlb aqlbVar) {
        avht avhtVar;
        if (aqlbVar != null) {
            avhu avhuVar = aqlbVar.h;
            if (avhuVar == null) {
                avhuVar = avhu.a;
            }
            if ((avhuVar.b & 1) == 0) {
                return null;
            }
            avhu avhuVar2 = aqlbVar.i;
            if (avhuVar2 == null) {
                avhuVar2 = avhu.a;
            }
            if ((avhuVar2.b & 1) == 0) {
                return null;
            }
            if (zew.y(context)) {
                avhu avhuVar3 = aqlbVar.i;
                if (avhuVar3 == null) {
                    avhuVar3 = avhu.a;
                }
                avhtVar = avhuVar3.c;
                if (avhtVar == null) {
                    avhtVar = avht.a;
                }
            } else {
                avhu avhuVar4 = aqlbVar.h;
                if (avhuVar4 == null) {
                    avhuVar4 = avhu.a;
                }
                avhtVar = avhuVar4.c;
                if (avhtVar == null) {
                    avhtVar = avht.a;
                }
            }
            if (elk.k(context.getResources().getConfiguration().orientation)) {
                avhn avhnVar = avhtVar.d;
                return avhnVar == null ? avhn.a : avhnVar;
            }
            avhn avhnVar2 = avhtVar.c;
            return avhnVar2 == null ? avhn.a : avhnVar2;
        }
        return null;
    }

    private final arjw p() {
        aunb aunbVar;
        aunb aunbVar2;
        aqlb aqlbVar = this.D;
        if (aqlbVar.c == 22) {
            aunbVar = (aunb) aqlbVar.d;
        } else {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer)) {
            aqlb aqlbVar2 = this.D;
            if (aqlbVar2.c == 22) {
                aunbVar2 = (aunb) aqlbVar2.d;
            } else {
                aunbVar2 = aunb.a;
            }
            return (arjw) aunbVar2.qm(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        }
        return null;
    }

    private static void q(View view, int i, int i2) {
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i2;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0295  */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mim.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqlb) obj).x.I();
    }

    public final float f(ajrs ajrsVar) {
        float fraction = this.a.getResources().getFraction(R.fraction.carousel_default_aspect_ratio, 1, 1);
        Object obj = ajrsVar.d.get("carousel_aspect_ratio");
        return obj instanceof Float ? ((Float) obj).floatValue() : fraction;
    }

    @Override // defpackage.fzq
    public final View g() {
        mkl mklVar = this.F;
        if (mklVar == null) {
            return null;
        }
        return mklVar.g();
    }

    @Override // defpackage.fzq
    public final void i(boolean z) {
        mkl mklVar = this.F;
        if (mklVar != null) {
            mklVar.i(z);
        }
    }

    @Override // defpackage.fzq
    public final /* synthetic */ mct j() {
        return null;
    }

    public final void o(int i) {
        int e = lj.e(this.d);
        int i2 = e == 1 ? i : 0;
        if (e == 1) {
            i = 0;
        }
        int childCount = this.e.getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = this.e.getChildAt(childCount);
                if ((childAt instanceof TextView) && childAt.getVisibility() == 0) {
                    q(childAt, i2, i);
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.geq
    public final aynr oI(int i) {
        if (i == 0) {
            if (this.D.c == 22) {
                return this.z.i(eog.bm(p()));
            }
        } else if (this.D.c == 22) {
            arjw p = p();
            InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.z;
            ggz bm = eog.bm(p);
            int i2 = 2;
            if (i != 2) {
                i2 = 0;
            }
            return inlinePlaybackLifecycleController.j(bm, this, i2);
        }
        return aynr.f();
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        if (geqVar instanceof mim) {
            return ((mim) geqVar).D.equals(this.D);
        }
        return false;
    }

    @Override // defpackage.akbi
    public final void oL(aopc aopcVar) {
        if (this.F != null) {
            this.z.o();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar;
        aqlb aqlbVar = this.D;
        if (aqlbVar == null) {
            return;
        }
        aafo aafoVar = this.s;
        apzg apzgVar2 = null;
        if ((aqlbVar.b & 128) != 0) {
            apzgVar = aqlbVar.m;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        aafoVar.c(apzgVar, actk.h(this.D, false));
        aafo aafoVar2 = this.s;
        aqlb aqlbVar2 = this.D;
        if ((aqlbVar2.b & 256) != 0 && (apzgVar2 = aqlbVar2.n) == null) {
            apzgVar2 = apzg.a;
        }
        aafoVar2.c(apzgVar2, actk.f(this.D));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        if (this.F != null) {
            zgd.u(this.p, new ecp(15), zgd.s(-1, -1), FrameLayout.LayoutParams.class);
            this.p.setX(0.0f);
            this.p.removeAllViews();
            this.F.qZ(ajsaVar);
            this.F = null;
        }
        this.m.setBackgroundColor(this.C);
    }
}

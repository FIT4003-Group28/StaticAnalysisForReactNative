package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.NativeAdBadgeRendererOuterClass;
/* compiled from: PG */
/* renamed from: mxg  reason: default package */
/* loaded from: classes3.dex */
public class mxg extends mxf {
    private final View A;
    private final View B;
    private final ImageView C;
    private final TextView D;
    private Integer E;
    private ViewGroup.MarginLayoutParams F;
    private Float G;
    protected final View x;
    protected final ImageView y;
    protected final ImageView z;

    /* JADX INFO: Access modifiers changed from: protected */
    public mxg(Context context, ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, boolean z, boolean z2, fjn fjnVar, akem akemVar) {
        super(context, ajmyVar, ajxzVar, ajycVar, view, view2, z, z2, fjnVar, akemVar);
        View findViewById = view2.findViewById(R.id.thumbnail_wrapper);
        this.x = findViewById;
        this.y = (ImageView) findViewById.findViewById(R.id.thumbnail);
        this.z = (ImageView) findViewById.findViewById(R.id.icon);
        View findViewById2 = view2.findViewById(R.id.overlay_badge_layout);
        this.A = findViewById2;
        View findViewById3 = findViewById2.findViewById(R.id.native_overlay_badge);
        this.B = findViewById3;
        this.C = (ImageView) findViewById3.findViewById(R.id.overlay_badge_icon);
        this.D = (TextView) findViewById3.findViewById(R.id.overlay_badge_text);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void u(View view, int i) {
        if (view != null && (view.getLayoutParams() instanceof GridLayout.LayoutParams)) {
            zgd.t(view, new zfw(GridLayout.spec(i)), GridLayout.LayoutParams.class);
        }
    }

    private final void v(avhn avhnVar, arhs arhsVar, atnm atnmVar, boolean z, arag aragVar) {
        if (avhnVar != null) {
            this.m.h(this.y, avhnVar);
        } else {
            ImageView imageView = this.y;
            imageView.setImageDrawable(akf.a(imageView.getContext(), z ? 2131232191 : 2131232192));
        }
        if (aragVar != null) {
            String valueOf = String.valueOf(this.y.getContentDescription());
            String str = ((arai) aragVar.c.get(0)).c;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
            sb.append(valueOf);
            sb.append(" ");
            sb.append(str);
            this.y.setContentDescription(sb.toString());
        }
        if (z) {
            q();
        } else {
            s();
        }
        if (arhsVar != null) {
            ImageView imageView2 = this.z;
            ajxz ajxzVar = this.n;
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView2.setImageResource(ajxzVar.a(b));
            this.z.setVisibility(0);
        } else {
            this.z.setVisibility(8);
        }
        zag.o(this.A, atnmVar != null);
        Spanned spanned = null;
        arag aragVar2 = null;
        if (atnmVar != null) {
            Drawable background = this.B.getBackground();
            if (background instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) background.getCurrent().mutate();
                int i = atnmVar.e;
                if (i != 0) {
                    gradientDrawable.setColor(i);
                } else {
                    gradientDrawable.setColor(this.B.getResources().getColor(R.color.native_thumbnail_badge_background_color));
                }
            }
            if ((1 & atnmVar.b) == 0) {
                this.C.setVisibility(8);
            } else {
                ImageView imageView3 = this.C;
                ajxz ajxzVar2 = this.n;
                arhs arhsVar2 = atnmVar.c;
                if (arhsVar2 == null) {
                    arhsVar2 = arhs.a;
                }
                arhr b2 = arhr.b(arhsVar2.c);
                if (b2 == null) {
                    b2 = arhr.UNKNOWN;
                }
                imageView3.setImageResource(ajxzVar2.a(b2));
                this.C.setVisibility(0);
            }
        } else {
            atnmVar = null;
        }
        TextView textView = this.D;
        if (atnmVar != null) {
            if ((atnmVar.b & 2) != 0 && (aragVar2 = atnmVar.d) == null) {
                aragVar2 = arag.a;
            }
            spanned = ajgl.b(aragVar2);
        }
        zag.m(textView, spanned);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(acti actiVar, Object obj, auik auikVar, auhp auhpVar, boolean z, boolean z2) {
        avhn avhnVar;
        super.p(actiVar, obj, auikVar, auhpVar, z2);
        arag aragVar = null;
        if ((auikVar.b & 1) != 0) {
            avhn avhnVar2 = auikVar.c;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            avhnVar = avhnVar2;
        } else {
            avhnVar = null;
        }
        aunb aunbVar = auikVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        atnm atnmVar = (atnm) ajjh.l(aunbVar, NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer);
        if (z && (aragVar = auikVar.f) == null) {
            aragVar = arag.a;
        }
        v(avhnVar, null, atnmVar, false, aragVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mxf
    public void b(acti actiVar, Object obj, auhs auhsVar, auht auhtVar, boolean z) {
        avhn avhnVar;
        atnm atnmVar;
        super.b(actiVar, obj, auhsVar, auhtVar, z);
        arag aragVar = null;
        if ((auhsVar.b & 4) != 0) {
            avhn avhnVar2 = auhsVar.d;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            avhnVar = avhnVar2;
        } else {
            avhnVar = null;
        }
        aunb aunbVar = auhsVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer)) {
            aunb aunbVar2 = auhsVar.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            atnmVar = (atnm) aunbVar2.qm(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer);
        } else {
            atnmVar = null;
        }
        if ((auhsVar.b & 1) != 0 && (aragVar = auhsVar.c) == null) {
            aragVar = arag.a;
        }
        v(avhnVar, null, atnmVar, false, aragVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mxf, defpackage.mxd
    public void c(acti actiVar, Object obj, auhs auhsVar) {
        avhn avhnVar;
        super.c(actiVar, obj, auhsVar);
        atnm atnmVar = null;
        if ((auhsVar.b & 4) != 0) {
            avhn avhnVar2 = auhsVar.d;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            avhnVar = avhnVar2;
        } else {
            avhnVar = null;
        }
        aunb aunbVar = auhsVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer)) {
            aunb aunbVar2 = auhsVar.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            atnmVar = (atnm) aunbVar2.qm(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer);
        }
        v(avhnVar, null, atnmVar, false, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mxf
    public void i(acti actiVar, Object obj, auiy auiyVar, atng atngVar) {
        avhn avhnVar;
        arhs arhsVar;
        super.i(actiVar, obj, auiyVar, atngVar);
        atnm atnmVar = null;
        if ((auiyVar.b & 1) != 0) {
            avhn avhnVar2 = auiyVar.c;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            avhnVar = avhnVar2;
        } else {
            avhnVar = null;
        }
        if ((auiyVar.b & 4) != 0) {
            arhs arhsVar2 = auiyVar.e;
            if (arhsVar2 == null) {
                arhsVar2 = arhs.a;
            }
            arhsVar = arhsVar2;
        } else {
            arhsVar = null;
        }
        aunb aunbVar = auiyVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer)) {
            aunb aunbVar2 = auiyVar.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            atnmVar = (atnm) aunbVar2.qm(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer);
        }
        v(avhnVar, arhsVar, atnmVar, auiyVar.u, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mxf
    public void k(acti actiVar, Object obj, auik auikVar, atng atngVar, Integer num) {
        avhn avhnVar;
        super.k(actiVar, obj, auikVar, atngVar, num);
        arhs arhsVar = null;
        if ((auikVar.b & 1) != 0) {
            avhn avhnVar2 = auikVar.c;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            avhnVar = avhnVar2;
        } else {
            avhnVar = null;
        }
        if ((auikVar.b & 4) != 0 && (arhsVar = auikVar.e) == null) {
            arhsVar = arhs.a;
        }
        arhs arhsVar2 = arhsVar;
        aunb aunbVar = auikVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        v(avhnVar, arhsVar2, (atnm) ajjh.l(aunbVar, NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer), auikVar.w, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mxf
    public void l(acti actiVar, Object obj, auil auilVar, atng atngVar, Integer num) {
        avhn avhnVar;
        arhs arhsVar;
        super.l(actiVar, obj, auilVar, atngVar, num);
        atnm atnmVar = null;
        if ((auilVar.b & 1) != 0) {
            avhn avhnVar2 = auilVar.c;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            avhnVar = avhnVar2;
        } else {
            avhnVar = null;
        }
        if ((auilVar.b & 8) != 0) {
            arhs arhsVar2 = auilVar.f;
            if (arhsVar2 == null) {
                arhsVar2 = arhs.a;
            }
            arhsVar = arhsVar2;
        } else {
            arhsVar = null;
        }
        aunb aunbVar = auilVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer)) {
            aunb aunbVar2 = auilVar.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            atnmVar = (atnm) aunbVar2.qm(NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer);
        }
        v(avhnVar, arhsVar, atnmVar, auilVar.z, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        View view = this.x;
        if (view instanceof FixedAspectRatioFrameLayout) {
            if (this.G != null) {
                return;
            }
            FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) view;
            this.G = Float.valueOf(fixedAspectRatioFrameLayout.a);
            fixedAspectRatioFrameLayout.a = 1.0f;
        } else if (this.E != null) {
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            this.E = Integer.valueOf(layoutParams.height);
            zgd.t(this.x, zgd.h(layoutParams.width + 18), ViewGroup.LayoutParams.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TextView textView = this.d;
        if (textView == null || (marginLayoutParams = this.F) == null) {
            return;
        }
        zgd.t(textView, zgd.b(zgd.i(marginLayoutParams.leftMargin), zgd.p(this.F.topMargin), zgd.o(this.F.rightMargin), zgd.e(this.F.bottomMargin)), ViewGroup.MarginLayoutParams.class);
        this.F = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s() {
        View view = this.x;
        if (!(view instanceof FixedAspectRatioFrameLayout)) {
            Integer num = this.E;
            if (num == null) {
                return;
            }
            zgd.t(view, zgd.h(num.intValue()), ViewGroup.LayoutParams.class);
            this.E = null;
            return;
        }
        Float f = this.G;
        if (f == null) {
            return;
        }
        ((FixedAspectRatioFrameLayout) view).a = f.floatValue();
        this.G = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(Integer num) {
        TextView textView = this.d;
        if (textView != null && (textView.getLayoutParams() instanceof GridLayout.LayoutParams)) {
            GridLayout.LayoutParams layoutParams = (GridLayout.LayoutParams) this.d.getLayoutParams();
            if (this.F == null) {
                this.F = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            zgd.t(this.d, zgd.b(zgd.i(layoutParams.leftMargin), zgd.p(layoutParams.topMargin), zgd.o(layoutParams.rightMargin), zgd.e(num.intValue())), ViewGroup.MarginLayoutParams.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public mxg(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, boolean z, fjn fjnVar, akem akemVar) {
        this(null, ajmyVar, ajxzVar, ajycVar, view, view2, z, false, fjnVar, akemVar);
    }
}

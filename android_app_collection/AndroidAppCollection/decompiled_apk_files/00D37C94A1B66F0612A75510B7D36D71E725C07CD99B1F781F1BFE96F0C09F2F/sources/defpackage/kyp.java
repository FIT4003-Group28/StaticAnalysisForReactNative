package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kyp  reason: default package */
/* loaded from: classes3.dex */
public final class kyp extends ajsl implements ajrm, lar {
    aupl a;
    private final ajmy b;
    private final CardView c;
    private final ImageView d;
    private final TextView e;
    private final View f;
    private final ImageView g;
    private final FixedAspectRatioFrameLayout h;
    private final ajrp i;
    private final Activity j;
    private final Resources k;
    private final SharedPreferences l;
    private final akem m;
    private ajrs n;
    private las o;

    public kyp(Activity activity, ajmy ajmyVar, aafo aafoVar, SharedPreferences sharedPreferences, akem akemVar, ViewGroup viewGroup) {
        this.b = ajmyVar;
        this.j = activity;
        this.k = activity.getResources();
        CardView cardView = (CardView) LayoutInflater.from(activity).inflate(R.layout.search_refinement_card, viewGroup, false);
        this.c = cardView;
        TextView textView = (TextView) cardView.findViewById(R.id.query);
        textView.getClass();
        this.e = textView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.thumbnail);
        imageView.getClass();
        this.d = imageView;
        this.i = new ajrp(aafoVar, cardView, this);
        this.f = cardView.findViewById(R.id.card_content_container);
        this.g = (ImageView) cardView.findViewById(R.id.card_content_outline);
        this.h = (FixedAspectRatioFrameLayout) cardView.findViewById(R.id.thumbnail_layout);
        this.l = sharedPreferences;
        this.m = akemVar;
    }

    private static int f(ajrs ajrsVar) {
        return ajrsVar.b("REFINEMENT_POSITION", -1);
    }

    private final void g() {
        this.f.setBackground(this.k.getDrawable(R.drawable.search_refinement_card_background));
        this.g.setImageDrawable(null);
        this.f.setPadding(0, 0, 0, 0);
        k(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_default_width));
        this.c.c(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_default_corner_radius));
        this.c.b(zhn.j(this.j, R.attr.ytBrandBackgroundSolid).orElse(0));
        this.h.a = this.k.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
        this.e.setLines(2);
        this.e.setTextSize(0, this.k.getDimensionPixelOffset(R.dimen.search_refinement_card_query_default_text_size));
        this.e.setGravity(8388611);
        n(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_default_horizontal_margin), this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_default_vertical_margin));
    }

    private final void k(int i) {
        zgd.t(this.f, zgd.r(i), RelativeLayout.LayoutParams.class);
    }

    private final void m(aupl auplVar) {
        int bo;
        int bo2;
        int bo3;
        aupn aupnVar = auplVar.f;
        if (aupnVar == null) {
            aupnVar = aupn.a;
        }
        if (aupnVar == null) {
            g();
        } else {
            int bo4 = awwc.bo(aupnVar.b);
            if (bo4 == 0) {
                bo4 = 1;
            }
            int i = bo4 - 1;
            if (i == 2) {
                this.f.setBackground(null);
                this.g.setImageDrawable(null);
                this.f.setPadding(0, 0, 0, 0);
                k(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_universal_watch_card_width));
                this.c.c(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_default_corner_radius));
                this.c.b(zhn.j(this.j, R.attr.ytGeneralBackgroundA).orElse(0));
                this.h.a = this.k.getFraction(R.fraction.aspect_ratio_square, 1, 1);
                this.e.setLines(2);
                this.e.setTextSize(0, this.k.getDimensionPixelOffset(R.dimen.search_refinement_card_query_default_text_size));
                this.e.setGravity(8388611);
                int dimensionPixelSize = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_margin);
                n(dimensionPixelSize, dimensionPixelSize);
            } else if (i == 3) {
                int orElse = zhn.j(this.j, R.attr.ytGeneralBackgroundA).orElse(0);
                this.f.setBackground(null);
                o(orElse);
                int dimensionPixelSize2 = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_container_padding);
                this.f.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                k(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_rectangular_width));
                this.c.c(this.k.getDimensionPixelOffset(R.dimen.search_refinement_card_rounded_corner_radius));
                this.c.b(orElse);
                this.h.a = this.k.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
                this.e.setLines(3);
                this.e.setTextSize(0, this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_text_size));
                this.e.setGravity(8388627);
                int dimensionPixelSize3 = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_margin);
                n(dimensionPixelSize3, dimensionPixelSize3);
            } else if (i == 4) {
                int orElse2 = zhn.j(this.j, R.attr.ytGeneralBackgroundA).orElse(0);
                this.f.setBackground(null);
                o(orElse2);
                int dimensionPixelSize4 = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_container_padding);
                this.f.setPadding(dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4);
                k(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_square_width));
                this.c.b(orElse2);
                this.c.c(this.k.getDimensionPixelOffset(R.dimen.search_refinement_card_rounded_corner_radius));
                this.h.a = this.k.getFraction(R.fraction.aspect_ratio_2_1, 1, 1);
                this.e.setLines(2);
                this.e.setTextSize(0, this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_text_size));
                this.e.setGravity(8388627);
                int dimensionPixelSize5 = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_margin);
                n(dimensionPixelSize5, dimensionPixelSize5);
            } else if (i == 5) {
                int orElse3 = zhn.j(this.j, R.attr.ytGeneralBackgroundA).orElse(0);
                this.f.setBackground(null);
                o(orElse3);
                int dimensionPixelSize6 = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_container_padding);
                this.f.setPadding(dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6);
                k(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_large_rectangular_width));
                this.c.c(this.k.getDimensionPixelOffset(R.dimen.search_refinement_card_rounded_corner_radius));
                this.c.b(orElse3);
                this.h.a = this.k.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
                this.e.setLines(2);
                this.e.setTextSize(0, this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_text_size));
                this.e.setGravity(8388627);
                int dimensionPixelSize7 = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_margin);
                n(dimensionPixelSize7, dimensionPixelSize7);
            } else {
                g();
            }
            akej a = akej.a(this.c.getContext());
            a.c((int) zew.h(this.j.getResources().getDisplayMetrics(), aec.g(this.c.e)));
            this.m.c(this.c, a.b());
        }
        if (p()) {
            aupn aupnVar2 = auplVar.f;
            if (aupnVar2 == null) {
                aupnVar2 = aupn.a;
            }
            if (aupnVar2 == null || (((bo = awwc.bo(aupnVar2.b)) == 0 || bo != 6) && (((bo2 = awwc.bo(aupnVar2.b)) == 0 || bo2 != 4) && ((bo3 = awwc.bo(aupnVar2.b)) == 0 || bo3 != 5)))) {
                int orElse4 = zhn.j(this.j, R.attr.ytGeneralBackgroundC).orElse(0);
                this.c.b(orElse4);
                this.e.setTextColor(zhn.j(this.j, R.attr.ytTextPrimary).orElse(0));
                if (this.g.getDrawable() != null) {
                    o(orElse4);
                }
            } else {
                int orElse5 = zhn.j(this.j, R.attr.ytCallToAction).orElse(0);
                this.c.b(orElse5);
                this.e.setTextColor(zhn.j(this.j, R.attr.ytFilledButtonText).orElse(0));
                if (this.g.getDrawable() != null) {
                    o(orElse5);
                }
            }
            this.e.setTypeface(null, 1);
            this.c.setSelected(true);
            this.c.setClickable(false);
            return;
        }
        this.e.setTextColor(zhn.j(this.j, R.attr.ytTextPrimary).orElse(0));
        this.e.setTypeface(null, 0);
        this.c.setSelected(false);
        this.c.setClickable(true);
    }

    private final void n(int i, int i2) {
        zgd.t(this.e, zgd.m(i, i2, i, i2), ViewGroup.MarginLayoutParams.class);
    }

    private final void o(int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.k.getDrawable(R.drawable.search_refinement_card_rounded_background);
        gradientDrawable.setStroke(zew.i(this.k.getDisplayMetrics(), 1), gy.e(gw.a(this.k, R.color.yt_separator_light, this.j.getTheme()), i));
        this.g.setImageDrawable(gradientDrawable);
    }

    private final boolean p() {
        las lasVar = this.o;
        return lasVar != null && lasVar.c == f(this.n);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        aupl auplVar = (aupl) obj;
        ajrp ajrpVar = this.i;
        acti actiVar = ajrsVar.a;
        arag aragVar = null;
        if ((auplVar.b & 4) != 0) {
            apzgVar = auplVar.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
        ajmy ajmyVar = this.b;
        ImageView imageView = this.d;
        avhn avhnVar = auplVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.e;
        if ((auplVar.b & 2) != 0 && (aragVar = auplVar.d) == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        las lasVar = (las) ajrsVar.c("REFINEMENT_SELECTION_CONTROLLER");
        this.o = lasVar;
        if (lasVar != null) {
            lasVar.a.put(pns.h(auplVar), this);
        }
        this.n = ajrsVar;
        this.a = auplVar;
        m(auplVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aupl) obj).g.I();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        if (r1.c != false) goto L22;
     */
    @Override // defpackage.ajrm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(android.view.View r6) {
        /*
            r5 = this;
            ajrs r6 = r5.n
            r0 = 0
            if (r6 != 0) goto L6
            return r0
        L6:
            boolean r6 = r5.p()
            r1 = 1
            if (r6 == 0) goto Le
            return r1
        Le:
            ajrs r6 = r5.n
            java.lang.String r2 = "HORIZONTAL_CARD_LIST"
            java.lang.Object r6 = r6.c(r2)
            argv r6 = (defpackage.argv) r6
            ajrs r3 = r5.n
            int r3 = f(r3)
            if (r6 == 0) goto L4f
            boolean r4 = defpackage.pns.i(r6)
            if (r4 != 0) goto L27
            goto L4f
        L27:
            ajrs r6 = r5.n
            java.lang.String r2 = "REFINEMENT_SELECTION_LISTENER"
            java.lang.Object r6 = r6.c(r2)
            lar r6 = (defpackage.lar) r6
            aupl r2 = r5.a
            if (r2 == 0) goto L3a
            if (r6 == 0) goto L3a
            r6.j(r2, r3)
        L3a:
            androidx.cardview.widget.CardView r6 = r5.c
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r6.getWidth()
            androidx.cardview.widget.CardView r4 = r5.c
            int r4 = r4.getHeight()
            r2.<init>(r0, r0, r3, r4)
            r6.requestRectangleOnScreen(r2)
            return r1
        L4f:
            android.content.SharedPreferences r1 = r5.l
            if (r1 == 0) goto L5c
            java.lang.String r4 = "force_enable_sticky_browsy_bars"
            boolean r1 = r1.getBoolean(r4, r0)
            if (r1 == 0) goto L5c
            goto L7c
        L5c:
            aupl r1 = r5.a
            apzg r1 = r1.e
            if (r1 != 0) goto L64
            apzg r1 = defpackage.apzg.a
        L64:
            aopg r4 = com.google.protos.youtube.api.innertube.SearchEndpointOuterClass.searchEndpoint
            java.lang.Object r1 = r1.qm(r4)
            auoy r1 = (defpackage.auoy) r1
            aupb r1 = r1.e
            if (r1 != 0) goto L72
            aupb r1 = defpackage.aupb.a
        L72:
            aupa r1 = r1.c
            if (r1 != 0) goto L78
            aupa r1 = defpackage.aupa.a
        L78:
            boolean r1 = r1.c
            if (r1 == 0) goto L8c
        L7c:
            r1 = -1
            if (r3 == r1) goto L8c
            argv r6 = defpackage.pns.g(r6, r3)
            ajrs r1 = r5.n
            java.util.Map r1 = r1.e()
            r1.put(r2, r6)
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyp.h(android.view.View):boolean");
    }

    @Override // defpackage.lar
    public final void j(aupl auplVar, int i) {
        m(auplVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.i.c();
    }
}

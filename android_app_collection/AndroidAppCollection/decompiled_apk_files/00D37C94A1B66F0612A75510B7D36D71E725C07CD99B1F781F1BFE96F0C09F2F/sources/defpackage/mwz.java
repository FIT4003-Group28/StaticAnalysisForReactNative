package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mwz  reason: default package */
/* loaded from: classes3.dex */
public final class mwz {
    protected final View a;
    protected final View b;
    protected final ImageView c;
    protected final ImageView d;
    protected final View e;
    protected final View f;
    protected final View g;
    protected final View h;
    protected final TextView i;
    protected final View j;
    protected final fjm k;
    protected final GradientDrawable l;
    public Integer m;
    private final ajxz n;
    private final TextView o;
    private final TextView p;
    private final View q;
    private final View r;
    private final ImageView s;
    private final TextView t;
    private final TextView u;
    private boolean v;
    private boolean w;

    public mwz(ajxz ajxzVar, View view, fjn fjnVar) {
        this.n = ajxzVar;
        view.getClass();
        this.a = view;
        View findViewById = view.findViewById(R.id.thumbnail_wrapper);
        this.b = findViewById;
        this.c = (ImageView) findViewById.findViewById(R.id.thumbnail);
        this.d = (ImageView) findViewById.findViewById(R.id.icon);
        this.p = (TextView) view.findViewById(R.id.title);
        this.o = (TextView) view.findViewById(R.id.description);
        this.q = view.findViewById(R.id.overlay_badge_layout);
        View findViewById2 = view.findViewById(R.id.cta_button_wrapper);
        this.e = findViewById2;
        this.f = findViewById2.findViewById(R.id.cta_button_start_filler);
        this.g = findViewById2.findViewById(R.id.cta_button_touchable_wrapper);
        this.h = findViewById2.findViewById(R.id.cta_button_end_filler);
        this.i = (TextView) findViewById2.findViewById(R.id.cta_button);
        View findViewById3 = findViewById2.findViewById(R.id.ad_cta_button);
        this.j = findViewById3;
        View findViewById4 = view.findViewById(R.id.one_point_five_click_overlay);
        this.r = findViewById4;
        this.s = (ImageView) findViewById4.findViewById(R.id.one_point_five_click_overlay_icon);
        this.t = (TextView) findViewById4.findViewById(R.id.one_point_five_click_overlay_text);
        this.u = (TextView) findViewById4.findViewById(R.id.one_point_five_click_overlay_text_secondary);
        if (findViewById3 != null) {
            this.k = fjnVar.a(null, findViewById3);
        } else {
            this.k = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.l = gradientDrawable;
        gradientDrawable.setShape(0);
    }

    private static final void c(TextView textView, int i) {
        if (TextUtils.isEmpty(textView.getText())) {
            textView.setVisibility(8);
        } else if (i > 0) {
            textView.setMaxLines(i);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    public final void a() {
        boolean z = true;
        this.v = this.p.getVisibility() == 0;
        if (this.o.getVisibility() != 0) {
            z = false;
        }
        this.w = z;
    }

    public final void b(arhs arhsVar, arhs arhsVar2, Spanned spanned, Spanned spanned2, aoyl aoylVar, auij auijVar, auhy auhyVar, boolean z, boolean z2) {
        View view;
        View view2;
        View view3;
        View view4;
        zag.o(this.p, this.v);
        zag.o(this.o, this.w);
        int i = 0;
        boolean z3 = z && !(arhsVar2 == null && spanned == null && spanned2 == null);
        if (arhsVar == null || z3) {
            this.d.setVisibility(8);
        } else {
            ImageView imageView = this.d;
            ajxz ajxzVar = this.n;
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView.setImageResource(ajxzVar.a(b));
            this.d.setVisibility(0);
        }
        zag.o(this.q, !z3);
        this.r.setVisibility(true != z3 ? 8 : 0);
        if (z) {
            if (arhsVar2 != null) {
                ImageView imageView2 = this.s;
                ajxz ajxzVar2 = this.n;
                arhr b2 = arhr.b(arhsVar2.c);
                if (b2 == null) {
                    b2 = arhr.UNKNOWN;
                }
                imageView2.setImageResource(ajxzVar2.a(b2));
                this.s.setVisibility(0);
            } else {
                this.s.setVisibility(8);
            }
            zag.m(this.t, spanned);
            zag.m(this.u, spanned2);
        }
        if (aoylVar == null || this.j == null || this.k == null || !z) {
            view = null;
        } else {
            this.e.setVisibility(0);
            this.i.setVisibility(8);
            this.j.setVisibility(0);
            View view5 = this.j;
            this.k.c(aoylVar);
            view = view5;
        }
        if (this.e.getVisibility() == 0 && (view2 = this.f) != null && (view3 = this.g) != null && (view4 = this.h) != null && view != null) {
            mxg.o(this.e, view2, view3, view4, view, auijVar);
        }
        if (z) {
            if (auhyVar != null) {
                this.l.setColor(auhyVar.b);
                zag.k(this.a, this.l);
            } else {
                zag.k(this.a, null);
            }
        }
        if (z2) {
            this.c.setScaleType(ImageView.ScaleType.CENTER_CROP);
            c(this.p, 2);
            int i2 = true != z ? 0 : 3;
            TextView textView = this.o;
            if (TextUtils.isEmpty(textView.getText())) {
                textView.setVisibility(8);
                return;
            }
            int measuredHeight = textView.getVisibility() != 8 ? textView.getMeasuredHeight() : 0;
            if (i2 > 0) {
                textView.setMaxLines(3);
                textView.measure(0, 0);
            }
            int measuredHeight2 = (i2 > 0 ? textView.getMeasuredHeight() : 0) - measuredHeight;
            textView.getLayoutParams().height = measuredHeight;
            textView.setVisibility(0);
            mwy mwyVar = new mwy(textView, measuredHeight2, measuredHeight, i2);
            mwyVar.setDuration((int) ((Math.abs(measuredHeight2) / textView.getContext().getResources().getDisplayMetrics().density) * 5.0f));
            textView.startAnimation(mwyVar);
            return;
        }
        this.c.setScaleType(z ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER_CROP);
        Integer num = this.m;
        if (num != null) {
            i = num.intValue();
        } else if (true == z) {
            i = 3;
        }
        c(this.p, 2);
        c(this.o, i);
    }
}

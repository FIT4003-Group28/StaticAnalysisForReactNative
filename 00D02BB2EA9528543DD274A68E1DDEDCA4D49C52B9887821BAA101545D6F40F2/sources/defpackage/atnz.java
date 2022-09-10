package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gmm.base.views.squeezedlabel.SqueezedLabelView;
import com.google.android.apps.maps.R;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: atnz  reason: default package */
/* loaded from: classes2.dex */
public final class atnz extends LinearLayout implements amfq {
    private final SqueezedLabelView a;
    private final SqueezedLabelView b;
    private amuo c;
    private atln d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private float k;
    private boolean l;
    private int m;
    private float n;
    private float o;
    private float p;
    private atll q;
    private atny r;

    public atnz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = atny.SHOW_ALWAYS;
        LayoutInflater.from(context).inflate(R.layout.navigation_stepcueview_internal, (ViewGroup) this, true);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        SqueezedLabelView squeezedLabelView = (SqueezedLabelView) findViewById(R.id.navigation_stepcuefirstline_textbox);
        this.a = squeezedLabelView;
        SqueezedLabelView squeezedLabelView2 = (SqueezedLabelView) findViewById(R.id.navigation_stepcuesecondline_textbox);
        this.b = squeezedLabelView2;
        squeezedLabelView.setMaxLines(2);
        squeezedLabelView2.setSingleLine();
        squeezedLabelView.setLayoutDirection(3);
        squeezedLabelView2.setLayoutDirection(3);
        this.e = true;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        return new cqmh(atnz.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> c(@dzsi atoa atoaVar) {
        return cqjv.i(atnl.STEP_CUE, atoaVar, atnk.a);
    }

    public static <T extends cqkp> cqnf<T> d(cqlc<T, atoa> cqlcVar) {
        return cqjv.g(atnl.STEP_CUE, cqlcVar, atnk.a);
    }

    public static <T extends cqkp> cqnf<T> e(atob atobVar) {
        return cqjv.i(atnl.STEP_CUE_VIEW_STYLE, atobVar, atnk.a);
    }

    public static <T extends cqkp> cqnf<T> f(Boolean bool) {
        return cqjv.i(atnl.ALLOW_TWO_LINES, bool, atnk.a);
    }

    public static <T extends cqkp> cqnf<T> g(@dzsi cqss cqssVar) {
        return cqjv.i(atnl.TEXT_COLOR, cqssVar, atnk.a);
    }

    public static <T extends cqkp> cqnf<T> h(@dzsi cqjb<T, cqss> cqjbVar) {
        return cqjv.e(atnl.TEXT_COLOR, cqjbVar, atnk.a);
    }

    public static <T extends cqkp> cqnf<T> i(Boolean bool) {
        return cqjv.i(atnl.INCLUDE_FONT_PADDING, bool, atnk.a);
    }

    private final void k() {
        int i = 1;
        if (this.f) {
            i = 3;
        } else if (true != this.e) {
            i = 2;
        }
        this.q = atln.g(getContext(), this.c, i);
    }

    private final void l() {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
    }

    private final void m() {
        setBaselineAlignedChildIndex(0);
        this.a.setVisibility(0);
        this.b.setVisibility(8);
    }

    private final void n() {
        setBaselineAlignedChildIndex(1);
        this.a.setVisibility(0);
        this.b.setVisibility(0);
    }

    private final List<CharSequence> o(SqueezedLabelView squeezedLabelView, float f, int i, int i2, Collection<amup> collection, int i3, boolean z) {
        TextPaint textPaint = new TextPaint(squeezedLabelView.getPaint());
        textPaint.setTextScaleX(1.0f);
        textPaint.setTextSize(f);
        atli atliVar = new atli(getContext(), collection.size(), i, i2, z, textPaint, this.l, this.m, this.n, this.o, this.p, 0, null, null);
        this.d.d(collection, i3, true, this, atliVar);
        return atliVar.k();
    }

    private static void p(SqueezedLabelView squeezedLabelView, CharSequence charSequence, float f) {
        squeezedLabelView.setText(charSequence);
        squeezedLabelView.setDesiredTextSize(f);
    }

    private final void q(View view, boolean z) {
        cjxu.b(view, z ? this.j : 0);
    }

    @Override // defpackage.amfq
    public final void a(amfu amfuVar) {
        if (amfuVar.a()) {
            post(new atnx(this));
        }
    }

    public final void j() {
        int width;
        int i;
        atll atllVar = this.q;
        boolean z = atllVar != null && atllVar.b.isEmpty();
        if (this.c == null || atllVar == null || (!z ? this.r == atny.SHOW_IF_NO_SECONDARY_CUES_PRESENT : this.r == atny.SHOW_IF_SECONDARY_CUES_PRESENT)) {
            l();
        } else if (this.q.a.isEmpty()) {
            m();
            this.a.setDesiredTextSize(this.e ? this.g : this.h);
            CharSequence charSequence = this.c.p;
            if (this.l) {
                bvsv a = new bvsx(getResources()).a(charSequence);
                a.i();
                charSequence = a.c();
            }
            this.a.setText(charSequence);
            q(this.a, true);
        } else if (this.q.b.isEmpty()) {
            if (!this.e || this.q.a.size() != 1) {
                width = (int) ((getWidth() - this.j) * this.k);
                q(this.a, true);
                i = this.h;
            } else {
                width = (int) (getWidth() * this.k);
                q(this.a, false);
                i = this.g;
            }
            float f = i;
            int i2 = width;
            SqueezedLabelView squeezedLabelView = this.a;
            int i3 = true != this.e ? 1 : 2;
            atll atllVar2 = this.q;
            List<CharSequence> o = o(squeezedLabelView, f, i3, i2, atllVar2.a, atllVar2.c, true);
            int size = o.size();
            if (size == 0) {
                l();
            } else if (size == 1) {
                p(this.a, o.get(0), f);
                m();
            } else if (size == 2) {
                p(this.a, o.get(0), f);
                p(this.b, o.get(1), f);
                n();
            }
        } else if (this.e) {
            int width2 = getWidth();
            float f2 = this.k;
            int width3 = getWidth();
            int i4 = this.j;
            float f3 = this.k;
            SqueezedLabelView squeezedLabelView2 = this.a;
            int i5 = this.g;
            atll atllVar3 = this.q;
            CharSequence charSequence2 = (CharSequence) dcft.r(o(squeezedLabelView2, i5, 1, (int) (width2 * f2), atllVar3.a, atllVar3.c, true), "");
            SqueezedLabelView squeezedLabelView3 = this.b;
            int i6 = this.i;
            atll atllVar4 = this.q;
            Collection<amup> collection = atllVar4.b;
            int i7 = atllVar4.d;
            p(this.a, charSequence2, this.g);
            p(this.b, (CharSequence) dcft.r(o(squeezedLabelView3, i6, 1, (int) ((width3 - i4) * f3), collection, i7, true), ""), this.i);
            n();
            q(this.a, false);
            q(this.b, true);
        } else {
            int width4 = getWidth();
            float f4 = this.k;
            int width5 = getWidth();
            int i8 = this.j;
            float f5 = this.k;
            SqueezedLabelView squeezedLabelView4 = this.a;
            int i9 = this.h;
            atll atllVar5 = this.q;
            CharSequence charSequence3 = (CharSequence) dcft.r(o(squeezedLabelView4, i9, 1, (int) ((width4 / 2) * f4), atllVar5.a, atllVar5.c, false), "");
            SqueezedLabelView squeezedLabelView5 = this.a;
            int i10 = this.h;
            atll atllVar6 = this.q;
            p(this.a, TextUtils.concat(charSequence3, " ", (CharSequence) dcft.r(o(squeezedLabelView5, i10, 1, (int) (((width5 / 2) - i8) * f5), atllVar6.b, atllVar6.d, true), "")), this.h);
            m();
            q(this.a, true);
        }
        if (!this.e || this.b.getVisibility() != 8) {
            this.a.setMaxLines(1);
        } else {
            this.a.setMaxLines(2);
        }
        this.a.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            j();
        }
    }

    public void setAllowTwoLines(boolean z) {
        this.e = z;
        k();
        j();
    }

    public void setFirstRowTextSize(@dzsi cqtv cqtvVar) {
        if (cqtvVar != null) {
            int e = cqtvVar.e(getContext());
            this.g = e;
            if (this.h > e) {
                this.h = e;
            }
            SqueezedLabelView squeezedLabelView = this.a;
            float f = e;
            if (squeezedLabelView.a > f) {
                squeezedLabelView.setMinTextSize(f);
            }
            SqueezedLabelView squeezedLabelView2 = this.b;
            float f2 = squeezedLabelView2.a;
            float f3 = this.g;
            if (f2 <= f3) {
                return;
            }
            squeezedLabelView2.setMinTextSize(f3);
        }
    }

    public void setIncludeFontPadding(Boolean bool) {
        this.a.setIncludeFontPadding(bool.booleanValue());
        this.b.setIncludeFontPadding(bool.booleanValue());
    }

    public void setSecondRowTextSize(@dzsi cqtv cqtvVar) {
        if (cqtvVar != null) {
            this.i = cqtvVar.e(getContext());
            k();
            j();
        }
    }

    public void setSecondaryTextColor(@dzsi ColorStateList colorStateList) {
        ColorStateList valueOf = ColorStateList.valueOf(0);
        if (colorStateList == null || colorStateList.equals(valueOf)) {
            return;
        }
        this.m = colorStateList.getDefaultColor();
    }

    public void setShowSingleCue(boolean z) {
        this.f = z;
        k();
        j();
    }

    public void setStepCueShowingPolicy(atny atnyVar) {
        this.r = atnyVar;
        k();
        j();
    }

    public void setStyle(atob atobVar) {
        int e = atobVar.a.e(getContext());
        int e2 = atobVar.b.e(getContext());
        int e3 = atobVar.c.e(getContext());
        int e4 = atobVar.d.e(getContext());
        int NR = atobVar.e.NR(getContext());
        float f = atobVar.f;
        boolean z = atobVar.g;
        int b = atobVar.h.b(getContext());
        float f2 = atobVar.i;
        float f3 = atobVar.j;
        float f4 = atobVar.k;
        Typeface typeface = atobVar.l;
        int i = atobVar.m;
        int e5 = atobVar.n.e(getContext());
        this.g = e;
        this.h = e2;
        float f5 = e3;
        this.a.setMinTextSize(f5);
        this.b.setMinTextSize(f5);
        this.i = e4;
        this.j = NR;
        this.k = f;
        float f6 = 1.0f / f;
        this.a.setMinScaleX(f6);
        this.b.setMinScaleX(f6);
        this.l = z;
        this.m = b;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.a.setTypeface(typeface);
        this.b.setTypeface(typeface);
        this.a.setTextAlignment(5);
        this.b.setTextAlignment(5);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        marginLayoutParams.topMargin = e5;
        this.b.setLayoutParams(marginLayoutParams);
        j();
    }

    public void setTextColor(@dzsi ColorStateList colorStateList) {
        ColorStateList valueOf = ColorStateList.valueOf(0);
        if (colorStateList == null || colorStateList.equals(valueOf)) {
            return;
        }
        this.a.setTextColor(colorStateList);
        this.b.setTextColor(colorStateList);
    }

    public void setTypeface(Typeface typeface) {
        this.a.setTypeface(typeface);
        this.b.setTypeface(typeface);
    }

    public void setProperties(@dzsi atoa atoaVar) {
        if (atoaVar == null) {
            this.c = null;
        } else {
            this.c = atoaVar.a;
            this.d = atoaVar.b;
        }
        k();
        j();
    }
}

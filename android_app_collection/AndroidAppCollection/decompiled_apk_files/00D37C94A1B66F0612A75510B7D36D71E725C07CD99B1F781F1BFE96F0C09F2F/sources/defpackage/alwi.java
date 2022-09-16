package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.template.FooterActionButton;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: alwi  reason: default package */
/* loaded from: classes.dex */
public final class alwi implements alwk {
    final boolean a;
    final boolean b;
    final boolean c;
    LinearLayout d;
    public alwj e;
    public alwj f;
    ColorStateList g;
    ColorStateList h;
    int i;
    int j;
    final int k;
    public final alwd l;
    private final Context m;
    private final ViewStub n;
    private int o;
    private int p;
    private int q;
    private int r;
    private final int s;
    private final int t;

    static {
        new AtomicInteger(1);
    }

    public alwi(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.g = null;
        this.h = null;
        alwd alwdVar = new alwd();
        this.l = alwdVar;
        Context context = templateLayout.getContext();
        this.m = context;
        this.n = (ViewStub) templateLayout.findViewById(R.id.suc_layout_footer);
        alvm alvmVar = (alvm) templateLayout;
        this.a = alvmVar.f();
        this.b = alvmVar.e();
        this.c = alvmVar.g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alvn.a, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        this.k = dimensionPixelSize;
        this.q = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        this.r = obtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize);
        this.i = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int color = obtainStyledAttributes.getColor(12, 0);
        this.s = color;
        int color2 = obtainStyledAttributes.getColor(14, 0);
        this.t = color2;
        int resourceId = obtainStyledAttributes.getResourceId(13, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(15, 0);
        obtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            alwj d = alwb.d(resourceId2, context);
            apwt.m("setSecondaryButton");
            h();
            alvq alvqVar = new alvq(d);
            alvqVar.m = g(d, 2132083468, alwe.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR);
            alvqVar.a = alwe.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR;
            alvqVar.b = alwe.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA;
            alvqVar.c = alwe.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR;
            alvqVar.d = i(d.a);
            alvqVar.k = alwe.CONFIG_FOOTER_BUTTON_RADIUS;
            alvqVar.l = alwe.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA;
            alvqVar.e = alwe.CONFIG_FOOTER_SECONDARY_BUTTON_TEXT_COLOR;
            alvqVar.f = alwe.CONFIG_FOOTER_SECONDARY_BUTTON_MARGIN_START;
            alvqVar.g = alwe.CONFIG_FOOTER_BUTTON_TEXT_SIZE;
            alvqVar.h = alwe.CONFIG_FOOTER_BUTTON_MIN_HEIGHT;
            alvqVar.i = alwe.CONFIG_FOOTER_BUTTON_FONT_FAMILY;
            alvqVar.j = alwe.CONFIG_FOOTER_BUTTON_TEXT_STYLE;
            alvr a = alvqVar.a();
            FooterActionButton j = j(d, a);
            this.p = j.getId();
            this.h = j.getTextColors();
            this.f = d;
            c(j, color2);
            k(j, a);
            d();
            alwdVar.b(true, true);
        }
        if (resourceId != 0) {
            alwj d2 = alwb.d(resourceId, context);
            apwt.m("setPrimaryButton");
            h();
            alvq alvqVar2 = new alvq(d2);
            alvqVar2.m = g(d2, 2132083467, alwe.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR);
            alvqVar2.a = alwe.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR;
            alvqVar2.b = alwe.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA;
            alvqVar2.c = alwe.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR;
            alvqVar2.d = i(d2.a);
            alvqVar2.k = alwe.CONFIG_FOOTER_BUTTON_RADIUS;
            alvqVar2.l = alwe.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA;
            alvqVar2.e = alwe.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR;
            alvqVar2.f = alwe.CONFIG_FOOTER_PRIMARY_BUTTON_MARGIN_START;
            alvqVar2.g = alwe.CONFIG_FOOTER_BUTTON_TEXT_SIZE;
            alvqVar2.h = alwe.CONFIG_FOOTER_BUTTON_MIN_HEIGHT;
            alvqVar2.i = alwe.CONFIG_FOOTER_BUTTON_FONT_FAMILY;
            alvqVar2.j = alwe.CONFIG_FOOTER_BUTTON_TEXT_STYLE;
            alvr a2 = alvqVar2.a();
            FooterActionButton j2 = j(d2, a2);
            this.o = j2.getId();
            this.g = j2.getTextColors();
            this.e = d2;
            c(j2, color);
            k(j2, a2);
            d();
            alwdVar.c(true, true);
        }
    }

    private final int g(alwj alwjVar, int i, alwe alweVar) {
        int i2 = alwjVar.c;
        if (i2 != 0 && !this.a) {
            i = i2;
        }
        if (this.a) {
            int c = alwg.f(this.m).c(this.m, alweVar);
            if (c == 0) {
                return 2132083468;
            }
            if (c != 0) {
                return 2132083467;
            }
            return i;
        }
        return i;
    }

    private final LinearLayout h() {
        int a;
        if (this.d == null) {
            if (this.n != null) {
                this.n.setLayoutInflater(LayoutInflater.from(new ContextThemeWrapper(this.m, 2132083470)));
                this.n.setLayoutResource(R.layout.suc_footer_button_bar);
                LinearLayout linearLayout = (LinearLayout) this.n.inflate();
                this.d = linearLayout;
                if (linearLayout != null) {
                    linearLayout.setId(View.generateViewId());
                    linearLayout.setPadding(this.i, this.q, this.j, this.r);
                    if (l(linearLayout.getContext())) {
                        linearLayout.setGravity(8388629);
                    }
                }
                LinearLayout linearLayout2 = this.d;
                if (linearLayout2 != null && this.a) {
                    if (!this.c) {
                        linearLayout2.setBackgroundColor(alwg.f(this.m).c(this.m, alwe.CONFIG_FOOTER_BAR_BG_COLOR));
                    }
                    if (alwg.f(this.m).l(alwe.CONFIG_FOOTER_BUTTON_PADDING_TOP)) {
                        this.q = (int) alwg.f(this.m).a(this.m, alwe.CONFIG_FOOTER_BUTTON_PADDING_TOP);
                    }
                    if (alwg.f(this.m).l(alwe.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM)) {
                        this.r = (int) alwg.f(this.m).a(this.m, alwe.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM);
                    }
                    if (alwg.f(this.m).l(alwe.CONFIG_FOOTER_BAR_PADDING_START)) {
                        this.i = (int) alwg.f(this.m).a(this.m, alwe.CONFIG_FOOTER_BAR_PADDING_START);
                    }
                    if (alwg.f(this.m).l(alwe.CONFIG_FOOTER_BAR_PADDING_END)) {
                        this.j = (int) alwg.f(this.m).a(this.m, alwe.CONFIG_FOOTER_BAR_PADDING_END);
                    }
                    linearLayout2.setPadding(this.i, this.q, this.j, this.r);
                    if (alwg.f(this.m).l(alwe.CONFIG_FOOTER_BAR_MIN_HEIGHT) && (a = (int) alwg.f(this.m).a(this.m, alwe.CONFIG_FOOTER_BAR_MIN_HEIGHT)) > 0) {
                        linearLayout2.setMinimumHeight(a);
                    }
                }
            } else {
                throw new IllegalStateException("Footer stub is not found in this template");
            }
        }
        return this.d;
    }

    private static alwe i(int i) {
        switch (i) {
            case 1:
                return alwe.CONFIG_FOOTER_BUTTON_ICON_ADD_ANOTHER;
            case 2:
                return alwe.CONFIG_FOOTER_BUTTON_ICON_CANCEL;
            case 3:
                return alwe.CONFIG_FOOTER_BUTTON_ICON_CLEAR;
            case 4:
                return alwe.CONFIG_FOOTER_BUTTON_ICON_DONE;
            case 5:
                return alwe.CONFIG_FOOTER_BUTTON_ICON_NEXT;
            case 6:
                return alwe.CONFIG_FOOTER_BUTTON_ICON_OPT_IN;
            case 7:
                return alwe.CONFIG_FOOTER_BUTTON_ICON_SKIP;
            case 8:
                return alwe.CONFIG_FOOTER_BUTTON_ICON_STOP;
            default:
                return null;
        }
    }

    private final FooterActionButton j(alwj alwjVar, alvr alvrVar) {
        FooterActionButton footerActionButton = (FooterActionButton) LayoutInflater.from(new ContextThemeWrapper(this.m, alvrVar.m)).inflate(R.layout.suc_button, (ViewGroup) null, false);
        footerActionButton.setId(View.generateViewId());
        footerActionButton.setText(alwjVar.b);
        footerActionButton.setOnClickListener(alwjVar);
        footerActionButton.setVisibility(0);
        footerActionButton.setEnabled(true);
        footerActionButton.a = alwjVar;
        footerActionButton.getId();
        return footerActionButton;
    }

    private final void k(Button button, alvr alvrVar) {
        int c;
        RippleDrawable rippleDrawable;
        GradientDrawable gradientDrawable;
        if (!this.a) {
            return;
        }
        Context context = this.m;
        boolean z = this.b;
        int id = button.getId();
        int i = this.o;
        if (!z) {
            if (button.isEnabled()) {
                alwb.c(context, button, alvrVar.e);
            }
            alwe alweVar = alvrVar.a;
            alwe alweVar2 = alvrVar.b;
            alwe alweVar3 = alvrVar.c;
            apwt.l(Build.VERSION.SDK_INT >= 29, "Update button background only support on sdk Q or higher");
            int c2 = alwg.f(context).c(context, alweVar);
            float o = alwg.f(context).o(context, alweVar2);
            int c3 = alwg.f(context).c(context, alweVar3);
            int[] iArr = {-16842910};
            int[] iArr2 = new int[0];
            if (c2 != 0) {
                if (o <= 0.0f) {
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16842803});
                    float f = obtainStyledAttributes.getFloat(0, 0.26f);
                    obtainStyledAttributes.recycle();
                    o = f;
                }
                if (c3 == 0) {
                    c3 = c2;
                }
                ColorStateList colorStateList = new ColorStateList(new int[][]{iArr, iArr2}, new int[]{alwb.b(c3, o), c2});
                button.getBackground().mutate().setState(new int[0]);
                button.refreshDrawableState();
                button.setBackgroundTintList(colorStateList);
            }
        }
        alwe alweVar4 = alvrVar.e;
        alwe alweVar5 = alvrVar.l;
        if (z) {
            c = button.getTextColors().getDefaultColor();
        } else {
            c = alwg.f(context).c(context, alweVar4);
        }
        float o2 = alwg.f(context).o(context, alweVar5);
        Drawable background = button.getBackground();
        if (background instanceof InsetDrawable) {
            rippleDrawable = (RippleDrawable) ((InsetDrawable) background).getDrawable();
        } else {
            rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
        }
        if (rippleDrawable != null) {
            rippleDrawable.setColor(new ColorStateList(new int[][]{new int[]{16842919}, StateSet.NOTHING}, new int[]{alwb.b(c, o2), 0}));
        }
        alwe alweVar6 = alvrVar.f;
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        if (alwg.f(context).l(alweVar6) && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int) alwg.f(context).a(context, alweVar6), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        float a = alwg.f(context).a(context, alvrVar.g);
        if (a > 0.0f) {
            button.setTextSize(0, a);
        }
        alwe alweVar7 = alvrVar.h;
        if (alwg.f(context).l(alweVar7)) {
            float a2 = alwg.f(context).a(context, alweVar7);
            if (a2 > 0.0f) {
                button.setMinHeight((int) a2);
            }
        }
        alwe alweVar8 = alvrVar.i;
        alwe alweVar9 = alvrVar.j;
        Typeface create = Typeface.create(alwg.f(context).h(context, alweVar8), alwg.f(context).l(alweVar9) ? alwg.f(context).p(context, alweVar9) : 0);
        if (create != null) {
            button.setTypeface(create);
        }
        alwe alweVar10 = alvrVar.k;
        if (Build.VERSION.SDK_INT >= 24) {
            float a3 = alwg.f(context).a(context, alweVar10);
            Drawable background2 = button.getBackground();
            if (background2 instanceof InsetDrawable) {
                gradientDrawable = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) background2).getDrawable()).getDrawable(0);
            } else if (background2 instanceof RippleDrawable) {
                RippleDrawable rippleDrawable2 = (RippleDrawable) background2;
                if (rippleDrawable2.getDrawable(0) instanceof GradientDrawable) {
                    gradientDrawable = (GradientDrawable) rippleDrawable2.getDrawable(0);
                } else {
                    gradientDrawable = (GradientDrawable) ((InsetDrawable) rippleDrawable2.getDrawable(0)).getDrawable();
                }
            } else {
                gradientDrawable = null;
            }
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(a3);
            }
        }
        alwe alweVar11 = alvrVar.d;
        if (button != null) {
            Drawable d = alweVar11 != null ? alwg.f(context).d(context, alweVar11) : null;
            if (d != null) {
                d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
            }
            Drawable drawable = id != i ? null : d;
            if (id == i) {
                d = null;
            }
            button.setCompoundDrawablesRelative(d, null, drawable, null);
        }
        if (this.b) {
            return;
        }
        alwe alweVar12 = alvrVar.e;
        if (button.isEnabled()) {
            alwb.c(this.m, button, alweVar12);
        } else {
            button.setTextColor(this.o != button.getId() ? this.h : this.g);
        }
    }

    private static final boolean l(Context context) {
        if (alwg.f(context).l(alwe.CONFIG_FOOTER_BUTTON_ALIGNED_END)) {
            return alwg.f(context).j(context, alwe.CONFIG_FOOTER_BUTTON_ALIGNED_END, false);
        }
        return false;
    }

    public final Button a() {
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.o);
    }

    public final Button b() {
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.p);
    }

    protected final void c(Button button, int i) {
        if (i != 0) {
            button.getBackground().mutate().setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
        this.d.addView(button);
        Button a = a();
        Button b = b();
        boolean z = true;
        int i2 = 0;
        boolean z2 = a != null && a.getVisibility() == 0;
        if (b == null || b.getVisibility() != 0) {
            z = false;
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            if (!z2 && !z) {
                i2 = 8;
            }
            linearLayout.setVisibility(i2);
        }
    }

    protected final void d() {
        LinearLayout h = h();
        Button a = a();
        Button b = b();
        h.removeAllViews();
        if (b != null) {
            h.addView(b);
        }
        LinearLayout h2 = h();
        if (!l(h2.getContext())) {
            View view = new View(h2.getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
            view.setVisibility(4);
            h2.addView(view);
        }
        if (a != null) {
            h.addView(a);
        }
    }

    public final boolean e() {
        return a() != null && a().getVisibility() == 0;
    }

    public final boolean f() {
        return b() != null && b().getVisibility() == 0;
    }
}

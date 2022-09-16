package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
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
import com.google.android.apps.maps.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.template.FooterActionButton;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: daow  reason: default package */
/* loaded from: classes5.dex */
public final class daow implements daoz {
    final boolean a;
    public daox b;
    public daox c;
    ColorStateList d;
    ColorStateList e;
    final int f;
    public final daor g;
    private final Context h;
    private final ViewStub i;
    private LinearLayout j;
    private int k;
    private int l;
    private int m;
    private int n;
    private final int o;
    private final int p;

    static {
        new AtomicInteger(1);
    }

    public daow(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.d = null;
        this.e = null;
        daor daorVar = new daor();
        this.g = daorVar;
        Context context = templateLayout.getContext();
        this.h = context;
        this.i = (ViewStub) templateLayout.findViewById(R.id.suc_layout_footer);
        this.a = ((danv) templateLayout).d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, danw.a, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f = dimensionPixelSize;
        this.m = obtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize);
        this.n = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        int color = obtainStyledAttributes.getColor(9, 0);
        this.o = color;
        int color2 = obtainStyledAttributes.getColor(11, 0);
        this.p = color2;
        int resourceId = obtainStyledAttributes.getResourceId(10, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(12, 0);
        obtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            daox a = daoy.a(resourceId2, context);
            daof.b("setSecondaryButton");
            g();
            daoa daoaVar = new daoa(a);
            daoaVar.j = h(a, 2132017949, daos.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR);
            daoaVar.a = daos.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR;
            daoaVar.b = daos.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA;
            daoaVar.c = daos.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR;
            daoaVar.d = k(a.a);
            daoaVar.h = daos.CONFIG_FOOTER_BUTTON_RADIUS;
            daoaVar.i = daos.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA;
            daoaVar.e = daos.CONFIG_FOOTER_SECONDARY_BUTTON_TEXT_COLOR;
            daoaVar.f = daos.CONFIG_FOOTER_BUTTON_TEXT_SIZE;
            daoaVar.g = daos.CONFIG_FOOTER_BUTTON_FONT_FAMILY;
            daob a2 = daoaVar.a();
            FooterActionButton i2 = i(a, a2);
            this.l = i2.getId();
            this.e = i2.getTextColors();
            this.c = a;
            d(i2, color2);
            j(i2, a2);
            c();
            daorVar.a(true, true);
        }
        if (resourceId != 0) {
            daox a3 = daoy.a(resourceId, context);
            daof.b("setPrimaryButton");
            g();
            daoa daoaVar2 = new daoa(a3);
            daoaVar2.j = h(a3, 2132017948, daos.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR);
            daoaVar2.a = daos.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR;
            daoaVar2.b = daos.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA;
            daoaVar2.c = daos.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR;
            daoaVar2.d = k(a3.a);
            daoaVar2.h = daos.CONFIG_FOOTER_BUTTON_RADIUS;
            daoaVar2.i = daos.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA;
            daoaVar2.e = daos.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR;
            daoaVar2.f = daos.CONFIG_FOOTER_BUTTON_TEXT_SIZE;
            daoaVar2.g = daos.CONFIG_FOOTER_BUTTON_FONT_FAMILY;
            daob a4 = daoaVar2.a();
            FooterActionButton i3 = i(a3, a4);
            this.k = i3.getId();
            this.d = i3.getTextColors();
            this.b = a3;
            d(i3, color);
            j(i3, a4);
            c();
            daorVar.b(true, true);
        }
    }

    private final LinearLayout g() {
        if (this.j == null) {
            if (this.i != null) {
                this.i.setLayoutInflater(LayoutInflater.from(new ContextThemeWrapper(this.h, 2132017951)));
                this.i.setLayoutResource(R.layout.suc_footer_button_bar);
                LinearLayout linearLayout = (LinearLayout) this.i.inflate();
                this.j = linearLayout;
                if (linearLayout != null) {
                    linearLayout.setId(View.generateViewId());
                    linearLayout.setPadding(linearLayout.getPaddingLeft(), this.m, linearLayout.getPaddingRight(), this.n);
                }
                LinearLayout linearLayout2 = this.j;
                if (linearLayout2 != null && this.a) {
                    linearLayout2.setBackgroundColor(daou.a(this.h).c(this.h, daos.CONFIG_FOOTER_BAR_BG_COLOR));
                    this.m = (int) daou.a(this.h).k(this.h, daos.CONFIG_FOOTER_BUTTON_PADDING_TOP);
                    this.n = (int) daou.a(this.h).k(this.h, daos.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM);
                    linearLayout2.setPadding(linearLayout2.getPaddingLeft(), this.m, linearLayout2.getPaddingRight(), this.n);
                }
            } else {
                throw new IllegalStateException("Footer stub is not found in this template");
            }
        }
        return this.j;
    }

    private final int h(daox daoxVar, int i, daos daosVar) {
        int i2 = daoxVar.c;
        if (i2 != 0 && !this.a) {
            i = i2;
        }
        if (this.a) {
            int c = daou.a(this.h).c(this.h, daosVar);
            if (c == 0) {
                return 2132017949;
            }
            if (c != 0) {
                return 2132017948;
            }
            return i;
        }
        return i;
    }

    private final FooterActionButton i(daox daoxVar, daob daobVar) {
        FooterActionButton footerActionButton = (FooterActionButton) LayoutInflater.from(new ContextThemeWrapper(this.h, daobVar.j)).inflate(R.layout.suc_button, (ViewGroup) null, false);
        footerActionButton.setId(View.generateViewId());
        footerActionButton.setText(daoxVar.b);
        footerActionButton.setOnClickListener(daoxVar);
        footerActionButton.setVisibility(0);
        footerActionButton.setEnabled(true);
        footerActionButton.a = daoxVar;
        footerActionButton.getId();
        return footerActionButton;
    }

    private final void j(Button button, daob daobVar) {
        Drawable drawable;
        GradientDrawable gradientDrawable;
        if (this.a) {
            daos daosVar = daobVar.e;
            if (button.isEnabled()) {
                int c = daou.a(this.h).c(this.h, daosVar);
                if (c != 0) {
                    button.setTextColor(ColorStateList.valueOf(c));
                }
            } else {
                button.setTextColor(button.getId() == this.k ? this.d : this.e);
            }
            float k = daou.a(this.h).k(this.h, daobVar.f);
            if (k > 0.0f) {
                button.setTextSize(0, k);
            }
            Typeface create = Typeface.create(daou.a(this.h).e(this.h, daobVar.g), 0);
            if (create != null) {
                button.setTypeface(create);
            }
            daos daosVar2 = daobVar.a;
            daos daosVar3 = daobVar.b;
            daos daosVar4 = daobVar.c;
            daof.a(Build.VERSION.SDK_INT >= 29, "Update button background only support on sdk Q or higher");
            int[] iArr = {-16842910};
            int[] iArr2 = new int[0];
            int c2 = daou.a(this.h).c(this.h, daosVar2);
            float l = daou.a(this.h).l(this.h, daosVar3);
            int c3 = daou.a(this.h).c(this.h, daosVar4);
            if (c2 != 0) {
                if (l <= 0.0f) {
                    TypedArray obtainStyledAttributes = this.h.obtainStyledAttributes(new int[]{16842803});
                    l = obtainStyledAttributes.getFloat(0, 0.26f);
                    obtainStyledAttributes.recycle();
                }
                if (c3 == 0) {
                    c3 = c2;
                }
                ColorStateList colorStateList = new ColorStateList(new int[][]{iArr, iArr2}, new int[]{l(c3, l), c2});
                button.getBackground().mutate().setState(new int[0]);
                button.refreshDrawableState();
                button.setBackgroundTintList(colorStateList);
            }
            daos daosVar5 = daobVar.h;
            RippleDrawable rippleDrawable = null;
            if (Build.VERSION.SDK_INT >= 24) {
                float k2 = daou.a(this.h).k(this.h, daosVar5);
                Drawable background = button.getBackground();
                if (background instanceof InsetDrawable) {
                    gradientDrawable = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) background).getDrawable()).getDrawable(0);
                } else {
                    gradientDrawable = background instanceof RippleDrawable ? (GradientDrawable) ((InsetDrawable) ((RippleDrawable) background).getDrawable(0)).getDrawable() : null;
                }
                if (gradientDrawable != null) {
                    gradientDrawable.setCornerRadius(k2);
                }
            }
            daos daosVar6 = daobVar.d;
            if (button != null) {
                Drawable d = daosVar6 != null ? daou.a(this.h).d(this.h, daosVar6) : null;
                if (d != null) {
                    d.setBounds(0, 0, d.getIntrinsicWidth(), d.getIntrinsicHeight());
                }
                if (button.getId() == this.k) {
                    drawable = d;
                    d = null;
                } else if (button.getId() == this.l) {
                    drawable = null;
                } else {
                    d = null;
                    drawable = null;
                }
                button.setCompoundDrawablesRelative(d, null, drawable, null);
            }
            Drawable background2 = button.getBackground();
            if (background2 instanceof InsetDrawable) {
                rippleDrawable = (RippleDrawable) ((InsetDrawable) background2).getDrawable();
            } else if (background2 instanceof RippleDrawable) {
                rippleDrawable = (RippleDrawable) background2;
            }
            if (rippleDrawable == null) {
                return;
            }
            rippleDrawable.setColor(new ColorStateList(new int[][]{new int[]{16842919}, StateSet.NOTHING}, new int[]{l(daou.a(this.h).c(this.h, daobVar.e), daou.a(this.h).l(this.h, daobVar.i)), 0}));
        }
    }

    private static daos k(int i) {
        switch (i) {
            case 1:
                return daos.CONFIG_FOOTER_BUTTON_ICON_ADD_ANOTHER;
            case 2:
                return daos.CONFIG_FOOTER_BUTTON_ICON_CANCEL;
            case 3:
                return daos.CONFIG_FOOTER_BUTTON_ICON_CLEAR;
            case 4:
                return daos.CONFIG_FOOTER_BUTTON_ICON_DONE;
            case 5:
                return daos.CONFIG_FOOTER_BUTTON_ICON_NEXT;
            case 6:
                return daos.CONFIG_FOOTER_BUTTON_ICON_OPT_IN;
            case 7:
                return daos.CONFIG_FOOTER_BUTTON_ICON_SKIP;
            case 8:
                return daos.CONFIG_FOOTER_BUTTON_ICON_STOP;
            default:
                return null;
        }
    }

    private static int l(int i, float f) {
        return Color.argb((int) (f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public final Button a() {
        LinearLayout linearLayout = this.j;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.k);
    }

    public final boolean b() {
        return a() != null && a().getVisibility() == 0;
    }

    protected final void c() {
        LinearLayout g = g();
        Button a = a();
        Button e = e();
        g.removeAllViews();
        if (e != null) {
            g.addView(e);
        }
        LinearLayout g2 = g();
        View view = new View(g2.getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        view.setVisibility(4);
        g2.addView(view);
        if (a != null) {
            g.addView(a);
        }
    }

    protected final void d(Button button, int i) {
        if (i != 0) {
            button.getBackground().mutate().setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
        this.j.addView(button);
        Button a = a();
        Button e = e();
        boolean z = true;
        int i2 = 0;
        boolean z2 = a != null && a.getVisibility() == 0;
        if (e == null || e.getVisibility() != 0) {
            z = false;
        }
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            if (!z2 && !z) {
                i2 = 8;
            }
            linearLayout.setVisibility(i2);
        }
    }

    public final Button e() {
        LinearLayout linearLayout = this.j;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.l);
    }

    public final boolean f() {
        return e() != null && e().getVisibility() == 0;
    }
}

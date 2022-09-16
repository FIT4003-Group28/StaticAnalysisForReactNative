package com.google.android.setupdesign;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.setupdesign.view.BottomScrollView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class GlifLayout extends alvm {
    private ColorStateList c;
    private boolean d;
    private boolean e;
    private ColorStateList f;

    public GlifLayout(Context context) {
        this(context, 0, 0);
    }

    private final void l(AttributeSet attributeSet, int i) {
        int a;
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, alwr.g, i, 0);
        this.e = f() && obtainStyledAttributes.getBoolean(4, false);
        j(alxa.class, new alxa(this, attributeSet, i));
        j(alwy.class, new alwy(this, attributeSet, i));
        j(alxb.class, new alxb(this, attributeSet, i));
        j(alxe.class, new alxe(this, attributeSet, i));
        j(alxd.class, new alxd(this));
        j(alxf.class, new alxf());
        View findViewById = findViewById(R.id.sud_scroll_view);
        ScrollView scrollView = findViewById instanceof ScrollView ? (ScrollView) findViewById : null;
        if (scrollView != null) {
            if (scrollView instanceof BottomScrollView) {
                BottomScrollView bottomScrollView = (BottomScrollView) scrollView;
            } else {
                String valueOf = String.valueOf(scrollView);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Cannot set non-BottomScrollView. Found=");
                sb.append(valueOf);
                Log.w("ScrollViewDelegate", sb.toString());
            }
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        if (colorStateList != null) {
            this.c = colorStateList;
            m();
            ProgressBar a2 = ((alxe) i(alxe.class)).a();
            if (a2 != null) {
                a2.setIndeterminateTintList(colorStateList);
                a2.setProgressBackgroundTintList(colorStateList);
            }
        }
        if (this.e) {
            if (!g()) {
                getRootView().setBackgroundColor(alwg.f(getContext()).c(getContext(), alwe.CONFIG_LAYOUT_BACKGROUND_COLOR));
            }
            View findViewById2 = findViewById(R.id.sud_layout_content);
            if (findViewById2 != null) {
                aqmv.n(findViewById2);
                Context context = findViewById2.getContext();
                boolean l = alwg.f(context).l(alwe.CONFIG_CONTENT_PADDING_TOP);
                if (aqmv.m(findViewById2) && l && (a = (int) alwg.f(context).a(context, alwe.CONFIG_CONTENT_PADDING_TOP)) != findViewById2.getPaddingTop()) {
                    findViewById2.setPadding(findViewById2.getPaddingStart(), a, findViewById2.getPaddingEnd(), findViewById2.getPaddingBottom());
                }
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sud_glif_land_middle_horizontal_spacing);
        View findViewById3 = findViewById(R.id.sud_landscape_header_area);
        if (findViewById3 != null && alwg.f(getContext()).l(alwe.CONFIG_LAYOUT_MARGIN_END)) {
            findViewById3.setPadding(findViewById3.getPaddingStart(), findViewById3.getPaddingTop(), (dimensionPixelSize / 2) - ((int) alwg.f(getContext()).a(getContext(), alwe.CONFIG_LAYOUT_MARGIN_END)), findViewById3.getPaddingBottom());
        }
        View findViewById4 = findViewById(R.id.sud_landscape_content_area);
        if (findViewById4 != null && alwg.f(getContext()).l(alwe.CONFIG_LAYOUT_MARGIN_START)) {
            findViewById4.setPadding(findViewById3 != null ? (dimensionPixelSize / 2) - ((int) alwg.f(getContext()).a(getContext(), alwe.CONFIG_LAYOUT_MARGIN_START)) : 0, findViewById4.getPaddingTop(), findViewById4.getPaddingEnd(), findViewById4.getPaddingBottom());
        }
        this.f = obtainStyledAttributes.getColorStateList(0);
        m();
        this.d = obtainStyledAttributes.getBoolean(1, true);
        m();
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.sud_layout_sticky_header);
            viewStub.setLayoutResource(resourceId);
            viewStub.inflate();
        }
        obtainStyledAttributes.recycle();
    }

    private final void m() {
        int defaultColor;
        Drawable colorDrawable;
        if (findViewById(R.id.suc_layout_status) != null) {
            ColorStateList colorStateList = this.f;
            if (colorStateList != null) {
                defaultColor = colorStateList.getDefaultColor();
            } else {
                ColorStateList colorStateList2 = this.c;
                defaultColor = colorStateList2 != null ? colorStateList2.getDefaultColor() : 0;
            }
            if (this.d) {
                colorDrawable = new alwq(defaultColor);
            } else {
                colorDrawable = new ColorDrawable(defaultColor);
            }
            ((alwl) i(alwl.class)).a(colorDrawable);
        }
    }

    @Override // defpackage.alvm, com.google.android.setupcompat.internal.TemplateLayout
    protected final View b(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.sud_glif_template;
        }
        return h(layoutInflater, 2132083545, i);
    }

    @Override // defpackage.alvm, com.google.android.setupcompat.internal.TemplateLayout
    protected final ViewGroup c(int i) {
        if (i == 0) {
            i = R.id.sud_layout_content;
        }
        return super.c(i);
    }

    public final boolean k() {
        return this.e || (f() && alwg.n(getContext()));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        ImageView b;
        int k;
        super.onFinishInflate();
        alxb alxbVar = (alxb) i(alxb.class);
        if (((GlifLayout) alxbVar.a).k()) {
            ImageView b2 = alxbVar.b();
            FrameLayout a = alxbVar.a();
            if (b2 != null && a != null) {
                Context context = b2.getContext();
                int k2 = aqmv.k(context);
                if (k2 != 0) {
                    aqmv.o(b2, k2);
                }
                ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
                if (alwg.f(context).l(alwe.CONFIG_ICON_MARGIN_TOP) && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) alwg.f(context).a(context, alwe.CONFIG_ICON_MARGIN_TOP), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                }
                if (alwg.f(context).l(alwe.CONFIG_ICON_SIZE)) {
                    b2.getViewTreeObserver().addOnPreDrawListener(new alxg(b2));
                    ViewGroup.LayoutParams layoutParams2 = b2.getLayoutParams();
                    layoutParams2.height = (int) alwg.f(context).a(context, alwe.CONFIG_ICON_SIZE);
                    layoutParams2.width = -2;
                    b2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
            }
        } else if (((alvm) alxbVar.a).f() && (b = alxbVar.b()) != null && (k = aqmv.k(b.getContext())) != 0) {
            aqmv.o(b, k);
        }
        alxa alxaVar = (alxa) i(alxa.class);
        TextView textView = (TextView) alxaVar.a.findViewById(R.id.suc_layout_title);
        boolean f = ((alvm) alxaVar.a).f();
        if (((GlifLayout) alxaVar.a).k()) {
            View findViewById = alxaVar.a.findViewById(R.id.sud_layout_header);
            if (textView != null) {
                aqmv.j(textView, new alxh(alwe.CONFIG_HEADER_TEXT_COLOR, null, alwe.CONFIG_HEADER_TEXT_SIZE, alwe.CONFIG_HEADER_FONT_FAMILY, null, alwe.CONFIG_HEADER_TEXT_MARGIN_TOP, alwe.CONFIG_HEADER_TEXT_MARGIN_BOTTOM, aqmv.k(textView.getContext())));
            }
            ViewGroup viewGroup = (ViewGroup) findViewById;
            if (viewGroup != null && aqmv.m(viewGroup)) {
                Context context2 = viewGroup.getContext();
                viewGroup.setBackgroundColor(alwg.f(context2).c(context2, alwe.CONFIG_HEADER_AREA_BACKGROUND_COLOR));
                if (alwg.f(context2).l(alwe.CONFIG_HEADER_CONTAINER_MARGIN_BOTTOM)) {
                    ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, (int) alwg.f(context2).a(context2, alwe.CONFIG_HEADER_CONTAINER_MARGIN_BOTTOM));
                        viewGroup.setLayoutParams(layoutParams3);
                    }
                }
            }
            aqmv.n(findViewById);
            alxaVar.c();
        } else if (f && textView != null) {
            aqmv.i(textView, new alxh(null, null, null, null, null, null, null, aqmv.k(textView.getContext())));
        }
        if (alxaVar.b) {
            alxaVar.b(textView);
        }
        alwy alwyVar = (alwy) i(alwy.class);
        TextView textView2 = (TextView) alwyVar.a.findViewById(R.id.sud_layout_subtitle);
        if (((GlifLayout) alwyVar.a).k()) {
            if (textView2 != null) {
                aqmv.j(textView2, new alxh(alwe.CONFIG_DESCRIPTION_TEXT_COLOR, alwe.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, alwe.CONFIG_DESCRIPTION_TEXT_SIZE, alwe.CONFIG_DESCRIPTION_FONT_FAMILY, alwe.CONFIG_DESCRIPTION_LINK_FONT_FAMILY, alwe.CONFIG_DESCRIPTION_TEXT_MARGIN_TOP, alwe.CONFIG_DESCRIPTION_TEXT_MARGIN_BOTTOM, aqmv.k(textView2.getContext())));
            }
        } else if (((alvm) alwyVar.a).f() && textView2 != null) {
            aqmv.i(textView2, new alxh(null, null, null, null, null, null, null, aqmv.k(textView2.getContext())));
        }
        alxe alxeVar = (alxe) i(alxe.class);
        ProgressBar a2 = alxeVar.a();
        if (alxeVar.b && a2 != null) {
            if (((GlifLayout) alxeVar.a).k()) {
                Context context3 = a2.getContext();
                ViewGroup.LayoutParams layoutParams4 = a2.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    int i = marginLayoutParams3.topMargin;
                    if (alwg.f(context3).l(alwe.CONFIG_PROGRESS_BAR_MARGIN_TOP)) {
                        i = (int) alwg.f(context3).b(context3, alwe.CONFIG_PROGRESS_BAR_MARGIN_TOP, context3.getResources().getDimension(R.dimen.sud_progress_bar_margin_top));
                    }
                    int i2 = marginLayoutParams3.bottomMargin;
                    if (alwg.f(context3).l(alwe.CONFIG_PROGRESS_BAR_MARGIN_BOTTOM)) {
                        i2 = (int) alwg.f(context3).b(context3, alwe.CONFIG_PROGRESS_BAR_MARGIN_BOTTOM, context3.getResources().getDimension(R.dimen.sud_progress_bar_margin_bottom));
                    }
                    if (i != marginLayoutParams3.topMargin || i2 != marginLayoutParams3.bottomMargin) {
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, i, marginLayoutParams3.rightMargin, i2);
                    }
                }
            } else {
                Context context4 = a2.getContext();
                ViewGroup.LayoutParams layoutParams5 = a2.getLayoutParams();
                if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    marginLayoutParams4.setMargins(marginLayoutParams4.leftMargin, (int) context4.getResources().getDimension(R.dimen.sud_progress_bar_margin_top), marginLayoutParams4.rightMargin, (int) context4.getResources().getDimension(R.dimen.sud_progress_bar_margin_bottom));
                }
            }
        }
        TextView textView3 = (TextView) findViewById(R.id.sud_layout_description);
        if (textView3 != null) {
            if (this.e) {
                aqmv.j(textView3, new alxh(alwe.CONFIG_DESCRIPTION_TEXT_COLOR, alwe.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, alwe.CONFIG_DESCRIPTION_TEXT_SIZE, alwe.CONFIG_DESCRIPTION_FONT_FAMILY, alwe.CONFIG_DESCRIPTION_LINK_FONT_FAMILY, null, null, aqmv.k(textView3.getContext())));
            } else if (!f()) {
            } else {
                aqmv.i(textView3, new alxh(null, null, null, null, null, null, null, aqmv.k(textView3.getContext())));
            }
        }
    }

    public GlifLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        this.d = true;
        this.e = false;
        l(null, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        this.e = false;
        l(attributeSet, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        this.e = false;
        l(attributeSet, i);
    }
}

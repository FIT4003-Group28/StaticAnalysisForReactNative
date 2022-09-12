package com.google.android.setupdesign;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.setupcompat.internal.TemplateLayout;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GlifLayout extends danv {
    public boolean c;
    private ColorStateList d;
    private boolean e;
    private ColorStateList f;

    public GlifLayout(Context context) {
        this(context, 0, 0);
    }

    private final void h(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dapf.f, i, 0);
        this.c = d() && obtainStyledAttributes.getBoolean(4, false);
        e(dapn.class, new dapn(this, attributeSet, i));
        e(dapo.class, new dapo(this, attributeSet, i));
        e(dapr.class, new dapr(this));
        e(dapq.class, new dapq(this));
        dapt daptVar = new dapt();
        e(dapt.class, daptVar);
        View findViewById = findViewById(R.id.sud_scroll_view);
        ScrollView scrollView = findViewById instanceof ScrollView ? (ScrollView) findViewById : null;
        if (scrollView != null) {
            new dapu(daptVar, scrollView);
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        if (colorStateList != null) {
            setPrimaryColor(colorStateList);
        }
        if (this.c) {
            getRootView().setBackgroundColor(daou.a(getContext()).c(getContext(), daos.CONFIG_LAYOUT_BACKGROUND_COLOR));
        }
        setBackgroundBaseColor(obtainStyledAttributes.getColorStateList(0));
        setBackgroundPatterned(obtainStyledAttributes.getBoolean(1, true));
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            ViewStub viewStub = (ViewStub) findViewById(R.id.sud_layout_sticky_header);
            viewStub.setLayoutResource(resourceId);
            viewStub.inflate();
        }
        obtainStyledAttributes.recycle();
    }

    private final void i() {
        int defaultColor;
        Drawable colorDrawable;
        if (findViewById(R.id.suc_layout_status) != null) {
            ColorStateList colorStateList = this.f;
            if (colorStateList != null) {
                defaultColor = colorStateList.getDefaultColor();
            } else {
                ColorStateList colorStateList2 = this.d;
                defaultColor = colorStateList2 != null ? colorStateList2.getDefaultColor() : 0;
            }
            if (this.e) {
                colorDrawable = new dape(defaultColor);
            } else {
                colorDrawable = new ColorDrawable(defaultColor);
            }
            ((dapa) f(dapa.class)).a(colorDrawable);
        }
    }

    @Override // defpackage.danv, com.google.android.setupcompat.internal.TemplateLayout
    protected final View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            i = R.layout.sud_glif_template;
        }
        return g(layoutInflater, 2132018008, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.danv, com.google.android.setupcompat.internal.TemplateLayout
    public final ViewGroup c(int i) {
        if (i == 0) {
            i = R.id.sud_layout_content;
        }
        return super.c(i);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        ImageView imageView;
        int a;
        super.onFinishInflate();
        dapo dapoVar = (dapo) f(dapo.class);
        if (((danv) dapoVar.a).d() && (imageView = (ImageView) dapoVar.a.findViewById(R.id.sud_layout_icon)) != null && (a = dapw.a(imageView.getContext())) != 0 && (imageView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.gravity = a;
            imageView.setLayoutParams(layoutParams);
        }
        dapn dapnVar = (dapn) f(dapn.class);
        TextView textView = (TextView) dapnVar.a.findViewById(R.id.suc_layout_title);
        TemplateLayout templateLayout = dapnVar.a;
        if (!((GlifLayout) templateLayout).c) {
            if (((danv) templateLayout).d() && textView != null) {
                dapy.b(textView, new dapx(null, null, null, null, dapw.a(textView.getContext())));
            }
        } else {
            if (textView != null) {
                dapy.a(textView, new dapx(daos.CONFIG_HEADER_TEXT_COLOR, null, daos.CONFIG_HEADER_TEXT_SIZE, daos.CONFIG_HEADER_FONT_FAMILY, dapw.a(textView.getContext())));
            }
            LinearLayout linearLayout = (LinearLayout) dapnVar.a.findViewById(R.id.sud_layout_header);
            if (linearLayout != null) {
                Context context = linearLayout.getContext();
                linearLayout.setBackgroundColor(daou.a(context).c(context, daos.CONFIG_HEADER_AREA_BACKGROUND_COLOR));
            }
        }
        TextView textView2 = (TextView) findViewById(R.id.sud_layout_description);
        if (textView2 != null) {
            if (this.c) {
                dapy.a(textView2, new dapx(daos.CONFIG_DESCRIPTION_TEXT_COLOR, daos.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, daos.CONFIG_DESCRIPTION_TEXT_SIZE, daos.CONFIG_DESCRIPTION_FONT_FAMILY, dapw.a(textView2.getContext())));
            } else if (!d()) {
            } else {
                dapy.b(textView2, new dapx(null, null, null, null, dapw.a(textView2.getContext())));
            }
        }
    }

    public void setBackgroundBaseColor(ColorStateList colorStateList) {
        this.f = colorStateList;
        i();
    }

    public void setBackgroundPatterned(boolean z) {
        this.e = z;
        i();
    }

    public void setHeaderColor(ColorStateList colorStateList) {
        ((dapn) f(dapn.class)).c(colorStateList);
    }

    public void setHeaderText(int i) {
        TextView a = ((dapn) f(dapn.class)).a();
        if (a != null) {
            a.setText(i);
        }
    }

    public void setIcon(Drawable drawable) {
        ImageView a = ((dapo) f(dapo.class)).a();
        if (a != null) {
            a.setImageDrawable(drawable);
            a.setVisibility(drawable != null ? 0 : 8);
        }
    }

    public void setPrimaryColor(ColorStateList colorStateList) {
        this.d = colorStateList;
        i();
        ((dapr) f(dapr.class)).b(colorStateList);
    }

    public void setProgressBarShown(boolean z) {
        dapr daprVar = (dapr) f(dapr.class);
        if (!z) {
            ProgressBar a = daprVar.a();
            if (a == null) {
                return;
            }
            a.setVisibility(8);
            return;
        }
        if (daprVar.a() == null) {
            ViewStub viewStub = (ViewStub) daprVar.a.findViewById(R.id.sud_layout_progress_stub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            daprVar.b(daprVar.b);
        }
        ProgressBar a2 = daprVar.a();
        if (a2 == null) {
            return;
        }
        a2.setVisibility(0);
    }

    public GlifLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        this.e = true;
        this.c = false;
        h(null, R.attr.sudLayoutTheme);
    }

    public void setHeaderText(CharSequence charSequence) {
        ((dapn) f(dapn.class)).b(charSequence);
    }

    public GlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = true;
        this.c = false;
        h(attributeSet, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
        this.c = false;
        h(attributeSet, i);
    }
}

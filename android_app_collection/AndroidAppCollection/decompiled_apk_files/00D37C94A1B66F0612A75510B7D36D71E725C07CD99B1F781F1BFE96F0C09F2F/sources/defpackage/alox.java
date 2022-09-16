package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.youtube.R;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: alox  reason: default package */
/* loaded from: classes.dex */
public final class alox extends LinearLayout {
    public TextView a;
    public ImageView b;
    public final Drawable c;
    final /* synthetic */ TabLayout d;
    private alou e;
    private int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.graphics.drawable.RippleDrawable] */
    public alox(TabLayout tabLayout, Context context) {
        super(context);
        quw quwVar;
        this.d = tabLayout;
        this.f = 2;
        int i = tabLayout.m;
        if (i != 0) {
            Drawable b = po.b(context, i);
            this.c = b;
            if (b != null && b.isStateful()) {
                b.setState(getDrawableState());
            }
        } else {
            this.c = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.h != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList a = almo.a(tabLayout.h);
            boolean z = tabLayout.u;
            gradientDrawable = new RippleDrawable(a, true == z ? null : gradientDrawable, true == z ? null : gradientDrawable2);
        }
        lj.O(this, gradientDrawable);
        tabLayout.invalidate();
        lj.Y(this, tabLayout.b, tabLayout.c, tabLayout.d, tabLayout.e);
        setGravity(17);
        setOrientation(!tabLayout.s ? 1 : 0);
        setClickable(true);
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            quwVar = new quw(PointerIcon.getSystemIcon(context2, 1002));
        } else {
            quwVar = new quw((Object) null);
        }
        lj.ay(this, quwVar);
    }

    private static final void c(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new alow(view));
    }

    public final void a(alou alouVar) {
        if (alouVar != this.e) {
            this.e = alouVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        alou alouVar = this.e;
        boolean z = false;
        if (this.b == null) {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
            this.b = imageView;
            addView(imageView, 0);
        }
        if (this.a == null) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
            this.a = textView;
            addView(textView);
            this.f = this.a.getMaxLines();
        }
        kz.s(this.a, this.d.f);
        ColorStateList colorStateList = this.d.g;
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        TextView textView2 = this.a;
        ImageView imageView2 = this.b;
        alou alouVar2 = this.e;
        CharSequence charSequence = null;
        CharSequence charSequence2 = alouVar2 != null ? alouVar2.a : null;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        boolean z2 = !isEmpty;
        if (textView2 != null) {
            if (z2) {
                textView2.setText(charSequence2);
                int i = this.e.e;
                textView2.setVisibility(0);
                setVisibility(0);
            } else {
                textView2.setVisibility(8);
                textView2.setText((CharSequence) null);
            }
        }
        if (imageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            int t = (!z2 || imageView2.getVisibility() != 0) ? 0 : (int) amyv.t(getContext(), 8);
            if (this.d.s) {
                if (t != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(t);
                    marginLayoutParams.bottomMargin = 0;
                    imageView2.setLayoutParams(marginLayoutParams);
                    imageView2.requestLayout();
                }
            } else if (t != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = t;
                marginLayoutParams.setMarginEnd(0);
                imageView2.setLayoutParams(marginLayoutParams);
                imageView2.requestLayout();
            }
        }
        alou alouVar3 = this.e;
        if (alouVar3 != null) {
            charSequence = alouVar3.b;
        }
        if (Build.VERSION.SDK_INT > 23) {
            if (true == isEmpty) {
                charSequence2 = charSequence;
            }
            hx.a(this, charSequence2);
        }
        c(this.b);
        c(this.a);
        if (alouVar != null && !TextUtils.isEmpty(alouVar.b)) {
            setContentDescription(alouVar.b);
        }
        if (alouVar != null) {
            TabLayout tabLayout = alouVar.f;
            if (tabLayout != null) {
                if (tabLayout.a() == alouVar.c) {
                    z = true;
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.c;
        if (drawable == null || !drawable.isStateful() || !this.c.setState(drawableState)) {
            return;
        }
        invalidate();
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        mh c = mh.c(accessibilityNodeInfo);
        c.u(mg.a(0, 1, this.e.c, 1, isSelected()));
        if (isSelected()) {
            c.s(false);
            c.b.removeAction((AccessibilityNodeInfo.AccessibilityAction) mf.b.j);
        }
        c.b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.d.n;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = this.d.k;
            int i4 = this.f;
            ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.d.l;
                }
            } else {
                i4 = 1;
            }
            float textSize = this.a.getTextSize();
            int lineCount = this.a.getLineCount();
            int maxLines = this.a.getMaxLines();
            if (f == textSize && (maxLines < 0 || i4 == maxLines)) {
                return;
            }
            if (this.d.r == 1 && f > textSize && lineCount == 1 && ((layout = this.a.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                return;
            }
            this.a.setTextSize(0, f);
            this.a.setMaxLines(i4);
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.e != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.e.a();
            return true;
        }
        return performClick;
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dage  reason: default package */
/* loaded from: classes5.dex */
public final class dage extends LinearLayout {
    public TextView a;
    public ImageView b;
    public View c;
    public TextView d;
    public ImageView e;
    public Drawable f;
    final /* synthetic */ dagg g;
    private dagb h;
    private int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dage(dagg daggVar, Context context) {
        super(context);
        ns nsVar;
        this.g = daggVar;
        this.i = 2;
        a(context);
        od.y(this, daggVar.d, daggVar.e, daggVar.f, daggVar.g);
        setGravity(17);
        setOrientation(!daggVar.w ? 1 : 0);
        setClickable(true);
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            nsVar = new ns(PointerIcon.getSystemIcon(context2, 1002));
        } else {
            nsVar = new ns(null);
        }
        od.am(this, nsVar);
    }

    private final void e(View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new dagd(view));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.graphics.drawable.RippleDrawable] */
    public final void a(Context context) {
        int i = this.g.q;
        GradientDrawable gradientDrawable = null;
        if (i != 0) {
            Drawable b = sl.b(context, i);
            this.f = b;
            if (b != null && b.isStateful()) {
                this.f.setState(getDrawableState());
            }
        } else {
            this.f = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        if (this.g.k != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList colorStateList = this.g.k;
            int[] iArr = dadg.a;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{dadg.c, StateSet.NOTHING}, new int[]{dadg.c(colorStateList, dadg.b), dadg.c(colorStateList, dadg.a)});
            boolean z = this.g.y;
            if (true == z) {
                gradientDrawable2 = null;
            }
            if (true != z) {
                gradientDrawable = gradientDrawable3;
            }
            gradientDrawable2 = new RippleDrawable(colorStateList2, gradientDrawable2, gradientDrawable);
        }
        od.U(this, gradientDrawable2);
        this.g.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(dagb dagbVar) {
        if (dagbVar != this.h) {
            this.h = dagbVar;
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        Drawable drawable;
        dagb dagbVar = this.h;
        Drawable drawable2 = null;
        View view = dagbVar != null ? dagbVar.e : null;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                }
                addView(view);
            }
            this.c = view;
            TextView textView = this.a;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.b;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.b.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(16908308);
            this.d = textView2;
            if (textView2 != null) {
                this.i = textView2.getMaxLines();
            }
            this.e = (ImageView) view.findViewById(16908294);
        } else {
            View view2 = this.c;
            if (view2 != null) {
                removeView(view2);
                this.c = null;
            }
            this.d = null;
            this.e = null;
        }
        boolean z = false;
        if (this.c == null) {
            if (this.b == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.b = imageView2;
                addView(imageView2, 0);
            }
            if (dagbVar != null && (drawable = dagbVar.a) != null) {
                drawable2 = ks.b(drawable).mutate();
            }
            if (drawable2 != null) {
                drawable2.setTintList(this.g.j);
                PorterDuff.Mode mode = this.g.n;
                if (mode != null) {
                    drawable2.setTintMode(mode);
                }
            }
            if (this.a == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.a = textView3;
                addView(textView3);
                this.i = this.a.getMaxLines();
            }
            qf.a(this.a, this.g.h);
            ColorStateList colorStateList = this.g.i;
            if (colorStateList != null) {
                this.a.setTextColor(colorStateList);
            }
            d(this.a, this.b);
            e(this.b);
            e(this.a);
        } else {
            TextView textView4 = this.d;
            if (textView4 != null || this.e != null) {
                d(textView4, this.e);
            }
        }
        if (dagbVar != null && !TextUtils.isEmpty(dagbVar.c)) {
            setContentDescription(dagbVar.c);
        }
        if (dagbVar != null) {
            dagg daggVar = dagbVar.g;
            if (daggVar != null) {
                if (daggVar.k() == dagbVar.d) {
                    z = true;
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        setSelected(z);
    }

    public final void d(TextView textView, ImageView imageView) {
        Drawable drawable;
        dagb dagbVar = this.h;
        CharSequence charSequence = null;
        Drawable mutate = (dagbVar == null || (drawable = dagbVar.a) == null) ? null : ks.b(drawable).mutate();
        dagb dagbVar2 = this.h;
        CharSequence charSequence2 = dagbVar2 != null ? dagbVar2.b : null;
        if (imageView != null) {
            if (mutate != null) {
                imageView.setImageDrawable(mutate);
                imageView.setVisibility(0);
                setVisibility(0);
            } else {
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
            }
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        boolean z = !isEmpty;
        if (textView != null) {
            if (z) {
                textView.setText(charSequence2);
                int i = this.h.f;
                textView.setVisibility(0);
                setVisibility(0);
            } else {
                textView.setVisibility(8);
                textView.setText((CharSequence) null);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int b = (!z || imageView.getVisibility() != 0) ? 0 : (int) dabd.b(getContext(), 8);
            if (this.g.w) {
                if (b != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(b);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (b != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = b;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        dagb dagbVar3 = this.h;
        CharSequence charSequence3 = dagbVar3 != null ? dagbVar3.c : null;
        if (true == isEmpty) {
            charSequence = charSequence3;
        }
        afb.a(this, charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f;
        if (drawable == null || !drawable.isStateful() || !this.f.setState(drawableState)) {
            return;
        }
        invalidate();
        this.g.invalidate();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        pc a = pc.a(accessibilityNodeInfo);
        a.I(pa.a(0, 1, this.h.d, 1, isSelected()));
        if (isSelected()) {
            a.t(false);
            a.R(oy.c);
        }
        a.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.g.r;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a != null) {
            float f = this.g.o;
            int i4 = this.i;
            ImageView imageView = this.b;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.g.p;
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
            if (this.g.v == 1 && f > textSize && lineCount == 1 && ((layout = this.a.getLayout()) == null || layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
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
        if (this.h != null) {
            if (!performClick) {
                playSoundEffect(0);
            }
            this.h.a();
            return true;
        }
        return performClick;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
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
        View view = this.c;
        if (view != null) {
            view.setSelected(z);
        }
    }
}

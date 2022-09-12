package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adb  reason: default package */
/* loaded from: classes2.dex */
public final class adb extends LinearLayout {
    public qj a;
    final /* synthetic */ add b;
    private final int[] c;
    private TextView d;
    private ImageView e;
    private View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adb(add addVar, Context context, qj qjVar) {
        super(context, null, R.attr.actionBarTabStyle);
        this.b = addVar;
        int[] iArr = {16842964};
        this.c = iArr;
        this.a = qjVar;
        aeq b = aeq.b(context, null, iArr, R.attr.actionBarTabStyle, 0);
        if (b.p(0)) {
            setBackgroundDrawable(b.d(0));
        }
        b.q();
        setGravity(8388627);
        a();
    }

    public final void a() {
        qj qjVar = this.a;
        View c = qjVar.c();
        CharSequence charSequence = null;
        if (c != null) {
            ViewParent parent = c.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(c);
                }
                addView(c);
            }
            this.f = c;
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.e;
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            this.e.setImageDrawable(null);
            return;
        }
        View view = this.f;
        if (view != null) {
            removeView(view);
            this.f = null;
        }
        Drawable a = qjVar.a();
        CharSequence b = qjVar.b();
        if (a != null) {
            if (this.e == null) {
                AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                appCompatImageView.setLayoutParams(layoutParams);
                addView(appCompatImageView, 0);
                this.e = appCompatImageView;
            }
            this.e.setImageDrawable(a);
            this.e.setVisibility(0);
        } else {
            ImageView imageView2 = this.e;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                this.e.setImageDrawable(null);
            }
        }
        boolean z = !TextUtils.isEmpty(b);
        if (z) {
            if (this.d == null) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 16;
                appCompatTextView.setLayoutParams(layoutParams2);
                addView(appCompatTextView);
                this.d = appCompatTextView;
            }
            this.d.setText(b);
            this.d.setVisibility(0);
        } else {
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setVisibility(8);
                this.d.setText((CharSequence) null);
            }
        }
        ImageView imageView3 = this.e;
        if (imageView3 != null) {
            imageView3.setContentDescription(qjVar.e());
        }
        if (!z) {
            charSequence = qjVar.e();
        }
        afb.a(this, charSequence);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.app.ActionBar$Tab");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.app.ActionBar$Tab");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.b.c > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.b.c;
            if (measuredWidth <= i3) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        boolean isSelected = isSelected();
        super.setSelected(z);
        if (isSelected == z || !z) {
            return;
        }
        sendAccessibilityEvent(4);
    }
}

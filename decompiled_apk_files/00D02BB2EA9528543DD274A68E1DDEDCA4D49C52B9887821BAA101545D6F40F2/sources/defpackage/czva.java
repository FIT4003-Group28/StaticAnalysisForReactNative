package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: czva  reason: default package */
/* loaded from: classes5.dex */
public final class czva extends LinearLayout.LayoutParams {
    public int a;
    public Interpolator b;

    public czva() {
        super(-1, -2);
        this.a = 1;
    }

    public czva(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, czvk.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public czva(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public czva(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public czva(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}

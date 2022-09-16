package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: alii  reason: default package */
/* loaded from: classes.dex */
public final class alii extends LinearLayout.LayoutParams {
    public int a;
    public alih b;
    public Interpolator c;

    public alii() {
        super(-1, -2);
        this.a = 1;
    }

    public alii(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alit.b);
        this.a = obtainStyledAttributes.getInt(1, 0);
        this.b = obtainStyledAttributes.getInt(0, 0) == 1 ? new alih(null) : null;
        if (obtainStyledAttributes.hasValue(2)) {
            this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public alii(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }

    public alii(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 1;
    }

    public alii(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 1;
    }
}

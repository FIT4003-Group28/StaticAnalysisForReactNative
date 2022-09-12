package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: czve  reason: default package */
/* loaded from: classes5.dex */
public final class czve extends FrameLayout.LayoutParams {
    int a;
    float b;

    public czve() {
        super(-1, -1);
        this.a = 0;
        this.b = 0.5f;
    }

    public czve(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, czvk.d);
        this.a = obtainStyledAttributes.getInt(0, 0);
        this.b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public czve(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
        this.b = 0.5f;
    }
}

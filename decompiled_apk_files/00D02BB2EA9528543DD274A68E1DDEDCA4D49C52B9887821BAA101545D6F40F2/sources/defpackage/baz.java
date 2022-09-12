package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: baz  reason: default package */
/* loaded from: classes3.dex */
public final class baz extends ViewGroup.LayoutParams {
    public boolean a;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;

    public baz() {
        super(-1, -1);
        this.c = 0.0f;
    }

    public baz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
        this.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}

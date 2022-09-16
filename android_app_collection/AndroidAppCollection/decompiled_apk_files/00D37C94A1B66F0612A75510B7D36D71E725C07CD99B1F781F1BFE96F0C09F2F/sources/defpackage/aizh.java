package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: aizh  reason: default package */
/* loaded from: classes.dex */
public final class aizh extends ViewGroup.LayoutParams {
    public final boolean a;

    public aizh(int i, int i2, boolean z) {
        super(i, i2);
        this.a = z;
    }

    public aizh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aheg.a);
        this.a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    public aizh(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = true;
    }
}

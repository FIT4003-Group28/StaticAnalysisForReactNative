package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: nh  reason: default package */
/* loaded from: classes3.dex */
public class nh extends ViewGroup.MarginLayoutParams {
    public int a;

    public nh(int i, int i2) {
        super(i, i2);
        this.a = 8388627;
    }

    public nh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pm.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public nh(nh nhVar) {
        super((ViewGroup.MarginLayoutParams) nhVar);
        this.a = 0;
        this.a = nhVar.a;
    }

    public nh(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}

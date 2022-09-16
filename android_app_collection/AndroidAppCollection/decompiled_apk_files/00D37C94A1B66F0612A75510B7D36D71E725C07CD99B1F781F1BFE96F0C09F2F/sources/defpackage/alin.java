package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: alin  reason: default package */
/* loaded from: classes.dex */
public final class alin extends FrameLayout.LayoutParams {
    public int a;
    float b;

    public alin() {
        super(-1, -1);
        this.a = 0;
        this.b = 0.5f;
    }

    public alin(byte[] bArr) {
        super(-1, -2, 17);
        this.a = 0;
        this.b = 0.5f;
    }

    public alin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alit.d);
        this.a = obtainStyledAttributes.getInt(0, 0);
        this.b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public alin(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
        this.b = 0.5f;
    }
}

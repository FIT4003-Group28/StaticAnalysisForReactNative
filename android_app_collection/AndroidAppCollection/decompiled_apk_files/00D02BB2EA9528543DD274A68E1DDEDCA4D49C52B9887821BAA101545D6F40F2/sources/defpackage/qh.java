package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: qh  reason: default package */
/* loaded from: classes.dex */
public class qh extends ViewGroup.MarginLayoutParams {
    public int a;

    public qh() {
        super(-2, -2);
        this.a = 8388627;
    }

    public qh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sj.b);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public qh(qh qhVar) {
        super((ViewGroup.MarginLayoutParams) qhVar);
        this.a = 0;
        this.a = qhVar.a;
    }

    public qh(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}

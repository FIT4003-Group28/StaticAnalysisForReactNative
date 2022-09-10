package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: anf  reason: default package */
/* loaded from: classes.dex */
public final class anf extends ViewGroup.MarginLayoutParams {
    public int a;
    float b;
    boolean c;
    int d;

    public anf() {
        super(-1, -1);
        this.a = 0;
    }

    public anf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ank.a);
        this.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public anf(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }

    public anf(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.a = 0;
    }

    public anf(anf anfVar) {
        super((ViewGroup.MarginLayoutParams) anfVar);
        this.a = 0;
        this.a = anfVar.a;
    }
}

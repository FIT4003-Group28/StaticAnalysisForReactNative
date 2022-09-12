package com.google.android.apps.gmm.ui.components.terra.callout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class BeakView extends View {
    private final float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeakView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dzvx.c(context, "context");
        dzvx.c(attributeSet, "attrSet");
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, cjka.b, 0, 0);
        try {
            int i = obtainStyledAttributes.getInt(0, 0);
            float f = 0.0f;
            if (i != 0) {
                if (i == 1) {
                    f = 90.0f;
                } else if (i == 2) {
                    f = 180.0f;
                } else if (i == 3) {
                    f = 270.0f;
                }
            }
            obtainStyledAttributes.recycle();
            this.a = f;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        setBackground(new cjja(i, i2, this.a));
        super.onSizeChanged(i, i2, i3, i4);
    }
}

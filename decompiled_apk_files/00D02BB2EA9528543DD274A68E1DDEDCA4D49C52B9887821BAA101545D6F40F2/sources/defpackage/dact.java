package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dact  reason: default package */
/* loaded from: classes5.dex */
public final class dact implements dabg {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public final dabi g;

    public dact(Context context, AttributeSet attributeSet, int i, int i2) {
        dabi dabiVar = new dabi();
        this.g = dabiVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dacu.a, i, i2);
        this.a = obtainStyledAttributes.getInt(8, 0);
        dabiVar.a = c(context, obtainStyledAttributes, 7, R.dimen.mtrl_progress_indicator_size);
        this.d = c(context, obtainStyledAttributes, 1, R.dimen.mtrl_progress_circular_inset);
        this.e = c(context, obtainStyledAttributes, 2, R.dimen.mtrl_progress_circular_radius);
        this.b = obtainStyledAttributes.getBoolean(9, false);
        this.c = obtainStyledAttributes.getInt(3, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            dabiVar.c = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(5, -1));
            if (obtainStyledAttributes.hasValue(4)) {
                throw new IllegalArgumentException("Attributes indicatorColors and indicatorColor cannot be used at the same time.");
            }
            if (dabiVar.c.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        } else if (!obtainStyledAttributes.hasValue(4)) {
            dabiVar.c = new int[]{czxb.a(context, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(4).type == 1) {
            dabiVar.c = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(4, -1));
            if (dabiVar.c.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        } else {
            dabiVar.c = new int[]{obtainStyledAttributes.getColor(4, -1)};
        }
        if (obtainStyledAttributes.hasValue(13)) {
            dabiVar.d = obtainStyledAttributes.getColor(13, -1);
        } else {
            dabiVar.d = dabiVar.c[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            dabiVar.d = czxb.c(dabiVar.d, (int) (f * 255.0f));
        }
        this.f = obtainStyledAttributes.getBoolean(10, true) && this.a == 0 && dabiVar.c.length >= 3;
        dabiVar.b = Math.min(obtainStyledAttributes.getDimensionPixelSize(6, 0), dabiVar.a / 2);
        obtainStyledAttributes.recycle();
        if (this.a != 1 || this.e >= dabiVar.a / 2) {
            if (this.f && dabiVar.b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in linear seamless mode.");
            }
            return;
        }
        throw new IllegalArgumentException("The circularRadius cannot be less than half of the indicatorSize.");
    }

    private static int c(Context context, TypedArray typedArray, int i, int i2) {
        return typedArray.getDimensionPixelSize(i, context.getResources().getDimensionPixelSize(i2));
    }

    @Override // defpackage.dabg
    public final boolean a() {
        return this.c != 0;
    }

    @Override // defpackage.dabg
    public final boolean b() {
        return this.c != 0;
    }
}

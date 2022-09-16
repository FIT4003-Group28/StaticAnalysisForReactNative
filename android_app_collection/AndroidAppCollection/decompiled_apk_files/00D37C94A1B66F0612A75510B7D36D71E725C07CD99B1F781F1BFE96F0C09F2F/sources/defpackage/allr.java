package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: allr  reason: default package */
/* loaded from: classes.dex */
public final class allr {
    public final int a;
    public final int b;
    public int[] c;
    public int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public int i;

    public allr(Context context, AttributeSet attributeSet) {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray a = alli.a(context, attributeSet, almg.a, R.attr.circularProgressIndicatorStyle, 2132084395, new int[0]);
        int e = almu.e(context, a, 8, dimensionPixelSize);
        this.a = e;
        this.b = Math.min(almu.e(context, a, 7, 0), e / 2);
        this.e = a.getInt(4, 0);
        this.f = a.getInt(1, 0);
        if (!a.hasValue(2)) {
            this.c = new int[]{amxp.y(context, R.attr.colorPrimary, -1)};
        } else if (a.peekValue(2).type != 1) {
            this.c = new int[]{a.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(a.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (a.hasValue(6)) {
            this.d = a.getColor(6, -1);
        } else {
            this.d = this.c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.d = amxp.x(this.d, (int) (f * 255.0f));
        }
        a.recycle();
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray a2 = alli.a(context, attributeSet, almg.b, R.attr.circularProgressIndicatorStyle, 2132084395, new int[0]);
        this.g = Math.max(almu.e(context, a2, 2, dimensionPixelSize2), e + e);
        this.h = almu.e(context, a2, 1, dimensionPixelSize3);
        this.i = a2.getInt(0, 0);
        a2.recycle();
    }

    public final boolean a() {
        return this.f != 0;
    }

    public final boolean b() {
        return this.e != 0;
    }
}

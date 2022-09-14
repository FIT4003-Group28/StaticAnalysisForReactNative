package com.facebook.react.fabric.e;

import android.view.View;
import com.facebook.react.uimanager.q;
import com.facebook.yoga.n;
/* loaded from: classes.dex */
public class a {
    public static float a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            return Float.POSITIVE_INFINITY;
        }
        return size;
    }

    public static n a(float f2, float f3) {
        return f2 == f3 ? n.EXACTLY : Float.isInfinite(f3) ? n.UNDEFINED : n.AT_MOST;
    }

    public static float b(float f2, float f3) {
        if (f2 != f3 && Float.isInfinite(f3)) {
            return Float.POSITIVE_INFINITY;
        }
        return q.b(f3);
    }

    public static float b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        return 0.0f;
    }
}

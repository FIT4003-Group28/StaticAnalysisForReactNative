package com.facebook.g.a.c;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: LayoutMeasureUtil.java */
/* loaded from: classes.dex */
public class a {
    public static int a(Layout layout) {
        if (layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        int i = 0;
        for (int i2 = 0; i2 < lineCount; i2++) {
            i = Math.max(i, (int) layout.getLineRight(i2));
        }
        return i;
    }

    public static int b(Layout layout) {
        int i = 0;
        if (layout == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 20 && (layout instanceof StaticLayout)) {
            float lineDescent = layout.getLineDescent(layout.getLineCount() - 1) - layout.getLineAscent(layout.getLineCount() - 1);
            float spacingAdd = lineDescent - ((lineDescent - layout.getSpacingAdd()) / layout.getSpacingMultiplier());
            i = spacingAdd >= BitmapDescriptorFactory.HUE_RED ? (int) (spacingAdd + 0.5d) : -((int) ((-spacingAdd) + 0.5d));
        }
        return layout.getHeight() - i;
    }
}

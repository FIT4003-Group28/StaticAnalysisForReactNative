package defpackage;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: zdb  reason: default package */
/* loaded from: classes4.dex */
public final class zdb {
    public static void a(SwipeLayout swipeLayout, List list) {
        swipeLayout.getClass();
        list.getClass();
        if (swipeLayout.g != null || !list.isEmpty()) {
            if (!(swipeLayout.g instanceof LinearLayout)) {
                LinearLayout linearLayout = new LinearLayout(swipeLayout.getContext());
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
                linearLayout.setOrientation(0);
                linearLayout.setGravity(17);
                swipeLayout.k(linearLayout);
            }
            LinearLayout linearLayout2 = (LinearLayout) swipeLayout.g;
            if (linearLayout2 != null) {
                linearLayout2.removeAllViews();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linearLayout2.addView((View) it.next(), new LinearLayout.LayoutParams(-2, -1));
                }
            }
            swipeLayout.h = !list.isEmpty();
        }
    }

    public static zbf b() {
        return new zbf();
    }

    public static double c(int i) {
        double red = Color.red(i);
        Double.isNaN(red);
        double d = red / 255.0d;
        double pow = d < 0.03928d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double green = Color.green(i);
        Double.isNaN(green);
        double d2 = green / 255.0d;
        double pow2 = d2 < 0.03928d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double blue = Color.blue(i);
        Double.isNaN(blue);
        double d3 = blue / 255.0d;
        return (pow * 0.2126d) + (pow2 * 0.7152d) + ((d3 < 0.03928d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d)) * 0.0722d);
    }

    public static int d(int i, int i2) {
        return (i & 16777215) | (i2 << 24);
    }
}

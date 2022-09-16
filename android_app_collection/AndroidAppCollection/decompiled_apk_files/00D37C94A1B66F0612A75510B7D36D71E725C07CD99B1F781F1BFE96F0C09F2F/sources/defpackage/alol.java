package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
/* compiled from: PG */
/* renamed from: alol  reason: default package */
/* loaded from: classes.dex */
public final class alol extends anqx {
    private static float n(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) (1.0d - Math.cos((d * 3.141592653589793d) / 2.0d));
    }

    private static float o(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) Math.sin((d * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.anqx
    public final void a(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float o;
        float n;
        RectF m = m(tabLayout, view);
        RectF m2 = m(tabLayout, view2);
        if (m.left < m2.left) {
            o = n(f);
            n = o(f);
        } else {
            o = o(f);
            n = n(f);
        }
        drawable.setBounds(alhv.c((int) m.left, (int) m2.left, o), drawable.getBounds().top, alhv.c((int) m.right, (int) m2.right, n), drawable.getBounds().bottom);
    }
}

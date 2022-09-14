package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dafp  reason: default package */
/* loaded from: classes5.dex */
public final class dafp extends dafr {
    private static float c(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) Math.sin((d * 3.141592653589793d) / 2.0d);
    }

    private static float d(float f) {
        double d = f;
        Double.isNaN(d);
        return (float) (1.0d - Math.cos((d * 3.141592653589793d) / 2.0d));
    }

    @Override // defpackage.dafr
    public final void a(dagg daggVar, View view, View view2, float f, Drawable drawable) {
        float c;
        float d;
        RectF b = b(daggVar, view);
        RectF b2 = b(daggVar, view2);
        if (b.left < b2.left) {
            c = d(f);
            d = c(f);
        } else {
            c = c(f);
            d = d(f);
        }
        drawable.setBounds(czum.b((int) b.left, (int) b2.left, c), drawable.getBounds().top, czum.b((int) b.right, (int) b2.right, d), drawable.getBounds().bottom);
    }
}

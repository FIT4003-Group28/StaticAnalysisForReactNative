package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bzkw  reason: default package */
/* loaded from: classes4.dex */
public final class bzkw {
    private final Resources a;

    public bzkw(Resources resources) {
        this.a = resources;
    }

    public static Bitmap a(TextView textView) {
        textView.measure(-2, -2);
        int max = Math.max(1, textView.getMeasuredWidth());
        int max2 = Math.max(1, textView.getMeasuredHeight());
        textView.layout(0, 0, max, max2);
        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
        textView.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static Bitmap b(Context context, cqtd cqtdVar) {
        Drawable a = cqtdVar.a(context);
        return c(context, a, a.getIntrinsicWidth(), a.getIntrinsicHeight());
    }

    public static Bitmap c(Context context, Drawable drawable, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(context.getResources().getDisplayMetrics(), i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public final alcb d(TextView textView) {
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        alcb a = alcc.a();
        a.a = textView.getContext();
        a.k = textView.getPaint();
        a.f = e(R.dimen.transit_line_text_size);
        a.h = Integer.valueOf(e(R.dimen.transit_line_text_min_width));
        a.g = Integer.valueOf(e(R.dimen.transit_line_text_max_width));
        return a;
    }

    public final int e(int i) {
        return this.a.getDimensionPixelSize(i);
    }
}

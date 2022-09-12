package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dhp  reason: default package */
/* loaded from: classes6.dex */
public final class dhp {
    public final Context a;
    public final Executor b;
    public final bvlo c;
    public final Paint d;
    public final int e;
    private final int f;

    public dhp(Activity activity, Executor executor, bvlo bvloVar) {
        this.a = activity;
        this.b = executor;
        this.c = bvloVar;
        Resources resources = activity.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.marker_label_border_size);
        this.f = dimensionPixelSize;
        this.e = resources.getDimensionPixelSize(R.dimen.marker_icon_inset_size);
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(resources.getColor(R.color.circle_border_color));
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setAntiAlias(true);
    }

    public final void a(Canvas canvas, int i) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        paint.setAntiAlias(true);
        canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, (canvas.getWidth() / 2) - (this.f / 2), paint);
    }

    public final void b(Canvas canvas, Paint paint) {
        canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, (canvas.getWidth() / 2) - (this.f / 2), paint);
    }
}

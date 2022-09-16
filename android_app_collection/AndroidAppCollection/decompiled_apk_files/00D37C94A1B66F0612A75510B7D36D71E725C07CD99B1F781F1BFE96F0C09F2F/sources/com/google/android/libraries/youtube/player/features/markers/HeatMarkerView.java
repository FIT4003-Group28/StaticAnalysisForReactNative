package com.google.android.libraries.youtube.player.features.markers;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.youtube.R;
import java.util.List;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class HeatMarkerView extends View {
    public ValueAnimator a;
    public azqb b;
    public float c;
    private final Paint d;
    private final Paint e;
    private final Path f;
    private int g;
    private ahwq h;

    public HeatMarkerView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        List list = (List) this.b.get();
        if (list.isEmpty() || this.h == null) {
            return;
        }
        canvas.save();
        if (this.a.isRunning()) {
            f = ((Float) this.a.getAnimatedValue()).floatValue();
        } else {
            f = this.g;
        }
        float f2 = this.g;
        float width = getWidth();
        this.f.reset();
        this.f.moveTo(0.0f, f2);
        for (int i = 1; i < list.size(); i++) {
            int i2 = i - 1;
            float f3 = ((PointF) list.get(i2)).x;
            this.f.quadTo(f3 * width, zgd.N(f2 - (((PointF) list.get(i2)).y * f), 0.0f, f2), ((PointF) list.get(i)).x * width, zgd.N(f2 - (((PointF) list.get(i)).y * f), 0.0f, f2));
        }
        this.f.lineTo(width, f2);
        this.f.close();
        canvas.drawPath(this.f, this.d);
        canvas.drawRect(0.0f, f2, width, this.h.a, this.d);
        if (this.h.c > 0) {
            float width2 = getWidth() * this.c;
            amxt d = amxt.d(Float.valueOf(width2 - (this.h.c / 2.0f)), Float.valueOf(width2 + (this.h.c / 2.0f)));
            canvas.drawRect(((Float) d.g()).floatValue(), f2 - (((PointF) list.get((int) (list.size() * this.c))).y * f), ((Float) d.h()).floatValue(), f2, this.e);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.h.a);
    }

    public HeatMarkerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        ahwp ahwpVar = new ahwp();
        ahwpVar.c = Integer.valueOf(zew.i(displayMetrics, 0));
        ahwpVar.d = Integer.valueOf(zew.i(displayMetrics, 0));
        ahwpVar.a = Integer.valueOf(zew.i(displayMetrics, 28));
        ahwpVar.b = Integer.valueOf(zew.i(displayMetrics, 4));
        Integer num = ahwpVar.a;
        if (num == null || ahwpVar.b == null || ahwpVar.c == null || ahwpVar.d == null) {
            StringBuilder sb = new StringBuilder();
            if (ahwpVar.a == null) {
                sb.append(" maximumBarHeight");
            }
            if (ahwpVar.b == null) {
                sb.append(" minimumBarHeight");
            }
            if (ahwpVar.c == null) {
                sb.append(" barGap");
            }
            if (ahwpVar.d == null) {
                sb.append(" highlightWidth");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        this.h = new ahwq(num.intValue(), ahwpVar.b.intValue(), ahwpVar.c.intValue(), ahwpVar.d.intValue());
        this.b = usw.p;
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        int orElse = zhn.j(context, R.attr.ytStaticWhite).orElse(0);
        paint.setColor(orElse);
        paint.setAlpha(PrivateKeyType.INVALID);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setColor(orElse);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setAlpha(88);
        this.f = new Path();
        ahwq ahwqVar = this.h;
        int i = ahwqVar.a - ahwqVar.b;
        this.g = i;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, i).setDuration(400L);
        this.a = duration;
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        this.a.addUpdateListener(new ahws(this));
    }
}

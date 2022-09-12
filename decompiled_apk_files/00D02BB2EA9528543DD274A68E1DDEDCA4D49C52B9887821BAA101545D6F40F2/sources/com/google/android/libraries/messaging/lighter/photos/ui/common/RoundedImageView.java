package com.google.android.libraries.messaging.lighter.photos.ui.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RoundedImageView extends AppCompatImageView {
    private final Path a;
    private float[] b;

    public RoundedImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Path path = this.a;
        float width = getWidth();
        float height = getHeight();
        float[] fArr = this.b;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        path.reset();
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        float abs3 = Math.abs(f4);
        float abs4 = Math.abs(f3);
        float min = Math.min(width, height) / 2.0f;
        float min2 = Math.min(abs, min);
        float min3 = Math.min(abs2, min);
        float min4 = Math.min(abs3, min);
        float min5 = Math.min(abs4, min);
        path.moveTo(0.0f, min2);
        path.quadTo(0.0f, 0.0f, min2, 0.0f);
        path.lineTo(width - min3, 0.0f);
        path.quadTo(width, 0.0f, width, min3);
        path.lineTo(width, height - min5);
        path.quadTo(width, height, width - min5, height);
        path.lineTo(min4, height);
        path.quadTo(0.0f, height, 0.0f, height - min4);
        path.close();
        canvas.clipPath(this.a);
        super.onDraw(canvas);
    }

    public void setRadii(float f, float f2, float f3, float f4) {
        boolean a = cste.a(getContext());
        float f5 = true != a ? f : f2;
        if (true != a) {
            f = f2;
        }
        float f6 = true != a ? f4 : f3;
        if (true == a) {
            f3 = f4;
        }
        this.b = new float[]{cuwg.a(getContext(), f5), cuwg.a(getContext(), f), cuwg.a(getContext(), f3), cuwg.a(getContext(), f6)};
        postInvalidate();
    }

    public void setRadius(float f) {
        setRadii(f, f, f, f);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Path();
        this.b = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }
}

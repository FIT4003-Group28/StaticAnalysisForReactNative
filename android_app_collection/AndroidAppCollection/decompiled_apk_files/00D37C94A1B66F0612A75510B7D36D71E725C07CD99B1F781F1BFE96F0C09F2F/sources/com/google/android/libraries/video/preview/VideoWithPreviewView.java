package com.google.android.libraries.video.preview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class VideoWithPreviewView extends vue {
    final Point f;
    public vua g;

    public VideoWithPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new Point();
    }

    @Override // defpackage.vue
    protected float d() {
        return getWidth() / 2.0f;
    }

    @Override // defpackage.vue
    protected float e() {
        return 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vue
    public void i() {
        float width = getWidth();
        float height = getHeight();
        if (width == 0.0f || height == 0.0f) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.mapRect(new RectF(0.0f, 0.0f, width, height));
        this.h.setTransform(matrix);
    }

    @Override // defpackage.vue
    protected final float n() {
        return getHeight() / 2.0f;
    }

    @Override // defpackage.vue
    protected final void o() {
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            i();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        viu.b(View.MeasureSpec.getMode(i) == 1073741824);
        this.f.x = View.MeasureSpec.getSize(i);
        Point point = this.f;
        point.y = (int) ((point.x / this.l) + 0.5f);
        if (u() || View.MeasureSpec.getMode(i2) != 0) {
            int size = u() ? this.m : View.MeasureSpec.getSize(i2);
            if (this.f.y > size) {
                this.f.y = size;
                Point point2 = this.f;
                point2.x = (int) ((point2.y * this.l) + 0.5f);
            }
        }
        vua vuaVar = this.g;
        if (vuaVar != null) {
            vuaVar.a(this.f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f.x, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f.y, 1073741824));
    }

    @Override // defpackage.vue
    public final void p() {
        requestLayout();
    }
}

package com.facebook.f.e;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
/* compiled from: RoundedCornersDrawable.java */
/* loaded from: classes.dex */
public class m extends g implements j {

    /* renamed from: a  reason: collision with root package name */
    a f2441a;

    /* renamed from: c  reason: collision with root package name */
    final float[] f2442c;

    /* renamed from: d  reason: collision with root package name */
    final Paint f2443d;
    private final float[] e;
    private boolean f;
    private float g;
    private int h;
    private int i;
    private float j;
    private final Path k;
    private final Path l;
    private final RectF m;

    /* compiled from: RoundedCornersDrawable.java */
    /* loaded from: classes.dex */
    public enum a {
        OVERLAY_COLOR,
        CLIPPING
    }

    public m(Drawable drawable) {
        super((Drawable) com.facebook.common.d.i.a(drawable));
        this.f2441a = a.OVERLAY_COLOR;
        this.e = new float[8];
        this.f2442c = new float[8];
        this.f2443d = new Paint(1);
        this.f = false;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.h = 0;
        this.i = 0;
        this.j = BitmapDescriptorFactory.HUE_RED;
        this.k = new Path();
        this.l = new Path();
        this.m = new RectF();
    }

    @Override // com.facebook.f.e.j
    public void a(boolean z) {
        this.f = z;
        b();
        invalidateSelf();
    }

    @Override // com.facebook.f.e.j
    public void a(float f) {
        Arrays.fill(this.e, f);
        b();
        invalidateSelf();
    }

    @Override // com.facebook.f.e.j
    public void a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.e, (float) BitmapDescriptorFactory.HUE_RED);
        } else {
            com.facebook.common.d.i.a(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.e, 0, 8);
        }
        b();
        invalidateSelf();
    }

    public void a(int i) {
        this.i = i;
        invalidateSelf();
    }

    @Override // com.facebook.f.e.j
    public void a(int i, float f) {
        this.h = i;
        this.g = f;
        b();
        invalidateSelf();
    }

    @Override // com.facebook.f.e.j
    public void b(float f) {
        this.j = f;
        b();
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b();
    }

    private void b() {
        this.k.reset();
        this.l.reset();
        this.m.set(getBounds());
        this.m.inset(this.j, this.j);
        if (this.f) {
            this.k.addCircle(this.m.centerX(), this.m.centerY(), Math.min(this.m.width(), this.m.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.k.addRoundRect(this.m, this.e, Path.Direction.CW);
        }
        this.m.inset(-this.j, -this.j);
        this.m.inset(this.g / 2.0f, this.g / 2.0f);
        if (this.f) {
            this.l.addCircle(this.m.centerX(), this.m.centerY(), Math.min(this.m.width(), this.m.height()) / 2.0f, Path.Direction.CW);
        } else {
            for (int i = 0; i < this.f2442c.length; i++) {
                this.f2442c[i] = (this.e[i] + this.j) - (this.g / 2.0f);
            }
            this.l.addRoundRect(this.m, this.f2442c, Path.Direction.CW);
        }
        this.m.inset((-this.g) / 2.0f, (-this.g) / 2.0f);
    }

    @Override // com.facebook.f.e.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        switch (this.f2441a) {
            case CLIPPING:
                int save = canvas.save();
                this.k.setFillType(Path.FillType.EVEN_ODD);
                canvas.clipPath(this.k);
                super.draw(canvas);
                canvas.restoreToCount(save);
                break;
            case OVERLAY_COLOR:
                super.draw(canvas);
                this.f2443d.setColor(this.i);
                this.f2443d.setStyle(Paint.Style.FILL);
                this.k.setFillType(Path.FillType.INVERSE_EVEN_ODD);
                canvas.drawPath(this.k, this.f2443d);
                if (this.f) {
                    float width = ((bounds.width() - bounds.height()) + this.g) / 2.0f;
                    float height = ((bounds.height() - bounds.width()) + this.g) / 2.0f;
                    if (width > BitmapDescriptorFactory.HUE_RED) {
                        canvas.drawRect(bounds.left, bounds.top, bounds.left + width, bounds.bottom, this.f2443d);
                        canvas.drawRect(bounds.right - width, bounds.top, bounds.right, bounds.bottom, this.f2443d);
                    }
                    if (height > BitmapDescriptorFactory.HUE_RED) {
                        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.top + height, this.f2443d);
                        canvas.drawRect(bounds.left, bounds.bottom - height, bounds.right, bounds.bottom, this.f2443d);
                        break;
                    }
                }
                break;
        }
        if (this.h != 0) {
            this.f2443d.setStyle(Paint.Style.STROKE);
            this.f2443d.setColor(this.h);
            this.f2443d.setStrokeWidth(this.g);
            this.k.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.l, this.f2443d);
        }
    }
}

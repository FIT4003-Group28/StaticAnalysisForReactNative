package com.facebook.react.flat;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
/* compiled from: AbstractDrawBorder.java */
/* loaded from: classes.dex */
abstract class a extends b {

    /* renamed from: c  reason: collision with root package name */
    private static final Paint f3370c = new Paint(1);

    /* renamed from: d  reason: collision with root package name */
    private static final RectF f3371d = new RectF();
    private int e;
    private int f = -16777216;
    private float g;
    private float h;
    private Path i;

    protected PathEffect d() {
        return null;
    }

    static {
        f3370c.setStyle(Paint.Style.STROKE);
    }

    public final void a(float f) {
        this.g = f;
        c(1);
    }

    public final float a() {
        return this.g;
    }

    public void b(float f) {
        this.h = f;
        c(1);
    }

    public final float b() {
        return this.h;
    }

    public final void a(int i) {
        this.f = i;
    }

    public final int c() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Canvas canvas) {
        if (this.g >= 0.5f && this.f != 0) {
            f3370c.setColor(this.f);
            f3370c.setStrokeWidth(this.g);
            f3370c.setPathEffect(d());
            canvas.drawPath(e(), f3370c);
        }
    }

    protected final void a(Path path, float f) {
        path.reset();
        f3371d.set(n() + f, o() + f, p() - f, q() - f);
        path.addRoundRect(f3371d, this.h, this.h, Path.Direction.CW);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean b(int i) {
        return (this.e & i) == i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(int i) {
        this.e = i | this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(int i) {
        this.e = (~i) & this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Path e() {
        if (b(1)) {
            if (this.i == null) {
                this.i = new Path();
            }
            a(this.i, this.g * 0.5f);
            d(1);
        }
        return this.i;
    }
}

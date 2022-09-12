package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: cscn  reason: default package */
/* loaded from: classes5.dex */
public class cscn {
    public final RectF a = new RectF();
    protected final Matrix b = new Matrix();
    public final Path c = new Path();
    public final Path d = new Path();
    public float e;
    public float f;
    public Paint.Cap g;

    public final void f() {
        this.c.reset();
        this.d.reset();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = Paint.Cap.ROUND;
    }

    public final void g(float f, float f2, float f3) {
        this.b.reset();
        this.b.preScale(f3, f3);
        this.b.preTranslate(f, f2);
        this.c.transform(this.b);
        this.d.transform(this.b);
        this.e *= f3;
        this.f *= f3;
    }
}

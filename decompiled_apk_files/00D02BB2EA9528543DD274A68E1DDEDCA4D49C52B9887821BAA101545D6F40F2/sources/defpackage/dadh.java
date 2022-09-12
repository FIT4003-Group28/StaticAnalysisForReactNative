package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
/* compiled from: PG */
/* renamed from: dadh  reason: default package */
/* loaded from: classes.dex */
public final class dadh {
    public static final int[] g = new int[3];
    public static final float[] h = {0.0f, 0.5f, 1.0f};
    public static final int[] i = new int[4];
    public static final float[] j = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public final Path k = new Path();
    public final Paint l;

    public dadh() {
        Paint paint = new Paint();
        this.l = paint;
        this.a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint2);
    }

    public final void a(int i2) {
        this.d = kc.f(i2, 68);
        this.e = kc.f(i2, 20);
        this.f = kc.f(i2, 0);
        this.a.setColor(this.d);
    }
}

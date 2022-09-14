package c.e.a.c.t;

import android.content.Context;
import android.graphics.Color;
import c.e.a.c.x.b;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4776a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4777b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4778c;

    /* renamed from: d  reason: collision with root package name */
    private final float f4779d;

    public a(Context context) {
        this.f4776a = b.a(context, c.e.a.c.b.elevationOverlayEnabled, false);
        this.f4777b = c.e.a.c.q.a.a(context, c.e.a.c.b.elevationOverlayColor, 0);
        this.f4778c = c.e.a.c.q.a.a(context, c.e.a.c.b.colorSurface, 0);
        this.f4779d = context.getResources().getDisplayMetrics().density;
    }

    private boolean a(int i) {
        return a.g.f.a.c(i, 255) == this.f4778c;
    }

    public float a(float f2) {
        float f3 = this.f4779d;
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int a(int i, float f2) {
        float a2 = a(f2);
        return a.g.f.a.c(c.e.a.c.q.a.a(a.g.f.a.c(i, 255), this.f4777b, a2), Color.alpha(i));
    }

    public boolean a() {
        return this.f4776a;
    }

    public int b(int i, float f2) {
        return (!this.f4776a || !a(i)) ? i : a(i, f2);
    }
}

package defpackage;

import android.content.Context;
import android.widget.Scroller;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ammt  reason: default package */
/* loaded from: classes.dex */
public final class ammt implements akzw {
    public float a;
    private final float b;
    private final float c;
    private final Scroller d;
    private float e;
    private float f;
    private float g;
    private int h;
    private int i;

    public ammt(Context context) {
        this.d = new Scroller(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.b = context.getResources().getDisplayMetrics().heightPixels * 0.125f;
        this.c = f + f;
    }

    private final int j(int i, int i2) {
        this.d.abortAnimation();
        this.d.fling(0, 0, i, 0, -i2, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.d.getFinalX();
    }

    @Override // defpackage.akzw
    public final void a(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = 0.0f;
        float abs = f3 == 0.0f ? 1.0f : Math.abs(15.0f / f3);
        if (abs < 1.0f) {
            f *= abs;
            f2 *= abs;
            f3 *= abs;
            f4 *= abs;
        }
        int round = (int) Math.round(Math.hypot(f, f2));
        int round2 = Math.round(f3 * this.b);
        int round3 = Math.round(f4 * this.c);
        int j = j(round, Integer.MAX_VALUE);
        this.e = round == 0 ? 0.0f : (j * f) / round;
        if (round != 0) {
            f5 = (j * f2) / round;
        }
        this.f = f5;
        this.a = j(round2, (int) (this.b * 4.0f)) / this.b;
        this.g = j(round3, Integer.MAX_VALUE) / this.c;
        int abs2 = Math.abs(round2);
        int abs3 = Math.abs(round3);
        int g = decl.g(round, abs2, abs3);
        if (g == round) {
            this.h = j(round, Integer.MAX_VALUE);
        } else if (g == abs2) {
            this.h = j(abs2, (int) (this.b * 4.0f));
        } else {
            this.h = j(abs3, Integer.MAX_VALUE);
        }
        this.i = 0;
    }

    @Override // defpackage.akzw
    public final void b(float[] fArr) {
        if (this.h == 0) {
            Arrays.fill(fArr, 0.0f);
            return;
        }
        this.d.computeScrollOffset();
        int currX = this.d.getCurrX();
        this.i = currX;
        float f = currX / this.h;
        fArr[0] = ((this.e + 0.0f) * f) + 0.0f;
        fArr[1] = ((this.f + 0.0f) * f) + 0.0f;
        fArr[2] = ((this.a + 0.0f) * f) + 0.0f;
        fArr[3] = ((this.g + 0.0f) * f) + 0.0f;
    }

    @Override // defpackage.akzw
    public final float c() {
        return this.a;
    }

    @Override // defpackage.akzw
    public final boolean d() {
        return (this.e == 0.0f && this.f == 0.0f) ? false : true;
    }

    @Override // defpackage.akzw
    public final boolean e() {
        return this.a != 0.0f;
    }

    @Override // defpackage.akzw
    public final boolean f() {
        return this.g != 0.0f;
    }

    @Override // defpackage.akzw
    public final boolean g() {
        return this.i == this.h;
    }

    @Override // defpackage.akzw
    public final void h() {
        this.d.abortAnimation();
        this.i = this.h;
    }

    @Override // defpackage.akzw
    public final void i() {
    }
}

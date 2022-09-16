package defpackage;

import android.graphics.Color;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bip  reason: default package */
/* loaded from: classes2.dex */
public final class bip {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private float[] i;

    public bip(int i, int i2) {
        this.c = Color.red(i);
        this.d = Color.green(i);
        this.e = Color.blue(i);
        this.a = i;
        this.b = i2;
    }

    private final void d() {
        int f;
        int f2;
        if (!this.f) {
            int d = gy.d(-1, this.a, 4.5f);
            int d2 = gy.d(-1, this.a, 3.0f);
            if (d == -1 || d2 == -1) {
                int d3 = gy.d(-16777216, this.a, 4.5f);
                int d4 = gy.d(-16777216, this.a, 3.0f);
                if (d3 == -1 || d4 == -1) {
                    if (d != -1) {
                        f = gy.f(-1, d);
                    } else {
                        f = gy.f(-16777216, d3);
                    }
                    this.h = f;
                    if (d2 != -1) {
                        f2 = gy.f(-1, d2);
                    } else {
                        f2 = gy.f(-16777216, d4);
                    }
                    this.g = f2;
                    this.f = true;
                    return;
                }
                this.h = gy.f(-16777216, d3);
                this.g = gy.f(-16777216, d4);
                this.f = true;
                return;
            }
            this.h = gy.f(-1, d);
            this.g = gy.f(-1, d2);
            this.f = true;
        }
    }

    public final int a() {
        d();
        return this.h;
    }

    public final int b() {
        d();
        return this.g;
    }

    public final float[] c() {
        if (this.i == null) {
            this.i = new float[3];
        }
        gy.g(this.c, this.d, this.e, this.i);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bip bipVar = (bip) obj;
            if (this.b == bipVar.b && this.a == bipVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return getClass().getSimpleName() + " [RGB: #" + Integer.toHexString(this.a) + "] [HSL: " + Arrays.toString(c()) + "] [Population: " + this.b + "] [Title Text: #" + Integer.toHexString(b()) + "] [Body Text: #" + Integer.toHexString(a()) + ']';
    }
}

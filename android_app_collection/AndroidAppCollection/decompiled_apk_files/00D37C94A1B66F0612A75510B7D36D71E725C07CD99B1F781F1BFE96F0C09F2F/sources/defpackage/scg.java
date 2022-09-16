package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: scg  reason: default package */
/* loaded from: classes4.dex */
public class scg {
    public List a;
    public float[] b;
    public float[] c;
    public int d;
    private float[] e;
    private int[] f;
    private int g;
    private boolean h;

    public scg(int i) {
        this.d = 0;
        this.g = 0;
        this.h = false;
        this.a = sbv.f(i);
        this.b = new float[i];
        this.e = new float[i];
        this.c = new float[i];
        this.f = new int[i];
    }

    public final float a(int i) {
        sho.f(i, this.d);
        float[] fArr = this.e;
        if (fArr != null) {
            return fArr[i];
        }
        return this.b[i];
    }

    public final scx b() {
        List list = this.a;
        float[] fArr = this.e;
        if (fArr == null) {
            fArr = this.b;
        }
        return new scx(list, fArr, this.d);
    }

    public final Object c(int i) {
        sho.f(i, this.d);
        return this.a.get(i);
    }

    public final void d(Object obj, float f, float f2, int i) {
        boolean z = false;
        sho.c(!(this.e == null), "Attempt to add target after animation is complete.");
        this.a.add(obj);
        float[] fArr = this.b;
        int i2 = this.d;
        fArr[i2] = f2;
        this.c[i2] = f;
        this.e[i2] = f;
        this.f[i2] = i;
        boolean z2 = this.h;
        if (f2 != f) {
            z = true;
        }
        this.h = z2 | z;
        e(obj, i2);
        this.d++;
        if (i != 0) {
            this.g++;
        }
    }

    public void e(Object obj, int i) {
    }

    public void f() {
    }

    public final void g(float f) {
        if (this.e != null) {
            int i = 0;
            if (f >= 1.0f) {
                this.e = null;
                this.c = null;
                this.h = false;
                int i2 = this.d;
                int i3 = this.g;
                if (i2 == i3) {
                    return;
                }
                ArrayList f2 = sbv.f(i3);
                float[] fArr = new float[this.g];
                int i4 = 0;
                while (i < this.d) {
                    if (this.f[i] != 0) {
                        f2.add(this.a.get(i));
                        fArr[i4] = this.b[i];
                        i4++;
                    }
                    i++;
                }
                this.d = this.g;
                this.a = f2;
                this.b = fArr;
                this.f = null;
                f();
                return;
            }
            while (true) {
                float[] fArr2 = this.b;
                if (i >= fArr2.length) {
                    return;
                }
                float[] fArr3 = this.e;
                float f3 = fArr2[i];
                float f4 = this.c[i];
                fArr3[i] = ((f3 - f4) * f) + f4;
                i++;
            }
        }
    }

    public scg(scx scxVar) {
        this.h = false;
        this.a = scxVar.a;
        this.b = scxVar.b;
        int i = scxVar.c;
        this.d = i;
        this.g = i;
        f();
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpqm  reason: default package */
/* loaded from: classes5.dex */
public class cpqm<D> {
    public List<D> a;
    public float[] b;
    public float[] c;
    public int d;
    private float[] e;
    private int[] f;
    private int g;
    private boolean h;

    public cpqm(int i) {
        this.d = 0;
        this.g = 0;
        this.h = false;
        this.a = cpwi.b(i);
        this.b = new float[i];
        this.e = new float[i];
        this.c = new float[i];
        this.f = new int[i];
    }

    public final cprd<D> a() {
        List<D> list = this.a;
        float[] fArr = this.e;
        if (fArr == null) {
            fArr = this.b;
        }
        return new cprd<>(list, fArr, this.d);
    }

    public final void b(D d, float f, float f2, int i) {
        boolean z = false;
        cpwl.e(!(this.e == null), "Attempt to add target after animation is complete.");
        this.a.add(d);
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
        c(d, i2);
        this.d++;
        if (i != 0) {
            this.g++;
        }
    }

    public void c(D d, int i) {
    }

    public void e() {
    }

    public final D f(int i) {
        cpwl.g(i, this.d);
        return this.a.get(i);
    }

    public final float g(int i) {
        cpwl.g(i, this.d);
        float[] fArr = this.e;
        if (fArr != null) {
            return fArr[i];
        }
        return this.b[i];
    }

    public final void d(float f) {
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
                ArrayList b = cpwi.b(i3);
                float[] fArr = new float[this.g];
                int i4 = 0;
                while (i < this.d) {
                    if (this.f[i] != 0) {
                        b.add(this.a.get(i));
                        fArr[i4] = this.b[i];
                        i4++;
                    }
                    i++;
                }
                this.d = this.g;
                this.a = b;
                this.b = fArr;
                this.f = null;
                e();
                return;
            }
            while (true) {
                float[] fArr2 = this.b;
                if (i >= fArr2.length) {
                    return;
                }
                float[] fArr3 = this.e;
                float f2 = fArr2[i];
                float f3 = this.c[i];
                fArr3[i] = ((f2 - f3) * f) + f3;
                i++;
            }
        }
    }

    public cpqm(cprd<D> cprdVar) {
        this.d = 0;
        this.g = 0;
        this.h = false;
        this.a = cprdVar.a;
        this.b = cprdVar.b;
        int i = cprdVar.c;
        this.d = i;
        this.g = i;
        e();
    }
}

package c.a.a.x;

import android.graphics.Color;
import c.a.a.x.k0.c;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class l implements j0<c.a.a.v.k.c> {

    /* renamed from: a  reason: collision with root package name */
    private int f2660a;

    public l(int i) {
        this.f2660a = i;
    }

    private int a(double d2, double[] dArr, double[] dArr2) {
        double d3;
        int i = 1;
        while (true) {
            if (i >= dArr.length) {
                d3 = dArr2[dArr2.length - 1];
                break;
            }
            int i2 = i - 1;
            double d4 = dArr[i2];
            double d5 = dArr[i];
            if (dArr[i] >= d2) {
                d3 = c.a.a.y.g.a(dArr2[i2], dArr2[i], (d2 - d4) / (d5 - d4));
                break;
            }
            i++;
        }
        return (int) (d3 * 255.0d);
    }

    private void a(c.a.a.v.k.c cVar, List<Float> list) {
        int i = this.f2660a * 4;
        if (list.size() <= i) {
            return;
        }
        int size = (list.size() - i) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                dArr[i2] = list.get(i).floatValue();
            } else {
                dArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        for (int i3 = 0; i3 < cVar.c(); i3++) {
            int i4 = cVar.a()[i3];
            cVar.a()[i3] = Color.argb(a(cVar.b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.a.a.x.j0
    /* renamed from: a */
    public c.a.a.v.k.c mo113a(c.a.a.x.k0.c cVar, float f2) {
        ArrayList arrayList = new ArrayList();
        boolean z = cVar.A() == c.b.BEGIN_ARRAY;
        if (z) {
            cVar.a();
        }
        while (cVar.f()) {
            arrayList.add(Float.valueOf((float) cVar.h()));
        }
        if (z) {
            cVar.c();
        }
        if (this.f2660a == -1) {
            this.f2660a = arrayList.size() / 4;
        }
        int i = this.f2660a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f2660a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        c.a.a.v.k.c cVar2 = new c.a.a.v.k.c(fArr, iArr);
        a(cVar2, arrayList);
        return cVar2;
    }
}

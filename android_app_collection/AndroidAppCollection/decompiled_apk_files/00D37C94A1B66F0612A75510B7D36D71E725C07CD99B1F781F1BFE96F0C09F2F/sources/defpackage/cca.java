package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: cca  reason: default package */
/* loaded from: classes2.dex */
public final class cca implements ccs {
    private int a;

    public cca(int i) {
        this.a = i;
    }

    @Override // defpackage.ccs
    public final /* bridge */ /* synthetic */ Object a(ccw ccwVar, float f) {
        double d;
        ArrayList arrayList = new ArrayList();
        int r = ccwVar.r();
        if (r == 1) {
            ccwVar.i();
        }
        while (ccwVar.p()) {
            arrayList.add(Float.valueOf((float) ccwVar.a()));
        }
        if (r == 1) {
            ccwVar.k();
        }
        int i = this.a;
        if (i == -1) {
            i = arrayList.size() / 4;
            this.a = i;
        }
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                Double.isNaN(floatValue);
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                Double.isNaN(floatValue);
                iArr[i5] = Color.argb((int) PrivateKeyType.INVALID, i3, i2, (int) (floatValue * 255.0d));
            }
        }
        cao caoVar = new cao(fArr, iArr);
        int i7 = this.a * 4;
        if (arrayList.size() > i7) {
            int size = (arrayList.size() - i7) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i8 = 0;
            while (i7 < arrayList.size()) {
                if (i7 % 2 == 0) {
                    dArr[i8] = ((Float) arrayList.get(i7)).floatValue();
                } else {
                    dArr2[i8] = ((Float) arrayList.get(i7)).floatValue();
                    i8++;
                }
                i7++;
            }
            for (int i9 = 0; i9 < caoVar.a(); i9++) {
                int i10 = caoVar.b[i9];
                double d2 = caoVar.a[i9];
                int i11 = 1;
                while (true) {
                    if (i11 < size) {
                        int i12 = i11 - 1;
                        double d3 = dArr[i12];
                        double d4 = dArr[i11];
                        if (d4 >= d2) {
                            Double.isNaN(d2);
                            d = cdc.a(dArr2[i12], dArr2[i11], cdc.j((d2 - d3) / (d4 - d3)));
                            break;
                        }
                        i11++;
                    } else {
                        d = dArr2[size - 1];
                        break;
                    }
                }
                caoVar.b[i9] = Color.argb((int) (d * 255.0d), Color.red(i10), Color.green(i10), Color.blue(i10));
            }
        }
        return caoVar;
    }
}

package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: boi  reason: default package */
/* loaded from: classes3.dex */
public final class boi implements bpe<bmt> {
    private int a;

    public boi(int i) {
        this.a = i;
    }

    @Override // defpackage.bpe
    public final /* bridge */ /* synthetic */ bmt a(bpj bpjVar, float f) {
        double d;
        ArrayList arrayList = new ArrayList();
        int r = bpjVar.r();
        if (r == 1) {
            bpjVar.d();
        }
        while (bpjVar.h()) {
            arrayList.add(Float.valueOf((float) bpjVar.n()));
        }
        if (r == 1) {
            bpjVar.e();
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
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                Double.isNaN(floatValue);
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                Double.isNaN(floatValue);
                iArr[i5] = Color.argb(255, i3, i2, (int) (floatValue * 255.0d));
            }
        }
        bmt bmtVar = new bmt(fArr, iArr);
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
            for (int i9 = 0; i9 < bmtVar.a(); i9++) {
                int i10 = bmtVar.b[i9];
                double d2 = bmtVar.a[i9];
                int i11 = 1;
                while (true) {
                    if (i11 >= size) {
                        d = dArr2[size - 1];
                        break;
                    }
                    int i12 = i11 - 1;
                    double d3 = dArr[i12];
                    double d4 = dArr[i11];
                    if (d4 >= d2) {
                        double d5 = dArr2[i12];
                        double d6 = dArr2[i11];
                        Double.isNaN(d2);
                        d = bpr.d(d5, d6, (d2 - d3) / (d4 - d3));
                        break;
                    }
                    i11++;
                }
                bmtVar.b[i9] = Color.argb((int) (d * 255.0d), Color.red(i10), Color.green(i10), Color.blue(i10));
            }
        }
        return bmtVar;
    }
}

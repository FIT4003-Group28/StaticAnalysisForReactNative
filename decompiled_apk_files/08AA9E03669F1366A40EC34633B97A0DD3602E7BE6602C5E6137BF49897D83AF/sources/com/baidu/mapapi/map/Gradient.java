package com.baidu.mapapi.map;

import android.graphics.Color;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import java.util.HashMap;
/* loaded from: classes.dex */
public class Gradient {

    /* renamed from: a  reason: collision with root package name */
    private final int f1578a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f1579b;

    /* renamed from: c  reason: collision with root package name */
    private final float[] f1580c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: b  reason: collision with root package name */
        private final int f1582b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1583c;

        /* renamed from: d  reason: collision with root package name */
        private final float f1584d;

        private a(int i, int i2, float f) {
            this.f1582b = i;
            this.f1583c = i2;
            this.f1584d = f;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, NetstatsParserPatterns.NEW_TS_TO_MILLIS);
    }

    private Gradient(int[] iArr, float[] fArr, int i) {
        if (iArr == null || fArr == null) {
            throw new IllegalArgumentException("colors and startPoints should not be null");
        }
        if (iArr.length != fArr.length) {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        }
        if (iArr.length == 0) {
            throw new IllegalArgumentException("No colors have been defined");
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            if (fArr[i2] <= fArr[i2 - 1]) {
                throw new IllegalArgumentException("startPoints should be in increasing order");
            }
        }
        this.f1578a = i;
        this.f1579b = new int[iArr.length];
        this.f1580c = new float[fArr.length];
        System.arraycopy(iArr, 0, this.f1579b, 0, iArr.length);
        System.arraycopy(fArr, 0, this.f1580c, 0, fArr.length);
    }

    private static int a(int i, int i2, float f) {
        int alpha = (int) (((Color.alpha(i2) - Color.alpha(i)) * f) + Color.alpha(i));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i2), Color.green(i2), Color.blue(i2), fArr2);
        if (fArr[0] - fArr2[0] > 180.0f) {
            fArr2[0] = fArr2[0] + 360.0f;
        } else if (fArr2[0] - fArr[0] > 180.0f) {
            fArr[0] = fArr[0] + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            fArr3[i3] = ((fArr2[i3] - fArr[i3]) * f) + fArr[i3];
        }
        return Color.HSVToColor(alpha, fArr3);
    }

    private HashMap<Integer, a> a() {
        HashMap<Integer, a> hashMap = new HashMap<>();
        if (this.f1580c[0] != com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) {
            hashMap.put(0, new a(Color.argb(0, Color.red(this.f1579b[0]), Color.green(this.f1579b[0]), Color.blue(this.f1579b[0])), this.f1579b[0], this.f1578a * this.f1580c[0]));
        }
        for (int i = 1; i < this.f1579b.length; i++) {
            int i2 = i - 1;
            hashMap.put(Integer.valueOf((int) (this.f1578a * this.f1580c[i2])), new a(this.f1579b[i2], this.f1579b[i], this.f1578a * (this.f1580c[i] - this.f1580c[i2])));
        }
        if (this.f1580c[this.f1580c.length - 1] != 1.0f) {
            int length = this.f1580c.length - 1;
            hashMap.put(Integer.valueOf((int) (this.f1578a * this.f1580c[length])), new a(this.f1579b[length], this.f1579b[length], this.f1578a * (1.0f - this.f1580c[length])));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] a(double d2) {
        HashMap<Integer, a> a2 = a();
        int[] iArr = new int[this.f1578a];
        a aVar = a2.get(0);
        int i = 0;
        for (int i2 = 0; i2 < this.f1578a; i2++) {
            if (a2.containsKey(Integer.valueOf(i2))) {
                aVar = a2.get(Integer.valueOf(i2));
                i = i2;
            }
            iArr[i2] = a(aVar.f1582b, aVar.f1583c, (i2 - i) / aVar.f1584d);
        }
        if (d2 != 1.0d) {
            for (int i3 = 0; i3 < this.f1578a; i3++) {
                int i4 = iArr[i3];
                iArr[i3] = Color.argb((int) (Color.alpha(i4) * d2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
        return iArr;
    }
}

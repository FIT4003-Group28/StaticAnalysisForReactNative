package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
/* loaded from: classes.dex */
class h extends d {

    /* renamed from: e  reason: collision with root package name */
    private long f5369e;

    /* renamed from: f  reason: collision with root package name */
    private double[] f5370f;

    /* renamed from: g  reason: collision with root package name */
    private double f5371g;

    /* renamed from: h  reason: collision with root package name */
    private double f5372h;
    private int i;
    private int j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ReadableMap readableMap) {
        a(readableMap);
    }

    @Override // com.facebook.react.animated.d
    public void a(long j) {
        double d2;
        if (this.f5369e < 0) {
            this.f5369e = j;
            if (this.j == 1) {
                this.f5372h = this.f5362b.f5405f;
            }
        }
        int round = (int) Math.round(((j - this.f5369e) / 1000000) / 16.666666666666668d);
        if (round >= 0) {
            if (this.f5361a) {
                return;
            }
            double[] dArr = this.f5370f;
            if (round >= dArr.length - 1) {
                d2 = this.f5371g;
                int i = this.i;
                if (i == -1 || this.j < i) {
                    this.f5369e = -1L;
                    this.j++;
                } else {
                    this.f5361a = true;
                }
            } else {
                double d3 = this.f5372h;
                d2 = d3 + (dArr[round] * (this.f5371g - d3));
            }
            this.f5362b.f5405f = d2;
            return;
        }
        throw new IllegalStateException("Calculated frame index should never be lower than 0");
    }

    @Override // com.facebook.react.animated.d
    public void a(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.f5370f;
        if (dArr == null || dArr.length != size) {
            this.f5370f = new double[size];
        }
        boolean z = false;
        for (int i = 0; i < size; i++) {
            this.f5370f[i] = array.getDouble(i);
        }
        double d2 = 0.0d;
        if (readableMap.hasKey("toValue") && readableMap.getType("toValue") == ReadableType.Number) {
            d2 = readableMap.getDouble("toValue");
        }
        this.f5371g = d2;
        if (readableMap.hasKey("iterations")) {
            this.i = readableMap.getType("iterations") == ReadableType.Number ? readableMap.getInt("iterations") : 1;
        } else {
            this.i = 1;
        }
        this.j = 1;
        if (this.i == 0) {
            z = true;
        }
        this.f5361a = z;
        this.f5369e = -1L;
    }
}

package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
class g extends s {
    private final l i;
    private final int[] j;

    public g(ReadableMap readableMap, l lVar) {
        this.i = lVar;
        ReadableArray array = readableMap.getArray("input");
        this.j = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.j;
            if (i < iArr.length) {
                iArr[i] = array.getInt(i);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.react.animated.b
    public void a() {
        int i = 0;
        while (true) {
            int[] iArr = this.j;
            if (i >= iArr.length) {
                return;
            }
            b d2 = this.i.d(iArr[i]);
            if (d2 == null || !(d2 instanceof s)) {
                break;
            }
            double e2 = ((s) d2).e();
            if (i == 0) {
                this.f5405f = e2;
            } else if (e2 == 0.0d) {
                throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node");
            } else {
                this.f5405f /= e2;
            }
            i++;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node");
    }
}

package com.facebook.react.uimanager;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
/* loaded from: classes.dex */
public class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static ThreadLocal<double[]> f6020a = new a();

    /* loaded from: classes.dex */
    static class a extends ThreadLocal<double[]> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public double[] initialValue() {
            return new double[16];
        }
    }

    private static double a(ReadableMap readableMap, String str) {
        double d2;
        boolean z = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z = false;
            }
            d2 = Float.parseFloat(string);
        } else {
            d2 = readableMap.getDouble(str);
        }
        return z ? d2 : j.a(d2);
    }

    public static void a(ReadableArray readableArray, double[] dArr) {
        double d2;
        double[] dArr2 = f6020a.get();
        j.c(dArr);
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap mo209getMap = readableArray.mo209getMap(i);
            String nextKey = mo209getMap.keySetIterator().nextKey();
            j.c(dArr2);
            if ("matrix".equals(nextKey)) {
                ReadableArray array = mo209getMap.getArray(nextKey);
                for (int i2 = 0; i2 < 16; i2++) {
                    dArr2[i2] = array.getDouble(i2);
                }
            } else if ("perspective".equals(nextKey)) {
                j.a(dArr2, mo209getMap.getDouble(nextKey));
            } else if ("rotateX".equals(nextKey)) {
                j.b(dArr2, a(mo209getMap, nextKey));
            } else if ("rotateY".equals(nextKey)) {
                j.c(dArr2, a(mo209getMap, nextKey));
            } else if ("rotate".equals(nextKey) || "rotateZ".equals(nextKey)) {
                j.d(dArr2, a(mo209getMap, nextKey));
            } else {
                if ("scale".equals(nextKey)) {
                    d2 = mo209getMap.getDouble(nextKey);
                    j.e(dArr2, d2);
                } else if ("scaleX".equals(nextKey)) {
                    j.e(dArr2, mo209getMap.getDouble(nextKey));
                } else if ("scaleY".equals(nextKey)) {
                    d2 = mo209getMap.getDouble(nextKey);
                } else {
                    double d3 = 0.0d;
                    if ("translate".equals(nextKey)) {
                        ReadableArray array2 = mo209getMap.getArray(nextKey);
                        double d4 = array2.getDouble(0);
                        double d5 = array2.getDouble(1);
                        if (array2.size() > 2) {
                            d3 = array2.getDouble(2);
                        }
                        j.a(dArr2, d4, d5, d3);
                    } else if ("translateX".equals(nextKey)) {
                        j.a(dArr2, mo209getMap.getDouble(nextKey), 0.0d);
                    } else if ("translateY".equals(nextKey)) {
                        j.a(dArr2, 0.0d, mo209getMap.getDouble(nextKey));
                    } else if ("skewX".equals(nextKey)) {
                        j.g(dArr2, a(mo209getMap, nextKey));
                    } else if (!"skewY".equals(nextKey)) {
                        throw new JSApplicationIllegalArgumentException("Unsupported transform type: " + nextKey);
                    } else {
                        j.h(dArr2, a(mo209getMap, nextKey));
                    }
                }
                j.f(dArr2, d2);
            }
            j.a(dArr, dArr, dArr2);
        }
    }
}

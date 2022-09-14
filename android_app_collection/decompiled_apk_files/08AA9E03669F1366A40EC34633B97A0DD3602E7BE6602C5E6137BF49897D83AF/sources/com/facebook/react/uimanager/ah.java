package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableType;
/* compiled from: TransformHelper.java */
/* loaded from: classes.dex */
public class ah {

    /* renamed from: a  reason: collision with root package name */
    private static ThreadLocal<double[]> f3752a = new ThreadLocal<double[]>() { // from class: com.facebook.react.uimanager.ah.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public double[] initialValue() {
            return new double[16];
        }
    };

    private static double a(com.facebook.react.bridge.an anVar, String str) {
        double d2;
        boolean z = true;
        if (anVar.getType(str) == ReadableType.String) {
            String string = anVar.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z = false;
            }
            d2 = Float.parseFloat(string);
        } else {
            d2 = anVar.getDouble(str);
        }
        return z ? d2 : h.b(d2);
    }

    public static void a(com.facebook.react.bridge.am amVar, double[] dArr) {
        double[] dArr2 = f3752a.get();
        h.e(dArr);
        int size = amVar.size();
        for (int i = 0; i < size; i++) {
            com.facebook.react.bridge.an c2 = amVar.c(i);
            String nextKey = c2.a().nextKey();
            h.e(dArr2);
            if ("matrix".equals(nextKey)) {
                com.facebook.react.bridge.am e = c2.e(nextKey);
                for (int i2 = 0; i2 < 16; i2++) {
                    dArr2[i2] = e.getDouble(i2);
                }
            } else if ("perspective".equals(nextKey)) {
                h.b(dArr2, c2.getDouble(nextKey));
            } else if ("rotateX".equals(nextKey)) {
                h.g(dArr2, a(c2, nextKey));
            } else if ("rotateY".equals(nextKey)) {
                h.h(dArr2, a(c2, nextKey));
            } else if ("rotate".equals(nextKey) || "rotateZ".equals(nextKey)) {
                h.i(dArr2, a(c2, nextKey));
            } else if ("scale".equals(nextKey)) {
                double d2 = c2.getDouble(nextKey);
                h.c(dArr2, d2);
                h.d(dArr2, d2);
            } else if ("scaleX".equals(nextKey)) {
                h.c(dArr2, c2.getDouble(nextKey));
            } else if ("scaleY".equals(nextKey)) {
                h.d(dArr2, c2.getDouble(nextKey));
            } else {
                double d3 = 0.0d;
                if ("translate".equals(nextKey)) {
                    com.facebook.react.bridge.am e2 = c2.e(nextKey);
                    double d4 = e2.getDouble(0);
                    double d5 = e2.getDouble(1);
                    if (e2.size() > 2) {
                        d3 = e2.getDouble(2);
                    }
                    h.a(dArr2, d4, d5, d3);
                } else if ("translateX".equals(nextKey)) {
                    h.a(dArr2, c2.getDouble(nextKey), 0.0d);
                } else if ("translateY".equals(nextKey)) {
                    h.a(dArr2, 0.0d, c2.getDouble(nextKey));
                } else if ("skewX".equals(nextKey)) {
                    h.e(dArr2, a(c2, nextKey));
                } else if ("skewY".equals(nextKey)) {
                    h.f(dArr2, a(c2, nextKey));
                } else {
                    throw new com.facebook.react.bridge.n("Unsupported transform type: " + nextKey);
                }
            }
            h.a(dArr, dArr, dArr2);
        }
    }
}

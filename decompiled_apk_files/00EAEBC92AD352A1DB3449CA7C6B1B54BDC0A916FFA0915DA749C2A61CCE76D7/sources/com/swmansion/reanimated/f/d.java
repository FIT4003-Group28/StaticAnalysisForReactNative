package com.swmansion.reanimated.f;

import a.r.a0;
import a.r.b0;
import a.r.e;
import a.r.f;
import a.r.v0;
import a.r.w;
import a.r.x;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
class d {
    private static v0 a(String str) {
        if (str == null || "none".equals(str)) {
            return null;
        }
        if ("fade".equals(str)) {
            return new f(3);
        }
        if ("scale".equals(str)) {
            return new b();
        }
        if ("slide-top".equals(str)) {
            return new w(48);
        }
        if ("slide-bottom".equals(str)) {
            return new w(80);
        }
        if ("slide-right".equals(str)) {
            return new w(5);
        }
        if ("slide-left".equals(str)) {
            return new w(3);
        }
        throw new JSApplicationIllegalArgumentException("Invalid transition type " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static x a(ReadableMap readableMap) {
        String string = readableMap.getString("type");
        if ("group".equals(string)) {
            return c(readableMap);
        }
        if ("in".equals(string)) {
            return d(readableMap);
        }
        if ("out".equals(string)) {
            return e(readableMap);
        }
        if ("change".equals(string)) {
            return b(readableMap);
        }
        throw new JSApplicationIllegalArgumentException("Unrecognized transition type " + string);
    }

    private static void a(x xVar, ReadableMap readableMap) {
        int i;
        TimeInterpolator linearInterpolator;
        if (readableMap.hasKey("durationMs")) {
            xVar.mo19a(readableMap.getInt("durationMs"));
        }
        if (readableMap.hasKey("interpolation")) {
            String string = readableMap.getString("interpolation");
            if (string.equals("easeIn")) {
                linearInterpolator = new AccelerateInterpolator();
            } else if (string.equals("easeOut")) {
                linearInterpolator = new DecelerateInterpolator();
            } else if (string.equals("easeInOut")) {
                linearInterpolator = new AccelerateDecelerateInterpolator();
            } else if (!string.equals("linear")) {
                throw new JSApplicationIllegalArgumentException("Invalid interpolation type " + string);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
            xVar.mo21a(linearInterpolator);
        }
        if (readableMap.hasKey("propagation")) {
            String string2 = readableMap.getString("propagation");
            a aVar = new a();
            if ("top".equals(string2)) {
                i = 80;
            } else if ("bottom".equals(string2)) {
                i = 48;
            } else if ("left".equals(string2)) {
                i = 5;
            } else {
                if ("right".equals(string2)) {
                    i = 3;
                }
                xVar.a(aVar);
            }
            aVar.a(i);
            xVar.a(aVar);
        } else {
            xVar.a((a0) null);
        }
        if (readableMap.hasKey("delayMs")) {
            xVar.mo23b(readableMap.getInt("delayMs"));
        }
    }

    private static x b(ReadableMap readableMap) {
        a.r.d dVar = new a.r.d();
        e eVar = new e();
        a(dVar, readableMap);
        a(eVar, readableMap);
        b0 b0Var = new b0();
        b0Var.a(dVar);
        b0Var.a(eVar);
        return b0Var;
    }

    private static x c(ReadableMap readableMap) {
        b0 b0Var = new b0();
        if (!readableMap.hasKey("sequence") || !readableMap.getBoolean("sequence")) {
            b0Var.b(0);
        } else {
            b0Var.b(1);
        }
        ReadableArray array = readableMap.getArray("transitions");
        int size = array.size();
        for (int i = 0; i < size; i++) {
            x a2 = a(array.mo209getMap(i));
            if (a2 != null) {
                b0Var.a(a2);
            }
        }
        return b0Var;
    }

    private static x d(ReadableMap readableMap) {
        v0 a2 = a(readableMap.getString("animation"));
        if (a2 == null) {
            return null;
        }
        a2.a(1);
        a(a2, readableMap);
        return a2;
    }

    private static x e(ReadableMap readableMap) {
        v0 a2 = a(readableMap.getString("animation"));
        if (a2 == null) {
            return null;
        }
        a2.a(2);
        a(a2, readableMap);
        return a2;
    }
}

package com.facebook.react.views.image;

import com.facebook.f.e.o;
import com.facebook.react.bridge.n;
/* compiled from: ImageResizeMode.java */
/* loaded from: classes.dex */
public class d {
    public static o.b a(String str) {
        if ("contain".equals(str)) {
            return o.b.f2453c;
        }
        if ("cover".equals(str)) {
            return o.b.g;
        }
        if ("stretch".equals(str)) {
            return o.b.f2451a;
        }
        if ("center".equals(str)) {
            return o.b.f;
        }
        if (str == null) {
            return a();
        }
        throw new n("Invalid resize mode: '" + str + "'");
    }

    public static o.b a() {
        return o.b.g;
    }
}

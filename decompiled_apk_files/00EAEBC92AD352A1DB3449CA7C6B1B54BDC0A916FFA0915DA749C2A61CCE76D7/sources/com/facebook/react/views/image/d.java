package com.facebook.react.views.image;

import android.graphics.Shader;
import c.d.h.e.r;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
/* loaded from: classes.dex */
public class d {
    public static Shader.TileMode a() {
        return Shader.TileMode.CLAMP;
    }

    public static r.b a(String str) {
        if ("contain".equals(str)) {
            return r.b.f3072b;
        }
        if ("cover".equals(str)) {
            return r.b.f3075e;
        }
        if ("stretch".equals(str)) {
            return r.b.f3071a;
        }
        if ("center".equals(str)) {
            return r.b.f3074d;
        }
        if ("repeat".equals(str)) {
            return h.f6163g;
        }
        if (str == null) {
            return b();
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
    }

    public static Shader.TileMode b(String str) {
        if ("contain".equals(str) || "cover".equals(str) || "stretch".equals(str) || "center".equals(str)) {
            return Shader.TileMode.CLAMP;
        }
        if ("repeat".equals(str)) {
            return Shader.TileMode.REPEAT;
        }
        if (str == null) {
            return a();
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
    }

    public static r.b b() {
        return r.b.f3075e;
    }
}

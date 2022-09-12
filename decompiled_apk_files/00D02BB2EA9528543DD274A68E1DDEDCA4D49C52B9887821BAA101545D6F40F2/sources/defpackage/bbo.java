package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bbo  reason: default package */
/* loaded from: classes.dex */
public final class bbo {
    public final Map<String, Object> a = new HashMap();

    public final bbp a() {
        bbp bbpVar = new bbp(this.a);
        bbp.f(bbpVar);
        return bbpVar;
    }

    public final void b(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                this.a.put(key, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.a.put(key, value);
                } else if (cls == boolean[].class) {
                    this.a.put(key, bbp.h((boolean[]) value));
                } else if (cls == byte[].class) {
                    this.a.put(key, bbp.i((byte[]) value));
                } else if (cls == int[].class) {
                    this.a.put(key, bbp.j((int[]) value));
                } else if (cls == long[].class) {
                    this.a.put(key, bbp.k((long[]) value));
                } else if (cls == float[].class) {
                    this.a.put(key, bbp.l((float[]) value));
                } else if (cls == double[].class) {
                    this.a.put(key, bbp.m((double[]) value));
                } else {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", key, cls));
                }
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        this.a.put(str, bbp.i(bArr));
    }

    public final void d(int i) {
        this.a.put("atn_subscription_reason", Integer.valueOf(i));
    }

    public final void e(String str, String str2) {
        this.a.put(str, str2);
    }
}

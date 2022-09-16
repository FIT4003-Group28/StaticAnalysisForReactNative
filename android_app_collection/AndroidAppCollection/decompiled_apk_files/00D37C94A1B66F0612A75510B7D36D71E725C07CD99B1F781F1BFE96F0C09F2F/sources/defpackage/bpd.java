package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bpd  reason: default package */
/* loaded from: classes2.dex */
public final class bpd {
    private bpd() {
    }

    public static final bpx a(Map map) {
        bpx bpxVar = new bpx(map);
        bpx.e(bpxVar);
        return bpxVar;
    }

    public static final void b(Map map, Map map2) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                map2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map2.put(str, value);
                } else if (cls == boolean[].class) {
                    map2.put(str, bpx.f((boolean[]) value));
                } else if (cls == byte[].class) {
                    map2.put(str, bpx.g((byte[]) value));
                } else if (cls == int[].class) {
                    map2.put(str, bpx.j((int[]) value));
                } else if (cls == long[].class) {
                    map2.put(str, bpx.k((long[]) value));
                } else if (cls == float[].class) {
                    map2.put(str, bpx.i((float[]) value));
                } else if (cls == double[].class) {
                    map2.put(str, bpx.h((double[]) value));
                } else {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                }
            }
        }
    }

    public static final void c(String str, byte[] bArr, Map map) {
        map.put(str, bpx.g(bArr));
    }

    public static final void d(String str, String str2, Map map) {
        map.put(str, str2);
    }
}

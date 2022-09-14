package com.google.protobuf;
/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: classes.dex */
final class o {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f4688a = a();

    static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.n");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static p b() {
        if (f4688a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return p.f4690b;
    }

    private static final p a(String str) {
        return (p) f4688a.getMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}

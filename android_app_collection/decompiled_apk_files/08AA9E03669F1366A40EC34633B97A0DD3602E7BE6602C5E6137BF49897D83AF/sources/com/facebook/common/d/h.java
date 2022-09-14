package com.facebook.common.d;

import java.util.Arrays;
/* compiled from: Objects.java */
/* loaded from: classes.dex */
public final class h {
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a a(Object obj) {
        return new a(a(obj.getClass()));
    }

    private static String a(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }

    /* compiled from: Objects.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f2268a;

        /* renamed from: b  reason: collision with root package name */
        private C0048a f2269b;

        /* renamed from: c  reason: collision with root package name */
        private C0048a f2270c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2271d;

        private a(String str) {
            this.f2269b = new C0048a();
            this.f2270c = this.f2269b;
            this.f2271d = false;
            this.f2268a = (String) i.a(str);
        }

        public a a(String str, Object obj) {
            return b(str, obj);
        }

        public a a(String str, boolean z) {
            return b(str, String.valueOf(z));
        }

        public a a(String str, int i) {
            return b(str, String.valueOf(i));
        }

        public String toString() {
            boolean z = this.f2271d;
            String str = "";
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f2268a);
            sb.append('{');
            for (C0048a c0048a = this.f2269b.f2274c; c0048a != null; c0048a = c0048a.f2274c) {
                if (!z || c0048a.f2273b != null) {
                    sb.append(str);
                    str = ", ";
                    if (c0048a.f2272a != null) {
                        sb.append(c0048a.f2272a);
                        sb.append('=');
                    }
                    sb.append(c0048a.f2273b);
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private C0048a a() {
            C0048a c0048a = new C0048a();
            this.f2270c.f2274c = c0048a;
            this.f2270c = c0048a;
            return c0048a;
        }

        private a b(String str, Object obj) {
            C0048a a2 = a();
            a2.f2273b = obj;
            a2.f2272a = (String) i.a(str);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: Objects.java */
        /* renamed from: com.facebook.common.d.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0048a {

            /* renamed from: a  reason: collision with root package name */
            String f2272a;

            /* renamed from: b  reason: collision with root package name */
            Object f2273b;

            /* renamed from: c  reason: collision with root package name */
            C0048a f2274c;

            private C0048a() {
            }
        }
    }
}

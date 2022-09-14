package c.d.d.d;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f2808a;

        /* renamed from: b  reason: collision with root package name */
        private a f2809b;

        /* renamed from: c  reason: collision with root package name */
        private a f2810c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2811d;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            String f2812a;

            /* renamed from: b  reason: collision with root package name */
            Object f2813b;

            /* renamed from: c  reason: collision with root package name */
            a f2814c;

            private a() {
            }
        }

        private b(String str) {
            this.f2809b = new a();
            this.f2810c = this.f2809b;
            this.f2811d = false;
            i.a(str);
            this.f2808a = str;
        }

        private a a() {
            a aVar = new a();
            this.f2810c.f2814c = aVar;
            this.f2810c = aVar;
            return aVar;
        }

        private b b(String str, Object obj) {
            a a2 = a();
            a2.f2813b = obj;
            i.a(str);
            a2.f2812a = str;
            return this;
        }

        public b a(String str, int i) {
            b(str, String.valueOf(i));
            return this;
        }

        public b a(String str, Object obj) {
            b(str, obj);
            return this;
        }

        public b a(String str, boolean z) {
            b(str, String.valueOf(z));
            return this;
        }

        public String toString() {
            boolean z = this.f2811d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f2808a);
            sb.append('{');
            String str = "";
            for (a aVar = this.f2809b.f2814c; aVar != null; aVar = aVar.f2814c) {
                if (!z || aVar.f2813b != null) {
                    sb.append(str);
                    String str2 = aVar.f2812a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(aVar.f2813b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static b a(Object obj) {
        return new b(a(obj.getClass()));
    }

    private static String a(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}

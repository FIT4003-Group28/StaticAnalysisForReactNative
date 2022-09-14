package c.e.a.b.d.g;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class d7 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f4104a = d();

    /* renamed from: b  reason: collision with root package name */
    private static final u7<?, ?> f4105b = a(false);

    /* renamed from: c  reason: collision with root package name */
    private static final u7<?, ?> f4106c = a(true);

    /* renamed from: d  reason: collision with root package name */
    private static final u7<?, ?> f4107d = new w7();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, Object obj, b7 b7Var) {
        return obj instanceof t5 ? j4.a(i, (t5) obj) : j4.b(i, (k6) obj, b7Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e2 = j4.e(i) * size;
        if (list instanceof v5) {
            v5 v5Var = (v5) list;
            while (i2 < size) {
                Object b2 = v5Var.b(i2);
                e2 += b2 instanceof v3 ? j4.a((v3) b2) : j4.a((String) b2);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e2 += obj instanceof v3 ? j4.a((v3) obj) : j4.a((String) obj);
                i2++;
            }
        }
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<?> list, b7 b7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e2 = j4.e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e2 += obj instanceof t5 ? j4.a((t5) obj) : j4.a((k6) obj, b7Var);
        }
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * j4.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y5) {
            y5 y5Var = (y5) list;
            i = 0;
            while (i2 < size) {
                i += j4.d(y5Var.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += j4.d(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static u7<?, ?> a() {
        return f4105b;
    }

    private static u7<?, ?> a(boolean z) {
        try {
            Class<?> e2 = e();
            if (e2 != null) {
                return (u7) e2.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB a(int i, int i2, UB ub, u7<UT, UB> u7Var) {
        if (ub == null) {
            ub = u7Var.a();
        }
        u7Var.a(ub, i, i2);
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB a(int i, List<Integer> list, f5 f5Var, UB ub, u7<UT, UB> u7Var) {
        UB ub2;
        int intValue;
        if (f5Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = list.get(i3).intValue();
                if (f5Var.a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = (UB) a(i, intValue2, ub2, u7Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            loop1: while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    intValue = it.next().intValue();
                    if (!f5Var.a(intValue)) {
                        break;
                    }
                }
                ub = (UB) a(i, intValue, ub2, u7Var);
                it.remove();
            }
        }
        return ub2;
    }

    public static void a(int i, List<String> list, o8 o8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.b(i, list);
    }

    public static void a(int i, List<?> list, o8 o8Var, b7 b7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.b(i, list, b7Var);
    }

    public static void a(int i, List<Double> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.i(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void a(h6 h6Var, T t, T t2, long j) {
        a8.a(t, j, h6Var.a(a8.f(t, j), a8.f(t2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends u4<FT>> void a(r4<FT> r4Var, T t, T t2) {
        s4<FT> a2 = r4Var.a(t2);
        if (!a2.f4401a.isEmpty()) {
            r4Var.b(t).a(a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void a(u7<UT, UB> u7Var, T t, T t2) {
        u7Var.a(t, u7Var.c(u7Var.a(t), u7Var.a(t2)));
    }

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (b5.class.isAssignableFrom(cls) || (cls2 = f4104a) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<v3> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e2 = size * j4.e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e2 += j4.a(list.get(i2));
        }
        return e2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<k6> list, b7 b7Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += j4.c(i, list.get(i3), b7Var);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * j4.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y5) {
            y5 y5Var = (y5) list;
            i = 0;
            while (i2 < size) {
                i += j4.e(y5Var.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += j4.e(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static u7<?, ?> b() {
        return f4106c;
    }

    public static void b(int i, List<v3> list, o8 o8Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.a(i, list);
    }

    public static void b(int i, List<?> list, o8 o8Var, b7 b7Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.a(i, list, b7Var);
    }

    public static void b(int i, List<Float> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.l(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * j4.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y5) {
            y5 y5Var = (y5) list;
            i = 0;
            while (i2 < size) {
                i += j4.f(y5Var.b(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += j4.f(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    public static u7<?, ?> c() {
        return f4107d;
    }

    public static void c(int i, List<Long> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.h(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * j4.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c5) {
            c5 c5Var = (c5) list;
            i = 0;
            while (i2 < size) {
                i += j4.k(c5Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += j4.k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(int i, List<Long> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.e(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * j4.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c5) {
            c5 c5Var = (c5) list;
            i = 0;
            while (i2 < size) {
                i += j4.f(c5Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += j4.f(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e(int i, List<Long> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.c(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * j4.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c5) {
            c5 c5Var = (c5) list;
            i = 0;
            while (i2 < size) {
                i += j4.g(c5Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += j4.g(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void f(int i, List<Long> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.a(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * j4.e(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c5) {
            c5 c5Var = (c5) list;
            i = 0;
            while (i2 < size) {
                i += j4.h(c5Var.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += j4.h(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void g(int i, List<Long> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.j(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * j4.i(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(List<?> list) {
        return list.size() << 2;
    }

    public static void h(int i, List<Integer> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.d(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * j4.g(i, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() << 3;
    }

    public static void i(int i, List<Integer> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.m(i, list, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * j4.b(i, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(List<?> list) {
        return list.size();
    }

    public static void j(int i, List<Integer> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.g(i, list, z);
    }

    public static void k(int i, List<Integer> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.k(i, list, z);
    }

    public static void l(int i, List<Integer> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.n(i, list, z);
    }

    public static void m(int i, List<Integer> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.f(i, list, z);
    }

    public static void n(int i, List<Boolean> list, o8 o8Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o8Var.b(i, list, z);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dstd  reason: default package */
/* loaded from: classes.dex */
public final class dstd {
    public static final dstx<?, ?> a;
    public static final dstx<?, ?> b;
    public static final dstx<?, ?> c;
    private static final Class<?> d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        d = cls;
        a = Z(false);
        b = Z(true);
        c = new dstz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * dspp.Y(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int B(int i, List<Long> list) {
        if (list.size() == 0) {
            return 0;
        }
        return b(list) + (list.size() * dspp.Y(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int C(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return h(list) + (size * dspp.Y(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int D(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * dspp.Y(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int E(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * dspp.Y(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int F(int i, List<Long> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * dspp.Y(i));
    }

    public static void G(int i, List<Double> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.I(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 8;
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.M(list.get(i2).doubleValue());
            i2++;
        }
    }

    public static void H(int i, List<Float> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.H(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 4;
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.L(list.get(i2).floatValue());
            i2++;
        }
    }

    public static void I(int i, List<Long> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.aF(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += dspp.ac(list.get(i4).longValue());
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.u(list.get(i2).longValue());
            i2++;
        }
    }

    public static void J(int i, List<Long> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.aF(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += dspp.ac(list.get(i4).longValue());
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.u(list.get(i2).longValue());
            i2++;
        }
    }

    public static void K(int i, List<Long> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.G(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += dspp.ad(list.get(i4).longValue());
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.K(list.get(i2).longValue());
            i2++;
        }
    }

    public static void L(int i, List<Long> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.aG(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 8;
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.v(list.get(i2).longValue());
            i2++;
        }
    }

    public static void M(int i, List<Long> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.aG(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 8;
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.v(list.get(i2).longValue());
            i2++;
        }
    }

    public static void N(int i, List<Integer> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.aC(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += dspp.Z(list.get(i4).intValue());
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.r(list.get(i2).intValue());
            i2++;
        }
    }

    public static void O(int i, List<Integer> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.aD(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += dspp.aa(list.get(i4).intValue());
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.s(list.get(i2).intValue());
            i2++;
        }
    }

    public static void P(int i, List<Integer> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.F(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += dspp.ab(list.get(i4).intValue());
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.J(list.get(i2).intValue());
            i2++;
        }
    }

    public static void Q(int i, List<Integer> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.aE(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 4;
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.t(list.get(i2).intValue());
            i2++;
        }
    }

    public static void R(int i, List<Integer> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.aE(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4);
            i3 += 4;
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.t(list.get(i2).intValue());
            i2++;
        }
    }

    public static void S(int i, List<Integer> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.aC(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += dspp.Z(list.get(i4).intValue());
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.r(list.get(i2).intValue());
            i2++;
        }
    }

    public static void T(int i, List<Boolean> list, dspq dspqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                dspqVar.a.i(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        dspqVar.a.aB(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            list.get(i4).booleanValue();
            i3++;
        }
        dspqVar.a.s(i3);
        while (i2 < list.size()) {
            dspqVar.a.q(list.get(i2).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void U(int i, List<String> list, dspq dspqVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dsrt)) {
            while (i2 < list.size()) {
                dspqVar.a.j(i, list.get(i2));
                i2++;
            }
            return;
        }
        dsrt dsrtVar = (dsrt) list;
        while (i2 < list.size()) {
            Object g = dsrtVar.g(i2);
            if (g instanceof String) {
                dspqVar.a.j(i, (String) g);
            } else {
                dspqVar.a.k(i, (dspd) g);
            }
            i2++;
        }
    }

    public static void V(int i, List<dspd> list, dspq dspqVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            dspqVar.a.k(i, list.get(i2));
        }
    }

    public static void W(int i, List<?> list, dspq dspqVar, dstc dstcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            dspqVar.q(i, list.get(i2), dstcVar);
        }
    }

    public static void X(int i, List<?> list, dspq dspqVar, dstc dstcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            dspqVar.r(i, list.get(i2), dstcVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void Y(T t, T t2, long j) {
        dsui.m(t, j, dsse.d(dsui.l(t, j), dsui.l(t2, j)));
    }

    private static dstx<?, ?> Z(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (dstx) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (dsqw.class.isAssignableFrom(cls) || (cls2 = d) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            i = 0;
            while (i2 < size) {
                i += dspp.ac(dsrxVar.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += dspp.ac(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            i = 0;
            while (i2 < size) {
                i += dspp.ac(dsrxVar.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += dspp.ac(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dsrx) {
            dsrx dsrxVar = (dsrx) list;
            i = 0;
            while (i2 < size) {
                i += dspp.ad(dsrxVar.c(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += dspp.ad(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dsqz) {
            dsqz dsqzVar = (dsqz) list;
            i = 0;
            while (i2 < size) {
                i += dspp.Z(dsqzVar.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += dspp.Z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dsqz) {
            dsqz dsqzVar = (dsqz) list;
            i = 0;
            while (i2 < size) {
                i += dspp.Z(dsqzVar.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += dspp.Z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dsqz) {
            dsqz dsqzVar = (dsqz) list;
            i = 0;
            while (i2 < size) {
                i += dspp.aa(dsqzVar.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += dspp.aa(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof dsqz) {
            dsqz dsqzVar = (dsqz) list;
            i = 0;
            while (i2 < size) {
                i += dspp.ab(dsqzVar.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += dspp.ab(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(List<?> list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i, List<?> list) {
        int ae;
        int ae2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int Y = dspp.Y(i) * size;
        if (list instanceof dsrt) {
            dsrt dsrtVar = (dsrt) list;
            while (i2 < size) {
                Object g = dsrtVar.g(i2);
                if (g instanceof dspd) {
                    ae2 = dspp.ag((dspd) g);
                } else {
                    ae2 = dspp.ae((String) g);
                }
                Y += ae2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof dspd) {
                    ae = dspp.ag((dspd) obj);
                } else {
                    ae = dspp.ae((String) obj);
                }
                Y += ae;
                i2++;
            }
        }
        return Y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i, Object obj, dstc dstcVar) {
        if (obj instanceof dsrr) {
            return dspp.X(i, (dsrr) obj);
        }
        return dspp.Y(i) + dspp.aj((dssj) obj, dstcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(int i, List<?> list, dstc dstcVar) {
        int aj;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Y = dspp.Y(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof dsrr) {
                aj = dspp.af((dsrr) obj);
            } else {
                aj = dspp.aj((dssj) obj, dstcVar);
            }
            Y += aj;
        }
        return Y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i, List<dspd> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int Y = size * dspp.Y(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            Y += dspp.ag(list.get(i2));
        }
        return Y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i, List<dssj> list, dstc dstcVar) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += dspp.aq(i, list.get(i3), dstcVar);
            }
            return i2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends dsqu> void r(dsqb<FT> dsqbVar, T t, T t2) {
        dsqh<FT> b2 = dsqbVar.b(t2);
        if (!b2.a()) {
            dsqh<FT> c2 = dsqbVar.c(t);
            for (int i = 0; i < b2.a.b(); i++) {
                c2.f(b2.a.c(i));
            }
            for (Map.Entry<FT, Object> entry : b2.a.d()) {
                c2.f(entry);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void s(dstx<UT, UB> dstxVar, T t, T t2) {
        dstxVar.h(t, dstxVar.n(dstxVar.i(t), dstxVar.i(t2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB t(int i, List<Integer> list, dsrc dsrcVar, UB ub, dstx<UT, UB> dstxVar) {
        if (dsrcVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dsrcVar.a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) v(i, intValue, ub, dstxVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dsrcVar.a(intValue2) == null) {
                    ub = (UB) v(i, intValue2, ub, dstxVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB u(int i, List<Integer> list, dsrd dsrdVar, UB ub, dstx<UT, UB> dstxVar) {
        if (dsrdVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dsrdVar.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) v(i, intValue, ub, dstxVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!dsrdVar.a(intValue2)) {
                    ub = (UB) v(i, intValue2, ub, dstxVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB v(int i, int i2, UB ub, dstx<UT, UB> dstxVar) {
        if (ub == null) {
            ub = dstxVar.f();
        }
        dstxVar.a(ub, i, i2);
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * dspp.as(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i, List<Integer> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * dspp.Y(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * dspp.au(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * dspp.av(i);
    }
}

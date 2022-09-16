package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: aorn  reason: default package */
/* loaded from: classes.dex */
public final class aorn {
    public static final apfu a;
    public static final apfu b;
    public static final apfu c;
    private static final Class d;

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
        c = new apfu();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return o(list) + (size * aool.ac(i));
    }

    public static void B(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.l(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void C(int i, List list, aoom aoomVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            aoomVar.a.n(i, (aoob) list.get(i2));
        }
    }

    public static void D(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.ap(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.aq(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    public static void E(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += aool.O(((Integer) list.get(i4)).intValue());
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void F(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void G(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void H(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.ar(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.as(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    public static void I(int i, List list, aoom aoomVar, aorm aormVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            aoomVar.h(i, list.get(i2), aormVar);
        }
    }

    public static void J(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.t(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += aool.O(((Integer) list.get(i4)).intValue());
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.u(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void K(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += aool.ag(((Long) list.get(i4)).longValue());
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void L(int i, List list, aoom aoomVar, aorm aormVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            aoomVar.k(i, list.get(i2), aormVar);
        }
    }

    public static void M(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.p(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.q(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void N(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.r(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void O(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.au(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += aool.X(((Integer) list.get(i4)).intValue());
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.av(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void P(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.aw(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += aool.Z(((Long) list.get(i4)).longValue());
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.ax(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void Q(int i, List list, aoom aoomVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aoqf)) {
            while (i2 < list.size()) {
                aoomVar.a.z(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        aoqf aoqfVar = (aoqf) list;
        while (i2 < list.size()) {
            Object f = aoqfVar.f(i2);
            if (f instanceof String) {
                aoomVar.a.z(i, (String) f);
            } else {
                aoomVar.a.n(i, (aoob) f);
            }
            i2++;
        }
    }

    public static void R(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += aool.ae(((Integer) list.get(i4)).intValue());
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void S(int i, List list, aoom aoomVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                aoomVar.a.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        aoomVar.a.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += aool.ag(((Long) list.get(i4)).longValue());
        }
        aoomVar.a.D(i3);
        while (i2 < list.size()) {
            aoomVar.a.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void T(Object obj, Object obj2) {
        aoov f = aoyt.f(obj2);
        if (!f.i()) {
            aoov g = aoyt.g(obj);
            for (int i = 0; i < f.b.a(); i++) {
                g.g(f.b.f(i));
            }
            for (Map.Entry entry : f.b.c()) {
                g.g(entry);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void U(Object obj, Object obj2, long j) {
        aosg.v(obj, j, apdw.k(aosg.i(obj, j), aosg.i(obj2, j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void V(Object obj, Object obj2) {
        aory q = apfu.q(obj);
        aory q2 = apfu.q(obj2);
        if (!q2.equals(aory.a)) {
            q = aory.b(q, q2);
        }
        apfu.r(obj, q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object W(int i, int i2, Object obj) {
        if (obj == null) {
            obj = aory.c();
        }
        apfu.p(obj, i, i2);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object X(int i, List list, aopn aopnVar, Object obj) {
        if (aopnVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (aopnVar.mo283findValueByNumber(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = W(i, intValue, obj);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (aopnVar.mo283findValueByNumber(intValue2) == null) {
                    obj = W(i, intValue2, obj);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object Y(int i, List list, aopo aopoVar, Object obj) {
        if (aopoVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (aopoVar.isInRange(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = W(i, intValue, obj);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!aopoVar.isInRange(intValue2)) {
                    obj = W(i, intValue2, obj);
                    it.remove();
                }
            }
        }
        return obj;
    }

    private static apfu Z(boolean z) {
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
            return (apfu) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int ac = size * aool.ac(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            ac += aool.J((aoob) list.get(i2));
        }
        return ac;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aopj) {
            aopj aopjVar = (aopj) list;
            i = 0;
            while (i2 < size) {
                i += aool.O(aopjVar.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += aool.O(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i, List list, aorm aormVar) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += aool.L(i, (aoqu) list.get(i3), aormVar);
            }
            return i2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aopj) {
            aopj aopjVar = (aopj) list;
            i = 0;
            while (i2 < size) {
                i += aool.O(aopjVar.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += aool.O(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            i = 0;
            while (i2 < size) {
                i += aool.ag(aoqjVar.a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += aool.ag(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i, Object obj, aorm aormVar) {
        if (obj instanceof aoqd) {
            return aool.Q(i, (aoqd) obj);
        }
        return aool.ac(i) + aool.U((aoqu) obj, aormVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i, List list, aorm aormVar) {
        int U;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int ac = aool.ac(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof aoqd) {
                U = aool.R((aoqd) obj);
            } else {
                U = aool.U((aoqu) obj, aormVar);
            }
            ac += U;
        }
        return ac;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aopj) {
            aopj aopjVar = (aopj) list;
            i = 0;
            while (i2 < size) {
                i += aool.X(aopjVar.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += aool.X(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            i = 0;
            while (i2 < size) {
                i += aool.Z(aoqjVar.a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += aool.Z(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i, List list) {
        int ab;
        int ab2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int ac = aool.ac(i) * size;
        if (list instanceof aoqf) {
            aoqf aoqfVar = (aoqf) list;
            while (i2 < size) {
                Object f = aoqfVar.f(i2);
                if (f instanceof aoob) {
                    ab2 = aool.J((aoob) f);
                } else {
                    ab2 = aool.ab((String) f);
                }
                ac += ab2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof aoob) {
                    ab = aool.J((aoob) obj);
                } else {
                    ab = aool.ab((String) obj);
                }
                ac += ab;
                i2++;
            }
        }
        return ac;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aopj) {
            aopj aopjVar = (aopj) list;
            i = 0;
            while (i2 < size) {
                i += aool.ae(aopjVar.d(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += aool.ae(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof aoqj) {
            aoqj aoqjVar = (aoqj) list;
            i = 0;
            while (i2 < size) {
                i += aool.ag(aoqjVar.a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += aool.ag(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void p(Class cls) {
        Class cls2;
        if (aopi.class.isAssignableFrom(cls) || (cls2 = d) == null || cls2.isAssignableFrom(cls)) {
            return;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * aool.ay(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * aool.ac(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * aool.aA(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * aool.aB(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * aool.ac(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return h(list) + (list.size() * aool.ac(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return k(list) + (size * aool.ac(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return l(list) + (size * aool.ac(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return n(list) + (size * aool.ac(i));
    }
}

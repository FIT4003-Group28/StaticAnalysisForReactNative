package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.TypedValue;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: amxp  reason: default package */
/* loaded from: classes.dex */
public final class amxp {
    public static boolean A(int i) {
        return i != 0 && gy.b(i) > 0.5d;
    }

    public static uyb B(int i, uyj uyjVar) {
        uya c = uyb.c();
        c.c(true);
        if (uyjVar != null) {
            c.a = uyjVar;
        }
        if (i > 0) {
            c.b(i);
        }
        return c.a();
    }

    public static Object[] a(Class cls, int i) {
        return (Object[]) Array.newInstance(cls, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Object obj, int i) {
        if (obj != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(Object... objArr) {
        d(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            b(objArr[i2], i2);
        }
    }

    public static void e(Iterable iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            objArr[i] = obj;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(amxj amxjVar, Object obj) {
        if (obj == amxjVar) {
            return true;
        }
        if (obj instanceof amxj) {
            amxj amxjVar2 = (amxj) obj;
            if (amxjVar.size() == amxjVar2.size() && amxjVar.j().size() == amxjVar2.j().size()) {
                for (amxk amxkVar : amxjVar2.j()) {
                    if (amxjVar.a(amxkVar.a) != amxkVar.a()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i) {
        if (i < 3) {
            araa.v(i, "expectedSize");
            return i + 1;
        } else if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        } else {
            return (int) ((i / 0.75f) + 1.0f);
        }
    }

    public static amup h(Map map) {
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return amyc.b;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum r1 = (Enum) entry.getKey();
        Object value = entry.getValue();
        araa.t(r1, value);
        EnumMap enumMap = new EnumMap(r1.getDeclaringClass());
        enumMap.put((EnumMap) r1, (Enum) value);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum r12 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            araa.t(r12, value2);
            enumMap.put((EnumMap) r12, (Enum) value2);
        }
        int size = enumMap.size();
        if (size == 0) {
            return amyc.b;
        }
        if (size == 1) {
            Map.Entry entry3 = (Map.Entry) arey.t(enumMap.entrySet());
            return amup.k((Enum) entry3.getKey(), entry3.getValue());
        }
        return new amue(enumMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object i(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static HashMap j() {
        return new HashMap();
    }

    public static HashMap k(int i) {
        return new HashMap(g(i));
    }

    public static Map.Entry l(Object obj, Object obj2) {
        return new amuc(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map.Entry m(Map.Entry entry) {
        entry.getClass();
        return new amws(entry);
    }

    public static Map n(Map map, ampg ampgVar) {
        ampgVar.getClass();
        return new amwz(map, new amwu(ampgVar));
    }

    public static ArrayList o() {
        return new ArrayList();
    }

    public static ArrayList p(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        return q(iterable.iterator());
    }

    public static ArrayList q(Iterator it) {
        ArrayList o = o();
        arey.n(o, it);
        return o;
    }

    @SafeVarargs
    public static ArrayList r(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        araa.v(length, "arraySize");
        ArrayList arrayList = new ArrayList(almu.v(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList s(int i) {
        araa.v(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List t(List list) {
        if (list instanceof amuk) {
            return ((amuk) list).a();
        }
        if (list instanceof amwj) {
            return ((amwj) list).a;
        }
        if (list instanceof RandomAccess) {
            return new amwh(list);
        }
        return new amwj(list);
    }

    public static List u(List list, ampg ampgVar) {
        if (list instanceof RandomAccess) {
            return new amwl(list, ampgVar);
        }
        return new amwn(list, ampgVar);
    }

    public static boolean v(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!akzj.f(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it2.hasNext()) {
                    if (!akzj.f(it.next(), it2.next())) {
                        break;
                    }
                } else {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static boolean w() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }

    public static int x(int i, int i2) {
        return gy.f(i, (Color.alpha(i) * i2) / PrivateKeyType.INVALID);
    }

    public static int y(Context context, int i, int i2) {
        TypedValue m = almu.m(context, i);
        return m != null ? m.data : i2;
    }

    public static int z(int i, int i2, float f) {
        return gy.e(gy.f(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}

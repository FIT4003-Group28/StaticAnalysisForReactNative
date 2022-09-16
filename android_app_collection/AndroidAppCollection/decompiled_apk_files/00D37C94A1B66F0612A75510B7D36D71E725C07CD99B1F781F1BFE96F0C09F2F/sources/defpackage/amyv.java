package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.PorterDuff;
import android.provider.Settings;
import android.util.TypedValue;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: amyv  reason: default package */
/* loaded from: classes.dex */
public final class amyv {
    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = amxo.a;
            }
        } else if (!(iterable instanceof amyu)) {
            return false;
        } else {
            comparator2 = ((amyu) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static amys c(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new amyq(set, set2);
    }

    public static amys d(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new amyo(set, set2);
    }

    public static HashSet e() {
        return new HashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HashSet f(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new HashSet((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        HashSet e = e();
        arey.n(e, it);
        return e;
    }

    public static HashSet g(Object... objArr) {
        HashSet h = h(objArr.length);
        Collections.addAll(h, objArr);
        return h;
    }

    public static HashSet h(int i) {
        return new HashSet(amxp.g(i));
    }

    public static Set i() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof amxj) {
            collection = ((amxj) collection).i();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return l(set, collection.iterator());
        }
        return arey.o(set.iterator(), collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean l(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amyk m(Class cls, String str) {
        try {
            return new amyk(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(amxc amxcVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(amxcVar.r().size());
        for (Map.Entry entry : amxcVar.r().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object obj : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object[] o(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }

    public static final float p(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static float q(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            StringBuilder sb = new StringBuilder(87);
            sb.append("Motion easing control point value must be between 0 and 1; instead got: ");
            sb.append(parseFloat);
            throw new IllegalArgumentException(sb.toString());
        }
        return parseFloat;
    }

    public static String r(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    public static boolean s(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static float t(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static PorterDuff.Mode u(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i == 5) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}

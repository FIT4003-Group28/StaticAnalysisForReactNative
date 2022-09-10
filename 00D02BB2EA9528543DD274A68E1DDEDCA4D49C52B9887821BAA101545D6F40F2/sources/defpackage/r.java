package defpackage;

import android.arch.lifecycle.CompositeGeneratedAdaptersObserver;
import android.arch.lifecycle.FullLifecycleObserverAdapter;
import android.arch.lifecycle.ReflectiveGenericLifecycleObserver;
import android.arch.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: r  reason: default package */
/* loaded from: classes.dex */
public final class r {
    private static final Map<Class<?>, Integer> a = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends g>>> b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l a(Object obj) {
        boolean z = obj instanceof l;
        boolean z2 = obj instanceof f;
        if (!z || !z2) {
            if (z2) {
                return new FullLifecycleObserverAdapter((f) obj, null);
            }
            if (z) {
                return (l) obj;
            }
            Class<?> cls = obj.getClass();
            if (c(cls) == 2) {
                List<Constructor<? extends g>> list = b.get(cls);
                if (list.size() == 1) {
                    return new SingleGeneratedAdapterObserver(b(list.get(0), obj));
                }
                g[] gVarArr = new g[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    gVarArr[i] = b(list.get(i), obj);
                }
                return new CompositeGeneratedAdaptersObserver(gVarArr);
            }
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        return new FullLifecycleObserverAdapter((f) obj, (l) obj);
    }

    private static g b(Constructor<? extends g> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
        if (r5.booleanValue() != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int c(java.lang.Class<?> r10) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r.c(java.lang.Class):int");
    }

    private static boolean d(Class<?> cls) {
        return cls != null && aou.class.isAssignableFrom(cls);
    }
}

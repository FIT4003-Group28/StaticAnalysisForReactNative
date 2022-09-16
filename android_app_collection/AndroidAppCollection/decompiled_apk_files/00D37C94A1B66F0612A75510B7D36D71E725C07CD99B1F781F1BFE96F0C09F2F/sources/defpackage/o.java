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
/* renamed from: o  reason: default package */
/* loaded from: classes3.dex */
public final class o {
    private static final Map a = new HashMap();
    private static final Map b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j a(Object obj) {
        boolean z = obj instanceof j;
        boolean z2 = obj instanceof g;
        if (!z || !z2) {
            if (z2) {
                return new FullLifecycleObserverAdapter((g) obj, null);
            }
            if (z) {
                return (j) obj;
            }
            Class<?> cls = obj.getClass();
            if (b(cls) == 2) {
                List list = (List) b.get(cls);
                if (list.size() == 1) {
                    return new SingleGeneratedAdapterObserver(c((Constructor) list.get(0), obj));
                }
                h[] hVarArr = new h[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    hVarArr[i] = c((Constructor) list.get(i), obj);
                }
                return new CompositeGeneratedAdaptersObserver(hVarArr);
            }
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        return new FullLifecycleObserverAdapter((g) obj, (j) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
        if (r5.booleanValue() != false) goto L5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b(java.lang.Class r10) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o.b(java.lang.Class):int");
    }

    private static h c(Constructor constructor, Object obj) {
        try {
            return (h) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static boolean d(Class cls) {
        return cls != null && apx.class.isAssignableFrom(cls);
    }
}

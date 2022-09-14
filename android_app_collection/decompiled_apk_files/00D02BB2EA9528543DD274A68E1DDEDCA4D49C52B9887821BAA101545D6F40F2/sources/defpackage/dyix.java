package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
/* compiled from: PG */
/* renamed from: dyix  reason: default package */
/* loaded from: classes6.dex */
public final class dyix {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ServiceLoader, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [dyiw, dyiw<T>] */
    public static <T> List<T> a(Class<T> cls, Iterable<Class> iterable, ClassLoader classLoader, dyiw<T> dyiwVar) {
        ?? load;
        if (!b(classLoader)) {
            load = ServiceLoader.load(cls, classLoader);
            if (!load.iterator().hasNext()) {
                load = ServiceLoader.load(cls);
            }
        } else {
            load = new ArrayList();
            for (Class cls2 : iterable) {
                try {
                    load.add(cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : load) {
            if (dyiwVar.b(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new dyiv(dyiwVar)));
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean b(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

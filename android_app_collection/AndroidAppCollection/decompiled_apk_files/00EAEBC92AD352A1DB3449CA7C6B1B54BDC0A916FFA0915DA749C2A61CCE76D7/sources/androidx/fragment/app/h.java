package androidx.fragment.app;

import androidx.fragment.app.Fragment;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final a.e.g<String, Class<?>> f1690a = new a.e.g<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> c(ClassLoader classLoader, String str) {
        Class<?> cls = f1690a.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            f1690a.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class<? extends Fragment> d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e2) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        } catch (ClassNotFoundException e3) {
            throw new Fragment.e("Unable to instantiate fragment " + str + ": make sure class name exists", e3);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dy  reason: default package */
/* loaded from: classes3.dex */
public class dy {
    private static final agd a = new agd();

    public static Class a(ClassLoader classLoader, String str) {
        try {
            return d(classLoader, str);
        } catch (ClassCastException e) {
            throw new dn("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new dn("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return dp.class.isAssignableFrom(d(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class d(ClassLoader classLoader, String str) {
        agd agdVar = a;
        agd agdVar2 = (agd) agdVar.get(classLoader);
        if (agdVar2 == null) {
            agdVar2 = new agd();
            agdVar.put(classLoader, agdVar2);
        }
        Class cls = (Class) agdVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            agdVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public dp c(String str) {
        throw null;
    }
}

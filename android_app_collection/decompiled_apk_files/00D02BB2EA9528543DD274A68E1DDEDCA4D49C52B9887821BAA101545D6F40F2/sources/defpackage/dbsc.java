package defpackage;
/* compiled from: PG */
/* renamed from: dbsc  reason: default package */
/* loaded from: classes.dex */
public final class dbsc {
    public static <T> T a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 == null) {
            throw new NullPointerException("Both parameters are null");
        }
        return t2;
    }

    public static dbsb b(Object obj) {
        return new dbsb(obj.getClass().getSimpleName());
    }

    public static dbsb c(Class<?> cls) {
        return new dbsb(cls.getSimpleName());
    }

    public static dbsb d(String str) {
        return new dbsb(str);
    }
}

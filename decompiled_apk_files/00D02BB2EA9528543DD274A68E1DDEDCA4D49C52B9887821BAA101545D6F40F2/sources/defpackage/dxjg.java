package defpackage;
/* compiled from: PG */
/* renamed from: dxjg  reason: default package */
/* loaded from: classes.dex */
public final class dxjg {
    public static <T> void a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }

    public static <T> void b(T t) {
        t.getClass();
    }

    public static <T> void c(T t, String str) {
        if (t != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static <T> void d(T t, String str, Object obj) {
        if (t == null) {
            if (str.contains("%s")) {
                if (str.indexOf("%s") != str.lastIndexOf("%s")) {
                    throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
                }
                throw new NullPointerException(str.replace("%s", obj instanceof Class ? ((Class) obj).getCanonicalName() : String.valueOf(obj)));
            }
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        }
    }

    public static <T> void e(T t) {
        if (t != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static <T> void f(T t) {
        if (t != null) {
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

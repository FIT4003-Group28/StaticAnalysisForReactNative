package defpackage;
/* compiled from: PG */
/* renamed from: btsr  reason: default package */
/* loaded from: classes.dex */
public final class btsr {
    public static volatile btst a;

    public static <T extends btsz> T a(Class<T> cls) {
        return (T) a.e(cls);
    }

    public static <T> T b(T t) {
        return a instanceof btsu ? (T) ((btsu) a).a() : t;
    }
}

package c.e.a.a;
/* loaded from: classes.dex */
public abstract class c<T> {
    public static <T> c<T> a(T t) {
        return new a(null, t, d.VERY_LOW);
    }

    public static <T> c<T> b(T t) {
        return new a(null, t, d.HIGHEST);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract d c();
}

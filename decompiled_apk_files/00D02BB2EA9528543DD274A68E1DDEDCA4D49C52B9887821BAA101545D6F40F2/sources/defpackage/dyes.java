package defpackage;
/* compiled from: PG */
/* renamed from: dyes  reason: default package */
/* loaded from: classes6.dex */
public final class dyes<T> {
    public final T a;
    private final String b;

    private dyes(String str, T t) {
        this.b = str;
        this.a = t;
    }

    public static <T> dyes<T> a(String str) {
        return new dyes<>(str, null);
    }

    public static <T> dyes<T> b(String str, T t) {
        return new dyes<>(str, t);
    }

    public final String toString() {
        return this.b;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dyek  reason: default package */
/* loaded from: classes6.dex */
public final class dyek<T> {
    private final String a;

    private dyek(String str) {
        this.a = str;
    }

    public static <T> dyek<T> a(String str) {
        return new dyek<>(str);
    }

    public final String toString() {
        return this.a;
    }
}

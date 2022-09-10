package defpackage;
/* compiled from: PG */
/* renamed from: cqpd  reason: default package */
/* loaded from: classes5.dex */
public final class cqpd {
    private static final cqom k = cqom.a;
    private static final cqpa<Float> c = cqou.a;
    public static final cqpa<Float> a = cqov.a;
    private static final cqpa<Integer> d = cqol.a;
    private static final cqpa<Integer> e = cqon.a;
    private static final cqpa<Integer> f = cqoo.a;
    private static final cqpa<Integer> g = cqop.a;
    private static final cqpa<Integer> h = cqoq.a;
    private static final cqpa<Integer> i = cqor.a;
    private static final cqpa<Integer> j = cqos.a;
    public static final cqpa<Integer> b = cqot.a;

    public static cqoj a(int i2, int i3, int i4, int i5) {
        return new cqoa(i2, i3, i4, i5);
    }

    public static cqoj b(int i2, int i3, int i4, int i5, cqtv cqtvVar) {
        return new cqob(i2, i3, i4, i5, cqtvVar);
    }

    public static cqoj c(int i2, int i3, cqtv cqtvVar) {
        return new cqoc(i2, i3, cqtvVar);
    }

    public static cqoj d(int i2, int i3, cqtv cqtvVar) {
        return new cqod(i2, i3, cqtvVar);
    }

    public static cqoj e(int i2, float f2) {
        return m(i2, Float.valueOf(f2), c);
    }

    public static cqoj f(int i2, cqtv cqtvVar) {
        return p(i2, cqtvVar, f, k);
    }

    public static cqoj g(int i2, cqtv cqtvVar) {
        return p(i2, cqtvVar, g, k);
    }

    public static cqoj h(int i2, int i3) {
        return m(i2, Integer.valueOf(i3), j);
    }

    public static cqoj i(int i2, cqva cqvaVar) {
        return m(i2, Integer.valueOf(((cquz) cqvaVar).d), d);
    }

    public static cqoj j(int i2, cqtv cqtvVar) {
        return p(i2, cqtvVar, d, k);
    }

    public static cqoj k(int i2, cqva cqvaVar) {
        return m(i2, Integer.valueOf(((cquz) cqvaVar).d), e);
    }

    public static cqoj l(int i2, cqtv cqtvVar) {
        return p(i2, cqtvVar, e, k);
    }

    public static <T> cqpb<T> m(int i2, T t, cqpa<T> cqpaVar) {
        return new cqoe(i2, t, cqpaVar);
    }

    public static cqoj n(int i2) {
        return m(i2, 1, i);
    }

    public static cqoj o(int i2) {
        return m(i2, 1, h);
    }

    private static <A, B> cqpc<A, B> p(int i2, A a2, cqpa<B> cqpaVar, cqom cqomVar) {
        return new cqof(i2, a2, cqpaVar, cqomVar);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: nrj  reason: default package */
/* loaded from: classes7.dex */
public final class nrj {
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        cqmh cqmhVar = new cqmh(nti.class, new cqmp[0]);
        cqmhVar.f(cqjv.j(nrf.NIGHT_AWARE, new nrh()), d(nqo.aJ));
        cqmhVar.f(cqmpVarArr);
        return cqmhVar;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqmp<T>... cqmpVarArr) {
        cqmh cqmhVar = new cqmh(nsq.class, cqmpVarArr);
        cqmhVar.g(cqjv.j(nrf.NIGHT_AWARE, new nri()));
        return cqmhVar;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        return new cqmh(nte.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> d(cqtv cqtvVar) {
        return cqjv.j(nrf.SCROLL_BAR_WIDTH, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> e(Integer num) {
        return cqjv.j(nrf.END_PADDING_WHEN_SCROLL_BAR_HIDDEN, num);
    }

    public static <T extends cqkp> cqnf<T> f(cqtv cqtvVar) {
        return cqjv.j(nrf.END_PADDING_WHEN_SCROLL_BAR_HIDDEN, cqtvVar);
    }

    public static <T extends cqkp> cqnf<T> g(Boolean bool) {
        return cqjv.j(nrf.SHOW_DIVIDER, bool);
    }
}

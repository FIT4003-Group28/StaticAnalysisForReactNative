package defpackage;
/* compiled from: PG */
/* renamed from: bjfe  reason: default package */
/* loaded from: classes3.dex */
public final class bjfe<T> extends btrh<T> {
    private bjfe(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    public static void b(btrm btrmVar, Object obj) {
        btrmVar.a(obj);
    }

    public static void c(btrm btrmVar, bjfd bjfdVar) {
        dceq a = dcet.a();
        a.b(bjfb.class, new bjfe(bjfb.class, bjfdVar, bvrj.UI_THREAD));
        btrmVar.g(bjfdVar, a.a());
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ((bjfd) this.a).a.k((bjfb) obj);
    }
}

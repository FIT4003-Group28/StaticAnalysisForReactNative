package defpackage;
/* compiled from: PG */
/* renamed from: vnf  reason: default package */
/* loaded from: classes7.dex */
public final class vnf<T> extends btrh<T> {
    private vnf(Class<?> cls, T t) {
        super(cls, t);
    }

    public static void b(btrm btrmVar, Object obj) {
        btrmVar.a(obj);
    }

    public static void c(btrm btrmVar, vne vneVar) {
        dceq a = dcet.a();
        a.b(ardp.class, new vnf(ardp.class, vneVar));
        btrmVar.g(vneVar, a.a());
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ardp ardpVar = (ardp) obj;
        aegc a = ((vne) this.a).a.a();
        if (a != null) {
            a.j();
        }
    }
}

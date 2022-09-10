package defpackage;
/* compiled from: PG */
/* renamed from: thn  reason: default package */
/* loaded from: classes7.dex */
public final class thn<T> extends btrh<T> {
    private thn(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    public static void b(btrm btrmVar, Object obj) {
        btrmVar.a(obj);
    }

    public static void c(btrm btrmVar, thl thlVar) {
        dceq a = dcet.a();
        a.b(srf.class, new thn(srf.class, thlVar, bvrj.UI_THREAD));
        btrmVar.g(thlVar, a.a());
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        thl thlVar = (thl) this.a;
        srf srfVar = (srf) obj;
        if (srfVar.a == thlVar.a && !srfVar.b.b()) {
            b(thlVar.b.c, thlVar);
            thlVar.b.f = null;
            thlVar.a(srfVar.b);
        }
    }
}

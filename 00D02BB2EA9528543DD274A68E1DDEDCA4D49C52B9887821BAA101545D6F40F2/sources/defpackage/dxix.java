package defpackage;
/* compiled from: PG */
/* renamed from: dxix  reason: default package */
/* loaded from: classes.dex */
public final class dxix {
    public static void a(fd fdVar) {
        dxiw dxiwVar;
        fd fdVar2 = fdVar;
        while (true) {
            fdVar2 = fdVar2.D;
            if (fdVar2 != null) {
                if (fdVar2 instanceof dxiw) {
                    dxiwVar = (dxiw) fdVar2;
                    break;
                }
            } else {
                ff J = fdVar.J();
                if (J instanceof dxiw) {
                    dxiwVar = (dxiw) J;
                } else if (!(J.getApplication() instanceof dxiw)) {
                    throw new IllegalArgumentException(String.format("No injector was found for %s", fdVar.getClass().getCanonicalName()));
                } else {
                    dxiwVar = (dxiw) J.getApplication();
                }
            }
        }
        dxis<Object> NK = dxiwVar.NK();
        dxjg.d(NK, "%s.androidInjector() returned null", dxiwVar.getClass());
        NK.a(fdVar);
    }
}

package defpackage;

import defpackage.azwm;
/* compiled from: PG */
/* renamed from: azwd  reason: default package */
/* loaded from: classes.dex */
public abstract class azwd<T extends azwm<T>> {
    public static final azwd<azva> a;
    public static final dcep<azwd<?>> b;
    public static final dcdn<dxby, azwd<?>> c;

    static {
        azwe azweVar = new azwe();
        a = azweVar;
        dcep<azwd<?>> B = dcep.B(azweVar);
        b = B;
        dcdg p = dcdn.p();
        dcpd<azwd<?>> it = B.iterator();
        while (it.hasNext()) {
            azwd<?> next = it.next();
            p.f(next.a(), next);
        }
        c = p.b();
    }

    public abstract dxby a();

    public abstract boolean b(dxci dxciVar);

    public abstract long c(dxci dxciVar);

    @dzsi
    public abstract akra d(dxci dxciVar);
}

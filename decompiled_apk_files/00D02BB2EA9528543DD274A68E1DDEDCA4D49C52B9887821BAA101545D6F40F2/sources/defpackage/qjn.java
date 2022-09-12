package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: qjn  reason: default package */
/* loaded from: classes7.dex */
public abstract class qjn implements Serializable {
    public static qjn i(@dzsi azva azvaVar, @dzsi azva azvaVar2) {
        return new qji(azvaVar, azvaVar2);
    }

    @dzsi
    public abstract azva a();

    @dzsi
    public abstract azva b();

    @dzsi
    public abstract azxa c();

    @dzsi
    public abstract azxa d();

    @dzsi
    public abstract azxa e();

    @dzsi
    public abstract azxa f();

    public final qjm g() {
        azxa c = c();
        if (a() != null || c != null) {
            if (c != null) {
                int a = dplp.a(c.k().h);
                if (a == 0) {
                    a = 1;
                }
                if (a == 3) {
                    return qjm.STALE;
                }
                if (a == 4) {
                    return qjm.VAGUE;
                }
            }
            return qjm.OK;
        }
        return qjm.UNSET;
    }

    public final qjm h() {
        akqq akqqVar;
        azxa d = d();
        if (b() != null || d != null) {
            if (d != null) {
                int a = dplp.a(d.k().h);
                if (a == 0) {
                    a = 1;
                }
                if (a == 3) {
                    return qjm.STALE;
                }
                if (a == 4) {
                    return qjm.VAGUE;
                }
            }
            akqq akqqVar2 = null;
            if (a() != null) {
                azva a2 = a();
                dbsk.s(a2);
                akqqVar = a2.e;
            } else if (c() != null) {
                azxa c = c();
                dbsk.s(c);
                akqqVar = c.d();
            } else {
                akqqVar = null;
            }
            if (b() != null) {
                azva b = b();
                dbsk.s(b);
                akqqVar2 = b.e;
            } else if (d() != null) {
                azxa d2 = d();
                dbsk.s(d2);
                akqqVar2 = d2.d();
            }
            if (akqqVar == null || akqqVar2 == null || !akqq.v(akqqVar.w(new akqq(0.001d, -0.001d)), akqqVar2, 1.0E-5d)) {
                return qjm.OK;
            }
            return qjm.SETUP_SKIPPED;
        }
        return qjm.UNSET;
    }
}

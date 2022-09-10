package defpackage;
/* compiled from: PG */
/* renamed from: dnvm  reason: default package */
/* loaded from: classes.dex */
public final class dnvm extends dsqw<dnvm, dnvl> implements dssk {
    public static final dnvm d;
    private static volatile dssr<dnvm> g;
    public dqpe a;
    public int c;
    private int e;
    private byte f = 2;
    public dsrj<dnvk> b = dssu.b;

    static {
        dnvm dnvmVar = new dnvm();
        d = dnvmVar;
        dsqw.cc(dnvm.class, dnvmVar);
    }

    private dnvm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0001\u0002Л\u0003ဌ\u0002", new Object[]{"e", "a", "b", dnvk.class, "c", drbs.a});
            }
            if (i2 == 3) {
                return new dnvm();
            }
            if (i2 == 4) {
                return new dnvl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dnvm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnvm.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dnus  reason: default package */
/* loaded from: classes.dex */
public final class dnus extends dsqw<dnus, dnul> implements dssk {
    public static final dnus d;
    private static volatile dssr<dnus> g;
    public dqpe a;
    public int b;
    private int e;
    private byte f = 2;
    public dsrj<dnur> c = dssu.b;

    static {
        dnus dnusVar = new dnus();
        d = dnusVar;
        dsqw.cc(dnus.class, dnusVar);
    }

    private dnus() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဌ\u0001\u0003Л", new Object[]{"e", "a", "b", drbs.a, "c", dnur.class});
            }
            if (i2 == 3) {
                return new dnus();
            }
            if (i2 == 4) {
                return new dnul();
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
            dssr<dnus> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnus.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: dlif  reason: default package */
/* loaded from: classes6.dex */
public final class dlif extends dsqw<dlif, dlic> implements dssk {
    public static final dlif d;
    private static volatile dssr<dlif> g;
    public long a;
    public long b;
    private int e;
    private byte f = 2;
    public dsrj<dlie> c = dssu.b;

    static {
        dlif dlifVar = new dlif();
        d = dlifVar;
        dsqw.cc(dlif.class, dlifVar);
    }

    private dlif() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003Л", new Object[]{"e", "a", "b", "c", dlie.class});
            }
            if (i2 == 3) {
                return new dlif();
            }
            if (i2 == 4) {
                return new dlic();
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
            dssr<dlif> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlif.class) {
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

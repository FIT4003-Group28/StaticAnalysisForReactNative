package defpackage;
/* compiled from: PG */
/* renamed from: dhsy  reason: default package */
/* loaded from: classes6.dex */
public final class dhsy extends dsqw<dhsy, dhsn> implements dssk {
    public static final dhsy g;
    private static volatile dssr<dhsy> j;
    public Object b;
    public int c;
    public boolean e;
    private int h;
    public int a = 0;
    private byte i = 2;
    public String d = "";
    public String f = "";

    static {
        dhsy dhsyVar = new dhsy();
        g = dhsyVar;
        dsqw.cc(dhsy.class, dhsyVar);
    }

    private dhsy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0004ᐼ\u0000\u0005ြ\u0000\u0006ဈ\t\u0007ြ\u0000\bဇ\u0003\tြ\u0000\nြ\u0000", new Object[]{"b", "a", "h", "c", drds.c(), "d", dhsx.class, dhst.class, "f", dhsr.class, "e", dhsv.class, dhsv.class});
            }
            if (i2 == 3) {
                return new dhsy();
            }
            if (i2 == 4) {
                return new dhsn();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dhsy> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dhsy.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}

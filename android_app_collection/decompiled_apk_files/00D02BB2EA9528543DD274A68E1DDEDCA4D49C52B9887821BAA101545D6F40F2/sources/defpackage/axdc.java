package defpackage;
/* compiled from: PG */
/* renamed from: axdc  reason: default package */
/* loaded from: classes.dex */
public final class axdc extends dsqw<axdc, axdb> implements dssk {
    public static final axdc e;
    private static volatile dssr<axdc> g;
    public int a;
    public long b;
    public dvhi c;
    public dviq d;
    private byte f = 2;

    static {
        axdc axdcVar = new axdc();
        e = axdcVar;
        dsqw.cc(axdc.class, axdcVar);
    }

    private axdc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new axdc();
            }
            if (i2 == 4) {
                return new axdb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<axdc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (axdc.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}

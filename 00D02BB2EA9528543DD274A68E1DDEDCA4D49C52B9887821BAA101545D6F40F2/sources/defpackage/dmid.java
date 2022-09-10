package defpackage;
/* compiled from: PG */
/* renamed from: dmid  reason: default package */
/* loaded from: classes6.dex */
public final class dmid extends dsqw<dmid, dmic> implements dssk {
    public static final dmid c;
    private static volatile dssr<dmid> e;
    public double a;
    public double b;
    private int d;

    static {
        dmid dmidVar = new dmid();
        c = dmidVar;
        dsqw.cc(dmid.class, dmidVar);
    }

    private dmid() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dmid();
            }
            if (i2 == 4) {
                return new dmic();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmid> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmid.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

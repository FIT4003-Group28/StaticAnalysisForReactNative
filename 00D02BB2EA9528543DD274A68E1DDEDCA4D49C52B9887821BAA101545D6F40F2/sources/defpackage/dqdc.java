package defpackage;
/* compiled from: PG */
/* renamed from: dqdc  reason: default package */
/* loaded from: classes.dex */
public final class dqdc extends dsqw<dqdc, dqdb> implements dssk {
    public static final dqdc c;
    private static volatile dssr<dqdc> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        dqdc dqdcVar = new dqdc();
        c = dqdcVar;
        dsqw.cc(dqdc.class, dqdcVar);
    }

    private dqdc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqdc();
            }
            if (i2 == 4) {
                return new dqdb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqdc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqdc.class) {
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

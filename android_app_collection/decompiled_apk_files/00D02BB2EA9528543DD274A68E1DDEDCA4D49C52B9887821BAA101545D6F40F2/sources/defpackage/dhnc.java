package defpackage;
/* compiled from: PG */
/* renamed from: dhnc  reason: default package */
/* loaded from: classes6.dex */
public final class dhnc extends dsqw<dhnc, dhnb> implements dssk {
    public static final dhnc b;
    private static volatile dssr<dhnc> d;
    public String a = "";
    private int c;

    static {
        dhnc dhncVar = new dhnc();
        b = dhncVar;
        dsqw.cc(dhnc.class, dhncVar);
    }

    private dhnc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dhnc();
            }
            if (i2 == 4) {
                return new dhnb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhnc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhnc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: dqdw  reason: default package */
/* loaded from: classes6.dex */
public final class dqdw extends dsqw<dqdw, dqdr> implements dssk {
    public static final dqdw c;
    private static volatile dssr<dqdw> e;
    public dqdt a;
    public dqdv b;
    private int d;

    static {
        dqdw dqdwVar = new dqdw();
        c = dqdwVar;
        dsqw.cc(dqdw.class, dqdwVar);
    }

    private dqdw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqdw();
            }
            if (i2 == 4) {
                return new dqdr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqdw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqdw.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: crwf  reason: default package */
/* loaded from: classes5.dex */
public final class crwf extends dsqw<crwf, crwe> implements dssk {
    public static final crwf c;
    private static volatile dssr<crwf> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        crwf crwfVar = new crwf();
        c = crwfVar;
        dsqw.cc(crwf.class, crwfVar);
    }

    private crwf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new crwf();
            }
            if (i2 == 4) {
                return new crwe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<crwf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (crwf.class) {
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

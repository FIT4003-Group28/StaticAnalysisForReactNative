package defpackage;
/* compiled from: PG */
/* renamed from: dusi  reason: default package */
/* loaded from: classes.dex */
public final class dusi extends dsqw<dusi, dush> implements dssk {
    public static final dusi c;
    private static volatile dssr<dusi> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        dusi dusiVar = new dusi();
        c = dusiVar;
        dsqw.cc(dusi.class, dusiVar);
    }

    private dusi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\t\u0002\u0000\u0000\u0000\u0001ဇ\u0000\tဇ\b", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dusi();
            }
            if (i2 == 4) {
                return new dush();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dusi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dusi.class) {
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

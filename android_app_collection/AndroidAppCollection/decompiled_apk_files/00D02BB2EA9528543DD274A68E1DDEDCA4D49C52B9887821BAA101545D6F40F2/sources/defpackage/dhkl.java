package defpackage;
/* compiled from: PG */
/* renamed from: dhkl  reason: default package */
/* loaded from: classes6.dex */
public final class dhkl extends dsqw<dhkl, dhkk> implements dssk {
    public static final dhkl c;
    private static volatile dssr<dhkl> e;
    public dqnt a;
    public dsrj<dqnf> b = dssu.b;
    private int d;

    static {
        dhkl dhklVar = new dhkl();
        c = dhklVar;
        dsqw.cc(dhkl.class, dhklVar);
    }

    private dhkl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dqnf.class});
            }
            if (i2 == 3) {
                return new dhkl();
            }
            if (i2 == 4) {
                return new dhkk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhkl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhkl.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: dhxz  reason: default package */
/* loaded from: classes.dex */
public final class dhxz extends dsqw<dhxz, dhxx> implements dssk {
    public static final dhxz c;
    private static volatile dssr<dhxz> d;
    public int a = 0;
    public Object b;

    static {
        dhxz dhxzVar = new dhxz();
        c = dhxzVar;
        dsqw.cc(dhxz.class, dhxzVar);
    }

    private dhxz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", djsd.class, djsd.class, diin.class});
            }
            if (i2 == 3) {
                return new dhxz();
            }
            if (i2 == 4) {
                return new dhxx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhxz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhxz.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

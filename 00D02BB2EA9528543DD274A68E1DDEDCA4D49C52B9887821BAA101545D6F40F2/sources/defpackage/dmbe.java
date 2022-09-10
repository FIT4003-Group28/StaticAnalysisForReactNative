package defpackage;
/* compiled from: PG */
/* renamed from: dmbe  reason: default package */
/* loaded from: classes6.dex */
public final class dmbe extends dsqw<dmbe, dmbd> implements dssk {
    public static final dmbe c;
    private static volatile dssr<dmbe> d;
    public int a;
    public dhze b;

    static {
        dmbe dmbeVar = new dmbe();
        c = dmbeVar;
        dsqw.cc(dmbe.class, dmbeVar);
    }

    private dmbe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmbe();
            }
            if (i2 == 4) {
                return new dmbd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmbe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmbe.class) {
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

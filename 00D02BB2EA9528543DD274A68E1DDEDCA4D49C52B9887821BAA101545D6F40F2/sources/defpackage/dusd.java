package defpackage;
/* compiled from: PG */
/* renamed from: dusd  reason: default package */
/* loaded from: classes6.dex */
public final class dusd extends dsqw<dusd, dusc> implements dssk {
    public static final dusd c;
    private static volatile dssr<dusd> d;
    public int a;
    public dqht b;

    static {
        dusd dusdVar = new dusd();
        c = dusdVar;
        dsqw.cc(dusd.class, dusdVar);
    }

    private dusd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dusd();
            }
            if (i2 == 4) {
                return new dusc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dusd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dusd.class) {
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

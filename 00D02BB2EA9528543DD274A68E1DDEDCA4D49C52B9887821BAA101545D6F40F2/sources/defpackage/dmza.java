package defpackage;
/* compiled from: PG */
/* renamed from: dmza  reason: default package */
/* loaded from: classes6.dex */
public final class dmza extends dsqw<dmza, dmyz> implements dssk {
    public static final dmza b;
    private static volatile dssr<dmza> d;
    public int a;
    private int c;

    static {
        dmza dmzaVar = new dmza();
        b = dmzaVar;
        dsqw.cc(dmza.class, dmzaVar);
    }

    private dmza() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dmza();
            }
            if (i2 == 4) {
                return new dmyz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmza> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmza.class) {
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

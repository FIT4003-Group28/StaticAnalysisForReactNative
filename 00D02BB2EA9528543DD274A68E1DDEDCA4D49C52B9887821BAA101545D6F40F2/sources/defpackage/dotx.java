package defpackage;
/* compiled from: PG */
/* renamed from: dotx  reason: default package */
/* loaded from: classes6.dex */
public final class dotx extends dsqw<dotx, dotw> implements dssk {
    public static final dotx c;
    private static volatile dssr<dotx> d;
    public int a;
    public int b;

    static {
        dotx dotxVar = new dotx();
        c = dotxVar;
        dsqw.cc(dotx.class, dotxVar);
    }

    private dotx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004င\u0003", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dotx();
            }
            if (i2 == 4) {
                return new dotw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dotx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dotx.class) {
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

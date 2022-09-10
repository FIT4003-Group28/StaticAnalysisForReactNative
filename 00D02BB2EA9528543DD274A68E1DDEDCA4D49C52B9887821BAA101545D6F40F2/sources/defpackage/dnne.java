package defpackage;
/* compiled from: PG */
/* renamed from: dnne  reason: default package */
/* loaded from: classes6.dex */
public final class dnne extends dsqw<dnne, dnnd> implements dssk {
    public static final dnne c;
    private static volatile dssr<dnne> d;
    public int a;
    public int b = 5;

    static {
        dnne dnneVar = new dnne();
        c = dnneVar;
        dsqw.cc(dnne.class, dnneVar);
    }

    private dnne() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnne();
            }
            if (i2 == 4) {
                return new dnnd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnne> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnne.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: dnqo  reason: default package */
/* loaded from: classes6.dex */
public final class dnqo extends dsqw<dnqo, dnqn> implements dssk {
    public static final dnqo c;
    private static volatile dssr<dnqo> d;
    public int a;
    public int b;

    static {
        dnqo dnqoVar = new dnqo();
        c = dnqoVar;
        dsqw.cc(dnqo.class, dnqoVar);
    }

    private dnqo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnqo();
            }
            if (i2 == 4) {
                return new dnqn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnqo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnqo.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: dizf  reason: default package */
/* loaded from: classes.dex */
public final class dizf extends dsqw<dizf, dize> implements dssk {
    public static final dizf c;
    private static volatile dssr<dizf> d;
    public int a;
    public dlws b;

    static {
        dizf dizfVar = new dizf();
        c = dizfVar;
        dsqw.cc(dizf.class, dizfVar);
    }

    private dizf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dizf();
            }
            if (i2 == 4) {
                return new dize();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dizf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dizf.class) {
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

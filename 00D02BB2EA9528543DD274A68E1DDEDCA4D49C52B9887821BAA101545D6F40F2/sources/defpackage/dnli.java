package defpackage;
/* compiled from: PG */
/* renamed from: dnli  reason: default package */
/* loaded from: classes6.dex */
public final class dnli extends dsqw<dnli, dnlh> implements dssk {
    public static final dnli c;
    private static volatile dssr<dnli> d;
    public int a;
    public dngu b;

    static {
        dnli dnliVar = new dnli();
        c = dnliVar;
        dsqw.cc(dnli.class, dnliVar);
    }

    private dnli() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnli();
            }
            if (i2 == 4) {
                return new dnlh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnli> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnli.class) {
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

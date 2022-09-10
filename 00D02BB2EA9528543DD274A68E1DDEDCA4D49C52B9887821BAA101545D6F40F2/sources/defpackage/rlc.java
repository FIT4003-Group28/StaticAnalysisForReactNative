package defpackage;
/* compiled from: PG */
/* renamed from: rlc  reason: default package */
/* loaded from: classes7.dex */
public final class rlc extends dsqw<rlc, rkz> implements dssk {
    public static final rlc d;
    private static volatile dssr<rlc> e;
    public int a;
    public rlb b;
    public int c;

    static {
        rlc rlcVar = new rlc();
        d = rlcVar;
        dsqw.cc(rlc.class, rlcVar);
    }

    private rlc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new rlc();
            }
            if (i2 == 4) {
                return new rkz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<rlc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (rlc.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

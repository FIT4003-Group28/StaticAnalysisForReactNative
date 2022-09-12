package defpackage;
/* compiled from: PG */
/* renamed from: dnwz  reason: default package */
/* loaded from: classes6.dex */
public final class dnwz extends dsqw<dnwz, dnwy> implements dssk {
    public static final dnwz d;
    private static volatile dssr<dnwz> f;
    public dnxh a;
    public dqdk b;
    public boolean c;
    private int e;

    static {
        dnwz dnwzVar = new dnwz();
        d = dnwzVar;
        dsqw.cc(dnwz.class, dnwzVar);
    }

    private dnwz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnwz();
            }
            if (i2 == 4) {
                return new dnwy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnwz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnwz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

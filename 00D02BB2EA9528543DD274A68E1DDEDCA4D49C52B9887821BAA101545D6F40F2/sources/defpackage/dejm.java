package defpackage;
/* compiled from: PG */
/* renamed from: dejm  reason: default package */
/* loaded from: classes6.dex */
public final class dejm extends dsqw<dejm, dejl> implements dssk {
    public static final dejm d;
    private static volatile dssr<dejm> e;
    public int a;
    public int b;
    public long c;

    static {
        dejm dejmVar = new dejm();
        d = dejmVar;
        dsqw.cc(dejm.class, dejmVar);
    }

    private dejm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dejm();
            }
            if (i2 == 4) {
                return new dejl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dejm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dejm.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: dejg  reason: default package */
/* loaded from: classes6.dex */
public final class dejg extends dsqw<dejg, dejf> implements dssk {
    public static final dejg e;
    private static volatile dssr<dejg> f;
    public boolean a;
    public long b;
    public boolean c;
    public boolean d;

    static {
        dejg dejgVar = new dejg();
        e = dejgVar;
        dsqw.cc(dejg.class, dejgVar);
    }

    private dejg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0003\u0007\u0004\u0007", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dejg();
            }
            if (i2 == 4) {
                return new dejf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dejg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dejg.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

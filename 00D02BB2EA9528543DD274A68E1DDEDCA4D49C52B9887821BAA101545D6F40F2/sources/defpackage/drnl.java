package defpackage;
/* compiled from: PG */
/* renamed from: drnl  reason: default package */
/* loaded from: classes6.dex */
public final class drnl extends dsqw<drnl, drnk> implements dssk {
    public static final drnl b;
    private static volatile dssr<drnl> d;
    public dqdk a;
    private int c;

    static {
        drnl drnlVar = new drnl();
        b = drnlVar;
        dsqw.cc(drnl.class, drnlVar);
    }

    private drnl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drnl();
            }
            if (i2 == 4) {
                return new drnk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drnl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drnl.class) {
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

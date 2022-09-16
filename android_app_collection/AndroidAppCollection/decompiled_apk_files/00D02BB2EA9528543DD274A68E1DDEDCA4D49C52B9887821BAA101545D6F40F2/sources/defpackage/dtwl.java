package defpackage;
/* compiled from: PG */
/* renamed from: dtwl  reason: default package */
/* loaded from: classes6.dex */
public final class dtwl extends dsqw<dtwl, dtwk> implements dssk {
    public static final dtwl b;
    private static volatile dssr<dtwl> c;
    public int a;

    static {
        dtwl dtwlVar = new dtwl();
        b = dtwlVar;
        dsqw.cc(dtwl.class, dtwlVar);
    }

    private dtwl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dtwl();
            }
            if (i2 == 4) {
                return new dtwk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtwl> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtwl.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

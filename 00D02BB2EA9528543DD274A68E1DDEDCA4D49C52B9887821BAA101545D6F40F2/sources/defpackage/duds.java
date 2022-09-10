package defpackage;
/* compiled from: PG */
/* renamed from: duds  reason: default package */
/* loaded from: classes6.dex */
public final class duds extends dsqw<duds, dudn> implements dssk {
    public static final duds e;
    private static volatile dssr<duds> f;
    public int a;
    public dudr b;
    public dudp c;
    public double d;

    static {
        duds dudsVar = new duds();
        e = dudsVar;
        dsqw.cc(duds.class, dudsVar);
    }

    private duds() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003က\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new duds();
            }
            if (i2 == 4) {
                return new dudn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duds> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duds.class) {
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

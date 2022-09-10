package defpackage;
/* compiled from: PG */
/* renamed from: doqz  reason: default package */
/* loaded from: classes6.dex */
public final class doqz extends dsqw<doqz, doqy> implements dssk {
    public static final doqz b;
    private static volatile dssr<doqz> d;
    public String a = "";
    private int c;

    static {
        doqz doqzVar = new doqz();
        b = doqzVar;
        dsqw.cc(doqz.class, doqzVar);
    }

    private doqz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new doqz();
            }
            if (i2 == 4) {
                return new doqy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doqz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (doqz.class) {
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

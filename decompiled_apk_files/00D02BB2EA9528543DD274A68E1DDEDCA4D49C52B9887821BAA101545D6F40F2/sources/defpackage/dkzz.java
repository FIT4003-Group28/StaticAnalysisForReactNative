package defpackage;
/* compiled from: PG */
/* renamed from: dkzz  reason: default package */
/* loaded from: classes6.dex */
public final class dkzz extends dsqw<dkzz, dkzy> implements dssk {
    public static final dkzz b;
    private static volatile dssr<dkzz> d;
    public String a = "";
    private int c;

    static {
        dkzz dkzzVar = new dkzz();
        b = dkzzVar;
        dsqw.cc(dkzz.class, dkzzVar);
    }

    private dkzz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkzz();
            }
            if (i2 == 4) {
                return new dkzy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkzz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkzz.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: cguc  reason: default package */
/* loaded from: classes4.dex */
public final class cguc extends dsqw<cguc, cgtz> implements dssk {
    public static final cguc c;
    private static volatile dssr<cguc> e;
    public dspd a = dspd.b;
    public int b;
    private int d;

    static {
        cguc cgucVar = new cguc();
        c = cgucVar;
        dsqw.cc(cguc.class, cgucVar);
    }

    private cguc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", cgua.a});
            }
            if (i2 == 3) {
                return new cguc();
            }
            if (i2 == 4) {
                return new cgtz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cguc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cguc.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

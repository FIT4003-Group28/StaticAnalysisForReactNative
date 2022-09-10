package defpackage;
/* compiled from: PG */
/* renamed from: drmx  reason: default package */
/* loaded from: classes6.dex */
public final class drmx extends dsqw<drmx, drmw> implements dssk {
    public static final drmx b;
    private static volatile dssr<drmx> d;
    public String a = "";
    private int c;

    static {
        drmx drmxVar = new drmx();
        b = drmxVar;
        dsqw.cc(drmx.class, drmxVar);
    }

    private drmx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drmx();
            }
            if (i2 == 4) {
                return new drmw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drmx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drmx.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: dspf  reason: default package */
/* loaded from: classes6.dex */
public final class dspf extends dsqw<dspf, dspe> implements dssk {
    public static final dspf b;
    private static volatile dssr<dspf> c;
    public dspd a = dspd.b;

    static {
        dspf dspfVar = new dspf();
        b = dspfVar;
        dsqw.cc(dspf.class, dspfVar);
    }

    private dspf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dspf();
            }
            if (i2 == 4) {
                return new dspe();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dspf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dspf.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: dllc  reason: default package */
/* loaded from: classes6.dex */
public final class dllc extends dsqw<dllc, dllb> implements dssk {
    public static final dllc c;
    private static volatile dssr<dllc> d;
    public int a;
    public dspd b = dspd.b;

    static {
        dllc dllcVar = new dllc();
        c = dllcVar;
        dsqw.cc(dllc.class, dllcVar);
    }

    private dllc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dllc();
            }
            if (i2 == 4) {
                return new dllb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dllc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dllc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

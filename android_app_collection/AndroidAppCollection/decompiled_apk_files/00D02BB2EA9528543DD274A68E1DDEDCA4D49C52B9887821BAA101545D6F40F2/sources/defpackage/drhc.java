package defpackage;
/* compiled from: PG */
/* renamed from: drhc  reason: default package */
/* loaded from: classes6.dex */
public final class drhc extends dsqw<drhc, drhb> implements dssk {
    public static final drhc b;
    private static volatile dssr<drhc> d;
    public int a;
    private int c;

    static {
        drhc drhcVar = new drhc();
        b = drhcVar;
        dsqw.cc(drhc.class, drhcVar);
    }

    private drhc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drhc();
            }
            if (i2 == 4) {
                return new drhb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drhc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drhc.class) {
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

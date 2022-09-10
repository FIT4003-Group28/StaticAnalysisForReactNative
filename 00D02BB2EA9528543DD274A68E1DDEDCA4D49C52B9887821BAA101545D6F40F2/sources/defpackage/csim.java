package defpackage;
/* compiled from: PG */
/* renamed from: csim  reason: default package */
/* loaded from: classes5.dex */
public final class csim extends dsqw<csim, csil> implements dssk {
    public static final csim b;
    private static volatile dssr<csim> d;
    public int a;
    private int c;

    static {
        csim csimVar = new csim();
        b = csimVar;
        dsqw.cc(csim.class, csimVar);
    }

    private csim() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new csim();
            }
            if (i2 == 4) {
                return new csil();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csim> dssrVar = d;
            if (dssrVar == null) {
                synchronized (csim.class) {
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

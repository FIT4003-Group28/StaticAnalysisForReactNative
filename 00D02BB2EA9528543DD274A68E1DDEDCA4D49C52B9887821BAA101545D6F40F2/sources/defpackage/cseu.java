package defpackage;
/* compiled from: PG */
/* renamed from: cseu  reason: default package */
/* loaded from: classes5.dex */
public final class cseu extends dsqw<cseu, cset> implements dssk {
    public static final cseu c;
    private static volatile dssr<cseu> d;
    public int a;
    public dhhp b;

    static {
        cseu cseuVar = new cseu();
        c = cseuVar;
        dsqw.cc(cseu.class, cseuVar);
    }

    private cseu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cseu();
            }
            if (i2 == 4) {
                return new cset();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cseu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cseu.class) {
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

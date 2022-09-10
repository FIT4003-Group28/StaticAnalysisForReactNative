package defpackage;
/* compiled from: PG */
/* renamed from: eawj  reason: default package */
/* loaded from: classes6.dex */
public final class eawj extends dsqw<eawj, eawi> implements dssk {
    public static final eawj c;
    private static volatile dssr<eawj> d;
    public int a;
    public int b;

    static {
        eawj eawjVar = new eawj();
        c = eawjVar;
        dsqw.cc(eawj.class, eawjVar);
    }

    private eawj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new eawj();
            }
            if (i2 == 4) {
                return new eawi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eawj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (eawj.class) {
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

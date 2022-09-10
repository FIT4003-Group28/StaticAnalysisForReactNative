package defpackage;
/* compiled from: PG */
/* renamed from: eaxv  reason: default package */
/* loaded from: classes6.dex */
public final class eaxv extends dsqw<eaxv, eaxu> implements dssk {
    public static final eaxv c;
    private static volatile dssr<eaxv> d;
    public int a;
    public int b;

    static {
        eaxv eaxvVar = new eaxv();
        c = eaxvVar;
        dsqw.cc(eaxv.class, eaxvVar);
    }

    private eaxv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new eaxv();
            }
            if (i2 == 4) {
                return new eaxu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaxv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (eaxv.class) {
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

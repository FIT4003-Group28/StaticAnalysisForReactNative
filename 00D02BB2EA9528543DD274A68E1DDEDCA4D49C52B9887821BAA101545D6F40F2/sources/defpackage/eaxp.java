package defpackage;
/* compiled from: PG */
/* renamed from: eaxp  reason: default package */
/* loaded from: classes6.dex */
public final class eaxp extends dsqw<eaxp, eaxo> implements dssk {
    public static final eaxp d;
    private static volatile dssr<eaxp> e;
    public int a;
    public int b;
    public eaxr c;

    static {
        eaxp eaxpVar = new eaxp();
        d = eaxpVar;
        dsqw.cc(eaxp.class, eaxpVar);
    }

    private eaxp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001င\u0000\u0003ဉ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new eaxp();
            }
            if (i2 == 4) {
                return new eaxo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaxp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eaxp.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
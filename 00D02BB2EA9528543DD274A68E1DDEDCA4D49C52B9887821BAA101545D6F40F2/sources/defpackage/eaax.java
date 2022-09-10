package defpackage;
/* compiled from: PG */
/* renamed from: eaax  reason: default package */
/* loaded from: classes.dex */
public final class eaax extends dsqw<eaax, eaaw> implements dssk {
    public static final eaax c;
    private static volatile dssr<eaax> d;
    public int a;
    public String b = "";

    static {
        eaax eaaxVar = new eaax();
        c = eaaxVar;
        dsqw.cc(eaax.class, eaaxVar);
    }

    private eaax() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new eaax();
            }
            if (i2 == 4) {
                return new eaaw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaax> dssrVar = d;
            if (dssrVar == null) {
                synchronized (eaax.class) {
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

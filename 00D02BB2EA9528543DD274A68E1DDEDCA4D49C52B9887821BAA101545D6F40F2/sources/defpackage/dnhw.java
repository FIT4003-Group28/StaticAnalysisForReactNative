package defpackage;
/* compiled from: PG */
/* renamed from: dnhw  reason: default package */
/* loaded from: classes6.dex */
public final class dnhw extends dsqw<dnhw, dnht> implements dssk {
    public static final dnhw c;
    private static volatile dssr<dnhw> e;
    public dnhv a;
    public String b = "";
    private int d;

    static {
        dnhw dnhwVar = new dnhw();
        c = dnhwVar;
        dsqw.cc(dnhw.class, dnhwVar);
    }

    private dnhw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dnhw();
            }
            if (i2 == 4) {
                return new dnht();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnhw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnhw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

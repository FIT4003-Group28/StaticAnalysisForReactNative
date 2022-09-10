package defpackage;
/* compiled from: PG */
/* renamed from: dnha  reason: default package */
/* loaded from: classes6.dex */
public final class dnha extends dsqw<dnha, dngz> implements dssk {
    public static final dnha c;
    private static volatile dssr<dnha> e;
    public dnkc a;
    public String b = "";
    private int d;

    static {
        dnha dnhaVar = new dnha();
        c = dnhaVar;
        dsqw.cc(dnha.class, dnhaVar);
    }

    private dnha() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dnha();
            }
            if (i2 == 4) {
                return new dngz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnha> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnha.class) {
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

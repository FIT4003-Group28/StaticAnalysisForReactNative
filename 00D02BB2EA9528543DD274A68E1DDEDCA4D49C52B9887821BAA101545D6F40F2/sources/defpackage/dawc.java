package defpackage;
/* compiled from: PG */
/* renamed from: dawc  reason: default package */
/* loaded from: classes5.dex */
public final class dawc extends dsqw<dawc, dawb> implements dssk {
    public static final dawc c;
    private static volatile dssr<dawc> d;
    public int a;
    public String b = "";

    static {
        dawc dawcVar = new dawc();
        c = dawcVar;
        dsqw.cc(dawc.class, dawcVar);
    }

    private dawc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dawc();
            }
            if (i2 == 4) {
                return new dawb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dawc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dawc.class) {
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

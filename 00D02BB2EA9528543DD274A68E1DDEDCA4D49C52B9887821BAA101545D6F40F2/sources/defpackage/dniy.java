package defpackage;
/* compiled from: PG */
/* renamed from: dniy  reason: default package */
/* loaded from: classes6.dex */
public final class dniy extends dsqw<dniy, dnix> implements dssk {
    public static final dniy c;
    private static volatile dssr<dniy> d;
    public int a;
    public String b = "";

    static {
        dniy dniyVar = new dniy();
        c = dniyVar;
        dsqw.cc(dniy.class, dniyVar);
    }

    private dniy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dniy();
            }
            if (i2 == 4) {
                return new dnix();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dniy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dniy.class) {
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

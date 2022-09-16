package defpackage;
/* compiled from: PG */
/* renamed from: dghc  reason: default package */
/* loaded from: classes6.dex */
public final class dghc extends dsqw<dghc, dghb> implements dssk {
    public static final dghc c;
    private static volatile dssr<dghc> d;
    public int a;
    public String b = "";

    static {
        dghc dghcVar = new dghc();
        c = dghcVar;
        dsqw.cc(dghc.class, dghcVar);
    }

    private dghc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dghc();
            }
            if (i2 == 4) {
                return new dghb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dghc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dghc.class) {
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

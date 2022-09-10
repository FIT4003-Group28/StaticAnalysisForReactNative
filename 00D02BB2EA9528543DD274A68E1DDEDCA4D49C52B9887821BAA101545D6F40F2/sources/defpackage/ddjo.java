package defpackage;
/* compiled from: PG */
/* renamed from: ddjo  reason: default package */
/* loaded from: classes.dex */
public final class ddjo extends dsqw<ddjo, ddjn> implements dssk {
    public static final ddjo e;
    private static volatile dssr<ddjo> f;
    public int a;
    public String b = "";
    public boolean c;
    public boolean d;

    static {
        ddjo ddjoVar = new ddjo();
        e = ddjoVar;
        dsqw.cc(ddjo.class, ddjoVar);
    }

    private ddjo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddjo();
            }
            if (i2 == 4) {
                return new ddjn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddjo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddjo.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

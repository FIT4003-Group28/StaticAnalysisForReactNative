package defpackage;
/* compiled from: PG */
/* renamed from: dney  reason: default package */
/* loaded from: classes6.dex */
public final class dney extends dsqw<dney, dnev> implements dssk {
    public static final dney e;
    private static volatile dssr<dney> f;
    public int a;
    public int b;
    public int c;
    public String d = "";

    static {
        dney dneyVar = new dney();
        e = dneyVar;
        dsqw.cc(dney.class, dneyVar);
    }

    private dney() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", dnex.a, "c", dnew.a, "d"});
            }
            if (i2 == 3) {
                return new dney();
            }
            if (i2 == 4) {
                return new dnev();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dney> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dney.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: dork  reason: default package */
/* loaded from: classes6.dex */
public final class dork extends dsqw<dork, dorj> implements dssk {
    public static final dork e;
    private static volatile dssr<dork> f;
    public int a;
    public String b = "";
    public String c = "";
    public boolean d;

    static {
        dork dorkVar = new dork();
        e = dorkVar;
        dsqw.cc(dork.class, dorkVar);
    }

    private dork() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dork();
            }
            if (i2 == 4) {
                return new dorj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dork> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dork.class) {
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

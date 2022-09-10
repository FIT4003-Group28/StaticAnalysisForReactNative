package defpackage;
/* compiled from: PG */
/* renamed from: chxe  reason: default package */
/* loaded from: classes4.dex */
public final class chxe extends dsqw<chxe, chwz> implements dssk {
    public static final chxe f;
    private static volatile dssr<chxe> g;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";
    public String e = "";

    static {
        chxe chxeVar = new chxe();
        f = chxeVar;
        dsqw.cc(chxe.class, chxeVar);
    }

    private chxe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"c", "b", "a", "d", "e", chxb.class, chxd.class});
            }
            if (i2 == 3) {
                return new chxe();
            }
            if (i2 == 4) {
                return new chwz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chxe> dssrVar = g;
            if (dssrVar == null) {
                synchronized (chxe.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

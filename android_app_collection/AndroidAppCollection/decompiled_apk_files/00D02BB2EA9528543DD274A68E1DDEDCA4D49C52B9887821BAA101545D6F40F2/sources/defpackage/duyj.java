package defpackage;
/* compiled from: PG */
/* renamed from: duyj  reason: default package */
/* loaded from: classes.dex */
public final class duyj extends dsqw<duyj, duyi> implements dssk {
    public static final duyj c;
    private static volatile dssr<duyj> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        duyj duyjVar = new duyj();
        c = duyjVar;
        dsqw.cc(duyj.class, duyjVar);
    }

    private duyj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new duyj();
            }
            if (i2 == 4) {
                return new duyi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duyj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duyj.class) {
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

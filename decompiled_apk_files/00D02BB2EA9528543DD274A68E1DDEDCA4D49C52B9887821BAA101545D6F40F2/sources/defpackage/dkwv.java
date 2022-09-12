package defpackage;
/* compiled from: PG */
/* renamed from: dkwv  reason: default package */
/* loaded from: classes.dex */
public final class dkwv extends dsqw<dkwv, dkwu> implements dssk {
    public static final dkwv f;
    private static volatile dssr<dkwv> g;
    public int a;
    public int b = 3;
    public dsri c = dsrx.b;
    public String d = "";
    public String e = "";

    static {
        dkwv dkwvVar = new dkwv();
        f = dkwvVar;
        dsqw.cc(dkwv.class, dkwvVar);
    }

    private dkwv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002\u0014\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dkwv();
            }
            if (i2 == 4) {
                return new dkwu();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkwv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkwv.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: ddzr  reason: default package */
/* loaded from: classes6.dex */
public final class ddzr extends dsqw<ddzr, ddzq> implements dssk {
    public static final ddzr f;
    private static volatile dssr<ddzr> g;
    public int a;
    public String b = "";
    public long c;
    public long d;
    public int e;

    static {
        ddzr ddzrVar = new ddzr();
        f = ddzrVar;
        dsqw.cc(ddzr.class, ddzrVar);
    }

    private ddzr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddzr();
            }
            if (i2 == 4) {
                return new ddzq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddzr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddzr.class) {
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

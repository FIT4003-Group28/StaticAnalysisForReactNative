package defpackage;
/* compiled from: PG */
/* renamed from: dsbr  reason: default package */
/* loaded from: classes6.dex */
public final class dsbr extends dsqw<dsbr, dsbq> implements dssk {
    public static final dsbr e;
    private static volatile dssr<dsbr> f;
    public int a;
    public String b = "";
    public dscr c;
    public dsdx d;

    static {
        dsbr dsbrVar = new dsbr();
        e = dsbrVar;
        dsqw.cc(dsbr.class, dsbrVar);
    }

    private dsbr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dsbr();
            }
            if (i2 == 4) {
                return new dsbq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsbr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsbr.class) {
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

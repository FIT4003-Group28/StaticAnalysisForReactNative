package defpackage;
/* compiled from: PG */
/* renamed from: dvtq  reason: default package */
/* loaded from: classes6.dex */
public final class dvtq extends dsqw<dvtq, dvtp> implements dssk {
    public static final dvtq c;
    private static volatile dssr<dvtq> d;
    public int a;
    public long b;

    static {
        dvtq dvtqVar = new dvtq();
        c = dvtqVar;
        dsqw.cc(dvtq.class, dvtqVar);
    }

    private dvtq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvtq();
            }
            if (i2 == 4) {
                return new dvtp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvtq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvtq.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: djbr  reason: default package */
/* loaded from: classes6.dex */
public final class djbr extends dsqw<djbr, djbq> implements dssk {
    public static final djbr d;
    private static volatile dssr<djbr> f;
    public String a = "";
    public String b = "";
    public int c;
    private int e;

    static {
        djbr djbrVar = new djbr();
        d = djbrVar;
        dsqw.cc(djbr.class, djbrVar);
    }

    private djbr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new djbr();
            }
            if (i2 == 4) {
                return new djbq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djbr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djbr.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

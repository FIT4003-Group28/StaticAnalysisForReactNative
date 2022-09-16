package defpackage;
/* compiled from: PG */
/* renamed from: djnc  reason: default package */
/* loaded from: classes6.dex */
public final class djnc extends dsqw<djnc, djnb> implements dssk {
    public static final djnc b;
    private static volatile dssr<djnc> d;
    public djnk a;
    private int c;

    static {
        djnc djncVar = new djnc();
        b = djncVar;
        dsqw.cc(djnc.class, djncVar);
    }

    private djnc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djnc();
            }
            if (i2 == 4) {
                return new djnb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djnc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djnc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

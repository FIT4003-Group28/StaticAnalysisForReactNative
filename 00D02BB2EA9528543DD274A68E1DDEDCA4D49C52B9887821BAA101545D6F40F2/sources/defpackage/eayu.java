package defpackage;
/* compiled from: PG */
/* renamed from: eayu  reason: default package */
/* loaded from: classes6.dex */
public final class eayu extends dsqw<eayu, eayt> implements dssk {
    public static final eayu i;
    private static volatile dssr<eayu> j;
    public int a;
    public int b;
    public int c;
    public dudj d;
    public String e = "";
    public long f;
    public eayr g;
    public int h;

    static {
        eayu eayuVar = new eayu();
        i = eayuVar;
        dsqw.cc(eayu.class, eayuVar);
    }

    private eayu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0002\u0003ဈ\u0003\u0004ဂ\u0004\u0005ဌ\u0001\u0006ဉ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", czgn.a, "d", "e", "f", "c", czgq.c(), "g", "h", eayv.a});
            }
            if (i3 == 3) {
                return new eayu();
            }
            if (i3 == 4) {
                return new eayt();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<eayu> dssrVar = j;
            if (dssrVar == null) {
                synchronized (eayu.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

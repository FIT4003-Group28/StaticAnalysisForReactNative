package defpackage;
/* compiled from: PG */
/* renamed from: dupg  reason: default package */
/* loaded from: classes6.dex */
public final class dupg extends dsqw<dupg, dupf> implements dssk {
    public static final dupg b;
    private static volatile dssr<dupg> d;
    public dnwb a;
    private int c;

    static {
        dupg dupgVar = new dupg();
        b = dupgVar;
        dsqw.cc(dupg.class, dupgVar);
    }

    private dupg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dupg();
            }
            if (i2 == 4) {
                return new dupf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dupg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dupg.class) {
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

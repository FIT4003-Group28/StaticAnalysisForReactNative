package defpackage;
/* compiled from: PG */
/* renamed from: dntg  reason: default package */
/* loaded from: classes6.dex */
public final class dntg extends dsqw<dntg, dntf> implements dssk {
    public static final dntg b;
    private static volatile dssr<dntg> d;
    public String a = "";
    private int c;

    static {
        dntg dntgVar = new dntg();
        b = dntgVar;
        dsqw.cc(dntg.class, dntgVar);
    }

    private dntg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dntg();
            }
            if (i2 == 4) {
                return new dntf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dntg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dntg.class) {
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

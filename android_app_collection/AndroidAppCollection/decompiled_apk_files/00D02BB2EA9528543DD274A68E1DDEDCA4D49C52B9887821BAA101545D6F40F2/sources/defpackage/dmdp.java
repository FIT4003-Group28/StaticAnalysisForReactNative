package defpackage;
/* compiled from: PG */
/* renamed from: dmdp  reason: default package */
/* loaded from: classes6.dex */
public final class dmdp extends dsqw<dmdp, dmdo> implements dssk {
    public static final dmdp b;
    private static volatile dssr<dmdp> d;
    public String a = "";
    private int c;

    static {
        dmdp dmdpVar = new dmdp();
        b = dmdpVar;
        dsqw.cc(dmdp.class, dmdpVar);
    }

    private dmdp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dmdp();
            }
            if (i2 == 4) {
                return new dmdo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmdp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmdp.class) {
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

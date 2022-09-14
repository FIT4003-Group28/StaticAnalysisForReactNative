package defpackage;
/* compiled from: PG */
/* renamed from: dosu  reason: default package */
/* loaded from: classes6.dex */
public final class dosu extends dsqw<dosu, dost> implements dssk {
    public static final dosu b;
    private static volatile dssr<dosu> d;
    public String a = "";
    private int c;

    static {
        dosu dosuVar = new dosu();
        b = dosuVar;
        dsqw.cc(dosu.class, dosuVar);
    }

    private dosu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dosu();
            }
            if (i2 == 4) {
                return new dost();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dosu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dosu.class) {
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

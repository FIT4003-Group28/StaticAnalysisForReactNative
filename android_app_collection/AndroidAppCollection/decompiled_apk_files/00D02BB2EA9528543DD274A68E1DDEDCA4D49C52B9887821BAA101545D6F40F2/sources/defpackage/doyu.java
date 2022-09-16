package defpackage;
/* compiled from: PG */
/* renamed from: doyu  reason: default package */
/* loaded from: classes6.dex */
public final class doyu extends dsqw<doyu, doyt> implements dssk {
    public static final doyu e;
    private static volatile dssr<doyu> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        doyu doyuVar = new doyu();
        e = doyuVar;
        dsqw.cc(doyu.class, doyuVar);
    }

    private doyu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "d", "b", "c"});
            }
            if (i2 == 3) {
                return new doyu();
            }
            if (i2 == 4) {
                return new doyt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doyu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (doyu.class) {
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

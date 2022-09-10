package defpackage;
/* compiled from: PG */
/* renamed from: chxr  reason: default package */
/* loaded from: classes4.dex */
public final class chxr extends dsqw<chxr, chxq> implements dssk {
    public static final chxr e;
    private static volatile dssr<chxr> f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        chxr chxrVar = new chxr();
        e = chxrVar;
        dsqw.cc(chxr.class, chxrVar);
    }

    private chxr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ျ\u0000\u0002ဈ\u0003\u0003ျ\u0000\u0004့\u0000", new Object[]{"c", "b", "a", "d"});
            }
            if (i2 == 3) {
                return new chxr();
            }
            if (i2 == 4) {
                return new chxq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chxr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (chxr.class) {
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

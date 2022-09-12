package defpackage;
/* compiled from: PG */
/* renamed from: bzhn  reason: default package */
/* loaded from: classes4.dex */
public final class bzhn extends dsqw<bzhn, bzhk> implements dssk {
    public static final bzhn d;
    private static volatile dssr<bzhn> e;
    public int a;
    public int b;
    public String c = "";

    static {
        bzhn bzhnVar = new bzhn();
        d = bzhnVar;
        dsqw.cc(bzhn.class, bzhnVar);
    }

    private bzhn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bzhm.c(), "c"});
            }
            if (i2 == 3) {
                return new bzhn();
            }
            if (i2 == 4) {
                return new bzhk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzhn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bzhn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

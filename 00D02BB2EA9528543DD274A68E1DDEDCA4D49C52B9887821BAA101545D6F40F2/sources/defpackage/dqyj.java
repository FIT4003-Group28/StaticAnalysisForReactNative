package defpackage;
/* compiled from: PG */
/* renamed from: dqyj  reason: default package */
/* loaded from: classes6.dex */
public final class dqyj extends dsqw<dqyj, dqyi> implements dssk {
    public static final dqyj f;
    private static volatile dssr<dqyj> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dqyj dqyjVar = new dqyj();
        f = dqyjVar;
        dsqw.cc(dqyj.class, dqyjVar);
    }

    private dqyj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dqyj();
            }
            if (i2 == 4) {
                return new dqyi();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqyj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqyj.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

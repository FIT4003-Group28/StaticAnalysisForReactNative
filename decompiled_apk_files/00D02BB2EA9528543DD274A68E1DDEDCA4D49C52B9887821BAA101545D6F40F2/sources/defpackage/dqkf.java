package defpackage;
/* compiled from: PG */
/* renamed from: dqkf  reason: default package */
/* loaded from: classes6.dex */
public final class dqkf extends dsqw<dqkf, dqke> implements dssk {
    public static final dqkf f;
    private static volatile dssr<dqkf> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dqkf dqkfVar = new dqkf();
        f = dqkfVar;
        dsqw.cc(dqkf.class, dqkfVar);
    }

    private dqkf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dqkf();
            }
            if (i2 == 4) {
                return new dqke();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqkf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqkf.class) {
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
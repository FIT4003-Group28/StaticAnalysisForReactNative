package defpackage;
/* compiled from: PG */
/* renamed from: dhmm  reason: default package */
/* loaded from: classes6.dex */
public final class dhmm extends dsqw<dhmm, dhml> implements dssk {
    public static final dhmm f;
    private static volatile dssr<dhmm> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dhmm dhmmVar = new dhmm();
        f = dhmmVar;
        dsqw.cc(dhmm.class, dhmmVar);
    }

    private dhmm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dhmm();
            }
            if (i2 == 4) {
                return new dhml();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhmm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhmm.class) {
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

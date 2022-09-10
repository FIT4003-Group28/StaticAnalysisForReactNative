package defpackage;
/* compiled from: PG */
/* renamed from: ccxa  reason: default package */
/* loaded from: classes4.dex */
public final class ccxa extends dsqw<ccxa, ccwz> implements dssk {
    public static final ccxa f;
    private static volatile dssr<ccxa> g;
    public int a;
    public String b = "";
    public dsrj<String> c = dssu.b;
    public String d = "";
    public String e = "";

    static {
        ccxa ccxaVar = new ccxa();
        f = ccxaVar;
        dsqw.cc(ccxa.class, ccxaVar);
    }

    private ccxa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0005ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ccxa();
            }
            if (i2 == 4) {
                return new ccwz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccxa> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ccxa.class) {
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

package defpackage;
/* compiled from: PG */
/* renamed from: doul  reason: default package */
/* loaded from: classes6.dex */
public final class doul extends dsqw<doul, douk> implements dssk {
    public static final doul f;
    private static volatile dssr<doul> g;
    public int a;
    public boolean c;
    public String b = "";
    public String d = "";
    public String e = "";

    static {
        doul doulVar = new doul();
        f = doulVar;
        dsqw.cc(doul.class, doulVar);
    }

    private doul() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new doul();
            }
            if (i2 == 4) {
                return new douk();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doul> dssrVar = g;
            if (dssrVar == null) {
                synchronized (doul.class) {
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

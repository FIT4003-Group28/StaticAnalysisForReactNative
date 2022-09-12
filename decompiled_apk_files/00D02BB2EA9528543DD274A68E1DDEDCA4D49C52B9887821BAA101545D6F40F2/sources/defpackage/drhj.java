package defpackage;
/* compiled from: PG */
/* renamed from: drhj  reason: default package */
/* loaded from: classes6.dex */
public final class drhj extends dsqw<drhj, drhi> implements dssk {
    public static final drhj c;
    private static volatile dssr<drhj> d;
    public int a;
    public String b = "";

    static {
        drhj drhjVar = new drhj();
        c = drhjVar;
        dsqw.cc(drhj.class, drhjVar);
    }

    private drhj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drhj();
            }
            if (i2 == 4) {
                return new drhi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drhj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drhj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

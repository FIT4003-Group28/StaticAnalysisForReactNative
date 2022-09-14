package defpackage;
/* compiled from: PG */
/* renamed from: doub  reason: default package */
/* loaded from: classes6.dex */
public final class doub extends dsqw<doub, doty> implements dssk {
    public static final doub f;
    private static volatile dssr<doub> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public String e = "";
    private int g;

    static {
        doub doubVar = new doub();
        f = doubVar;
        dsqw.cc(doub.class, doubVar);
    }

    private doub() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0002\t\u0005\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002\u0005င\u0004\u0006ဌ\u0005\tဈ\b", new Object[]{"g", "a", "b", "c", "d", dotz.a, "e"});
            }
            if (i2 == 3) {
                return new doub();
            }
            if (i2 == 4) {
                return new doty();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doub> dssrVar = h;
            if (dssrVar == null) {
                synchronized (doub.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

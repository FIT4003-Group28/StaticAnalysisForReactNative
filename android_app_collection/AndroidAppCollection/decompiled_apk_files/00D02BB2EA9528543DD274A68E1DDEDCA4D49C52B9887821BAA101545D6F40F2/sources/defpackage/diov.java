package defpackage;
/* compiled from: PG */
/* renamed from: diov  reason: default package */
/* loaded from: classes6.dex */
public final class diov extends dsqw<diov, diou> implements dssk {
    public static final diov d;
    private static volatile dssr<diov> f;
    public int a;
    public String b = "";
    public String c = "";
    private int e;

    static {
        diov diovVar = new diov();
        d = diovVar;
        dsqw.cc(diov.class, diovVar);
    }

    private diov() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဌ\u0000\u0003ဈ\u0002", new Object[]{"e", "b", "a", dgbp.a, "c"});
            }
            if (i2 == 3) {
                return new diov();
            }
            if (i2 == 4) {
                return new diou();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diov> dssrVar = f;
            if (dssrVar == null) {
                synchronized (diov.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

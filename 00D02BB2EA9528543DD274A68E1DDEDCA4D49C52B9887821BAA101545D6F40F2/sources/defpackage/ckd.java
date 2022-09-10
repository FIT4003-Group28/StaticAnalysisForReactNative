package defpackage;
/* compiled from: PG */
/* renamed from: ckd  reason: default package */
/* loaded from: classes4.dex */
public final class ckd extends dsqw<ckd, ckc> implements dssk {
    public static final ckd g;
    private static volatile dssr<ckd> h;
    public int a;
    public int c;
    public boolean f;
    public String b = "";
    public dsrj<String> d = dssu.b;
    public String e = "";

    static {
        ckd ckdVar = new ckd();
        g = ckdVar;
        dsqw.cc(ckd.class, ckdVar);
    }

    private ckd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0004\u001a\u0005ဈ\u0002\u0007င\u0001\bဇ\u0004", new Object[]{"a", "b", "d", "e", "c", "f"});
            }
            if (i2 == 3) {
                return new ckd();
            }
            if (i2 == 4) {
                return new ckc();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckd> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ckd.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

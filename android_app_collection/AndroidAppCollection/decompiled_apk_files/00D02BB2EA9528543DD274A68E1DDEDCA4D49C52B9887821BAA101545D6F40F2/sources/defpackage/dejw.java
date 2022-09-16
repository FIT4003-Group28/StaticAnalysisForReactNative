package defpackage;
/* compiled from: PG */
/* renamed from: dejw  reason: default package */
/* loaded from: classes6.dex */
public final class dejw extends dsqw<dejw, dejv> implements dssk {
    public static final dejw e;
    private static volatile dssr<dejw> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        dejw dejwVar = new dejw();
        e = dejwVar;
        dsqw.cc(dejw.class, dejwVar);
    }

    private dejw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dejw();
            }
            if (i2 == 4) {
                return new dejv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dejw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dejw.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

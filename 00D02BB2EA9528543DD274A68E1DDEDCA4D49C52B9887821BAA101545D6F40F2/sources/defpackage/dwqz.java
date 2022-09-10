package defpackage;
/* compiled from: PG */
/* renamed from: dwqz  reason: default package */
/* loaded from: classes6.dex */
public final class dwqz extends dsqw<dwqz, dwqu> implements dssk {
    public static final dwqz g;
    private static volatile dssr<dwqz> h;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public dwqw e;
    public dwqy f;

    static {
        dwqz dwqzVar = new dwqz();
        g = dwqzVar;
        dsqw.cc(dwqz.class, dwqzVar);
    }

    private dwqz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dwqz();
            }
            if (i2 == 4) {
                return new dwqu();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwqz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwqz.class) {
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

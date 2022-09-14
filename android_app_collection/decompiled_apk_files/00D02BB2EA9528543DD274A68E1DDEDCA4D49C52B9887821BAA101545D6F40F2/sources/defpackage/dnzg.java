package defpackage;
/* compiled from: PG */
/* renamed from: dnzg  reason: default package */
/* loaded from: classes6.dex */
public final class dnzg extends dsqw<dnzg, dnzf> implements dssk {
    public static final dnzg g;
    private static volatile dssr<dnzg> h;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        dnzg dnzgVar = new dnzg();
        g = dnzgVar;
        dsqw.cc(dnzg.class, dnzgVar);
    }

    private dnzg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0004\u0005ဇ\u0003", new Object[]{"a", "b", "c", "d", "f", "e"});
            }
            if (i2 == 3) {
                return new dnzg();
            }
            if (i2 == 4) {
                return new dnzf();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnzg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dnzg.class) {
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

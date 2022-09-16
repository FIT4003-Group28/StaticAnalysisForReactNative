package defpackage;
/* compiled from: PG */
/* renamed from: arkz  reason: default package */
/* loaded from: classes2.dex */
public final class arkz extends dsqw<arkz, arky> implements dssk {
    public static final arkz g;
    private static volatile dssr<arkz> h;
    public int a;
    public arkx b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public dstv f;

    static {
        arkz arkzVar = new arkz();
        g = arkzVar;
        dsqw.cc(arkz.class, arkzVar);
    }

    private arkz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0002\u0016\u0005\u0000\u0000\u0000\u0002ဇ\u0001\u0013ဉ\u0000\u0014ဇ\u0002\u0015ဇ\u0003\u0016ဉ\u0004", new Object[]{"a", "c", "b", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new arkz();
            }
            if (i2 == 4) {
                return new arky();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<arkz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (arkz.class) {
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

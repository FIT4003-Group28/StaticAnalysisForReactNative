package defpackage;
/* compiled from: PG */
/* renamed from: dkls  reason: default package */
/* loaded from: classes.dex */
public final class dkls extends dsqw<dkls, dklp> implements dssk {
    public static final dkls b;
    private static volatile dssr<dkls> d;
    public int a;
    private int c;

    static {
        dkls dklsVar = new dkls();
        b = dklsVar;
        dsqw.cc(dkls.class, dklsVar);
    }

    private dkls() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"c", "a", dklq.a});
            }
            if (i2 == 3) {
                return new dkls();
            }
            if (i2 == 4) {
                return new dklp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkls> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkls.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

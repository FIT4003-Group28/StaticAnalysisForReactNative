package defpackage;
/* compiled from: PG */
/* renamed from: ckwg  reason: default package */
/* loaded from: classes5.dex */
public final class ckwg extends dsqw<ckwg, ckwf> implements dssk {
    public static final ckwg e;
    private static volatile dssr<ckwg> f;
    public int a;
    public ckvz b;
    public long c;
    public int d;

    static {
        ckwg ckwgVar = new ckwg();
        e = ckwgVar;
        dsqw.cc(ckwg.class, ckwgVar);
    }

    private ckwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", ckwc.a});
            }
            if (i2 == 3) {
                return new ckwg();
            }
            if (i2 == 4) {
                return new ckwf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckwg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ckwg.class) {
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

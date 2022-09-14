package defpackage;
/* compiled from: PG */
/* renamed from: ckzu  reason: default package */
/* loaded from: classes5.dex */
public final class ckzu extends dsqw<ckzu, ckzt> implements dssk {
    public static final ckzu c;
    private static volatile dssr<ckzu> d;
    public int a;
    public dspd b = dspd.b;

    static {
        ckzu ckzuVar = new ckzu();
        c = ckzuVar;
        dsqw.cc(ckzu.class, ckzuVar);
    }

    private ckzu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ckzu();
            }
            if (i2 == 4) {
                return new ckzt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckzu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ckzu.class) {
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

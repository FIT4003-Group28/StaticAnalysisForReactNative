package defpackage;
/* compiled from: PG */
/* renamed from: bufh  reason: default package */
/* loaded from: classes4.dex */
public final class bufh extends dsqw<bufh, bufg> implements dssk {
    public static final bufh c;
    private static volatile dssr<bufh> d;
    public int a;
    public dspd b = dspd.b;

    static {
        bufh bufhVar = new bufh();
        c = bufhVar;
        dsqw.cc(bufh.class, bufhVar);
    }

    private bufh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new bufh();
            }
            if (i2 == 4) {
                return new bufg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bufh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (bufh.class) {
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

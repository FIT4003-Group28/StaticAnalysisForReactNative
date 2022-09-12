package defpackage;
/* compiled from: PG */
/* renamed from: ckxh  reason: default package */
/* loaded from: classes5.dex */
public final class ckxh extends dsqw<ckxh, ckxg> implements dssk {
    public static final ckxh f;
    private static volatile dssr<ckxh> g;
    public int a;
    public ckwb b;
    public int c;
    public ckxl d;
    public ckxp e;

    static {
        ckxh ckxhVar = new ckxh();
        f = ckxhVar;
        dsqw.cc(ckxh.class, ckxhVar);
    }

    private ckxh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", ckwc.a, "d", "e"});
            }
            if (i2 == 3) {
                return new ckxh();
            }
            if (i2 == 4) {
                return new ckxg();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckxh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ckxh.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

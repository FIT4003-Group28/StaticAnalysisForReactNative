package defpackage;
/* compiled from: PG */
/* renamed from: aimh  reason: default package */
/* loaded from: classes2.dex */
public final class aimh extends dsqw<aimh, aimg> implements dssk {
    public static final aimh c;
    private static volatile dssr<aimh> d;
    public int a;
    public dqzv b;

    static {
        aimh aimhVar = new aimh();
        c = aimhVar;
        dsqw.cc(aimh.class, aimhVar);
    }

    private aimh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new aimh();
            }
            if (i2 == 4) {
                return new aimg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aimh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (aimh.class) {
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

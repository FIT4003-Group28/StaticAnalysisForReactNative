package defpackage;
/* compiled from: PG */
/* renamed from: drqy  reason: default package */
/* loaded from: classes6.dex */
public final class drqy extends dsqw<drqy, drpx> implements dssk {
    public static final drqy c;
    private static volatile dssr<drqy> d;
    public int a = 0;
    public Object b;

    static {
        drqy drqyVar = new drqy();
        c = drqyVar;
        dsqw.cc(drqy.class, drqyVar);
    }

    private drqy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", drqb.class, drqf.class, drqx.class, drqh.class, drqt.class, drqd.class, drqv.class});
            }
            if (i2 == 3) {
                return new drqy();
            }
            if (i2 == 4) {
                return new drpx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drqy.class) {
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

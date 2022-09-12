package defpackage;
/* compiled from: PG */
/* renamed from: drqt  reason: default package */
/* loaded from: classes6.dex */
public final class drqt extends dsqw<drqt, drqi> implements dssk {
    public static final drqt c;
    private static volatile dssr<drqt> d;
    public int a = 0;
    public Object b;

    static {
        drqt drqtVar = new drqt();
        c = drqtVar;
        dsqw.cc(drqt.class, drqtVar);
    }

    private drqt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", drqq.class, drqk.class, drqm.class, drqs.class, drqo.class});
            }
            if (i2 == 3) {
                return new drqt();
            }
            if (i2 == 4) {
                return new drqi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drqt.class) {
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

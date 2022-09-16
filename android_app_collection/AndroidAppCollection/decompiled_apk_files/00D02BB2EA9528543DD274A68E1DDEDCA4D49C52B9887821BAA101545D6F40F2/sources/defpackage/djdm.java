package defpackage;
/* compiled from: PG */
/* renamed from: djdm  reason: default package */
/* loaded from: classes6.dex */
public final class djdm extends dsqw<djdm, djdb> implements dssk {
    public static final djdm c;
    private static volatile dssr<djdm> d;
    public int a = 0;
    public Object b;

    static {
        djdm djdmVar = new djdm();
        c = djdmVar;
        dsqw.cc(djdm.class, djdmVar);
    }

    private djdm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", djdh.class, djdf.class, djdl.class, djdj.class, djdd.class});
            }
            if (i2 == 3) {
                return new djdm();
            }
            if (i2 == 4) {
                return new djdb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djdm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djdm.class) {
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

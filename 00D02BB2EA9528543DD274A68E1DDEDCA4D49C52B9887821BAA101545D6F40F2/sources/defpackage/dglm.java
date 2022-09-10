package defpackage;
/* compiled from: PG */
/* renamed from: dglm  reason: default package */
/* loaded from: classes6.dex */
public final class dglm extends dsqw<dglm, dglh> implements dssk {
    public static final dglm c;
    private static volatile dssr<dglm> d;
    public int a = 0;
    public Object b;

    static {
        dglm dglmVar = new dglm();
        c = dglmVar;
        dsqw.cc(dglm.class, dglmVar);
    }

    private dglm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dglj.class, dgll.class});
            }
            if (i2 == 3) {
                return new dglm();
            }
            if (i2 == 4) {
                return new dglh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dglm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dglm.class) {
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

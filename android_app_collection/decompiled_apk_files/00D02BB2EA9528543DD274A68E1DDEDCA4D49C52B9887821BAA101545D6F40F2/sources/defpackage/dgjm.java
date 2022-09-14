package defpackage;
/* compiled from: PG */
/* renamed from: dgjm  reason: default package */
/* loaded from: classes6.dex */
public final class dgjm extends dsqw<dgjm, dgjj> implements dssk {
    public static final dgjm c;
    private static volatile dssr<dgjm> d;
    public int a = 0;
    public Object b;

    static {
        dgjm dgjmVar = new dgjm();
        c = dgjmVar;
        dsqw.cc(dgjm.class, dgjmVar);
    }

    private dgjm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", dgjl.class});
            }
            if (i2 == 3) {
                return new dgjm();
            }
            if (i2 == 4) {
                return new dgjj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgjm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgjm.class) {
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

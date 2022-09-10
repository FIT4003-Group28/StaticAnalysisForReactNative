package defpackage;
/* compiled from: PG */
/* renamed from: dsfg  reason: default package */
/* loaded from: classes6.dex */
public final class dsfg extends dsqw<dsfg, dsff> implements dssk {
    public static final dsfg d;
    private static volatile dssr<dsfg> f;
    public float a;
    public float b = -1.0f;
    public float c = -1.0f;
    private int e;

    static {
        dsfg dsfgVar = new dsfg();
        d = dsfgVar;
        dsqw.cc(dsfg.class, dsfgVar);
    }

    private dsfg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsfg();
            }
            if (i2 == 4) {
                return new dsff();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsfg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsfg.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

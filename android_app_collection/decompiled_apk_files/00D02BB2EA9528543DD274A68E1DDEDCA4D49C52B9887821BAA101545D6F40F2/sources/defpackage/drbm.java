package defpackage;
/* compiled from: PG */
/* renamed from: drbm  reason: default package */
/* loaded from: classes6.dex */
public final class drbm extends dsqw<drbm, drbl> implements dssk {
    public static final drbm d;
    private static volatile dssr<drbm> e;
    public int a;
    public int b;
    public drbj c;

    static {
        drbm drbmVar = new drbm();
        d = drbmVar;
        dsqw.cc(drbm.class, drbmVar);
    }

    private drbm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", drbp.a, "c"});
            }
            if (i2 == 3) {
                return new drbm();
            }
            if (i2 == 4) {
                return new drbl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drbm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drbm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: disy  reason: default package */
/* loaded from: classes6.dex */
public final class disy extends dsqw<disy, disv> implements dssk {
    public static final disy d;
    private static volatile dssr<disy> e;
    public int a;
    public int b;
    public dqzv c;

    static {
        disy disyVar = new disy();
        d = disyVar;
        dsqw.cc(disy.class, disyVar);
    }

    private disy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", disx.c(), "c"});
            }
            if (i2 == 3) {
                return new disy();
            }
            if (i2 == 4) {
                return new disv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<disy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (disy.class) {
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

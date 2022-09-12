package defpackage;
/* compiled from: PG */
/* renamed from: dtca  reason: default package */
/* loaded from: classes6.dex */
public final class dtca extends dsqw<dtca, dtbz> implements dssk {
    public static final dtca d;
    private static volatile dssr<dtca> e;
    public int a;
    public dstv b;
    public dstv c;

    static {
        dtca dtcaVar = new dtca();
        d = dtcaVar;
        dsqw.cc(dtca.class, dtcaVar);
    }

    private dtca() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtca();
            }
            if (i2 == 4) {
                return new dtbz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtca> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtca.class) {
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

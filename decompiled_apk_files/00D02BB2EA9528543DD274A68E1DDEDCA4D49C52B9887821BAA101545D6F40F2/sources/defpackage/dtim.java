package defpackage;
/* compiled from: PG */
/* renamed from: dtim  reason: default package */
/* loaded from: classes6.dex */
public final class dtim extends dsqw<dtim, dtil> implements dssk {
    public static final dtim d;
    private static volatile dssr<dtim> e;
    public int a;
    public int b;
    public int c;

    static {
        dtim dtimVar = new dtim();
        d = dtimVar;
        dsqw.cc(dtim.class, dtimVar);
    }

    private dtim() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtim();
            }
            if (i2 == 4) {
                return new dtil();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtim> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtim.class) {
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

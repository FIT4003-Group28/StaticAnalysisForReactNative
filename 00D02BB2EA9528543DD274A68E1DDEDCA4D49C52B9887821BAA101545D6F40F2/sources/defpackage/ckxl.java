package defpackage;
/* compiled from: PG */
/* renamed from: ckxl  reason: default package */
/* loaded from: classes5.dex */
public final class ckxl extends dsqw<ckxl, ckxk> implements dssk {
    public static final ckxl d;
    private static volatile dssr<ckxl> e;
    public int a;
    public ckvz b;
    public dsrj<ckwx> c = dssu.b;

    static {
        ckxl ckxlVar = new ckxl();
        d = ckxlVar;
        dsqw.cc(ckxl.class, ckxlVar);
    }

    private ckxl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", ckwx.class});
            }
            if (i2 == 3) {
                return new ckxl();
            }
            if (i2 == 4) {
                return new ckxk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckxl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckxl.class) {
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

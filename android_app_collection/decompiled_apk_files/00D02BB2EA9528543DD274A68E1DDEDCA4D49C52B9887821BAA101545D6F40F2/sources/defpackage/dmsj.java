package defpackage;
/* compiled from: PG */
/* renamed from: dmsj  reason: default package */
/* loaded from: classes6.dex */
public final class dmsj extends dsqs<dmsj, dmsi> implements dsqt {
    public static final dmsj e;
    private static volatile dssr<dmsj> h;
    public int b;
    private int f;
    private byte g = 2;
    public dspd a = dspd.b;
    public dsrf c = dsqz.b;
    public dsrf d = dsqz.b;

    static {
        dmsj dmsjVar = new dmsj();
        e = dmsjVar;
        dsqw.cc(dmsj.class, dmsjVar);
    }

    private dmsj() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0000\u0001ည\u0000\u0003'\u0005'\u0006င\u0001", new Object[]{"f", "a", "c", "d", "b"});
            }
            if (i2 == 3) {
                return new dmsj();
            }
            if (i2 == 4) {
                return new dmsi();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dmsj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmsj.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
